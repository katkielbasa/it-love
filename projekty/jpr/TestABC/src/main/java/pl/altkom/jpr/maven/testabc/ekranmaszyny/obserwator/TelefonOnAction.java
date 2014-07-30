package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TelefonOnAction implements ActionListener {

	private MachineListener listener;
	public TelefonOnAction(MachineListener l){
		listener = l;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
