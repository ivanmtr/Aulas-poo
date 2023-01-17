package poo.aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setDono("Ivan");
        p1.setNumConta(777);
       

        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("CP");
        p2.setDono("zeze");
        p2.setNumConta(321);
        
        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(150);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
