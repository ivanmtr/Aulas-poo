package poo.aula011;

public class Aula011 {

   public static void main(String[] args) {

     //Pessoa p1 = new Pessoa();
     Visitante v1 = new Visitante();
     v1.setNome("Marcos");
     v1.setIdade(22);
     v1.setSexo("M");
     System.out.println(v1.toString());

     Aluno a1 = new Aluno();
     a1.setNome("Jonas");
     a1.setCurso("Informatica");
     a1.setMatricula(222);
     a1.setIdade(16);
     a1.setSexo("M");
     a1.pagarMensalidade();

     Bolsista b1 = new Bolsista();
     b1.setMatricula(123);
     b1.setNome("Tico");
     b1.setBolsa(12.5f);
     b1.setSexo("M");
     b1.pagarMensalidade();

     AlunoTec at = new AlunoTec();
     at.setNome("kiko");
     at.setRegistroProfissional("Estelionatario");
     at.praticar();

     Professor p1 = new Professor();
     p1.setNome("Xico");
     p1.setSalario(1500.0f);
     p1.receberAumento(500.0f);
     
   }
}
