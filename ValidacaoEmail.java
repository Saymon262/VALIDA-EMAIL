package aula_1;

import javax.swing.JOptionPane;

public class ValidacaoEmail {
	
	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email:");
		
		String ret = "";
		
		if(email.length() < 10)
			ret += "- Necessário no mínimo 10 caracteres\n";
		
		if(email.indexOf("@")==-1)
			ret += "- Necessário ter um @\n";
		else {
			String antesArroba = email.substring(0,email.indexOf("@"));
			
			if(!antesArroba.contains(".")) 
				ret += "- Necessário ter um ponto antes do @\n";
			
			if(email.indexOf(".com", email.indexOf("@"))==-1) 
				ret += "- Necessário ter .com após o @\n";
			
			if(antesArroba.length() < 6)
				ret += "- Necessário no mínimo 6 caracteres antes do @\n";
		}
		
		
		if(ret.equals(""))
			JOptionPane.showMessageDialog(null, "VÁLIDO!!!!");
		else
			JOptionPane.showMessageDialog(null, ret);
			
		
	}

}
