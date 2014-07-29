package pl.altkom.jpr.nitecki;

// import java.awt.event.ActionEvent;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui {

	/**
	 * Klasa ta ma na celu utworzenie graficznego interfejsu do obs�ugi
	 * programu.
	 */

	JTextField queryField = new JTextField("Podaj ile liczb chcesz wygenerowa�");
	JTextArea areaField = new JTextArea();
	JButton searchButton = new JButton("Wygeneruj!");

	public static void main(String[] args) {

		Gui i = new Gui();
		i.init();

	}

	public void init() {
		JFrame f = new JFrame();
		f.setLayout(new BorderLayout());
		f.add(queryField, BorderLayout.NORTH);
		f.add(areaField, BorderLayout.CENTER);
		f.add(searchButton, BorderLayout.SOUTH);
		f.setSize(800, 600);
		f.setVisible(true);

		searchButton.addActionListener(null);
	}

}
