import java.util.Random;
import java.util.Scanner;

public class DeberCAI {
    private int aciertos;
    private int intentos;
    private int nivelDificultad;
    private int tipoProblema;
    private Random random;

    public DeberCAI() {
        random = new Random();
        aciertos = 0;
        intentos = 0;
    }
        public void configuracionInicial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige el nivel de dificultad (1, 2, 3): ");
        nivelDificultad = scanner.nextInt();
        System.out.print("Elige el tipo de problema aritmético "
        + "(1: Suma, "
        + "2: Resta, "
        + "3: Multiplicación, "
        + "4: División, "
        + "5: Aleatorio): ");
        tipoProblema = scanner.nextInt();
    }
        
            public int[] generarOperandos() {
        int max = (int) Math.pow(10, nivelDificultad) - 1;
        int min = (int) Math.pow(10, nivelDificultad - 1);
        int num1 = random.nextInt((max - min) + 1) + min;
        int num2 = random.nextInt((max - min) + 1) + min;
        return new int[]{num1, num2};
    }

    public void generarMensajePositivo() {
        String[] mensajes = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!"};
        System.out.println(mensajes[random.nextInt(mensajes.length)]);
    }

    public void generarMensajeNegativo() {
        String[] mensajes = {"No. Por favor intenta de nuevo.", "Incorrecto. Intenta una vez más.", "¡No te rindas!", "No. Sigue intentando."};
        System.out.println(mensajes[random.nextInt(mensajes.length)]);
    }

    
        public static void main(String[] args) {
        DeberCAI programa = new DeberCAI();
        Scanner scanner = new Scanner(System.in);

        programa.configuracionInicial();
        
                while (programa.intentos < 10) {
            int[] operandos = programa.generarOperandos();
            System.out.printf("¿Cuánto es %d + %d? ", operandos[0], operandos[1]);
            int respuesta = scanner.nextInt();
            programa.intentos++;

            if (respuesta == operandos[0] + operandos[1]) {
                programa.aciertos++;
                programa.generarMensajePositivo();
            } else {
                programa.generarMensajeNegativo();
            }
        }

    }
       
}

