package imprimirdados;

import java.util.Scanner;

public class Impressora {
    public int x;
    public int y;

    public void lernumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NUMERO");
        x = scanner.nextInt();
        System.out.print("DIGITE O SEGUNDO NUMERO");
        y = scanner.nextInt();
    }
}
