package operacoes;
import imprimirdados.Impressora;

public class Soma {
    public static void main(String[] args) {
        Impressora imprimirdados = new Impressora();
        imprimirdados.lernumeros();

        System.out.println(imprimirdados.x+imprimirdados.y);
    }
}
