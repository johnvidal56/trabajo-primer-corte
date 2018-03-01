/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_persona;

/**
 *
 * @author Phoenik
 */
public class Trabajo_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Persona obj1 = new Persona ();
        
            obj1.setNombre("naiara");
            obj1.setApellido(" marin");
            obj1.unir();  
            
               System.out.println(obj1.getNombre());
               System.out.println(obj1.getApellido());
              
               
               
        Persona obj2 = new Persona ();
        
            obj2.setCodigo("codigo: 23");
            obj2.setInfo("es una estudiante muy diciplinada");
           
               System.out.println(obj2.getCodigo());
               System.out.println(obj2.getInfo());
           
               
            
    }

  
    }
    

