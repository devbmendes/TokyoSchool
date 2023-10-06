import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static double media(float firstNumber, float secondNumber, float thirdNumber, float fourthNumber,
                        float fifthNumber, float sixthNumber){

        return (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber)/6;
    }
    static void aplyAgain(String answer){
        if(answer.equalsIgnoreCase("s")){
            menuMain();
        }else {
            System.out.println("PROGRAM CLOSED");
            System.exit(0);
        }
    }
    static void askIfWantCalculatingAgain(){
        String answer;
        System.out.println("Deseja calcular outra vez? (S/N)");
        answer = scanner.nextLine();
        aplyAgain(answer);
    }
    static void menuMain(){
        System.out.println("Insira o primeiro numero :");
        float firstNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o segundo numero :");
        float secondNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o terceiro numero :");
        float thirdNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o quarto numero :");
        float fourthNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o quinto numero :");
        float fifthNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o sexto numero :");
        float sixthNumber = Float.parseFloat(scanner.nextLine());

        System.out.println("A media calculada =  "+media(firstNumber,secondNumber,thirdNumber,fourthNumber,
                fifthNumber,sixthNumber));

        askIfWantCalculatingAgain();
    }
    public static void main(String[] args) {
        menuMain();
    }
}