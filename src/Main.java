public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 25;
        cliente.nombre = "Pepe";
        cliente.telefono = 915086254;
        cliente.credito = 1500;

        System.out.println("edad del cliente:"+cliente.edad);
        System.out.println("nombre del cliente:"+cliente.nombre);
        System.out.println("teléfono del cliente:"+cliente.telefono);
        System.out.println("crédito del cliente:"+cliente.credito);

        trabajador.edad = 50;
        trabajador.nombre = "Julián";
        trabajador.telefono = 914803254;
        trabajador.salario = 1578;

        System.out.println("Mi nombre es " + trabajador.nombre + " y tengo " + trabajador.edad + " años. Mi teléfono es el " + trabajador.telefono + " y mi salario es de " + trabajador.salario + " euros.")
        ;




    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}