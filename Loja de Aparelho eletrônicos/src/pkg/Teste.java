
package pkg;

/**
 *
 * @author daiana
 */
public class Teste {
    public static void main(String[] args) {
        Data garantiaCelular = new Data();
        garantiaCelular.setDia("12");
        garantiaCelular.setMes("04");
        garantiaCelular.setAno("2023");
        Movel celular = new Movel("samsung", "A20", "preto", 0.5, garantiaCelular);
        celular.dadosAparelho();
        celular.autenticaRede();
        
        Data garantiaFixo = new Data();
        garantiaFixo.setDia("15");
        garantiaFixo.setMes("08");
        garantiaFixo.setAno("2024");
        Fixo telefone = new Fixo("intelbras", "ls 3110", "preto", 0.75, garantiaFixo);
        telefone.dadosAparelho();
        telefone.autenticaRede();
        
        Data garantiaLaptop = new Data();
        garantiaLaptop.setDia("20");
        garantiaLaptop.setMes("07");
        garantiaLaptop.setAno("2024");
        Portatil laptop = new Portatil("dell", "inspiron 15", "prata", 3.0, garantiaLaptop);
        laptop.dadosAparelho();
        laptop.autenticaRede(); 
        
        Data garantiaComputador = new Data();
        garantiaComputador.setDia("30");
        garantiaComputador.setMes("02");
        garantiaComputador.setAno("2024");
        Mesa computador = new Mesa("samsung", "all in one", "branco", 5.5, garantiaComputador);
        computador.dadosAparelho();
        computador.autenticaRede();
    }
}
