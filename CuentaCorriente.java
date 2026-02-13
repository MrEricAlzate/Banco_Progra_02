public class CuentaCorriente extends Cuenta {

    private static final double LIMITE_SOBREGIRO = 500000;
    private static final double COMISION_MENSUAL_FIJA = 15000;
    private static final double INTERES_SOBREGIRO_MENSUAL = 0.02; // 2%

    // constructor
    public CuentaCorriente(String numeroCuenta, String titular,
            String fechaApertura, String estado, double saldoActual, double sobregiro) {

        super(numeroCuenta, titular, fechaApertura, estado);
        saldo = saldoActual - sobregiro;
        if (saldo>=-LIMITE_SOBREGIRO){
            this.estado = "Saldo negativo";
            cobrointeressobregiromensual();
            cobrocomisionfija();
        }
        if (saldo >= 0) {
            this.estado = "Saldo positivo";
            cobrocomisionfija();
                if (saldo <-LIMITE_SOBREGIRO){
                    this.estado= "Saldo negativo";
                    cobrocomisionfija();
                    System.out.println("Excede el limite de sobregiro, transacción rechazada");
                }
        }

    }

    public void cobrocomisionfija() {

        saldo -= COMISION_MENSUAL_FIJA;
    }

    public void cobrointeressobregiromensual() {
        double interessobregiro = saldo * (INTERES_SOBREGIRO_MENSUAL);
        saldo += interessobregiro;

    }
}
