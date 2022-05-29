package main;

import java.util.Scanner;

/**
 *
 * @author darkangel
 */
public class Memoria {
    public final static int OVERFLOW = 200000000;
    private StringBuilder cadena = new StringBuilder(OVERFLOW);
    private String salida;
    private int tamanio;
    String tempOOM = "";

    public Memoria(int leng) {

        String aux = "aa";
        int i = 0;
        int j = 0;
        while (j < 8) {            
            while (i < 10) {
                this.cadena.append(aux);
                i++;
            }
            aux = this.cadena.toString();
            this.cadena.delete(0, OVERFLOW);
            i = 0;
            j++;
        }
        this.cadena.append(aux);
        this.salida = this.cadena.toString();
    
        this.salida = tempOOM;
    }

    public String getOom() {
        return salida;
    }

    public int getLength() {
        return tamanio;
    }

    public static void main(String[] args) {
        Memoria javaHeapTest = new Memoria(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("precione cualquier numero");
        sc.nextInt();
    }
}

