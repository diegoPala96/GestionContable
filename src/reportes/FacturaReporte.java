package reportes;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JTextField;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class FacturaReporte extends JFrame{

	private JRViewer viewer;
	
	//private JTextField txtEdadMinima;
	
	public FacturaReporte(String nFac){
		
		try{
			getContentPane().remove(viewer);
		}catch(Exception e){}
		
		
		HashMap parametros = new HashMap();
		parametros.put("Num_Factura", nFac);
		System.out.println(nFac);
		
		CallReport cr = new CallReport();
		JasperPrint jasperPrint = null;
		try {
			jasperPrint = cr.generateReport("D:\\Users\\Diego\\eclipse-workspace\\FacturaElectronica\\ReportesPDF\\Factura", parametros);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		viewer = new JRViewer(jasperPrint);
		getContentPane().add(viewer, BorderLayout.CENTER);
		


	}

	
	
}
