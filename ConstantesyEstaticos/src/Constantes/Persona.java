
package Constantes;
public class Persona {
    private int edad;
    private final String nombre;
    public void mostrarDatos(){
        System.out.println("El nombre que me diste es "+nombre);
        System.out.println("La edad que tienes es "+edad);
    }
    
/*
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */

    public Persona(String nombre) {
        //this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
