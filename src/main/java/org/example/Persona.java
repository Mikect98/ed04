package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael
 * @version 0.0
 * Representa una persona dentro de la agenda.
 * Cada persona tiene un nombre y una lista de números de teléfono asociados.
 */

class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor para crear una nueva persona con un nombre y un teléfono inicial.
     *
     * @param name  Nombre de la persona.
     * @param phone Número de teléfono inicial.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    //Metodos getters y setters
    /**
     * Obtiene el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getNamme() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos asociados a la persona.
     *
     * @return Lista de números de teléfono.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Establece un nuevo nombre para la persona.
     *
     * @param name Nuevo nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Establece una nueva lista de teléfonos para la persona.
     *
     * @param phones Lista de números de teléfono.
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    /**
     * Agrega un nuevo número de teléfono a la lista de teléfonos de la persona.
     *
     * @param phone Número de teléfono a agregar.
     */
    public void addPhone(String phone) {
        this.phones.add(phone);
    }

}