import java.util.Scanner;

public class A1E12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables
        double Celcius;
        double Fahrenheit;

        //ingresar valor
        System.out.print("Ingrese la temperatura en Celcius: ");
        Celcius = scanner.nextDouble();

        //hacer operacion 
        Fahrenheit = (Celcius * 1.8) + 32;

        System.out.println(Celcius + " son: " + Fahrenheit + " Fahrenheit.");
    }

}
