package poo.projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jose", 19, "M");
        p[1] = new Pessoa("Maria", 20, "F");

        l[0] = new Livro("Vida Cara","Marcos", 300, p[0]);
        l[1] = new Livro("ajsb", "james", 500, p[0]);
        l[2] = new Livro("ABC", "Carlos", 800, p[0]);

        l[0].abrir();
        l[0].folhear(0);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());


    }
}
