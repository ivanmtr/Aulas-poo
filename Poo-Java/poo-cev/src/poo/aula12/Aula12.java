package poo.aula12;

public class Aula12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        

        a.locomover();
        p.locomover();
        r.locomover();
        m.locomover();
        c.locomover();
        k.emitirSom();



    }
}
