package org.vaadin.example;

public class Coche
{
    private int id;
    private String marca;
    private int edad;
    private  String color;

    private String popularidad;

    public Coche() {
    }

    public Coche(int id, String marca, int edad, String color, String popularidad) {
        this.id = id;
        this.marca = marca;
        this.edad = edad;
        this.color = color;
        this.popularidad = popularidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public String mostrarJson()
    {
        return "{\n" +
                "\"id\": " + id  +  ",\n" +
                "\"marca\": " + "\"" + marca + "\"," + "\n" +
                "\"edad\": " + edad  +  ",\n" +
                "\"color\": " + "\"" + color + "\"," + "\n" +
                "\"popularidad\": " + "\"" + popularidad + "\"" + "\n" +
                "}";
    }
}
