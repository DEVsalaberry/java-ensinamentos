
//Também usamos o controle de fluxo for, para interagir sobre arrays e coleções:

// ExemploFor.java
/* public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

    }
}  */


//agora forma abreviada

public class ExemploForArray {

    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        for(String aluno : alunos){
            System.err.println("Nome do aluno é: " + aluno);
        }
    }
}