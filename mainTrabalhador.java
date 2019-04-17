
import java.util.Scanner;

import aula.Trabalhador;

public class mainTrabalhador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota", 500);
        severino.start();
        raimundo.start();
    }
}
