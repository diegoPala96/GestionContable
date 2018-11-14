package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Menu extends JFrame {

	private JPanel contentPane;
	static String cedEmpleado;

	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					Menu frame = new Menu(cedEmpleado);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the frame.
	 * @param g 
	 */
	public Menu(String g) {

	cedEmpleado=g;


		
		setBounds(100, 100, 863, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(6, 29, 851, 488);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnfactura = new JButton("");
		btnfactura.setIcon(new ImageIcon("Iconos/botonFac.png")); 
		btnfactura.setContentAreaFilled(false);
		btnfactura.setBorder(null);
		btnfactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Facturacion factura = new Facturacion(cedEmpleado);
				factura.setVisible(true);
				
			}
		});
		btnfactura.setBounds(16, 98, 260, 83);
		panel.add(btnfactura);
		
		JButton btncaja = new JButton("");
		btncaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Caja caja = new Caja();
				caja.setVisible(true);
			}
		});
		btncaja.setBounds(293, 98, 260, 83);
		btncaja.setIcon(new ImageIcon("Iconos/botonCaj.png"));
		btncaja.setContentAreaFilled(false);
		btncaja.setBorder(null);
		panel.add(btncaja);
		
		JButton btninventario = new JButton("");
		btninventario.setIcon(new ImageIcon("Iconos/botonInv.png"));
		btninventario.setContentAreaFilled(false);
		btninventario.setBorder(null);
		btninventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inventario inventario=new Inventario();
				inventario.setVisible(true);
				
				
			}
		});
		btninventario.setBounds(571, 98, 260, 83);
		panel.add(btninventario);
		
		JButton btncliente = new JButton("");
		btncliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Personas personas=new Personas();
				personas.setVisible(true);

				
				
			}
		});
		btncliente.setIcon(new ImageIcon("Iconos/botonCli.png"));
		btncliente.setContentAreaFilled(false);
		btncliente.setBorder(null);
		btncliente.setBounds(16, 225, 260, 83);
		panel.add(btncliente);
		
		/*JButton btnreporte = new JButton("");
		btnreporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reporte reporte = new Reporte();
				reporte.setVisible(true);

				
			}
		});
		btnreporte.setIcon(new ImageIcon("Iconos/botonRep.png"));
		btnreporte.setContentAreaFilled(false);
		btnreporte.setBorder(null);
		btnreporte.setBounds(293, 225, 260, 83);
		panel.add(btnreporte);*/
		
		JButton btnproveedor = new JButton("");
		btnproveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Proveedor proeveedor = new Proveedor();
				proeveedor.setVisible(true);

				
			}
		});
		btnproveedor.setIcon(new ImageIcon("Iconos/botonPro.png"));
		btnproveedor.setContentAreaFilled(false);
		btnproveedor.setBorder(null);
		btnproveedor.setBounds(571, 225, 260, 83);
		panel.add(btnproveedor);
		
		JButton btnadministrador = new JButton("");
		btnadministrador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				Reporte reporte = new Reporte();
				reporte.setVisible(true);
				
			}
		});
		btnadministrador.setIcon(new ImageIcon("Iconos/botonAdm.png"));
		btnadministrador.setContentAreaFilled(false);
		btnadministrador.setBorder(null);
		btnadministrador.setBounds(293, 225, 260, 83);
		//btnadministrador.setBounds(16, 325, 260, 83);
		panel.add(btnadministrador);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(405, 427, 117, 43);
		panel.add(btnSalir);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(545, 427, 117, 43);
		panel.add(btnCerrarSesion);
		
		JLabel lblSesionIniciadaPor = new JLabel("Sesion Iniciada por:");
		lblSesionIniciadaPor.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		lblSesionIniciadaPor.setBounds(16, 31, 193, 29);
		panel.add(lblSesionIniciadaPor);
		

		
	}
}
