package desafios.Desafio3;
/*
Funcionários:
Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize o conceito de Herança para remodelá-lo e implemente um programa que explore o domínio em questão:
Screenshot-from-2022-05-23-15-16-50

Regras:
a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor), uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
c) Consultores ganham somente pelas horas que trabalharam.
 */
public abstract class Funcionario {

    public String nome;
    public long Cpf;

    private final Double SALARIO_MINIMO = 1000d;

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        Cpf = cpf;
    }

    public abstract double CalcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return Cpf;
    }

    public void setCpf(long cpf) {
        Cpf = cpf;
    }

    public Double getSALARIO_MINIMO() {
        return SALARIO_MINIMO;
    }
}
