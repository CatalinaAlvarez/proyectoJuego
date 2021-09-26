
package proyectoJuego;

import java.util.ArrayList;


public class Opciones {
    private int categoria, numeroPregunta;
    private String opcion1, opcion2, opcion3, opcion4, opcionCorrecta;

    public Opciones(int categoria, int numeroPregunta, String opcion1, String opcion2, String opcion3, String opcion4, String opcionCorrecta) {
        this.categoria = categoria;
        this.numeroPregunta = numeroPregunta;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.opcionCorrecta = opcionCorrecta;
    }

    public Opciones() {
    }
    
    public String getOpciones(int numeroRandom, int contadorCategoria, ArrayList<Opciones> opciones, int caso){
        for (int i = 0; i < opciones.size(); i++) {
            if (opciones.get(i).getCategoria() == contadorCategoria && opciones.get(i).getNumeroPregunta() == numeroRandom) {
                opcion1 = opciones.get(i).getOpcion1(); 
                opcion2 = opciones.get(i).getOpcion2();
                opcion3 = opciones.get(i).getOpcion3();
                opcion4 =opciones.get(i).getOpcion4(); //añadir label opciones
                opcionCorrecta = opciones.get(i).getOpcionCorrecta(); 
            }
        }
        switch(caso){
                case 1: return opcion1;
                case 2: return opcion2;
                case 3: return opcion3;
                case 4: return opcion4;
                case 5: return opcionCorrecta;
                default: return "Nope";
        }
    }
                
    
    /*public String establecerOpcion1(){
        return opcion1;
    }
    
    public String establecerOpcion2(){
        return opcion2;
    }
    
    public String establecerOpcion3(){
        return opcion3;
    }
    
    public String establecerOpcion4(){
        return opcion4;
    }
    
    public String establecerOpcionCorrecta(){
        return opcionCorrecta;
    }*/
    
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

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(String opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }
    
    public ArrayList<Opciones> agregarOpciones(){
        ArrayList<Opciones> opciones = new ArrayList<Opciones>();
        
        Opciones opcionesPregunta1 = new Opciones(1, 1, "Miguel Ángel", "Leonardo DaVinci", "Pablo Picasso", "Tiziano", "Leonardo DaVinci");
        Opciones opcionesPregunta2 = new Opciones(1, 2, "Francisco de Goya", "Leonardo DaVinci", "Miguel Ángel", "Picasso", "Miguel Ángel");
        Opciones opcionesPregunta3 = new Opciones(1, 3, "Van Gogh", "Miguel Ángel", "Francisco de Goya", "Paul Gaugin", "Van Gogh");
        Opciones opcionesPregunta4 = new Opciones(1, 4, "Miguel Ángel", "Diego Rivera", "Diego Velásquez", "Fernando Botero", "Fernando Botero");
        Opciones opcionesPregunta5 = new Opciones(1, 5, "Gabriel García Márquez", "William Shakespeare", "Miguel de Cervantes", "Edgar Allan Poe", "Miguel de Cervantes");
        
        Opciones opcionesPregunta6 = new Opciones(2, 1, "Amazonas", "Nilo", "Yangtsé", "Río Amarillo", "Amazonas");
        Opciones opcionesPregunta7 = new Opciones(2, 2, "Rusia", "India", "China", "Estados Unidos", "Rusia");
        Opciones opcionesPregunta8 = new Opciones(2, 3, "Rusia", "India", "China", "Estados Unidos", "China");
        Opciones opcionesPregunta9 = new Opciones(2, 4, "4", "5", "6", "7", "5");
        Opciones opcionesPregunta10 = new Opciones(2, 5, "Montevideo", "Buenos Aires", "Santiago", "Asunción", "Asunción");
        
        Opciones opcionesPregunta11 = new Opciones(3, 1, "Siete", "Ocho", "Seis", "Cinco", "Seis");
        Opciones opcionesPregunta12 = new Opciones(3, 2, "Caballo", "Peón", "Reina", "Alfil", "Caballo");
        Opciones opcionesPregunta13 = new Opciones(3, 3, "Judista", "Juda", "Judoka", "Judoto", "Judoka");
        Opciones opcionesPregunta14 = new Opciones(3, 4, "Veinte", "Once", "Diez", "Quince", "Once");
        Opciones opcionesPregunta15 = new Opciones(3, 5, "Italia", "Argentina", "Alemania", "Brasil", "Brasil");
        
        Opciones opcionesPregunta16 = new Opciones(4, 1, "Primera cruzada", "Guerras Napoleónicas", "La guerra de los 100 años", "La guerra de los 30 años", "La guerra de los 100 años");
        Opciones opcionesPregunta17 = new Opciones(4, 2, "Cuzco", "Quito", "Machu Picchu", "Lima", "Cuzco");
        Opciones opcionesPregunta18 = new Opciones(4, 3, "Julio Cesar", "Cesar Augusto", "Nerón", "Calígula", "Cesar Augusto");
        Opciones opcionesPregunta19 = new Opciones(4, 4, "España", "Francia", "Polonia", "Portugal", "Francia");
        Opciones opcionesPregunta20 = new Opciones(4, 5, "Austria", "Suiza", "Alemania", "Polonia", "Austria");
        
        Opciones opcionesPregunta21 = new Opciones(5, 1, "Glucosa", "Glucógeno", "CO2 y H2O", "Ácido pirúvico", "Ácido pirúvico");
        Opciones opcionesPregunta22 = new Opciones(5, 2, "Gatos", "Pájaros", "Roedores", "Perros", "Perros");
        Opciones opcionesPregunta23 = new Opciones(5, 3, "Koalas", "Osos", "Primates", "Perros", "Primates");
        Opciones opcionesPregunta24 = new Opciones(5, 4, "Iridio", "Wolframio", "Osmio", "Platino", "Osmio");
        Opciones opcionesPregunta25 = new Opciones(5, 5, "Alexander Fleming", "Edward Jenner", "William Osler", "Louis Pasteur", "Alexander Fleming");
        
        opciones.add(opcionesPregunta1);
        opciones.add(opcionesPregunta2);
        opciones.add(opcionesPregunta3);
        opciones.add(opcionesPregunta4);
        opciones.add(opcionesPregunta5);
        opciones.add(opcionesPregunta6);
        opciones.add(opcionesPregunta7);
        opciones.add(opcionesPregunta8);
        opciones.add(opcionesPregunta9);
        opciones.add(opcionesPregunta10);
        opciones.add(opcionesPregunta11);
        opciones.add(opcionesPregunta12);
        opciones.add(opcionesPregunta13);
        opciones.add(opcionesPregunta14);
        opciones.add(opcionesPregunta15);
        opciones.add(opcionesPregunta16);
        opciones.add(opcionesPregunta17);
        opciones.add(opcionesPregunta18);
        opciones.add(opcionesPregunta19);
        opciones.add(opcionesPregunta20);
        opciones.add(opcionesPregunta21);
        opciones.add(opcionesPregunta22);
        opciones.add(opcionesPregunta23);
        opciones.add(opcionesPregunta24);
        opciones.add(opcionesPregunta25);
        
        return opciones;
    }
}


