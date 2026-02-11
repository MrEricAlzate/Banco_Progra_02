class CuentaNomina extends Cuenta {
    private static double COBRO_COMISION = 8000;

    //constructor
    public CuentaNomina(String numeroCuenta, String titular, String fechaApertura,
                        String estado, Double saldoInicial,Double MesesSinSalario) {



        super(numeroCuenta, titular, fechaApertura, estado);

        if (MesesSinSalario<3){
            this.saldo = saldoInicial;
            this.estado = "Cuenta nómina activa";

            if (MesesSinSalario>1){
                this.saldo = saldoInicial;
                this.estado = "Cuenta nómina sin ingreso mensual";
                CobroComision();
                System.out.println("Se procedera a cobrar 8,000 de comisión a la cuenta");


                if (MesesSinSalario<1){
                    this.saldo = saldoInicial;
                    this.estado = "Cuenta nómina activa";
                    if (MesesSinSalario>=3){
                        this.saldo = saldoInicial;
                        this.estado = "Cuenta nómina inactiva";
                        System.out.println("Se procedera a cambiar el tipo de cuenta a corriente");

                    }

                }
            }

        }
    }
    public void CobroComision (){
        double comision = saldo - (COBRO_COMISION);
        saldo += comision;
        }
    }

