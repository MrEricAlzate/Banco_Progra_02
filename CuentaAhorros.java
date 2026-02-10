public class CuentaAhorros extends Cuenta {

    private static final double SALDO_MINIMO = 100000;
    private static final double TASA_ANUAL = 0.036; // 3.6%

    // Constructor
public CuentaAhorros(String numeroCuenta, String titular,
                     String fechaApertura, String estado,
                     double saldoInicial) {

    super(numeroCuenta, titular, fechaApertura, estado);

    if (saldoInicial >= SALDO_MINIMO) {
        this.saldo = saldoInicial;
        this.estado = "Activa";
    } else {
        this.saldo = 0;
        this.estado = "Rechazada";
        System.out.println("No se pudo abrir la cuenta: saldo mínimo $100,000");
    }
}


    public void aplicarInteresMensual() {
        double interesMensual = saldo * (TASA_ANUAL / 12);     // Interés mensual
        saldo += interesMensual;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && saldo - monto >= 0) {  //aca no permite el sobregiro
            saldo -= monto;
            return true;
        }
        return false;
    }
}
