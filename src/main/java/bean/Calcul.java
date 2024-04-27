package bean;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public record Calcul(int operande1, String signe, int operande2) {
    
    public int result() {
        int resultat = switch(signe) {
            case "+" -> operande1 + operande2;
            case "-" -> operande1 - operande2;
            case "X" -> operande1 * operande2;
            case "÷" -> operande1 / operande2;
            default -> 0;
        };
        return resultat;
    }
}
