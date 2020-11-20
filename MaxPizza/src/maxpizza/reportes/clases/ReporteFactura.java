package maxpizza.reportes.clases;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

public class ReporteFactura {

    public ReporteFactura() {
    }

    public void crearFactura(int idPedido) {
        try {
            String reportFuente = "./src/maxpizza/reportes/Ped_Cli.jrxml";
            String reportPDF = "./src/maxpizza/reportes/factura/Pedido_" + idPedido + ".pdf";
            String jasperReportCompilado = "./src/maxpizza/reportes/Ped_Cli.jasper";

            InputStream inputStream = null;
            inputStream = new FileInputStream(reportFuente);

            //HashMap para crear y almacenar parametros
            Map parametros = new HashMap();
            parametros.put("PedCli", idPedido);
            JasperReport jasperDesign = (JasperReport) JRLoader.loadObjectFromFile("./src/maxpizza/reportes/Ped_Cli.jasper");

            //Driver y conexion a la Base de datos:
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria"
                    + "?zeroDateTimeBehavior=convertToNull", "root", "");

            //Metodo para rellenar de datos el informe, genera un fichero .jasper
            //parametros (nombre objeto Jaspert Report, parametros de informe, conexion a BD)
            JasperPrint MiInforme = JasperFillManager.fillReport(jasperReportCompilado, parametros, conexion);

            // Convertir a PDF(generar informe en PDF)
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, MiInforme);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(reportPDF));
            exporter.exportReport();

            File path = new File(reportPDF);
            Desktop.getDesktop().open(path);

        } catch (JRException | ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(ReporteFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
