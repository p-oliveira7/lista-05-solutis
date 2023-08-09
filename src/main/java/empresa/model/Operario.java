package empresa.model;

public class Operario extends Empregado{
    public double valorProducao;
    public double comissao;

    public Operario(){
        super();
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, double imposto, double valorProducao, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        double comissaoBase = this.valorProducao * this.comissao;
        return super.calcularSalario() + comissaoBase;
    }
    @Override
    public String toString() {
        return super.toString() + " Operario{" +
                "valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                '}';
    }
}
