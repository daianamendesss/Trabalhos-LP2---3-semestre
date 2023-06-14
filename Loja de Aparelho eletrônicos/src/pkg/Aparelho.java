package pkg;

/**
 *
 * @author daiana
 */
abstract public class Aparelho {
    String marca;
    String modelo;
    String cor;
    double peso;
    Data dataGarantia;
    
    // construtor obrigando suas filhas a terem construtores
    public Aparelho(String marca, String modelo, String cor, double peso, Data dataGarantia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dataGarantia = dataGarantia;
    }
    
    abstract public void ligar();
        
    
    abstract public void desligar();
    
    abstract public void dadosAparelho();
    
    abstract public void setMarca(String marca);
    
    abstract public void setModelo(String modelo);
    
    abstract public void setCor(String cor);
    
    abstract public void setPeso(double peso);
    
    abstract public void setData(Data dataGarantia);
    
    abstract public String getMarca();
    
    abstract public String getModelo();
    
    abstract public String getCor();
    
    abstract public double getPeso();
    
    abstract public Data getData();
}
