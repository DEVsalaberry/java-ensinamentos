import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int forca;

        for (int i = 0; i < C; i++) {
            nome = leitor.next();
            forca = leitor.nextInt();
            if (nome.equals("Thor") && forca <= 5000) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}



