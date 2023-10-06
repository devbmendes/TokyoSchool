import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // Função para verificar se os valores formam um triângulo válido
    public static boolean verificarSeTrianguloValido(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a){
            return true;
        }else{
            System.out.println("Os valores inseridos nao formam um triangulo\n===================================================");
            return false;
        }
    }

    // Função para calcular um ângulo usando a lei dos cossenos
    public static double calcularAnguloDoTriangulo(double primeiro, double segundo, double terceiro) {
        double cosAngle = (segundo * segundo + terceiro * terceiro - primeiro * primeiro) / (2 * segundo * terceiro);
        return Math.toDegrees(Math.acos(cosAngle));
    }
    static double areaDoTriangulo(double a, double b,double c){
        //Cálculo da area do triangulo com a formula de Heron
        double semi = (a + b + c)/2; //Semiperimetro

        return Math.sqrt(semi * (semi -a) * (semi - b) * (semi - c));
    }

    static String verificarTipoDeTriangulo(double a,double b, double c){
        if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
            return "Triangulo : ISÓSCELES";
        }else if (a == b && b == c){
            return "Triangulo : EQUILÁTERO";
        }else{
            return "Triangulo : ESCALENO";
        }
    }
    static void menu(){
        boolean check = true;
        int option;
        while (check){
            System.out.println("1 - Calcular a área do triângulo");
            System.out.println("2 - Calcular os angulos do triângulo");
            System.out.println("3 - Sair do Programa");
            System.out.println("Escolher : -> "); option = Integer.parseInt(scanner.nextLine());
            if(option == 1){
                double a, b, c;
                System.out.println("Insira o comprimento do lado A :");
                a = Double.parseDouble(scanner.nextLine());
                System.out.println("Insira o comprimento do lado B :");
                b = Double.parseDouble(scanner.nextLine());
                System.out.println("Insira o comprimento do lado C :");
                c = Double.parseDouble(scanner.nextLine());
                if (verificarSeTrianguloValido(a,b,c)){
                    System.out.println(verificarTipoDeTriangulo(a,b,c));
                    System.out.println("Area calculado : "+areaDoTriangulo(a,b,c));
                }
            }else if(option == 2){
                double a, b, c;
                System.out.println("Insira o comprimento do lado A :");
                a = Double.parseDouble(scanner.nextLine());
                System.out.println("Insira o comprimento do lado B :");
                b = Double.parseDouble(scanner.nextLine());
                System.out.println("Insira o comprimento do lado C :");
                c = Double.parseDouble(scanner.nextLine());
                if(verificarSeTrianguloValido(a,b,c)){
                    System.out.println(verificarTipoDeTriangulo(a,b,c));
                    double angleA = calcularAnguloDoTriangulo(a, b, c);
                    double angleB = calcularAnguloDoTriangulo(b, a, c);
                    double angleC = calcularAnguloDoTriangulo(c, a, b);
                    System.out.println("O ângulo A é: " + angleA + " graus");
                    System.out.println("O ângulo B é: " + angleB + " graus");
                    System.out.println("O ângulo C é: " + angleC + " graus\n==================================================");
                }
            }else if(option == 3){
                System.out.println("Saindo do Programa ......");
                check = false;
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}