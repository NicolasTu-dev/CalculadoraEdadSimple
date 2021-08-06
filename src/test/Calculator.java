package test;

import java.time.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa año, mes y dia");
        int year = ingreso.nextInt();
        int mes = ingreso.nextInt();
        int dia = ingreso.nextInt();
        LocalDate suma = LocalDate.of(year,mes,dia);
        int edad = Period.between(suma, fecha).getYears();
        System.out.println("Tu edad es: "+edad);
    }
}
