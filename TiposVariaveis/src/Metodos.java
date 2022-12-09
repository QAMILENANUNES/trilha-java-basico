public class Metodos {

    // funções,ações,e subrotinas
    // CaucularImposto(){}
    // somar(int n1,int n2)metodo com dois parametros
    public double somar (int num1,int num2){
            //lógica-finalidade do metodo
            return...;
        }

    public void imprimir(String texto) {
        // lógica-finalidade do método
        // aqui não precisa do return
        // pois não será retornado nenhum resultado
    }

    // trows exception: indica que o método a ser
    // utilizado poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) { // throws exception {

        // se informar zero como divisor
        // trará uma exceção
    }

    // esse método não pode ser visto por outras classes
    // no private
    private void metodoPrivado() {

    }

    // alguns equivos estruturais/conceitual
    public void validar() {
        // este metodo deveria retornar algum valor
        // no caso boolean(true or false)
    }

    // um metodo deve apresentar uma única responsabilidade
    public void caucularEnviar() {

    }

    public void gravarCliente(String nome, String cpf, Integer idade) {
        // metodos com muitos parametros(que pode ser uma abstração de um objeto)
        // se cria um objeto Cliente
        // classe cliente com suas caracteristicas
    }

    public void gravarCliente(Cliente cliente) {

        // ou
        // public void gravar(Cliente cliente){}
    }
}
