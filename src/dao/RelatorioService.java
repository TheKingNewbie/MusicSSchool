package dao;
 
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
 
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import Connection.Conexao;
 
public class RelatorioService implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private static final String FOLDER_RELATORIOS = "";
    private String caminhoArquivoRelatorio = null;
    private JRExporter exporter = null;
    private File arquivoGerado = null;
 
    public String gerarRelatorio(HashMap parametrosRelatorio, String nomeRelatorioJasper, String tipoExportar) throws Exception {
 
        String caminhoRelatorio = getClass().getResource(FOLDER_RELATORIOS).getPath();
 
        /* caminho completo até o relatório compilado indicado */
        String caminhoArquivosJasper = caminhoRelatorio + File.separator + nomeRelatorioJasper + ".jasper";
        /* Faz o carregamento do relatório */
        JasperReport relatorioJasper = (JasperReport) JRLoader.loadObjectFromFile(caminhoArquivosJasper);
 
        /* Carrega o arquivo */
        JasperPrint impressoraJasper = JasperFillManager.fillReport(relatorioJasper, parametrosRelatorio, Conexao.getConnection());
 
        if (tipoExportar.equalsIgnoreCase("pdf")) {
            exporter = new JRPdfExporter();
        } else if (tipoExportar.equalsIgnoreCase("xls")) {
            exporter = new JRXlsExporter();
        }
 
        /* Caminho relatorio exportado */
        caminhoArquivoRelatorio = caminhoRelatorio + File.separator + nomeRelatorioJasper + "." + tipoExportar;
 
        /* Criar novo arquivos exportado */
 
        arquivoGerado = new File(caminhoArquivoRelatorio);
 
        /* Prepara a impressão */
        exporter.setParameter(JRExporterParameter.JASPER_PRINT,impressoraJasper);
 
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, arquivoGerado);
 
        /* Excuta a exportação */
        exporter.exportReport();
 
        return caminhoArquivoRelatorio;
 
    }
 
}