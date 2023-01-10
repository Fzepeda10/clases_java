import Animales.Gato;
import Animales.Perro;

public class Aplicacion {
    public static void main(String[] args) {
        Perro doberman = new Perro("Doberman");
        doberman.setNombre("Firulais");
        doberman.setEdad(2);
        doberman.setPatas(4);
        doberman.setColor("Negro");

        Perro perro2 = new Perro("Chihuahueño");
        perro2.setNombre("Chiwas");
        perro2.ladrar();



        System.out.println(doberman.ladrar());
        System.out.println(perro2.ladrar());

        Gato gato1 = new Gato();
        gato1.setNombre("gatillo");
        gato1.maullar();



        doberman.comer();
        perro2.comer();
        gato1.comer();
    }
}
