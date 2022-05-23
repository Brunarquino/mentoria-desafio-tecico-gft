package desafios.Desafio3;

public class Vendedor extends Funcionario{


    private double comissao;
    private long numeroDeVendas;

    public Vendedor(String nome, long cpf, double comissao, long numeroDeVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public double CalcularSalario() {
        return super.getSALARIO_MINIMO() + (this.comissao * this.numeroDeVendas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(long numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }
}
