package Animales;

public class Perro extends Animal{
    private String razaCanina;

    public Perro(String razaCanina){
        super();
        this.razaCanina = razaCanina;

    }

    public String ladrar(){
        return "bark bark bark " + this.razaCanina;
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo perro");
    }
}
