package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(5);
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(7);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> myList = new ArrayList<>();

        /*for (int i = 10; i >= 1; i--) {*/
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
            System.out.println(myList);
        }
        if (myList.contains(num)) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + myList.indexOf(num));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }

        System.out.println("Los primeros " + num + " números naturales son: " + result);
    }


    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}