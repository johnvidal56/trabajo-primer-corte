/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_vehiculo;

/**
 *
 * @author Phoenik
 */
public class Trabajo_vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        vehiculo obj1 = new vehiculo();
        
        obj1.setColor("azul");
        obj1.setPlaca("225 cmd");
        obj1.setNum_llantas(4);
        
        System.out.println(obj1.getColor());
        System.out.println(obj1.getPlaca());
        System.out.println(obj1.getNum_llantas());
        
        
        vehiculo obj2 = new vehiculo ();
        
        obj2.setModelo("mazda");
        obj2.setInf(" carro cero kilometron garantia dies años o cien kilometros");
        
         
        System.out.println(obj2.getModelo());
        System.out.println(obj2.getInf());
        
        
                
                
                
                
                }         
        
        
        
        
    
    

}