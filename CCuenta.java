package cuentas;
/**
 * La clase CCuenta representa una cuenta bancaria.
 *
 * @author Mariana
 * @version 1.0
 */
public class CCuenta {

	/**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * Número de cuenta.
     */
    private String cuenta;
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInterés;
    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor parametrizado de la clase CCuenta.
     *
     * @param nom   Nombre del titular de la cuenta.
     * @param cue   Número de cuenta.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }
    /**
     * Obtiene el estado actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */

    public double estado()
    {
        return getSaldo();
    }
    /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad Cantidad a ingresar en la cuenta. Debe ser mayor que cero.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar de la cuenta. Debe ser mayor que cero.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
 // Métodos privados para acceder a los atributos encapsulados

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
