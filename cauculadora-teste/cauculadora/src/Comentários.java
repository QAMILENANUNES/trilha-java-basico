public class Comentários {
    public static void main(String[] args) {
        // Olá,eu sou um comentário em uma única linha

        /*
         * Olá,
         * eu sou um comentário
         * que posso ser mais detalhado
         * quando necesário
         */
    }

    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação
     * que incrível!!!
     */

    public void metodo() {

    }

    public static void main(String[] args) {

    }

    /*
     * o que não fazer:
     * este método foi elaborado as pressas
     * por iso abreviei o nome das variáveis
     * mas,olha,ele tem a finalidade de somar ou mutiplicar
     * dois números
     */
    public int somaMultiplica (int n,int x, String m){
        int r =0;// r é igual ao resultado
        if (m == "M"){// M= multiplicação
        r= n*x;
    }else{
            //se não soma mesmo
            r= n+x;
        return r;

    }
}
    
