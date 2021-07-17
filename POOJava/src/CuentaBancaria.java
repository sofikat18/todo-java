
public class CuentaBancaria {
	
	//Atributos de la clase
	private String institucion = "";
	private String beneficiario = "";
	private float saldo = 0;
	private long cuenta = 0;
	private String producto = "";
	private String direccion = "";
	private String RFC = "";
	
	/*
	 * Estos son constructores. Es la forma de inicializar un objeto con parámetros
	o valores ya dados. Pero si lo declaras con parámetros, en delante tienen que 
	considerarse
	
	CuentaBancaria(String beneficiario, float saldo){
		this.beneficiario = beneficiario;
		this.saldo = saldo;
	}
	
	 */
	
	
	//getter y setter
	//get: obtengo el valor
	//set: asigno el valor
	
	public String getInstitucion() {
		return this.institucion;
	}
	
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			throw new IllegalArgumentException("El saldo ingreado es inválido");
		}
		
	}

	public long getCuenta() {
		return cuenta;
	}

	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public void depositos(float monto) {
		
		this.saldo = this.saldo + monto;
		
	}
	
	
	
	//Métodos de la clase
	
public void retiros(float monto) {
	
	if(monto <= this.saldo && monto > 0) {
		this.saldo = this.saldo - monto;
	} else {
		System.out.println("No cuenta con suficiente saldo para hacer su retiro");
	}
		
		
	}

public float consultarSaldo() {
	return this.saldo;
	
}

public String estadoDeCuenta() {
	return "";
	
}

}
