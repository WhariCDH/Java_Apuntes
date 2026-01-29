package Clase04;
class Animal2{
    public void hacerSonido(){
        System.out.println("Los animales hacen sonido...");
    }
}

class Perro2 extends Animal2{
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra...");
    }
}

class Gato extends Animal2{
    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla...");
    }
}

class Conejo extends Animal2{
    @Override
    public void hacerSonido(){
        System.out.println("El conejo chilla...");
    }
}

class Vaca extends Animal2{
    @Override
    public void hacerSonido(){
        System.out.println("Las vacas mujen...");
    }
}

public class Polim29 {
    public static void main(String[] args) {
        Animal2 a1=new Animal2();
        Animal2 a2=new Perro2();
        Animal2 a3=new Gato();
        Animal2 a4=new Conejo();
        Animal2 a5=new Vaca();

        a1.hacerSonido();
        a2.hacerSonido();
        a3.hacerSonido();
        a4.hacerSonido();
        a5.hacerSonido();
    }    
}
