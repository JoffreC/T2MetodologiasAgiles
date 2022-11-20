
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
        int opcionModulo;
        int opcionGestorU;
        int opcionGestorL;
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
        int paginas;
        Ejemplar ejemplar;
        int idEjemplar;
        String estadoEjemplar;
        GestorUsuario gestorU = new GestorUsuario();
        GestorLibro gestorL = new GestorLibro();
        Scanner in = new Scanner(System.in);

        while (continuar == true) {
            System.out.println("""
                               \nOpciones (Ingresar el número):\n
                               1. Gestor Usuario
                               2. Gestor Libro""");
            opcionModulo = Integer.parseInt(in.nextLine());

            switch (opcionModulo) {

                case 1 -> {
                    System.out.println("""
                               \nOpciones (Ingresar el número):\n
                               1. Registrar Usuario
                               2. Eliminar Usuario
                               3. Buscar Usuario""");
                    opcionGestorU = Integer.parseInt(in.nextLine());
                    switch (opcionGestorU) {
                        case 1 -> {
                            System.out.println("\nIngresar la cédula:");
                            cedula = in.nextLine();

                            System.out.println("Ingresar el nombre:");
                            nombre = in.nextLine();

                            System.out.println("Ingresar apellido:");
                            apellido = in.nextLine();

                            System.out.println("Ingresar telefono:");
                            telefono = in.nextLine();

                            System.out.println("Ingresar dirección:");
                            direccion = in.nextLine();

                            System.out.println("Ingresar correo:");
                            correo = in.nextLine();

                            usuario = new Usuario(cedula, nombre, apellido,
                                    telefono, direccion, correo);

                            gestorU.registrarUsuario(usuario);
                            System.out.println(usuario.toString());
                        }
                        case 2 -> {
                            System.out.println("\nIngrese el número de cédula:");
                            gestorU.eliminarUsuario(in.nextLine());
                        }
                        case 3 -> {
                            System.out.println("\nIngrese el número de cédula:");
                            usuario = gestorU.buscarUsuario(in.nextLine());
                            if (usuario != null) {
                                System.out.println(usuario.toString());
                            } else {
                                System.out.println("No se encontró al usuario");
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("""
                               \nOpciones (Ingresar el número):\n
                               1. Agregar Libro
                               2. Eliminar Libro
                               3. Buscar Libro
                               4. Agregar Ejemplar""");
                    opcionGestorL = Integer.parseInt(in.nextLine());
                    switch (opcionGestorL) {
                        case 1 -> {
                            System.out.println("\nIngrese el id del libro:");
                            idLibro = in.nextLine();

                            System.out.println("\nIngrese el título del libro:");
                            titulo = in.nextLine();

                            System.out.println("\nIngrese el ISBN del libro:");
                            isbn = in.nextLine();

                            System.out.println("\nIngrese el autor del libro:");
                            autor = in.nextLine();

                            System.out.println("\nIngrese el numero de paginas:");
                            paginas = Integer.parseInt(in.nextLine());

                            libro = new Libro(idLibro, titulo, autor, isbn, paginas);

                            gestorL.agregarLibro(libro);
                            System.out.println(libro.toString());

                        }
                        case 2 -> {
                            System.out.println("\nIngrese el id del libro:");
                            gestorL.eliminarLibro(in.nextLine());
                        }
                        case 3 -> {
                            System.out.println("\nIngrese el id del libro:");
                            libro = gestorL.buscarLibro(in.nextLine());
                            if (libro != null) {
                                System.out.println(libro.toString());
                            } else {
                                System.out.println("No se encontró el libro");
                            }

                        }
                        case 4 -> {
                            System.out.println("\nIngrese el id del libro:");
                            idLibro = in.nextLine();
                            libro = gestorL.buscarLibro(idLibro);

                            if (libro != null) {
                                System.out.println("\nIngrese el id del ejemplar:");
                                idEjemplar = Integer.parseInt(in.nextLine());

                                System.out.println("\nIngrese el estado del ejemplar:");
                                estadoEjemplar = in.nextLine();

                                ejemplar = new Ejemplar(idEjemplar, idLibro, estadoEjemplar);

                                libro.agregarEjemplar(ejemplar);
                            } else {
                                System.out.println("Libro no encontrado");
                            }

                        }
                    }
                }
            }

            System.out.println("\n¿Quiere seguir utilizando la aplicación? Si o No");
            continuar = !in.nextLine().toUpperCase().equals("NO");

        }

    }

}
