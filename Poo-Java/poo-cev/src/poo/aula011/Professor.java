package poo.aula011;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento) {
        salario += aumento;
        System.out.println("O professor " + this.getNome() + " recebeu um aumento");
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}