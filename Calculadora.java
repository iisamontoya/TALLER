public class Calculadora {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los dos números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Pedir al usuario la operación a realizar
        System.out.print("Ingresa la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        
        double resultado;

        switch(operacion) {
                        case"+":
                        resultado num= num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;




}



}
