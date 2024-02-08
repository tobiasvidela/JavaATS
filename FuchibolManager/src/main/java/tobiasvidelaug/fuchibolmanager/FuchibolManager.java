package tobiasvidelaug.fuchibolmanager;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;

public class FuchibolManager {
    static ArrayList<Persona> equipo = new ArrayList<>();
    static Random random = new Random();
    
    static String opciones[] = {"Salir",
        "Viaje de equipo",
        "Entrenamiento",
        "Jugar partido",
        "Planificar entrenamiento",
        "Entrevista",
        "Curar lesión"
    };
    
    static boolean entrenado = false;
    
    static int lesionados = 0, partidosJugados = 0, entrenamientosRealizados = 0, entrenamientosPlanificados = 0;
    
    public static void main(String[] args) {
        llenarEquipo();
        //abrir menu
        abrirMenuPrincipal();
    }
    
    public static void abrirMenuPrincipal() {
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Fútbol Club Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
            
            if (opcion > 0) {
                switch (opcion) {
                    case 1 -> { //Viaje de equipo
                        viajarEquipo();
                    }
                    case 2 -> { //Entrenamiento
                        entrenamiento();
                    }
                    case 3 -> { //Jugar partido
                        jugarPartido();
                    }
                    case 4 -> { //Planificar entrenamiento
                        planificarEntrenamiento();
                    }
                    case 5 -> { //Entrevista
                        entrevista();
                    }
                    case 6 -> { //Curar lesión
                        curarLesion();
                    }
                }
            }
        } while (opcion > 0);
    }
    
    public static void viajarEquipo() {
        String lugares[] = {"Ciudad cercana","Ciudad lejana","Barrio","Gimnasio"};
        String vuelta[] = {"El viaje a la "+lugares[0]+" fue tranquilo.",
            "El viaje a la "+lugares[1]+" fue extenso pero fructífero.",
            "El paseo por el "+lugares[2]+" fue grato.",
            "El paso por el "+lugares[3]+" fue agotador."
        };
        String destino = JOptionPane.showInputDialog(null, "¿A dónde viajará el equipo?", opciones[1], JOptionPane.PLAIN_MESSAGE, null, lugares, lugares[0]).toString();
        switch (destino) {
            case "Ciudad cercana" -> {
                JOptionPane.showMessageDialog(null, vuelta[0], "Vuelta", JOptionPane.PLAIN_MESSAGE);
            }
            case "Ciudad lejana" -> {
                JOptionPane.showMessageDialog(null, vuelta[1], "Vuelta", JOptionPane.PLAIN_MESSAGE);
            }
            case "Barrio" -> {
                JOptionPane.showMessageDialog(null, vuelta[2], "Vuelta", JOptionPane.PLAIN_MESSAGE);
            }
            case "Gimnasio" -> {
                JOptionPane.showMessageDialog(null, vuelta[3], "Vuelta", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    public static void entrenamiento() {
        int aleatorio = random.nextInt(10);
        String entrenamientos[] = {
            "Probabilidades de éxito en el próximo partido: ¡1000000%!",
            "Cada sesión ayuda a fortalecer el juego del equipo.",
            "La dedicación y el compromiso son virtudes admirables.",
            "La práctica constante es la clave para alcanzar la excelencia.",
            "Sigamos trabajando para pulir nuestras habilidades y tácticas.",
            "Hoy hemos enfocado el entrenamiento en áreas específicas.",
            "El equipo ha aumentado su química y comunicación.",
            "Cuidar el físico es fundamental en este mercado.",
            "El crecimiento es un proceso continuo.",
            "¡Un jugador se ha lesionado!"
        };
        if (entrenamientosPlanificados == 0) {
            JOptionPane.showMessageDialog(null, "No hay entrenamientos planificados.", "¡Ups!", JOptionPane.WARNING_MESSAGE);
            entrenado = false;
        } else {
            JOptionPane.showMessageDialog(null, entrenamientos[aleatorio], opciones[2], JOptionPane.PLAIN_MESSAGE);
            if (entrenamientos[aleatorio].compareTo("¡Un jugador se ha lesionado!") == 0) {
                lesionados++;
            }
            entrenado = true;
            entrenamientosRealizados++;
            entrenamientosPlanificados--;
        }
    }
    
    public static void jugarPartido() {
        if (entrenado) {
            int jugar; // 0 - Sí | 1 - No
            int goles = random.nextInt(6); //0 a 5
            int golesRival;
            int rendimiento = (entrenamientosRealizados + partidosJugados ) / (lesionados + 1) * 10;
                        
            if (lesionados > 11) {
                jugar = JOptionPane.showConfirmDialog(null, "Demasiados jugadores lesionados, ¿jugar de todas formas?", "Tal vez \"Curar lesión\" sea útil", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (jugar == 1) {
                    return;
                }
                goles = random.nextInt(2);
            }
            
            JOptionPane.showConfirmDialog(null, "...", "Jugando", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            if (rendimiento >= 100) {
                golesRival = random.nextInt(1);
                entrenamientosRealizados /= 2;
                if (random.nextBoolean() && random.nextBoolean() && random.nextBoolean()) {
                    lesionados++;
                    JOptionPane.showMessageDialog(null, "¡Un jugador se ha lesionado!", "Se partieron jugando", JOptionPane.WARNING_MESSAGE);
                }
                
                if (goles > golesRival) {
                    JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival, "¡Victoria!", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival, "Derrota", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (rendimiento >= 45) {
                entrenamientosRealizados = 0;
                golesRival = random.nextInt(3);
                if (random.nextBoolean() && random.nextBoolean()) {
                    lesionados++;
                    JOptionPane.showMessageDialog(null, "¡Un jugador se ha lesionado!", "Se partieron jugando", JOptionPane.WARNING_MESSAGE);
                }
                if (goles > golesRival) {
                    JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival, "¡Victoria!", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival, "Derrota", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (rendimiento >= 9) {
                entrenamientosRealizados = 0;
                golesRival = random.nextInt(2,5);
                if (random.nextBoolean()) {
                    lesionados++;
                    JOptionPane.showMessageDialog(null, "¡Un jugador se ha lesionado!", "Se partieron jugando", JOptionPane.WARNING_MESSAGE);
                }
                if (goles > golesRival) {
                    JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival, "¡Victoria!", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival, "Derrota", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                entrenamientosRealizados = 0;
                goles = random.nextInt(1);
                golesRival = random.nextInt(4,6);
                if (random.nextBoolean()) {
                    lesionados++;
                    JOptionPane.showMessageDialog(null, "¡Un jugador se ha lesionado!", "Se partieron jugando", JOptionPane.WARNING_MESSAGE);
                } else {
                    lesionados++;
                    JOptionPane.showMessageDialog(null, "¡Un jugador se ha lesionado!", "Se partieron jugando", JOptionPane.WARNING_MESSAGE);
                }
                JOptionPane.showConfirmDialog(null, "Goles: "+goles+" - "+golesRival+"\n\nDeberíamos entrenar más.", "Derrota", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            
            partidosJugados++;
        } else {
            JOptionPane.showMessageDialog(null, "Necesitas entrenar para poder jugar otro partido.", opciones[3], JOptionPane.ERROR_MESSAGE);
        }
        if (partidosJugados % 4 == 0) {
            entrenado = false;
        }
    }
    
    public static void planificarEntrenamiento() {
        Integer nroPlanificar[] = {3,4};
        int planificar = JOptionPane.showOptionDialog(null, "¿Cuántos entrenamientos deseás planificar?", opciones[4], JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, nroPlanificar, nroPlanificar[0]);
        switch (planificar) {
            case 0 -> entrenamientosPlanificados += nroPlanificar[0];
            case 1 -> entrenamientosPlanificados += nroPlanificar[1];
            default -> System.out.println(planificar);
        }
    }
    
    public static void entrevista() {
        String nombres[] = new String[equipo.size()];
        for (int i = 0; i < equipo.size(); i++) {
            nombres[i] = equipo.get(i).getApellido() + ", " + equipo.get(i).getNombre() + " - " + equipo.get(i).getClass().getSimpleName();
        }
        
        String eleccion = JOptionPane.showInputDialog(null, "Selecciona a quién quieres entrevistar:", opciones[5], JOptionPane.PLAIN_MESSAGE, null, nombres, nombres[0]).toString();
        
        System.out.println(eleccion);
        int commaIndex = eleccion.indexOf(",");
        String apellido = eleccion.substring(0, commaIndex);
        Persona entrevistado = null;
        for (int i = 0; i < equipo.size(); i++) {
            if (apellido.compareTo(equipo.get(i).getApellido()) == 0) {
                entrevistado = new Persona(equipo.get(i).getNombre(),equipo.get(i).getApellido(),equipo.get(i).getEdad());
            }
        }
        
        JOptionPane.showMessageDialog(null, frase(entrevistado), "_ " + entrevistado.getNombre() + " " + entrevistado.getApellido() + " _", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static String frase(Persona entrevistado) {
        int aleatorio = random.nextInt(5);
        String frases[] = {
            "El juego estuvo muy complicado, la verdad que tuvimos un golpe de suerte.\n\n   - " + entrevistado.getNombre() + "   - " + entrevistado.getEdad() + " años",
            "El juego estuvo muy fácil, la verdad que tuvieron suerte de que no les llenaramos más la canasta.\n\n   - " + entrevistado.getApellido() + "   - " + entrevistado.getEdad() + " años",
            "Sin comentarios.\n\n   - " + entrevistado.getNombre() + "   - " + entrevistado.getEdad() + " años",
            "Eh... Eh... Bueno, eh...\n\n   - " + entrevistado.getApellido() + "   - " + entrevistado.getEdad() + " años",
            "¿Qué mirá vo?\nAndá pashá bobo, andá pashá\n\n   - " + entrevistado.getApellido() + "   - " + entrevistado.getEdad() + " años"
        };
        return frases[aleatorio];
    }
    
    public static void curarLesion() {
        JOptionPane.showMessageDialog(null, "¡Ninguna lesión fue grave!", "Lesionados sanados", JOptionPane.INFORMATION_MESSAGE);
        lesionados = 0;
    }
    
    public static void llenarEquipo() {
        //Jugadores Titulares (11) y Suplentes (5)
        equipo.add(new Futbolista(1, "ARC", "Aaron", "Iglesias", 34));
        equipo.add(new Futbolista(2, "DEF", "Alvaro", "Fabra", 24));
        equipo.add(new Futbolista(3, "DEF", "Jorge", "Gonzalez", 21));
        equipo.add(new Futbolista(4, "DEF", "Facundo", "Perez", 20));
        equipo.add(new Futbolista(5, "MED", "Isaac", "Goldberg", 20));
        equipo.add(new Futbolista(6, "MED", "Hugo", "Casas", 24));
        equipo.add(new Futbolista(7, "MED", "Marcos", "Paredes", 22));
        equipo.add(new Futbolista(8, "DEL", "Diego", "Mendez", 33));
        equipo.add(new Futbolista(9, "DEL", "Ángel", "Di María", 31));
        equipo.add(new Futbolista(10, "DEL", "Pepe", "Argento", 36));
        equipo.add(new Futbolista(11, "DEL", "Samuel", "Leguizamon", 26));
        equipo.add(new Futbolista(12, "ARC", "Miguel", "De Los Ángeles", 34));
        equipo.add(new Futbolista(13, "ARC", "Pablo", "Villanueva", 21));
        equipo.add(new Futbolista(14, "DEF", "Gabriel", "Fernandez", 23));
        equipo.add(new Futbolista(15, "MED", "Benedicto", "Dominguez", 25));
        equipo.add(new Futbolista(16, "DEL", "Lautaro", "Martinez", 19));
        //Entrenador
        equipo.add(new Entrenador("Agresivo", "Gerardo", "Quiroga", 47));
        //Doctor
        equipo.add(new Doctor("Médico Especialista en Kinesiología", 7, "Deblin", "White", 53));
    }
}

