package modelo;

public class Detalle_fac {
	int cantidad, idProducto;
	String numFactura;
	double SubDetalleFac;


	public double getSubDetalleFac() {
		return SubDetalleFac;
	}

	public void setSubDetalleFac(double subDetalleFac) {
		this.SubDetalleFac  = subDetalleFac;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	

}
