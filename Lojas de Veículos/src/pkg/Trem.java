
package pkg;

/**
 *
 * @author daiana
 */
public class Trem extends VeiculoGrande{
    public Trem(String modelo, String marca, int ano, double preco, String cor, Endereco endereco) {
        super(modelo, marca, ano, preco, cor, endereco);
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public Endereco getEnd() {
        return this.end;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public void mover() {
        System.out.println("trem em movimento");
    }

    @Override
    public void parar() {
        System.out.println("trem parado");
    }
}
