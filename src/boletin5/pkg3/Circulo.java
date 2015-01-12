
package boletin5.pkg3;

/**
 * Este programa se usara para hallar el area y longitud de un circulo.
 * @author sbenavidesvazquez
 * @version 12/1/15A
 */
public class Circulo {
    private double radio;
    private double pi=3.14;
    
    /**
     * El constructor del programa.
     */
    public Circulo(){
        
    }
    
    /**
     * constructor para igualar el radio.
     * @param r double
     */
    public Circulo(double r){
        radio=r;
    }
    
    /**
     * Realizara la operacion para hallar el area.
     * @return El area del circulo.
     */
    public double calcularArea(){
        return Math.pow(radio,2)*pi;
    }
    
    /**
     * Realizara la operacion para hallar la longitud.
     * @return La longitud del circulo.
     */
    public double calcularLonxitude(){
        return 2*pi*radio;
    }
    
}
