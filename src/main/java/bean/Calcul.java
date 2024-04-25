package bean;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Calcul {
	
	private int operande1;
	private String signe;
	private int operande2;
	
	
	public int getOperande1() {
		return operande1;
	}
	public void setOperande1(int operande1) {
		this.operande1 = operande1;
	}
	public String getSigne() {
		return signe;
	}
	public void setSigne(String signe) {
		this.signe = signe;
	}
	public int getOperande2() {
		return operande2;
	}
	public void setOperande2(int operande2) {
		this.operande2 = operande2;
	}
	public Calcul(int operande1, String signe, int operande2) {
		super();
		this.operande1 = operande1;
		this.signe = signe;
		this.operande2 = operande2;
	}
	public Calcul() {
		super();
	}
	
	public int result() {
		if(signe.equals("+")) {
			return operande1 + operande2;
		}
		
		return 0;
	}

}
