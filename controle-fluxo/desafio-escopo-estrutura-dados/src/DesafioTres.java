import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int N;

        for (int i = 0; i < C; i++) {
            nome = leitor.next();
            N = leitor.nextInt();
            if (nome.equals("Thor") && N <= 50) System.out.println("Y");
            else System.out.println("N");
        
        

            
        }
    }
}


