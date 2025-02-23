package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael
 * @version 0.0
 * Representa un contacto dentro de la agenda.
 * Cada contacto tiene un nombre y una lista de números de teléfono asociados.
 */

class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor para crear un nuevo contacto con un nombre y un teléfono inicial.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos asociados al contacto.
     *
     * @return Lista de números de teléfono.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}