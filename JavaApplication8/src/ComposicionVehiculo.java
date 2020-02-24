
public class ComposicionVehiculo {

   
    public static void main(String[] args) {
     Vehiculo vel=new Vehiculo ();
     
   vel.setMarca("Audi"); 
   vel.setColor("azul");
   vel.setAnio(2019);
   
     
   
        System.out.println("La informacion de su auto al momento es:\n"+vel.getMarca()+"\n"+vel.getColor()+"\n"+vel.getAnio());
       
    }
    
}
