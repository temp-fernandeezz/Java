import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
int N1, N2, N3, P1, P2, P3, MediaP;
Scanner meuScanner = new Scanner (System.in);

    System.out.println("Digite a primeira Nota: ");
    N1 = meuScanner.nextInt();
    System.out.println("Digite o primeiro Peso: ");
    P1 = meuScanner.nextInt();
    System.out.println("Digite a segunda Nota: ");
    N2 = meuScanner.nextInt();
    System.out.println("Digite o segundo Peso: ");
    P2 = meuScanner.nextInt();
    System.out.println("Digite a terceiro Nota: ");
    N3 = meuScanner.nextInt();
    System.out.println("Digite o terceiro Peso: ");
    P3 = meuScanner.nextInt();
    MediaP = ((N1*P1)+(N2*P2)+(N3*P3)) / (P1+P2+P3);
    System.out.println("A média Ponderada é: "+MediaP);
    }
}
