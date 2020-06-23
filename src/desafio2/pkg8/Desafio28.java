package desafio2.pkg8;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double v, PI, r;
        
        System.out.println("Qual o raio da esfera?");
        r = ler.nextDouble();
        
        PI= 3.14;
        v = (4/3)*PI*Math.pow(r, 3);
        
        System.out.println("O volume da esfera é:"+v);
    }    
}
