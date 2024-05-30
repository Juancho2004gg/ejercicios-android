import java.util.*

/*
* There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.

In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:

Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
Kelvin to Celsius: ° C = K - 273.15
Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
*/

fun main() {
    val input = Scanner(System.`in`)

    var initialMeasurement:Double = 0.0
    var initialUnit:String = ""
    var finalUnit:String = ""
    var validAnswer:Boolean = false

    val celsiusToFahrenheit = { temperature: Double -> temperature * 9/5 + 32 } // The inferred type is (Double) -> Double
    val kelvinToCelsius = {temperature: Double -> temperature - 273.15}
    val fahrenheitToKelvin =  {temperature: Double -> (temperature - 32) * 5/9 + 273.15}
    var conversionFormula:(Double) -> Double = celsiusToFahrenheit

    println("Which conversion would you like to get?")
    println("1. Celsius to Fahrenheit. \n2. Kelvin to Celsius. \n3. Fahrenheit to Kelvin.")
    println("Enter the option number: ")
    val selectedOption = input.next()

    do {
        if (selectedOption.equals("1",true)){
            conversionFormula = celsiusToFahrenheit
            initialUnit = "Celsius"
            finalUnit = "Fahrenheit"
            validAnswer = true

        }
        else if (selectedOption.equals("2",true)){
            conversionFormula = kelvinToCelsius
            initialUnit = "Kelvin"
            finalUnit = "Celsius"
            validAnswer = true

        }

        else if (selectedOption.equals("3",true)){
            conversionFormula = fahrenheitToKelvin
            initialUnit = "Fahrenheit"
            finalUnit = "Kelvin"
            validAnswer = true
        }
        else{
            println("Enter a valid number.")
        }
    }while (!validAnswer)

    println("Enter the initial measurement: ")
    initialMeasurement = input.nextDouble()

    printFinalTemperature(initialMeasurement, initialUnit, finalUnit, conversionFormula)
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val result:Double = conversionFormula(initialMeasurement)
    val finalMeasurement = String.format("%.2f", result) // two decimal places

    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
