
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        int opcion;
        Usuario usuario;
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        String direccion;
        String correo;
        GestorUsuario gestor = new GestorUsuario();
        Scanner in = new Scanner(System.in);

        while (continuar == true) {
            System.out.println("""
                               \nOpciones (Ingresar el número):\n
                               1. Registrar Usuario\n
                               2. Eliminar Usuario\n""");
            opcion = Integer.parseInt(in.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("\nIngresar la cédula");
                    cedula = in.nextLine();

                    System.out.println("Ingresar el nombre");
                    nombre = in.nextLine();

                    System.out.println("Ingresar apellido");
                    apellido = in.nextLine();

                    System.out.println("Ingresar telefono");
                    telefono = in.nextLine();

                    System.out.println("Ingresar dirección");
                    direccion = in.nextLine();

                    System.out.println("Ingresar correo");
                    correo = in.nextLine();

                    usuario = new Usuario(cedula, nombre, apellido,
                            telefono, direccion, correo);

                    gestor.registrarUsuario(usuario);
                    System.out.println(usuario.toString());
                }
                case 2 -> {
                    System.out.println("\nIngrese el número de cédula");
                    gestor.eliminarUsuario(in.nextLine());
                }
            }
            
            System.out.println("\n¿Quiere seguir agregado o eliminando? Si o No");
            continuar = !in.nextLine().toUpperCase().equals("NO");

        }

    }

}
