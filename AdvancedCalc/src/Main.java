import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static void menu(){
        System.out.println("************* Calculadora Avançada ******************\n");
        System.out.println("\t\t\t1 +++ ADIÇÃO");
        System.out.println("\t\t\t2 +++ SUBTRAÇÃO");
        System.out.println("\t\t\t3 +++ MULTIPLICAÇÃO");
        System.out.println("\t\t\t4 +++ DIVISÃO");
        System.out.println("\t\t\t5 +++ SENO");
        System.out.println("\t\t\t6 +++ COSSENO");
        System.out.println("\t\t\t7 +++ TANGENTE");
        System.out.println("\t\t\t8 +++ RAIZ QUADRADA");
        System.out.println("\t\t\t9 +++ EXPOENTE");
        System.out.println("\t\t\t0 ---------> SAIR\n");

    }
    static void adition(){
        double numberOne, numberTwo;
        System.out.println(" -------- ADIÇÃO ---------- ");
        System.out.println("Insira o primeiro numero"); numberOne = scanner.nextDouble();
        System.out.println("Insira o segundo numero"); numberTwo = scanner.nextDouble();
        System.out.println(numberOne+" + "+numberTwo+" = "+(numberOne+numberTwo));
    }
    static void sub(){
        double numberOne, numberTwo;
        System.out.println(" -------- SUBTRAÇÃO ---------- ");
        System.out.println("Insira o primeiro numero"); numberOne = scanner.nextDouble();
        System.out.println("Insira o segundo numero"); numberTwo = scanner.nextDouble();
        System.out.println(numberOne+" - "+numberTwo+" = "+(numberOne-numberTwo));
    }
    static void mult(){
        double numberOne, numberTwo;
        System.out.println(" -------- MULTIPLICAÇAO ---------- ");
        System.out.println("Insira o primeiro numero"); numberOne = scanner.nextDouble();
        System.out.println("Insira o segundo numero"); numberTwo = scanner.nextDouble();
        System.out.println(numberOne+" * "+numberTwo+" = "+(numberOne*numberTwo));
    }
    static void div(){
        double numberOne, numberTwo;
        System.out.println(" -------- DIVISÃO ---------- ");
        System.out.println("Insira o primeiro numero"); numberOne = scanner.nextDouble();
        System.out.println("Insira o segundo numero"); numberTwo = scanner.nextDouble();
        if(numberTwo == 0){
            System.out.println("Impossivel dividir por 0");
        }
        else
            System.out.println(numberOne+" / "+numberTwo+" = "+(numberOne/numberTwo));
    }

    static void seno(){
        double numberOne;
        System.out.println(" -------- SENO DE UM NÚMERO ---------- ");
        System.out.println("Insira o numero"); numberOne = scanner.nextDouble();
        System.out.println(" ---- Seno("+numberOne+") = "+Math.sin(numberOne));
    }

    static void cosseno(){
        double numberOne;
        System.out.println(" -------- COSSENO DE UM NÚMERO ---------- ");
        System.out.println("Insira o numero"); numberOne = scanner.nextDouble();
        System.out.println(" ---- Cosseno("+numberOne+") = "+Math.cos(numberOne));
    }

    static void tangente(){
        double numberOne;
        System.out.println(" -------- TANGENTE DE UM NÚMERO ---------- ");
        System.out.println("Insira o numero"); numberOne = scanner.nextDouble();
        System.out.println(" ---- Tangente("+numberOne+") = "+Math.tan(numberOne));
    }
    static void raizQuadrada(){
        double numberOne;
        System.out.println(" -------- RAIZ QUADRADA DE UM NÚMERO ---------- ");
        System.out.println("Insira o numero"); numberOne = scanner.nextDouble();
        System.out.println(" ---- Raiz Quadrada("+numberOne+") = "+Math.sqrt(numberOne));
    }

    static void expoente(){
        double numberOne,numberTwo;
        System.out.println(" -------- SENO DE UM NÚMERO ---------- ");
        System.out.println("Insira a base"); numberOne = scanner.nextDouble();
        System.out.println("Insira o expoente"); numberTwo = scanner.nextDouble();
        System.out.println(numberOne+" EXPOENTE "+numberTwo+" = "+Math.pow(numberOne,numberTwo));
    }
    public static void main(String[] args) {
        int option;
        do {
            menu();
            System.out.print("Escolha uma operação ----> ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    adition();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    seno();
                    break;
                case 6:
                    cosseno();
                    break;
                case 7:
                    tangente();
                    break;
                case 8:
                    raizQuadrada();
                    break;
                case 9:
                    expoente();
                    break;
            }
        } while (option != 0);
        System.out.println("SAINDO DO PROGRAMA ..........");
    }
}