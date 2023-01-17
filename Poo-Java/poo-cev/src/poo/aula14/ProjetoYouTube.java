package poo.aula14;
public class ProjetoYouTube {
    public static void main(String[] args) {
        
        Video[] v = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula 10 de java");
        v[2] = new Video("Aula 12 de PHP");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Maria", 22, "F", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "cxreuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); //Maria assiste PHP
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);  //Maria assiste JAVA
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());


        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());

    }
}