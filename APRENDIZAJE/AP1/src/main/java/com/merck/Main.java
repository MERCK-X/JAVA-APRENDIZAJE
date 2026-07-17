package com.merck;

public class Main
{
    public static void main(String[] args)
    {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("--------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println(ejercicios.Ej1Mio(8));
        System.out.println(ejercicios.Ej1Correcto(8));
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println(ejercicios.Ej2Mio());
        System.out.println(ejercicios.Ej2Correcto());
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println(ejercicios.Ej3Mio());

    }
}