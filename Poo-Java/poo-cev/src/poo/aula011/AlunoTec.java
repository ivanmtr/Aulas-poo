package poo.aula011;

public class AlunoTec extends Aluno{
    private String registroProfissional;

    public void praticar() {
        System.out.println("Praticando!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
