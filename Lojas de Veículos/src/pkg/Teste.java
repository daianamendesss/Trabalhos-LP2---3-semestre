
package pkg;

/**
 *
 * @author daiana
 */
public class Teste {
    public static void main(String[] args) {
        Endereco end1 = new Endereco();
        end1.setRua("Rua Consolação");
        end1.setNumero(275);
        end1.setBairro("Santo Amaro");
        Carro carro = new Carro("gol", "volkswagen", 2014, 25000.00, "cinza", end1);
        carro.dadosVeiculo();
        carro.mover();
        carro.parar();
        carro.registraPlaca("XLK-9604");
        
        Endereco end2 = new Endereco();
        end2.setRua("Rua Andorinhas");
        end2.setNumero(94);
        end2.setBairro("Centenária");
        Van van = new Van("fiorino", "fiat", 2013, 50000.00, "branca", end2);
        van.dadosVeiculo();
        van.mover();
        van.parar();
        van.registraPlaca("RTZ-0864");
        
        Endereco end3 = new Endereco();
        end3.setRua("Rua Ricardo Annone Filho");
        end3.setNumero(55);
        end3.setBairro("Centro");
        Moto moto = new Moto("fan-150", "honda", 2010, 12000.00, "preta", end3);
        moto.dadosVeiculo();
        moto.mover();
        moto.parar();
        moto.registraPlaca("SDW-0458");

        Endereco end4 = new Endereco();
        end4.setRua("Rua Pica-Pau");
        end4.setNumero(940);
        end4.setBairro("Centenário");
        Onibus onibus = new Onibus("XXXX", "Mercedes", 2015, 200000.00, "azul", end4);
        onibus.dadosVeiculo();
        onibus.mover();
        onibus.parar();
        onibus.registraPlaca("HRE-5421");
        
        Endereco end5 = new Endereco();
        end5.setRua("Rua Pica-Pau");
        end5.setNumero(940);
        end5.setBairro("Centenário");
        Trem trem = new Trem("XXXX", "YYYY", 2006, 550000.00, "amarelo", end5);
        trem.dadosVeiculo();
        trem.mover();
        trem.parar();
        
        Endereco end6 = new Endereco();
        end6.setRua("Rua Consolação");
        end6.setNumero(475);
        end6.setBairro("Santo Amaro");
        Caminhao caminhao = new Caminhao("XXXX", "Scania", 1998, 150000.00, "azul", end6);
        caminhao.dadosVeiculo();
        caminhao.mover();
        caminhao.parar();
        caminhao.registraPlaca("ITR-8706");        
    }
}
