//El programa debe simular el despegue de un cohete
package Clase02;
public class while12 {
    public static void main(String[] args) {
        int i=10; //Para contar de 0 al 10
        System.out.println("Simularemos el despegue de un cohete. ");
        while (i>=0){  //Mientras i tenga un valor >= a cero hara lo siguiente 
            System.out.println(i); //Imprime el valor i automatico 
            i--; //Le quita uno a lo que vale i
            try{
                Thread.sleep(1000); //Pausa de 1 segundo
            }catch(InterruptedException e){
                System.out.println("Se interrumpío el retardo");
            }
        }
        System.out.println("El cohete ha despegado...");
    }
    
}
