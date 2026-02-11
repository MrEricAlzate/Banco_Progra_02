   public class CuentaCorriente extends Cuenta {

       private static final double LIMITE_SOBREGIRO = 500000;
       private static final double COMISION_MENSUAL_FIJA = 15000;
       private static final double INTERES_SOBREGIRO_MENSUAL = 0.02; //2%

       //constructor
       public CuentaCorriente(String numeroCuenta, String titular,
                              String fechaApertura, String estado, double saldoActual, double sobregiro) {

           super(numeroCuenta, titular, fechaApertura, estado);
           if (saldoActual >= 0) {
               this.saldo = saldoActual;
               this.estado = "Saldo positivo";
               cobrocomisionfija();
               if (sobregiro > LIMITE_SOBREGIRO) {
                   this.saldo = -sobregiro;
                   this.estado = "Saldo negativo";
                   cobrointeressobregiromensual();
                   System.out.println("Se paso del limite del sobregiro, su cuenta quedara en negativo");
               }


           }

       }


       public void cobrocomisionfija() {
           double comisionfija = saldo - (COMISION_MENSUAL_FIJA);
           saldo += comisionfija;
       }

       public void cobrointeressobregiromensual() {
           double interessobregiro = saldo * (INTERES_SOBREGIRO_MENSUAL);


       }
   }




