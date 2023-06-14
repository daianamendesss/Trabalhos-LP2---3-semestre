
package pkg;

/**
 *
 * @author daiana
 */
abstract public class Veiculo {
    String modelo;
    String marca;
    int ano;
    double preco;
    String cor;
    Endereco end;

    //fazendo construtor
    public Veiculo(String modelo, String marca, int ano, double preco, String cor, Endereco endereco){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
        this.end = endereco;
    }
    
    /**
     * @return the modelo
     */
    abstract public String getModelo();

    /**
     * @return the marca
     */
    abstract public String getMarca();

    /**
     * @return the ano
     */
    abstract public int getAno();
    /**
     * @return the preco
     */
    abstract public double getPreco();

    /**
     * @return the cor
     */
    abstract public String getCor();

    /**
     * @return the end
     */
    abstract public Endereco getEnd();

    /**
     * @param modelo the modelo to set
     */
    abstract public void setModelo(String modelo);

    /**
     * @param marca the marca to set
     */
    abstract public void setMarca(String marca);

    /**
     * @param ano the ano to set
     */
    abstract public void setAno(int ano);

    /**
     * @param preco the preco to set
     */
    abstract public void setPreco(double preco);

    /**
     * @param cor the cor to set
     */
    abstract public void setCor(String cor);

    /**
     * @param end the end to set
     */
    abstract public void setEnd(Endereco end);

    //metodo abstrato mover(+)
    abstract public void mover();
    
    
    abstract public void parar();
    
    public void dadosVeiculo() {
        System.out.println("modelo:" + this.modelo);
        System.out.println("marca:" + this.marca);
        System.out.println("ano:" + this.ano);
        System.out.println("preço:" + this.preco);
        System.out.println("cor:" + this.cor);
        System.out.println("endereço:" + this.end.getRua() + "," 
                            + this.end.getNumero() + "," + this.end.getBairro());
    }
}
