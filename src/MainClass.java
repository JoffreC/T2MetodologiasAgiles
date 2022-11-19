
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
        Libro libro;
        String idLibro;
        String titulo;
        String autor;
        String isbn;
        int stock;
        int paginas;
        GestorUsuario gestor = new GestorUsuario();
        GestorLibros gestorL= new GestorLibros();
        Scanner in = new Scanner(System.in);

        while (continuar == true) {
            System.out.println("""
                               \nOpciones (Ingresar el número):\n
                               1. Registrar Usuario\n
                               2. Eliminar Usuario\n
                               3. Agregar libro\n
                               4. Eliminar libro\n
                               5. Buscar libro\n""");
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
                case 3 -> {
                    System.out.println("\nIngrese el id del libro:");
                    idLibro=in.nextLine();
                    System.out.println("\nIngrese el título del libro:");
                    titulo=in.nextLine();
                    System.out.println("\nIngrese el autor del libro:");
                    autor=in.nextLine();
                    System.out.println("\nIngrese el isbn del libro:");
                    isbn=in.nextLine();
                    System.out.println("\nIngrese el stock del libro:");
                    stock=Integer.parseInt(in.nextLine());
                    System.out.println("\nIngrese el numero de paginas:");
                    paginas=Integer.parseInt(in.nextLine());
                    libro=new Libro(idLibro,titulo,autor,isbn,stock,paginas);
                    gestorL.agregarLibro(libro);
                }
                case 4-> {
                    System.out.println("\nIngrese el id del libro a eliminar:");
                    idLibro=in.nextLine();
                    gestorL.eliminarLibro(idLibro);
                }
                case 5-> {
                    System.out.println("\nIngrese el id del libro:");
                    idLibro=in.nextLine();
                    gestorL.buscarLibro(idLibro);
                }
            }
            
            System.out.println("\n¿Quiere seguir agregado o eliminando? Si o No");
            continuar = !in.nextLine().toUpperCase().equals("NO");

        }

    

    }

}