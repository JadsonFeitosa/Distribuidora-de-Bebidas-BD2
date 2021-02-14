package modelo;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.PedidoDAO;
import dto.RelatorioDTO;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Relatorio {
    private PedidoDAO daoP;
    
    public Relatorio(){
        daoP = new PedidoDAO();
    }
    public void gerarPDF() throws Exception {
        RelatorioDTO relatorios = daoP.pedidosRegistrados();
        Document documento = new Document(PageSize.A4, 72, 72, 72, 72);
        try {
            String nomeDoPdf = "Distribuidora.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nomeDoPdf));
            documento.open();
            String titulo = "Relatório de vendas";
            Paragraph p = new Paragraph(titulo);
            p.setAlignment(1);
            documento.add(p);
            p = new Paragraph(" ");
            documento.add(p);
            PdfPTable tabela = new PdfPTable(4);
            
            PdfPCell cellIdvenda = new PdfPCell(new Paragraph("ID venda"));
            PdfPCell cellNomeCli = new PdfPCell(new Paragraph("Nome do cliente"));
            PdfPCell cellProduto = new PdfPCell(new Paragraph("Produto"));
            PdfPCell cellValorTotal = new PdfPCell(new Paragraph("Valor total"));
             
            tabela.addCell(cellIdvenda);
            tabela.addCell(cellNomeCli);
            tabela.addCell(cellProduto);
            tabela.addCell(cellValorTotal);
            for(RelatorioDTO r: relatorios.getVetorRelatorio()) {
                
                cellIdvenda = new PdfPCell(new Paragraph(r.getIdVenda()+""));
                cellNomeCli = new PdfPCell(new Paragraph(r.getNomeCliente()));
                cellProduto = new PdfPCell(new Paragraph(r.getNomeProduto()));
                cellValorTotal = new PdfPCell(new Paragraph(r.getValorPedido()+ ""));
                
                tabela.addCell(cellIdvenda);
                tabela.addCell(cellNomeCli);
                tabela.addCell(cellProduto);
                tabela.addCell(cellValorTotal);
                
            }
            documento.add(tabela);
            Desktop.getDesktop().open(new File(nomeDoPdf));
        } catch (FileNotFoundException | DocumentException ex) {
            throw new Exception("erro ao gerar pdf. " +ex.getMessage());
        }finally{
            documento.close();
        }
    }
}
