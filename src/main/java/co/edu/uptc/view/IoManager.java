package co.edu.uptc.view;

import javax.swing.JOptionPane;

public class IoManager {
	
	public IoManager() {
		
	}
	
	public void printMessage(String message) {
		JOptionPane.showMessageDialog(null,message);
	}
	
	public int readInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
    public String readString(String message) {
    	return JOptionPane.showInputDialog(message);
    }
    
    public void showMessage(String message){
    	JOptionPane.showMessageDialog(null, message);
    }

}
