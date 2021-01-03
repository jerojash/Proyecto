
package Users;

public abstract class Usuario {
    //Atributos
        
        protected int cedula, diaNacimineto, mesNacimiento, annioNacimiento;
        protected String nombre, apellido, usuario, password;
        
    //Metodos
        public abstract void pedirPrestamo();
        
        public abstract void devolver();    
        
}
