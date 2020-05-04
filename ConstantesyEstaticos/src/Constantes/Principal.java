
package Constantes;
public class Principal {
    public static void main(String[] args){
        Persona persona1=new Persona("juanito");
        persona1.mostrarDatos();
        Persona persona2=new Persona("Juanote");
        persona2.setEdad(15);
        persona2.mostrarDatos();
        
       /* Persona persona1=new Persona();
        persona1.setNombre("Juanito");
        persona1.setEdad(17);
        persona1.mostrarDatos();
        //proximo año
        persona1.setNombre("Pedrito");
        persona1.setEdad(15);
        persona1.mostrarDatos();*/
    }
}
