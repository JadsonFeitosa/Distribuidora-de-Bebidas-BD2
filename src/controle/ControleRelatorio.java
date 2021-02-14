package controle;

import dto.RelatorioDTO;
import modelo.Relatorio;

public class ControleRelatorio {
    private Relatorio relatorios;
    
    public ControleRelatorio(){
        relatorios = new Relatorio();
    }
    
    public void gerarRelatorio() throws Exception{
        relatorios.gerarPDF();
    }
}
