package Users;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args){
        ArrayList<Bien> listado = new ArrayList<Bien>();
        
        listado.add(new Bien(123));
        listado.add(new Bien(124));
        listado.add(new Bien(125));
                
        Iterator<Bien> iterador = listado.iterator();
        
        while(iterador.hasNext()){
            System.out.println(iterador.next().ID);
        }
        
        
    }
    
    
}
