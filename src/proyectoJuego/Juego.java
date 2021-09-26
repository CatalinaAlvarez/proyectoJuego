package proyectoJuego;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;



public class Juego {

    static ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    static ArrayList<Premio> premios = new ArrayList<Premio>();
    private static String nombre, apellido, pregunta, opcion1, opcion2, opcion3, opcion4, opcionCorrecta;
    private static int documento, premio, acumuladorPremio, contadorCategoria;
    static Vista vista1 = new Vista();
    static Final final1 = new Final();
    static Resultado resultado1 = new Resultado();
    public static String respuestaSeleccionada;
    public static Pregunta preguntaClase = new Pregunta();
    public static Opciones opcionesClase = new Opciones();
    public static Premio premioJugador = new Premio();
    public static Jugador jugadorMain = new Jugador();
    public ArrayList<String[]> lineaDatos = new ArrayList<>();


    public void obtenerNombre(String nombreJugador) {
        nombre = nombreJugador;
    }

    public void obtenerApellido(String apellidoJugador) {
        apellido = apellidoJugador;
    }

    public void obtenerDocumento(int documentoJugador) {
        documento = documentoJugador;
    }

    public String establecerPregunta() {
        return pregunta;
    }

    public String establecerOpcion1() {
        return opcion1;
    }

    public String establecerOpcion2() {
        return opcion2;
    }

    public String establecerOpcion3() {
        return opcion3;
    }

    public String establecerOpcion4() {
        return opcion4;
    }

    public String establecerOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void obtenerRespuestaSeleccionada(String seleccionada) {
        respuestaSeleccionada = seleccionada;
    }

    public String getRespuestaSeleccionada() {
        return respuestaSeleccionada;
    }

    public int premio() {
        return premio;
    }

    public int contador() {
        return contadorCategoria;
    }
    
    public void obtenerJugador(Jugador jugador){
        jugadorMain = jugador;
    }

    public static void main(String[] args) {

        Categoria categoria1 = new Categoria(1, "Arte ");
        Categoria categoria2 = new Categoria(2, "Geografía ");
        Categoria categoria3 = new Categoria(3, "Deporte ");
        Categoria categoria4 = new Categoria(4, "Historia ");
        Categoria categoria5 = new Categoria(5, "Ciencias ");

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);

        Premio premio1 = new Premio(1, 100000);
        Premio premio2 = new Premio(2, 250000);
        Premio premio3 = new Premio(3, 500000);
        Premio premio4 = new Premio(4, 1000000);
        Premio premio5 = new Premio(5, 5000000);

        premios.add(premio1);
        premios.add(premio2);
        premios.add(premio3);
        premios.add(premio4);
        premios.add(premio5);

        vista1.setVisible(true);

        Jugador jugador1 = new Jugador(documento, nombre, apellido); //validar que funcione

        contadorCategoria = 1;
        acumuladorPremio = 0;
        premio = premios.get(0).getPremio();
        iniciarNivel();    
    }

    public void siguienteNivel() {
        if(contadorCategoria<5){
        vista1.setVisible(false);
        resultado1.setVisible(true);
        vista1.dispose();
        acumuladorPremio = acumuladorPremio + premios.get(contadorCategoria-1).getPremio();
        int acumuladorImprimir = acumuladorPremio + premios.get(contadorCategoria).getPremio();
        final1.campoAcumulado.setText(String.valueOf(acumuladorImprimir));
        premio = premios.get(contadorCategoria).getPremio();
        contadorCategoria = contadorCategoria+1;
        System.out.println(acumuladorPremio);
        System.out.println(premio);
        }
        else {
            final1.respuestaFinal.setText("¡GANASTE!");
            vista1.setVisible(false);
            final1.setVisible(true);
            premioJugador.setCategoria(contadorCategoria);
            premioJugador.setPremio(acumuladorPremio + premios.get(contadorCategoria-1).getPremio());
            System.out.println(premioJugador.getCategoria());
            System.out.println(premioJugador.getPremio());
            escribirTexto(String.valueOf(jugadorMain.getDocumento()),jugadorMain.getNombre(), jugadorMain.getApellido(), String.valueOf(premioJugador.getCategoria()), String.valueOf(premioJugador.getPremio()));
             
        }
    }
    
    public static void iniciarNivel(){
        int numeroRandom = (int) (Math.random() * 5 + 1);
        pregunta = preguntaClase.getPreguntaRandom(numeroRandom, contadorCategoria, preguntaClase.agregarPreguntas());

        opcion1 = opcionesClase.getOpciones(numeroRandom, contadorCategoria, opcionesClase.agregarOpciones(), 1);
        opcion2 = opcionesClase.getOpciones(numeroRandom, contadorCategoria, opcionesClase.agregarOpciones(), 2);
        opcion3 = opcionesClase.getOpciones(numeroRandom, contadorCategoria, opcionesClase.agregarOpciones(), 3);
        opcion4 = opcionesClase.getOpciones(numeroRandom, contadorCategoria, opcionesClase.agregarOpciones(), 4);
        opcionCorrecta = opcionesClase.getOpciones(numeroRandom, contadorCategoria, opcionesClase.agregarOpciones(), 5);
    }
 
    public void terminarJuego(String tipoFinalizacion){
        vista1.setVisible(false);
        final1.setVisible(true);
        final1.campoAcumulado.setText(String.valueOf(acumuladorPremio));
        premioJugador.setCategoria(contadorCategoria);
        premioJugador.setPremio(acumuladorPremio);
        System.out.println(premioJugador.getCategoria());
        System.out.println(premioJugador.getPremio());
        if(tipoFinalizacion == "salida"){
            final1.respuestaFinal.setText("¡Gracias por jugar!");
            premioJugador.setCategoria(contadorCategoria-1);
            premioJugador.setPremio(acumuladorPremio);
            System.out.println(premioJugador.getCategoria());
            System.out.println(premioJugador.getPremio());
            escribirTexto(String.valueOf(jugadorMain.getDocumento()),jugadorMain.getNombre(), jugadorMain.getApellido(), String.valueOf(premioJugador.getCategoria()), String.valueOf(premioJugador.getPremio()));
        }
        else{
            final1.respuestaFinal.setText("¡Respuesta incorrecta!");
            premioJugador.setCategoria(contadorCategoria);
            premioJugador.setPremio(acumuladorPremio);
            System.out.println(premioJugador.getCategoria());
            System.out.println(premioJugador.getPremio());
           
            escribirTexto(String.valueOf(jugadorMain.getDocumento()),jugadorMain.getNombre(), jugadorMain.getApellido(), String.valueOf(premioJugador.getCategoria()), String.valueOf(premioJugador.getPremio()));
            }
    }
    
    public String getRespuestaCorrecta() {
        return opcionCorrecta;
    }
    
    public int acumulador() {
        return acumuladorPremio;
    }

  public void escribirTexto(String documento, String nombre, String apellido, String categoria, String premio) {
    try {
      FileWriter myWriter = new FileWriter("src\\proyectoJuego\\guardarDatos.txt", true);
      myWriter.write(documento + " , " + nombre + " , " + apellido + " , " + categoria + " , " + premio + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

    
    
 

   
}

