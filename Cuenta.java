import java.util.ArrayList;

public class Cuenta implements Banco {

    // Atributos
    private final String numeroCuenta;
    private String titular;
    protected double saldo;
    private String fechaApertura;
    protected String estado;

    private static ArrayList<Cuenta> cuentas = new ArrayList<>(); // lista array para las cuentas

    // metodos
    public Cuenta(String numeroCuenta, String titular, String fechaApertura, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.fechaApertura = fechaApertura;
        this.estado = estado;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void infoCuenta()  {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Fecha Apertura: " + fechaApertura);
        System.out.println("Estado de la cuenta: " + estado);
    }

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public boolean eliminarCuenta(String numeroCuenta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).numeroCuenta.equals(numeroCuenta)) {
                cuentas.remove(i);
                return true;
            }
        }
        return false;
    }
}
