public class Converter {

    // Método que converte Celsius para Fahrenheit.
    // Recebe um valor double (temperatura em Celsius)
    // e retorna um valor double (temperatura em Fahrenheit).
    public double celsiusToFahrenheit(double tempCelsius) {
        // TF = TC * 9/5 + 32
        // Utilizamos 9.0/5.0 para garantir a divisão de ponto flutuante
        double tempFahrenheit = (tempCelsius * 9.0 / 5.0) + 32.0; 
        return tempFahrenheit;
    }

    // Método que converte Fahrenheit para Celsius.
    // Recebe um valor double (temperatura em Fahrenheit)
    // e retorna um valor double (temperatura em Celsius).
    public double fahrenheitToCelsius(double tempFahrenheit) {
        // TC = (TF - 32) * 5/9
        double tempCelsius = (tempFahrenheit - 32.0) * 5.0 / 9.0;
        return tempCelsius;
    }
}
