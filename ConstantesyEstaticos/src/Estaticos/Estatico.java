
package Estaticos;
public class Estatico {
    private static String frase="hola soy juanito";
    public static void main(String[] args) {
        Estatico objeto1=new Estatico();
        //System.out.println(objeto1.frase);
         Estatico objeto2=new Estatico();
         
         //System.out.println(objeto2.frase);
         objeto2.frase="No Soy juanito";
         objeto1.frase="Pedrito";
         System.out.println(objeto1.frase);
         System.out.println(objeto2.frase);
         //always take last value for all obj.
                 
       /* String oracion=objeto1.frase;
        System.out.println(oracion);
        Estatico objeto2=new Estatico();
        objeto2.frase="Soy Pedrito";
        System.out.println(objeto2.frase);
        System.out.println(oracion);
*/
    }
    
}
