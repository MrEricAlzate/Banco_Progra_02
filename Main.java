public class Main {
    public static void main(String[] args) {

        Cuenta banco = new Cuenta("0000000000", "Banco", "2024", "Activo");

        CuentaAhorros ahorros = new CuentaAhorros(
                "1111111111",
                "Eric",
                "2024-03-01",
                "Activa",
                10000);

        banco.agregarCuenta(ahorros);

        System.out.println(ahorros); // Para mostrar los datos de la cuenta
        // Cuenta.mostrarCuentas(); Este es para mostrar todos los datos de la cuenta

        System.out.println("Saldo: $" + ahorros.getSaldo());
    }
}
