
package pkg;

/**
 *
 * @author daiana
 */
public class Mesa extends Computador implements Comunicacao{
   
    public Mesa(String marca, String modelo, String cor, double peso, Data dataGarantia) {
        super(marca, modelo, cor, peso, dataGarantia);
    }

    @Override
    public void ligar() {
        System.out.println("Aparelho está ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Aparelho está desligado!");
    }

    @Override
    public void dadosAparelho() {
        System.out.println("marca:" + this.getMarca());
        System.out.println("modelo:" + this.getModelo());
        System.out.println("cor:" + this.getCor());
        System.out.println("peso:" + this.getPeso());
        System.out.println("data da garantia: " + this.getData().getDia() + 
                            "/" + this.getData().getMes() + "/" + this.getData().getAno());
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void setData(Data dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public Data getData() {
        return this.dataGarantia;
    }

    @Override
    public void autenticaRede() {
        System.out.println("computador autenticado!");
    }
}
