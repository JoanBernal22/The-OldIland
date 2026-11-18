
import java.util.Random;
import java.util.Scanner;

public class Oldisland {

    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            Random random = new Random();
           
            
            // Codigos ANSI para los colores
            final String RESET = "\u001B[0m";
            final String VERDE = "\u001B[32m";
            final String ROJO = "\u001B[31m";
            final String AZUL = "\u001B[34m";
            final String AMARILLO = "\u001B[33m";
            final String CIAN = "\u001B[36m";
            final String NEGRITA = "\u001B[1m";
            
            // Estado inicial del jugador
            int salud = 100;
            int energia = 100;
            int comida = 5;
            int agua = 5;
            int madera = 0;
            int cuerda = 0;
            
            boolean jugando = true;
            
            System.out.println(CIAN + NEGRITA);
            System.out.println("========================================");
            System.out.println("              THE OLD ISLAND             ");
            System.out.println("========================================");
            System.out.println(RESET);
            
            System.out.println(AZUL + "Has naufragado en una isla.");
            System.out.println(AZUL + "Ahora debes, explorar, cazar, construir e intentar sobrevivir a esta isla, buena suerte guerrero!!!");
            System.out.println();
            
            while (jugando && salud > 0) {
                
            // Tabla de estado del jugador
            System.out.println(CIAN + NEGRITA);
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║       ESTADO DEL JUGADOR         ║");
            System.out.println("╠════════════════╦═════════════════╣");
            System.out.println("║    RECURSO     ║    CANTIDAD     ║");
            System.out.println("╠════════════════╬═════════════════╣");
                
            System.out.printf(ROJO + "║ %-14s ║ %15d ║%n", "Salud", salud);
            System.out.printf(AMARILLO + "║ %-14s ║ %15d ║%n", "Energia", energia);
            System.out.printf(VERDE + "║ %-14s ║ %15d ║%n", "Comida", comida);
            System.out.printf(AZUL + "║ %-14s ║ %15d ║%n", "Agua", agua);
            System.out.printf(CIAN + "║ %-14s ║ %15d ║%n", "Madera", madera);
            System.out.printf(CIAN + "║ %-14s ║ %15d ║%n", "Cuerda", cuerda);
            System.out.println(RESET + "╚════════════════╩═════════════════╝");
                
            // Menu de acciones
            System.out.println(AMARILLO + NEGRITA);
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║          MENU DE ACCIONES        ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println(VERDE + "║  [1] Buscar comida               ║");
            System.out.println(AZUL + "║  [2] Buscar agua                 ║");
            System.out.println(CIAN + "║  [3] Explorar la isla            ║");
            System.out.println(AMARILLO + "║  [4] Descansar                   ║");
            System.out.println(VERDE + "║  [5] Construir una balsa         ║");
            System.out.println(ROJO + "║  [6] Salir del juego             ║");
            System.out.println(RESET + "╚══════════════════════════════════╝");
                
            System.out.print("Elige una opcion: ");
            int opcion = teclado.nextInt();
                
                switch (opcion) {
                    
                    case 1 -> {
                        if (energia >= 20) {
                            int encontrada = random.nextInt(10) + 1;
                            comida += encontrada;
                            energia -= 20;
                            System.out.println(VERDE
                                    + "Has encontrado " + encontrada
                                    + " unidades de comida." + RESET);
                        } else {
                            System.out.println(ROJO
                                    + "No tienes energia." + RESET);
                        }
                    }
                    
                    case 2 -> {
                        if (energia >= 20) {
                            int encontrada = random.nextInt(10) + 1;
                            agua += encontrada;
                            energia -= 20;
                            System.out.println(AZUL
                                    + "Has encontrado " + encontrada
                                    + " unidades de agua." + RESET);
                        } else {
                            System.out.println(ROJO
                                    + "Tu energia es insuficiente." + RESET);
                        }
                    }
                    
                    case 3 -> {
                        if (energia >= 20) {
                            energia -= 20;
                            int resultado = random.nextInt(5);
                            if (resultado != 0) {
                            if (resultado == 1) {
                                    cuerda += 1;
                            System.out.println(VERDE
                                     + "Enhorabuena, ahora tienes una cuerda." + RESET);
                        } else {
                            salud -= 1;
                                System.out.println(ROJO
                                    + "Te has lastimado. Pierdes 1 de vida."
                                    + RESET);
                                }       
                        } else {
                            madera += 3;
                                System.out.println(VERDE
                                    + "Obtienes 3 unidades de madera."
                                    + RESET);
                            }
                        } else {
                            System.out.println(ROJO
                                    + "Necesitas descansar, te hace falta energia" + RESET);
                        }
                    }
                     
                    case 4 -> {
                        energia += 30;
                        if (energia > 100) {
                            energia = 100;
                        }
                        System.out.println(AMARILLO
                                + "Muy bien!, descansaste y recuperaste energia."
                                + RESET);
                    }
                    
                    case 5 -> {
                        if (madera >= 4 && cuerda >= 2) {
                            madera -= 4;
                            cuerda -= 2;
                            System.out.println(VERDE + NEGRITA
                                    + "Conseguiste construir una balsa."
                                    + RESET);
                            System.out.println(VERDE
                                    + "¡¡Lograste sobrevivir a la isla, estas preparado para mas!!"
                                    + RESET);
                            jugando = false;
                        } else {
                            System.out.println(ROJO
                                    + "Materiales insuficientes, no seria posible construir."
                                    + RESET);
                            System.out.println("Necesitas 4 de madera y 2 de cuerda.");
                        }
                    }
                    
                    case 6 -> {
                        jugando = false;
                        System.out.println(AMARILLO
                                + "Has abandonado el juego, no lograste sobrevivir a la isla." + RESET);

                    }
                }
                    if (opcion < 1 || opcion > 6) {
                        System.out.println(ROJO + "Opcion no valida." + RESET);
                    }
                
                // Consumo de comida y agua al final del turno
                if (jugando) {
                    
                    if (comida > 0) {
                        comida--;
                    } else {
                        salud -= +26;
                        System.out.println(ROJO
                                + "No tienes comida. Pierdes vida." + RESET);
                    }
                    if (agua > 0) {
                        agua--;
                    } else {
                        salud -= +26;
                        System.out.println(ROJO
                                + "No tienes agua, estas cerca de morir." + RESET);
                    }
                    if (salud > 0) {
                        System.out.println(CIAN + "Fin del turno." + RESET);
                    }
                }
            }
            
        // Resultado final
         if (salud <= 0) {
            System.out.println(ROJO + NEGRITA);
            System.out.println("========================================");
            System.out.println("       HAS PERDIDO LA PARTIDA");
            System.out.println("                 :c                     ");
            System.out.println("========================================");
            System.out.println(RESET);
            System.out.println("No has sobrevivido a la isla.");
                
            }
        }
    }


