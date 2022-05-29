package main;

import java.util.Scanner;

/**
 *
 * @author darkangel
 */
public class Memoria {
    public final static int OVERFLOW = 200000000;
    StringBuilder cadena = new StringBuilder(OVERFLOW);
    private String salida;
    private int tamanio;
    String tempOOM = "";

    public Memoria(int leng) {
        this.tamanio = leng;
        int i = 0;
        while (i < leng) {
            i++;
            try {         
                this.cadena.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
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


