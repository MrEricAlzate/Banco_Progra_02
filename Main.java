public class Main {
    public static void main(String[] args) {

        Cuenta banco = new Cuenta("0000000000", "Banco", "2024", "Activo");

        Cuenta c1 = new Cuenta("1234567890", "Eric", "2024-01-01", "Activa");
        Cuenta c2 = new Cuenta("0987654321", "Ana", "2024-02-01", "Activa");

        banco.agregarCuenta(c1);
        banco.agregarCuenta(c2);

        c1.infoCuenta();

        boolean eliminada = banco.eliminarCuenta("1234567890");

        if (eliminada) {
            System.out.println("Cuenta eliminada correctamente");
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }
}

