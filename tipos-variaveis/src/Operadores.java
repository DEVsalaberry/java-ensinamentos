/*public class Operadores { ARITMÉTICOS
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.err.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

    }
}*/ 

/*public class Operadores { UNÁRIOS
    int numero = 5;

    numero = - numero;

    System.out.println(numero);

    numero = numero;

    System.out.println(numero);
}*/

/*public class Operadores {
    

boolean variavel = false;

variavel = variavel;
System.out.println(!variavel);
}*/

/*  public class Operadores { // operador ternário

    public static void main(String[] args) {
        
        int a, b;

    a = 6;
    b = 6;
    String resultado = a==b?"verdadeiro" : "falso"; //abreviaçao para nao ter muito if/else

        
        System.out.println(resultado);
    }
    
} */

/*public class Operadores { //RELACIONAIS
    public static void main(String[] args) {
        String nomeUm = "Felipe";
        String nomeDois = new String ("Felipe");

        System.out.println(nomeUm.equals(nomeDois));
        
        
    
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condiçao é verdadeira");
        }

        System.out.println("numeroUm é igual a numemeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
} */
    
public class Operadores { //LÓGICOS
    public static void main(String[] args) {
        boolean condiçao1=true;

        boolean condiçao2=true;

        if(condiçao1 && condiçao2) {
            System.out.println("as duas condiçoes sao verdadeira");
        } 

        if (condiçao1 || condiçao2) {
            System.out.println("Uma das condiçoes é verdadeiras");
        }

       System.out.println("fim");

        }
    }




