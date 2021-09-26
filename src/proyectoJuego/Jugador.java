
package proyectoJuego;


public class Jugador {
    
    private String nombre, apellido;
    private int documento;

    public Jugador(int documento,String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
}
