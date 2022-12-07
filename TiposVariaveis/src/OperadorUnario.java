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
    }

}