package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	JButton telefonOn = new JButton("Telefon ON");
	JButton telefonOff = new JButton("Telefon OFF");

	JButton ekranOn = new JButton("Ekran ON");
	JButton ekranOff = new JButton("Ekran OFF");

	JButton historiOn = new JButton("Historia ON");
	JButton historiOff = new JButton("Historia OFF");

	static MachineListener listener = new MachineListener();

	public static void main(String[] args) {

		GUI g = new GUI();
		JFrame f = new JFrame("Gui listeners");
		f.setLayout(new FlowLayout());

		f.add(g.telefonOn);
		f.add(g.telefonOff);
		f.add(g.ekranOn);
		f.add(g.ekranOff);
		f.add(g.historiOn);
		f.add(g.historiOff);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		g.telefonOn.addActionListener(new TelefonOnAction(listener));
		g.telefonOff.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listener.removeObserver(0);

			}
		});
		
		
		
		g.ekranOn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listener.addObservator(new Ekran());

			}
		});
		g.ekranOff.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listener.removeObserver(1);

			}
		});
		
		g.historiOn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listener.addObservator(new HistoriaProdukcji());

			}
		});
		g.historiOff.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				listener.removeObserver(2);

			}
		});
		
		listener.start();
	}

}
