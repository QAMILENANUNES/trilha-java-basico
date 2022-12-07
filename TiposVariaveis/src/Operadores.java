public class Operadores {
    public static void main(String[] args) throws Exception {
        // operador de tribuição(=)

         String nome = "MARIA"
         int idade = 22;
         double peso = 68.5;
         char sexo ='F';
         boolean doadorOrgao=false;
         Date datanascimento -= new Date();

        // operador aritmético(+),(-),(*),(/)

         double soma =10.5+15.7;
         int subtracao =113-25;
         int multiplicacao =20*7;
         int divisao =15/3;
         int modulo =18%3;
         double resultado= (10*7)+(20/4);

        // concatenação

        String concatenacao = "?";

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}