
package boletin5.pkg3;

/**
 * Este programa se usara para hallar el area y longitud de un circulo.
 * @author sbenavidesvazquez
 * @version 12/1/15A
 */
public class Boletin53 {

   /**
    * Se lanzaran las operaciones y el resultado saldra por la pantalla
    * @param args 
    */
    
    public static void main(String[] args) {
    Circulo circulo1=new Circulo(5);
        System.out.println("area= "+ circulo1.calcularArea());
        System.out.println("lonxitude= "+ circulo1.calcularLonxitude());
    }
    
}
