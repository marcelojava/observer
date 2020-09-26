public class Demo {
    public static void main(String[] args) {
        var carroPolicia = new CarroPolicia();
        var carroRoubado = new CarroRoubado();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.parar();
    }
}
