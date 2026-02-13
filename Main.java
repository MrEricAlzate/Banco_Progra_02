public class Main {
    public static void main(String[] args) {

        Cuenta banco = new Cuenta("0000000000", "Banco", "2024", "Activo");

        CuentaAhorros ahorros = new CuentaAhorros(
                "1111111111",
                "Eric",
                "2024-03-01",
                "Activa",
                150000);
        CuentaCorriente corriente = new CuentaCorriente(
                "18184950192",
                "Nikoll",
                "24.01.2021",
                "Activa",
                50000,
                400000);

        CuentaNomina nomina = new CuentaNomina(
                "1086412941",
                "Sebas",
                "01-05-2004",
                "Activo",
                10000.0,
                4.5);

        banco.agregarCuenta(corriente);
        banco.agregarCuenta(ahorros);
        banco.agregarCuenta(nomina);

        /*
         * System.out.println(corriente);
         * System.out.println(ahorros); // Para mostrar los datos de la cuenta
         */
        Cuenta.mostrarCuentas(); // Este es para mostrar todos los datos de las cuentas

        System.out.println("Retiraremos 450.000 de la cuenta de ahorros en la cual tenemos 150000");
// System.out.println("Saldo: $" + ahorros.getSaldo()); //para obtener el saldo
        // de alguna cuenta en especifico
        ahorros.retirar(450000);

        System.out.println("Retiraremos 400.000 de la cuenta corriente en la cual tenemos 50.000");
        corriente.retirar(400000);
        System.out.println("El saldo de la cuenta corriente es " + corriente.getSaldo());
        System.out.println(nomina+" Se procedera cambiar la cuenta a corriente");

    }
}
