
package taller.pkg1;

/**
 *
 * @author Home
 */
public class Rectangulo {
    
    double ancho;
    double altura;

    public Rectangulo() {
        this.ancho = 1.00d;
        this.altura = 1.00d;
    }

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public double getArea(){
        return ancho * altura;
    }
    
    public double getPerimetro(){
        return (ancho + altura) * 2;
    }
    
    public static void main(String [] args){
        Rectangulo rectangul = new Rectangulo();
        rectangul.getArea();
        rectangul.getPerimetro();
    }
}
