package org.example;

import org.example.model.Ingrediente;
import org.example.service.PilaInventario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PilaInventario pilaInventario = new PilaInventario();

        // Crear ingredientes
        Ingrediente ingrediente1 = new Ingrediente("Tomate", 10, new Date());
        Ingrediente ingrediente2 = new Ingrediente("Lechuga", 15, new Date());
        Ingrediente ingrediente3 = new Ingrediente("Pan para hamburguesas", 20, new Date());

        // Añadir ingredientes al inventario
        pilaInventario.añadirIngrediente(ingrediente1);
        pilaInventario.añadirIngrediente(ingrediente2);
        pilaInventario.añadirIngrediente(ingrediente3);

        // Mostrar inventario
        pilaInventario.mostrarInventario();

        // Sacar el ingrediente más reciente
        pilaInventario.sacarIngrediente();

        // Mostrar inventario después de sacar un ingrediente
        pilaInventario.mostrarInventario();

        // Consultar el número de ingredientes restantes
        System.out.println("Ingredientes restantes en el inventario: " + pilaInventario.contarIngredientes());
    }
}