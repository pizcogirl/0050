
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{

    /**
     * Constructor for objects of class Test0050
     */
    public Test0050()
    {
    }

    /**
     * Realiza una multiplicacion entre dos numeros enteros
     */
    public int multiplicar(int a, int b)
    {
        // Inicializamos dos variables locales, una como contador y la otra como acumulador
        int index = 0;
        int resultado = 0;
        // Pasamos a y b a valor absoluto para realizar despues los calculos
        int valorA =valorAbsoluto(a);
        int valorB = valorAbsoluto(b);
        while (index < valorB)
        {
            resultado = resultado + valorA;
            index++;
        }
        // Si a o b es negativo, cambia el signo del resultado
        if ((b >= 0 || a >= 0) && (b < 0 || a < 0))
        {
            resultado = 0 - resultado;
        }
        return resultado;
    }

    /**
     * Realiza la division de dos numeros enteros
     */
    public int dividir(int a, int b)
    {
        // Pasamos a y b a valor absoluto para realizar despues los calculos
        int valorA = valorAbsoluto(a);
        int valorB = valorAbsoluto(b);
        // Inicializamos dos variables locales, una como contador y la otra como 
        // acumulador, que inicializamos como a
        int index = 0;
        int resultado = valorA;
        // Si el divisor es 0, devuelve el valor maximo de un entero para simular el infinito
        if (valorB == 0)
        {
            index = Integer.MAX_VALUE;
        }
        else
        {
            while (resultado >= valorB)
            {
                resultado = resultado - valorB;
                index++;
            }
            // Si a o b es negativo, cambia el signo del resultado
            if ((b >= 0 || a >= 0) && (b < 0 || a < 0))
            {
                index = 0 - index;
            }
        }
        return index;
    }

    /**
     * Calcula el modulo de un numero entero entre otro
     */
    public int modulo(int a, int b)
    {

        // Pasamos a y b a valor absoluto para realizar despues los calculos
        int valorA = valorAbsoluto(a);
        int valorB = valorAbsoluto(b);
        // Inicializamos una variable local como acumulador que inicializamos a valorA
        int resultado = valorA;
        // Si el divisor es 0, devuelve como resultado el valor maximo de entero (valor invalido)
        if (valorB == 0)
        {
            resultado = Integer.MAX_VALUE;
        }
        else
        {
            while (resultado >= valorB)
            {
                resultado = resultado - valorB;
            }
            // Si a es negativo, cambia el signo del resultado
            if ( a < 0)
            {
                resultado = 0 - resultado;
            }
        }
        return resultado;
    }

    /**
     * Calcula un numero a elevado a otro numero b
     */
    public int potencia (int a, int b)
    {
        // Inicializamos dos variables locales, una como contador en 1 y otra para el resultado como a
        int index = 1;
        int resultado = a;
        // Si el exponente es negativo, los resultados seran proximos a 0, redondeamos a 0
        if (b < 0)
        {
            resultado = 0;
        }
        // Si el exponente es 0, el resultado siempre sera 1
        else if (b == 0)
        {
            resultado = 1;
        }
        else
        {
            // Mientras el indice sea menor que b, multiplicamos resultado por a
            while (index < b)
            {
                resultado = multiplicar (resultado, a);
                index++;
            }
        }
        return resultado;
    }

    /**
     * Realiza la raiz cuadrada entera de un numero
     */
    public int raizCuadradaEntera(int a)
    {
        // Inicializamos una variable para almacenar el resultado como -1, que sera el valor a devolver
        // si no existe raiz cuadrada entera o si se introduce un numero no valido (negativo o mayor de 1000)
        int resultado = -1;
        if ((a > 0) && (a <= 1000))
        {
            // Inicializamos el indice como 0 y un acumulador para las multiplicaciones
            int index = 0;
            int resultadoTemporal = 0;
            // Mientras el acumulador sea menor que a, realizamos multiplicaciones
            while (resultadoTemporal < a)
            {
                resultadoTemporal = multiplicar(index, index);
                index++;
            }
            // Una vez nos pasemos o tengamos el valor a, comprobamos. Si es igual a a, guardamos el index - 1
            // como el resultado, sino imprimimos un mensaje de error y devolvemos el resultado
            if (resultadoTemporal == a)
            {
                resultado = (index -1);
            }
            else
            {
                System.out.println("No existe raiz cuadrada entera de " + a);
            }
        }
        // Si a es 0, su raiz cuadrada es 0
        else if (a == 0)
        {
            resultado = 0;
        }
        return resultado;
    }

    /**
     * Pasa un numero a valor absoluto
     */
    private int valorAbsoluto(int n)
    {
        int resultado = 0;
        if (n >= 0)
        {
            resultado = n;
        }
        else
        {
            resultado = 0 - n;
        }
        return resultado;
    }
}
