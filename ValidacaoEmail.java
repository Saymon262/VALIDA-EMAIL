package aula_1;

import javax.swing.JOptionPane;

public class ValidacaoEmail {
	
	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email:");
		
		String ret = "";
		
		if(email.length() < 10)
			ret += "- Necess�rio no m�nimo 10 caracteres\n";
		
		if(email.indexOf("@")==-1)
			ret += "- Necess�rio ter um @\n";
		else {
			String antesArroba = email.substring(0,email.indexOf("@"));
			
			if(!antesArroba.contains(".")) 
				ret += "- Necess�rio ter um ponto antes do @\n";
			
			if(email.indexOf(".com", email.indexOf("@"))==-1) 
				ret += "- Necess�rio ter .com ap�s o @\n";
			
			if(antesArroba.length() < 6)
				ret += "- Necess�rio no m�nimo 6 caracteres antes do @\n";
		}
		
		
		if(ret.equals(""))
			JOptionPane.showMessageDialog(null, "V�LIDO!!!!");
		else
			JOptionPane.showMessageDialog(null, ret);
			
		
	}

}
