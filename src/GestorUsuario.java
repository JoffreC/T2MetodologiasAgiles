
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class GestorUsuario {

    ArrayList<Usuario> usuarios = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    //Método registrar usuario
    public void registrarUsuario(Usuario usuario) {
        while (!esValida(usuario.getCedula())) {
            System.out.println("\nNo se puede realizar el registro del cliente: "
                    + "CÉDULA INVÁLIDA\n" + "Ingresar de nuevo");
            usuario.setCedula(in.nextLine());
        }
        usuarios.add(usuario);
        System.out.println("\nAgregado correctamente\n");

    }

    //Método eliminarUsuario cliente
    public void eliminarUsuario(String cedula) {
        if (!usuarios.isEmpty()) {
            for (Iterator<Usuario> it = usuarios.iterator(); it.hasNext();) {
                Usuario cliente = it.next();
                if (cliente.getCedula().equals(cedula)) {
                    it.remove();
                    System.out.println("\nEliminación exitosa\n");
                } else {
                    System.out.println("\nCliente no encontrado");
                }
            }
        } else {
            System.out.println("\nNo existen clientes registrados\n");
        }

    }

    //Método para validar cédula
    public static boolean esValida(String cedula) {
        int suma = 0;
        if (cedula.length() == 9) {
            return false;
        } else {
            int a[] = new int[cedula.length() / 2];
            int b[] = new int[(cedula.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < cedula.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(cedula.charAt(c)));
                c = c + 2;
                if (i < (cedula.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(cedula.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(cedula.charAt(cedula.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && cedula.charAt(cedula.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }

        }
    }
}
