
package proyectoJuego;


public class Premio {
    
    private int categoria, premio;

    public Premio(int categoria, int premio) {
        this.categoria = categoria;
        this.premio = premio;
    }

    public Premio() {
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    
}
