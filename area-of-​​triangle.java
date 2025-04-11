import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
double BASE, ALT, A;
Scanner meuScanner = new Scanner (System.in);

    System.out.println("Digite o valor da Base do Triângulo: ");
    BASE = meuScanner.nextDouble();
    System.out.println("Digite o valor da altura do Triângulo: ");
    ALT = meuScanner.nextDouble();
    
    A = (BASE*ALT)/2; 
    
    System.out.println("A Área do Triângulo é: "+A);
    }
}
    
