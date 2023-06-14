
package pkg;

/**
 *
 * @author daiana
 */
abstract public class VeiculoPequeno extends Veiculo implements Cadastro{
    
    public VeiculoPequeno(String modelo, String marca, int ano, double preco, String cor, Endereco endereco) {
        super(modelo, marca, ano, preco, cor, endereco);
    }
    
}
