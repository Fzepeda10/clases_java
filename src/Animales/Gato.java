package Animales;

public class Gato extends Animal{

    public Gato(){
        super();
    }

    public void maullar(){
        System.out.println("Miau");
    }

    @Override
    public void comer(){
        System.out.println("Comiendo gato");
    }
}
