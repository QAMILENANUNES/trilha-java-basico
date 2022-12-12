public class SmartTv {

    boolean ligada = false;// toda minha classe
    int canal = 1;// acessa esses
    int volume = 25;// atributos

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public Void aumentarCanal() {
        canal++;
    }

    public Void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("aumentado o volume para:" + volume);
        // volume =volume + 1;
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}