import java.util.Observable;
import java.util.Observer;

public class CarroPolicia  implements Observer, Carro {
    @Override
    public void frente() {
        System.out.println("Policia [vou seguir em frente]");
    }

    @Override
    public void esquerda() {
        System.out.println("Policia [vou virar a esquerda]");
    }

    @Override
    public void direita() {
        System.out.println("Policia [vou virar a direita]");
    }

    @Override
    public void parar() {
        System.out.println("Policia [vou parar  e vc esta preso]");
    }

    @Override
    public void update(Observable o, Object arg) {
        var carroRoubado = (CarroRoubado) o;
        var acao = String.valueOf(arg);

        if ("frente".equals(acao))
            this.frente();
        if("esquerda".equals(acao))
            this.esquerda();
        if("direita".equals(acao))
            this.direita();
        if("parar".equals(acao))
            this.parar();
    }
}
