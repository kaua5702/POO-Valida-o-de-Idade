package VerificadorDeIdade;

public class Pessoa {

    private int idade;

    public Pessoa(int IdadeInicial) {
        setIdade(IdadeInicial);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            this.idade = novaIdade;

        }else {
            System.out.println("Idade inválida! Não pode ser negativa.");
        }
    }

    public void apresentar() {
        System.out.println("Olá, eu tenho " + idade + " anos.");
    }

}
