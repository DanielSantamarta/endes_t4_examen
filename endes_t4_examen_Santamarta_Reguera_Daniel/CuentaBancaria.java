package endes_t4_examen_Santamarta_Reguera_Daniel;

/**
 * CuentaBancaria
 * Es un objeto que nos permite crear diferentes cuentas con diferentes Clientes
 * @author Daniel Santamarta Reguera
 * @version 1.0,12/03/2024
 */
public class CuentaBancaria {
    /**
     * NumeroCuenta
     * Valor de tipo cadena de texto que identifica cada cuenta bancaria
     */
    private String numeroCuenta;
    /**
     * Saldo
     * valor de tipo numerico entero que indica la cantidad de dinero dentro de la cuenta bancaria
     */
    private double saldo;
    /**
     * Propietario
     * Valor de tipo Cliente que nos da informacion del dueño de la cuenta
     */
    private Cliente propietario;

    /**
     * Constructor CuentaBancaria
     * permite crear Cuentas bancarias añadiendo los siguientes datos
     * @param numeroCuenta Identifacatorio de cada Cuenta
     * @param saldo cantidad de dinero de la cuenta
     * @param propietario objeto de la clase Cliente
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Depositar
     * Permite sumarle una cantidad de ingresos al saldo ya definido
      * @param cantidad variable de tipo numerico entero
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    /**
     * Retirar
     * Permite restatrle una cantidad de ingresos al saldo ya definido
     * @param cantidad variable de tipo numerico entero
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * toString
     * Metodo que devuelve unna cadena de texto con los datos del objeto CuentaBancaria
     * @return cadena de texto
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}
