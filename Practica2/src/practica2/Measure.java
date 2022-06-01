/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import controlador.tda.lista.ListaEnlazadaServices;
import java.util.ArrayList;
import java.util.List;
import org.github.jamm.MemoryMeter;

public class Measure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Measure m = new Measure();
        // Crear un string sin datos y medir cuando ocupa en memoria, luego agregarle algun dato al string y medir la memoria
        String cadena = "";
        m.Medir(cadena, "String sin datos");
        m.Medir(cadena = "Joan Daniel Riofrio Bustamante", "String con datos");
        System.out.println();
        
        //Crear todos los tipos de datos primitivos y medir en tamaño en la memoria luego asignarles un valor y medir en tamaño en la memoria
        byte b = 0;
        m.Medir(b, "byte sin datos");
        m.Medir(b = 14, "byte con datos");
        System.out.println();
        
        short s = 0;
        m.Medir(s, "short sin datos");
        m.Medir(s = 3274, "short con datos");
        System.out.println();
        
        int i = 0;
        m.Medir(i, "int sin datos");
        m.Medir(i = 3274, "int con datos");
        System.out.println();
        
        long l = 0L;
        m.Medir(l, "long sin datos");
        m.Medir(l = 2147483647, "long con datos");
        System.out.println();
        
        float f = 0.0f;
        m.Medir(f, "float sin datos");
        m.Medir(f = 3.1416f, "float con datos");
        System.out.println();
        
        double d = 0.0d;
        m.Medir(d, "double sin datos");
        m.Medir(d = 3.1416d, "double con datos");
        System.out.println();
        
        char c = '\u0000';
        m.Medir(c, "char sin datos");
        m.Medir(c = 'A', "char con datos");
        System.out.println();
        
        boolean bol = false;
        m.Medir(bol, "boolean sin datos");
        m.Medir(bol = true, "boolean con datos");
        System.out.println();
        
        //Crear 5 arreglos uno con String y el resto con cualquier dato, y medir su tamaño en memoria, lue-go llenar con datos y medir su memoria.
        String arrayCadena[] = new String[4];
        m.Medir(arrayCadena, "Array de String sin datos");
        arrayCadena = new String[] {"Joan Daniel","Riofrio Bustamante","Masculino","19"};
        m.Medir(arrayCadena, "Array de String con datos");
        System.out.println();
        
        int arrayInt[] = new int[4];
        m.Medir(arrayCadena, "Array de int sin datos");
        arrayInt = new int[] { 123, 234, 342, 321};
        m.Medir(arrayCadena, "Array de int con datos");
        System.out.println();
        
        float arrayFloat[] = new float[4];
        m.Medir(arrayCadena, "Array de float sin datos");
        arrayFloat = new float[] { 0.34f, 0.43f, 0.45f, 12.40f};
        m.Medir(arrayCadena, "Array de float con datos");
        System.out.println();
        
        double arrayDouble[] = new double[4];
        m.Medir(arrayCadena, "Array de double sin datos");
        arrayDouble = new double[] {0.34, 0.43, 0.45, 12.40};
        m.Medir(arrayCadena, "Array de double con datos");
        System.out.println();
        
        char arrayChar[] = new char[4];
        m.Medir(arrayCadena, "Array de char sin datos");
        arrayChar = new char[] {'A','B','C','D'};
        m.Medir(arrayCadena, "Array de char con datos");
        System.out.println();
        
        //Crear un objeto de la clase ListaEnlazada y java.util.List y medir su tamaño, luego agregar 25 datos a cada lista y medir su tamaño.
        ListaEnlazadaServices<String> listaNums = new ListaEnlazadaServices<String>();
        m.Medir(listaNums, "Lista enlazada sin datos");
        int j = 0;
        while (j < 25) {            
            listaNums.insertarAlFinal(String.valueOf(Math.random()*1000+1));
            j++;
        }
        m.Medir(listaNums, "Lista enlazada con datos");
        System.out.println();
        
        List<String> list = new ArrayList<String>();
        m.Medir(list, "List sin datos");
        j = 0;
        while (j < 25) {            
            list.add(String.valueOf(Math.random()*1000+1));
            j++;
        }
        m.Medir(list, "List con datos");
        
    }
    
    void Medir (Object object, String tipoDato){
        MemoryMeter meter = MemoryMeter.builder().build();
        System.out.println("*- La ocupación de memoria del " + tipoDato + " es: "+ meter.measureDeep(object));
    }
    
}
