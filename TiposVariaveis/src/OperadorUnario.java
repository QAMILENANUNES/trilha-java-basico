public class OperadorUnario {
    public static void main(String[] args) throws Exception {

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        // convertendo para positivo
        numero = numero * -1;
        System.out.println(numero);

        // incremento
        int numer = 5;
        // x repetição
        // numer++;
        // numer = numer + 1;
        // System.out.println(numer++);
        // System.out.println(numer);

        System.out.println(numer--);
        System.out.println(numer);

        // negação
        boolean variavel = false;
        // variavel em memória
        variavel = !variavel;
        // reatribuição de variavel negando-a
        System.out.println(variavel);

    }

}