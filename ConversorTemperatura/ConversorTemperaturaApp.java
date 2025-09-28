import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ConversorTemperaturaApp {

    public static void main(String[] args) { // Método principal de execução
        
        // Cria um objeto Scanner para obter entrada do teclado (System.in)
        Scanner input = new Scanner(System.in); 
        
        // Cria uma instância da classe Converter
        Converter conversor = new Converter();

        // ----------------------------------------------------
        // 1. Conversão Celsius para Fahrenheit
        // ----------------------------------------------------
        System.out.print("Digite a temperatura em Celsius (C) para conversão: "); // Solicita entrada
        
        // O Scanner lê o próximo valor de ponto flutuante (double) inserido pelo usuário
        if (input.hasNextDouble()) {
            double tempC = input.nextDouble();
            
            // Chama o método de conversão do objeto 'conversor'
            double tempF = conversor.celsiusToFahrenheit(tempC);
            
            // Exibe o resultado formatado com duas casas decimais (%.2f)
            System.out.printf("%.2f °C equivalem a %.2f °F.\n", tempC, tempF);
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número para a temperatura Celsius.");
            input.next(); // Limpa a entrada inválida
        }
        
        // ----------------------------------------------------
        // 2. Conversão Fahrenheit para Celsius
        // ----------------------------------------------------
        System.out.print("\nDigite a temperatura em Fahrenheit (F) para conversão: "); // Solicita entrada

        // Leitura e validação de entrada para Fahrenheit
        if (input.hasNextDouble()) {
            double tempF = input.nextDouble();
            
            // Chama o método de conversão
            double tempC = conversor.fahrenheitToCelsius(tempF);
            
            // Exibe o resultado formatado
            System.out.printf("%.2f °F equivalem a %.2f °C.\n", tempF, tempC);
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número para a temperatura Fahrenheit.");
        }
        
        input.close(); // Fecha o objeto Scanner
    }
}
