Algoritmo  Convertir_Celsius_a_Fahrenheit
    Definir celsius, fahrenheit Como Real;
    Definir FACTOR_CONVERSION, AJUSTE_FAHRENHEIT Como Real;
	
    FACTOR_CONVERSION <- 1.8;
    AJUSTE_FAHRENHEIT <- 32;
	
    Escribir "Ingresa la temperatura en grados Celsius:";
    Leer celsius;
	
    fahrenheit <- celsius * FACTOR_CONVERSION + AJUSTE_FAHRENHEIT;
	
    Escribir celsius, " grados Celsius equivalen a ", fahrenheit, " grados Fahrenheit.";
FinAlgoritmo
