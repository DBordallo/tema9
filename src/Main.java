public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Pepe";
        cliente.telefono = 915086254;
        cliente.credito = 1500;

        System.out.println("edad del cliente:"+cliente.edad);
        System.out.println("nombre del cliente:"+cliente.nombre);
        System.out.println("teléfono del cliente:"+cliente.telefono);
        System.out.println("crédito del cliente:"+cliente.credito);


    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;


}

class Cliente extends Persona {
    int credito;

}

final class Tabajador extends Persona{
    int salario;

}