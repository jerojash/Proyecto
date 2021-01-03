
package Users;

import java.util.ArrayList;

import java.util.Iterator;

public class Bien {
    //Atributos
        protected int ID, fechaSalida, fechaEntrega, fechaIngreso, cantidad;
        protected String nombrePersona;
        protected boolean disponible;
        protected static ArrayList<Bien> listaBienes = new ArrayList<Bien>(); //Instanciar la lista de los bienes
    //Metodos
        public Bien(int nombre){
            this.ID = nombre;
        }
        public static void imprimirLista(){
            Iterator<Bien> iteradorBienes = listaBienes.iterator();
            
            while(iteradorBienes.hasNext()){
                
                //El codigo para imprimir los bienes.
                
            }
            
        }
        
        public static void buscarBienesDisponibles(){
            
            Iterator<Bien> iteradorBienes = listaBienes.iterator();
            
            while(iteradorBienes.hasNext()){
               
            }
            
        }
        
        
       /* public static Bien buscarBien(){
            //Busca un bien y retorna un bien
            
            return new Bien();
        } */
        public void cambiarEstado(){
            
        }
    
}
