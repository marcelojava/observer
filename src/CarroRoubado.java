import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {

    private String acao = "";
    @Override
    public void frente() {
        acao = "frente";
        System.out.println("Ladrao [vou seguir em frente]");
        this.mudarEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Ladrao [vou virar a esquerda]");
        this.mudarEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("Ladrao [vou virar a direita]");
        this.mudarEstado();
    }

    @Override
    public void parar() {
        acao = "parar";
        System.out.println("Ladrao [vou parar]");
        this.mudarEstado();
    }

    private void mudarEstado() {
        setChanged();
        notifyObservers(acao);
    }
}
