/**
 * UPTx - Fundamentos de Programación Orientada a Objetos
 * Practica No. 4     Grupo: 5H
 * Tema: Clase Carro
 * Integrantes: Eder López Villarreal, Jazmin Portillo Michicol, Karen Leticia García Vásquez, Eric Jhonathan Anaya Márquez
 * Objetivo: Realizar una aplicación donde se realice los registros de un coche
 *           para establecer su mantenimiento, consumo de gas y km recorrido.
 * Modificación: 18/ene/2024
 */

import POO.Carro;
public class Main {
    public static void main(String[] args) {

        // Crea tres objetos Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        Carro carro3 = new Carro("Ford", "Focus", 2021);

        // Actualiza atributos de los carros
        carro1.setConsumoGas(10.5);
        carro1.setKmRecorridos(14700.0);
        carro2.setKmRecorridos(15000.0);
        carro2.setConsumoGas(12.0); // Establecer el consumo de gas antes de los kilómetros recorridos
        carro3.setConsumoGas(15.0);
        carro3.setKmRecorridos(20000.0);

        // Mostra valores en consola
        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Año de fabricación: " + carro1.getAnoFabricacion());
        System.out.println("Consumo de gas: " + carro1.getConsumoGas() + " km/l");
        System.out.println("Kilómetros recorridos: " + carro1.getKmRecorridos() + " km\n");

        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Año de fabricación: " + carro2.getAnoFabricacion());
        System.out.println("Consumo de gas: " + carro2.getConsumoGas() + " km/l");
        System.out.println("Kilómetros recorridos: " + carro2.getKmRecorridos() + " km\n");

        System.out.println("Carro 3:");
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Año de fabricación: " + carro3.getAnoFabricacion());
        System.out.println("Consumo de gas: " + carro3.getConsumoGas() + " km/l");
        System.out.println("Kilómetros recorridos: " + carro3.getKmRecorridos() + " km");
    }
}