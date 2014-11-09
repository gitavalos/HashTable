/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_example;
import java.util.*;
/**
 *
 * @author Antonio
 */
public class Hash_Example {
 Hashtable dic;	
    /**
     * @param args the command line arguments
     */
     public Hash_Example()
     {
      dic = new Hashtable();
     } 
             
    public static void main(String[] args) {
        // TODO code application logic here
         Hash_Example     d = new Hash_Example();
                Scanner         s = new Scanner(System.in);
                int             op = 0;

                System.out.println(" \n Ejemplo de uso de la clase Hashtable de la api java\n "+
                                   " \n\n Elige una opción a ejecutar\n"+
                                   " 1.- Vaciar el hash\n"+    
                                   " 2.- Cuantos elementos tiene\n"+
                                   " 3.- Verificar si el hash esta vacío\n"+
                                   " 4.- Imprimir el hash\n"+
                                   " 5.- Insertar numeros de ejemplo\n"+
                                   " 6.- Insertar strings de ejemplo\n"+
                                   " 0.- Salir\n\n\n\n"

                                        );
               
                while(true){
                System.out.println("\n\nTeclea una opcion de menu: ");
                op = s.nextInt();

                        if( op == 1 ){
                                d.limpiar();
                                System.out.println("Diccionario vacio");       
                          }
                        if( op == 2 ){
                                System.out.println("El Diccionario posee "+d.cantElementos()+" elementos");
                          }
                        if( op == 3 ){
                                System.out.println("El Diccionario se encuentra vacio ? R: "+ d.isVacio() );
                          }
                        if( op == 4 ){
                                d.imprimir( d.dic );
                          }
                        if( op == 5 ){
                                d.insertarNums();
                                System.out.println("Se insertaron num de ejemplos");
                          }
                        if( op == 6 ){
                                d.insertarPal();
                                System.out.println("Se insertaron palabras de ejemplos");
                          }
                        if( op == 0 ){         
                                System.out.println("Adios\n\n\n");
                                System.exit(0);
                           }


               

                }
        
    }
    public void limpiar(){
                dic. clear();
        }
       
        public int cantElementos(){
                return dic.size();
        }
       
        public boolean isVacio(){
                return dic.isEmpty();
        }      

        public void imprimir( Hashtable h ){
                Enumeration e = h.keys();  
                Object obj;  
                   while (e.hasMoreElements()) {  
                      obj = e.nextElement();  
                      System.out.println(" key "+ obj +": "+ h.get(obj));  
                           }           
        }

        public void insertarNums(){
                dic.put(1, "UNO");
                dic.put(2, "two");
                dic.put(3, "tres");
                dic.put(4, "four");
                dic.put(8, "ocho");
                dic.put(1, "avalos");

        }
       
        public void insertarPal(){
                dic.put("uno"   ,"1");
                dic.put("tres"  ,"3");
                dic.put("tress" ,"33");
                dic.put("four"  ,"4");
                dic.put("cuatro","4");
                dic.put("cinco" ,"5");

        }
}
