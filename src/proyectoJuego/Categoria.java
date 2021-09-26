
package proyectoJuego;


public class Categoria {
    
    private int nivel;
    private String tema;

    public Categoria(int nivel, String tema) {
        this.nivel = nivel;
        this.tema = tema;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
}
