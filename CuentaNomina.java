class CuentaNomina extends Cuenta {
    private static double COBRO_COMISION = 8000;
    private double mesesSinSalario;
    //constructor
    public CuentaNomina(String numeroCuenta, String titular, String fechaApertura,
                        String estado, Double saldoInicial, Double mesesSinSalario) {


        super(numeroCuenta, titular, fechaApertura, estado);
        this.saldo = saldoInicial;
        this.mesesSinSalario = mesesSinSalario;

        if (mesesSinSalario == 0) {
            this.estado = "Cuenta nómina activa";

            if (mesesSinSalario > 0) {
                this.saldo = saldoInicial;
                this.estado = "Cuenta nómina sin ingreso mensual";
                CobroComision();
                System.out.println("Se procedera a cobrar 8,000 de comisión a la cuenta");


                if (mesesSinSalario >= 3) {
                    this.saldo = saldoInicial;
                    this.estado = "Cuenta nómina inactiva";
                    System.out.println("Se procedera a cambiar el tipo de cuenta a corriente");
                }
            }

        }
    }

    public void CobroComision() {
        double comision = saldo - (COBRO_COMISION);
        saldo += comision;

    }
    @Override
    public String toString() {
        return "Meses sin salario: " + mesesSinSalario;
    }

}

