/**
 *
 * @author Juan
 */

public class Usuario extends Persona{
    
   private boolean isSuspendido;

    Usuario(String cedula, String nombre, String apellido, String telefono, String direccion, String correo, boolean isSuspendido) {
        super(cedula, nombre, apellido, telefono, direccion, correo);
        this.isSuspendido = isSuspendido;
    }

   
    Usuario(String cedula, String nombre, String apellido, String telefono, String direccion, String correo) {
        this(cedula,nombre,apellido,telefono,direccion,correo,false);
    }


    public void setSuspendido(boolean isSuspendido) {
        this.isSuspendido = isSuspendido;
    }
    
    public boolean isSuspendido() {
        return isSuspendido;
    }
                   
    @Override
    public String toString() {
        return """
               Usuario
               Está Suspendido: """+ String.valueOf(isSuspendido) + "\n"+super.toString();
    }
    
    
}
