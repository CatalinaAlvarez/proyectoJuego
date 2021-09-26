
package proyectoJuego;

import java.util.ArrayList;


public class Pregunta {
    
    private int categoria, numeroPregunta;
    private String pregunta;
    
    public Pregunta() {
    }


    public Pregunta(int categoria, int numeroPregunta, String pregunta) {
        this.categoria = categoria;
        this.numeroPregunta = numeroPregunta;
        this.pregunta = pregunta;
    }
    
    public String getPreguntaRandom(int numeroRandom, int contadorCategoria, ArrayList<Pregunta> preguntas){
        
        for (int i = 0; i < preguntas.size(); i++) {
            if (preguntas.get(i).getCategoria() == contadorCategoria && preguntas.get(i).getNumeroPregunta() == numeroRandom) {
                System.out.println(preguntas.get(i).getPregunta());
                pregunta = preguntas.get(i).getPregunta();
            }
        }
        return pregunta;
    }


    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPregunta() {
        return numeroPregunta;
    }

    public void setNumeroPregunta(int numeroPregunta) {
        this.numeroPregunta = numeroPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public ArrayList<Pregunta> agregarPreguntas(){
        
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
    
        Pregunta pregunta1 = new Pregunta(1, 1, "¿Quién pinto la Mona Lisa o Gioconda? ");
        Pregunta pregunta2 = new Pregunta(1, 2, "¿Quién pintó la Capilla Sixtina? ");
        Pregunta pregunta3 = new Pregunta(1, 3, "¿Quién pintó la noche estrellada? ");
        Pregunta pregunta4 = new Pregunta(1, 4, "Famoso pintor y escultor colombiano: ");
        Pregunta pregunta5 = new Pregunta(1, 5, "¿Quién escribió el Quijote de la mancha? ");
        
        Pregunta pregunta6 = new Pregunta(2,1,"¿Cuál es el río más largo del mundo? ");
        Pregunta pregunta7 = new Pregunta(2,2,"¿Cuál es el país más grande del mundo en superficie? ");
        Pregunta pregunta8 = new Pregunta(2,3,"¿Cuál es el país más poblado del mundo? ");
        Pregunta pregunta9 = new Pregunta(2,4,"¿Cuántos océanos hay en la tierra? ");
        Pregunta pregunta10 = new Pregunta(2,5,"¿Cuál es la capital de Paraguay? ");
        
        Pregunta pregunta11 = new Pregunta(3,1,"¿Cuántos jugadores tiene un equipo de voleibol? ");
        Pregunta pregunta12 = new Pregunta(3,2,"¿Qué pieza de ajedrez puede hacer un movimiento en forma de L? ");
        Pregunta pregunta13 = new Pregunta(3,3,"¿Cómo se llaman los deportistas que practican el judo? ");
        Pregunta pregunta14 = new Pregunta(3,4,"¿A cuántos puntos se disputa un set en el tenis de mesa? ");
        Pregunta pregunta15 = new Pregunta(3,5,"¿Cuál es el país con más mundiales de fútbol ganados? ");
        
        Pregunta pregunta16 = new Pregunta(4,1,"¿En qué guerra participó Juana de Arco? ");
        Pregunta pregunta17 = new Pregunta(4,2,"¿Cuál fue la capital del Imperio Inca? ");
        Pregunta pregunta18 = new Pregunta(4,3,"¿Quién fue el primer emperador romano? ");
        Pregunta pregunta19 = new Pregunta(4,4,"¿Qué país fue llamado la Galia por los romanos? ");
        Pregunta pregunta20 = new Pregunta(4,5,"¿En qué país nació Adolf Hitler? ");
        
        Pregunta pregunta21 = new Pregunta(5,1,"El producto final de la glucolisis es: ");
        Pregunta pregunta22 = new Pregunta(5,2,"¿Qué animales utilizó Ivan Pavlov en sus experimentos? ");
        Pregunta pregunta23 = new Pregunta(5,3,"¿Con qué animales trabaja la bióloga Jane Goodall? ");
        Pregunta pregunta24 = new Pregunta(5,4,"¿Cuál es el elemento químico más denso? ");
        Pregunta pregunta25 = new Pregunta(5,5,"¿Quién descubrió la penicilina? ");

        preguntas.add(pregunta1);
        preguntas.add(pregunta2);
        preguntas.add(pregunta3);
        preguntas.add(pregunta4);
        preguntas.add(pregunta5);
        preguntas.add(pregunta6);
        preguntas.add(pregunta7);
        preguntas.add(pregunta8);
        preguntas.add(pregunta9);
        preguntas.add(pregunta10);
        preguntas.add(pregunta11);
        preguntas.add(pregunta12);
        preguntas.add(pregunta13);
        preguntas.add(pregunta14);
        preguntas.add(pregunta15);
        preguntas.add(pregunta16);
        preguntas.add(pregunta17);
        preguntas.add(pregunta18);
        preguntas.add(pregunta19);
        preguntas.add(pregunta20);
        preguntas.add(pregunta21);
        preguntas.add(pregunta22);
        preguntas.add(pregunta23);
        preguntas.add(pregunta24);
        preguntas.add(pregunta25);
    
        return preguntas;
    }
    
}


