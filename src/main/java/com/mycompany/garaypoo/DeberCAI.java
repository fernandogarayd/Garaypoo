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

}

