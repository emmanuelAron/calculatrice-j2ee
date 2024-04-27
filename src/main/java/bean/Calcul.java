package bean;

import jakarta.xml.bind.annotation.XmlRootElement;

/***
 * Utilisation d'un record (apparu avec java 16, au lieu d'une classe java classique).
 * Les records sont immutables.
 * L'annotation @XmlRootElement permet de l'utiliser avec notre web service pour effectuer une sérialisation XML (Objet vers XML).
 * @author emman
 *
 */

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
