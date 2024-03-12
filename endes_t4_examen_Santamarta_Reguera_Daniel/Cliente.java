package endes_t4_examen_Santamarta_Reguera_Daniel;

import java.util.ArrayList;
import java.util.List;
/**
 * Cliente
 * Es un objeto que nos permite crear diferentes Clientes con diferentes datos cada uno
 * @author Daniel Santamarta Reguera
 * @version 1.0,12/03/2024
 */
public class Cliente {
    /**
     * Nombre
     * valor de tipo cadena de texto que marca el nombre del cliente
     */
    private String nombre;
    /**
     * Apellido
     * valor de tipo cadena de texto que marca el apellido del cliente
     */
    private String apellido;
    /**
     * ID
     * variable de tipo cadena de texto que identifica el objeto Cliente
     */
    private String id;
    /**
     * Cuentas
     * Lista que almacena objetos de tipo CuentaBancaria
     */
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor Cliente
     * permite crear Clientes añadiendo los siguientes datos
     * @param nombre cadena de texto
     * @param apellido cadena de texo
     * @param id cadena de texto
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * AgregarCuenta
     * Permite añadir objetos de la clase CuentaBancaria a la lista cuentas
     * @param cuenta Obejo tipo CuentaBancaria
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * CerrarCuenta
     * Permite eliminar un objeto de la clase CuentaBancaria de la lista Cuentas si cumple con el mismo Numero de Cuenta
     * @param numeroCuenta cadena de texto que diferencia cada Cuenta Bancaria
     * @return  devuelve la lista con la cuenta eliminada
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }
    /**
     * toString
     * Metodo que devuelve unna cadena de texto con los datos del objeto Cliente
     * @return cadena de texto
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
