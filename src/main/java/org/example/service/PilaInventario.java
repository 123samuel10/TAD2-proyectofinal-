package org.example.service;

import org.example.model.Ingrediente;

import java.util.Stack;

public class PilaInventario {
    private Stack<Ingrediente> pila;

    public PilaInventario() {
        pila = new Stack<>();
    }

    // Añadir ingrediente al inventario (con fecha de ingreso)
    public void añadirIngrediente(Ingrediente ingrediente) {
        pila.push(ingrediente);
        System.out.println("Ingrediente añadido: " + ingrediente);
    }

    // Sacar ingrediente del inventario (debe ser el más reciente)
    public Ingrediente sacarIngrediente() {
        if (!pila.isEmpty()) {
            Ingrediente ingredienteSacado = pila.pop();
            System.out.println("Ingrediente sacado: " + ingredienteSacado);
            return ingredienteSacado;
        } else {
            System.out.println("No hay ingredientes en el inventario.");
            return null;
        }
    }

    // Mostrar todos los ingredientes en el inventario
    public void mostrarInventario() {
        if (pila.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de ingredientes:");
            for (Ingrediente ingrediente : pila) {
                System.out.println(ingrediente);
            }
        }
    }

    // Consultar el número de ingredientes en el inventario
    public int contarIngredientes() {
        return pila.size();
    }
}
