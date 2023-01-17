package poo.aula12;

public class Reptil extends Animal{
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar() {
        System.out.println("Comer vegetais");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
}
