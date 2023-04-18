package run;

import javax.swing.UIManager;

import view.QLHH;

public class RunApp {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new QLHH();
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
