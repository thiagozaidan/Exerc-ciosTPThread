import java.util.Scanner;

public class sapo extends Thread{

    float distanciaPercorrida;
    float distanciaPulo;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a distância do pulo: ");
    distanciaPulo = sc.nextFloat();

    System.out.println("Digite a distância percorrida: ");
    distanciaPercorrida = sc.nextFloat();
}