package pl.altkom.jpr.maven.testabc.adapter.vieo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import pl.altkom.jpr.maven.testabc.adapter.DivX;
import pl.altkom.jpr.maven.testabc.adapter.SuperAdapter;

public class DekoderGui {

	private static ObslugaDekodera dekoder = new ObslugaDekodera();
	
	public static void main(String args[]){
		
		
		
		JFrame f = new JFrame("Okno dekodera");
		f.setLayout(new FlowLayout());
		JButton divXCompressButton = new JButton("konpresuj DivX");
		JButton superCompressButton = new JButton("konpresuj Super Compressorem");
		
		f.add(divXCompressButton);
		f.add(superCompressButton);
		
		divXCompressButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dekoder.setKompresor(new DivX());
				dekoder.wlaczKompresje();			
			}
		});
		
		superCompressButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dekoder.setKompresor(new SuperAdapter());
				dekoder.wlaczKompresje();			
			}
		});
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
