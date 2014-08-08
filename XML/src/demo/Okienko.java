package demo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class Okienko extends JFrame implements ActionListener {

	private static final long serialVersionUID = 8L;

	private JButton start = new JButton("Start");
	private JProgressBar bar = new JProgressBar(0, 10);
	private JTextArea area = new JTextArea(15, 30);

	// private Handler handler = new Handler();

	public Okienko() {
		Container main = getContentPane();
		JPanel north = new JPanel();
		north.add(start);
		start.addActionListener(this);
		north.add(bar);
		bar.setStringPainted(true);
		main.add(north, BorderLayout.NORTH);
		main.add(new JScrollPane(area), BorderLayout.CENTER);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Okienko();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		SwingWorker<Void, Integer> task = new SwingWorker<Void, Integer>() {

			@Override
			protected Void doInBackground() throws Exception {
				for (int i = 0; i < 10; i++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						System.out.println("B£ONT");
						e1.printStackTrace();
					}
					publish(i);
				}
				return null;
			}
			@Override
			protected void process(List<Integer> chunks) {
				int iii = chunks.get(0);
				bar.setValue(iii+1);
//				area.append("Ciê¿ko pracujê... (" + iii + "0%)\n");
				area.append(String.format("Ciê¿ko pracujê... (%d%%)%n", (iii+1)*10));
				
			}
			@Override
			protected void done() {
				area.append("Yeah bitch! MAGNETS!\n");
			}
		};
		task.execute();
		/*
		 * // new Thread(new Runnable() { // // @Override // public void run() {
		 * // // TODO Auto-generated method stub // try { // Thread.sleep(3000);
		 * // } catch (InterruptedException e1) { //
		 * System.out.println("B£ONT"); // e1.printStackTrace(); // } //
		 * System.out.println("Bardzo d³uga operacja"); //
		 * area.append("Dzia³a\n"); // } // }).start();
		 */
	}

	// private class Handler extends WindowAdapter {
	// @Override
	// public void windowClosing(WindowEvent e) {
	// System.exit(0);
	// }
	// }
}
