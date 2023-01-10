package Animales;

public class Animal {
    String nombre;
    int patas;
    int edad;
    String color;

    public Animal(){}
    public Animal(String nombre, int patas, int edad, String color) {
        this.nombre = nombre;
        this.patas = patas;
        this.edad = edad;
        this.color = color;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
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

    public void comer(){
    }
}
