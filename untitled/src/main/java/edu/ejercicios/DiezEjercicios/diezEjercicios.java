package edu.ejercicios.DiezEjercicios;

import java.util.*;
public class diezEjercicios
{
    public void AreaCirculo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;

        System.out.println("El area del circulo es: " + area);
    }

    public void Circunferencia()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("El area del circulo es: " + circunferencia);
    }

    public void Volumen()
    {
        int lado = 15;
        double resultado = Math.pow(lado, 3);
        System.out.println(resultado);
    }

    public void AreaPiramide()
    {
        int base = 10;
        int altura = 30;

        double result = ((base * altura)/3);
        System.out.println(result);
    }

}
