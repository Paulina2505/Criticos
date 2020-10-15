/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.criticos;

/**
 *
 * @author Paulina
 */
public class Principal {
    private static int posiciones[] = new int [20]; 
    public static void main(String[] args) {
        System.out.println("FUNCIÓN: f(x)=((x^4)/4)-((9x^2)/2)");
        System.out.println("PRIMER DERIVADA: f'(x)=(x^3)-(9x)");
        System.out.println("SEGUNDA DERIVADA: f''(x)=(3x^2)-(9)");
        System.out.println("Igualando la primer derivada se tiene: x((x^2)-9)=0\nx(x+3)(x-3)=0");
        System.out.println("Teniendo x=0; x=3; x=-3");
        System.out.println("\nSUSTITUCIÓN");
        if (f(0) < 0) System.out.println("f(0) = "+f(0)+" < 0");
        else if (f(0) > 0) System.out.println("f(0) = "+f(0)+" > 0");
        else System.out.println("f(0) = 0");
        if (f(3) < 0) System.out.println("f(3) = "+f(3)+" < 0");
        else if (f(3) > 0) System.out.println("f(3) = "+f(3)+" > 0");
        else System.out.println("f(3) = 0");
        if (f(-3) < 0) System.out.println("f(-3) = "+f(-3)+" < 0");
        else if (f(-3) > 0) System.out.println("f(-3) = "+f(-3)+" > 0");
        else System.out.println("f(-3) = 0");
        
        if (f_1ra(0) < 0) System.out.println("f'(0) = "+f_1ra(0)+" < 0");
        else if (f_1ra(0) > 0) System.out.println("f'(0) = "+f_1ra(0)+" > 0");
        else System.out.println("f'(0) = 0");
        if (f_1ra(3) < 0) System.out.println("f'(3) = "+f_1ra(3)+" < 0");
        else if (f_1ra(3) > 0) System.out.println("f'(3) = "+f_1ra(3)+" > 0");
        else System.out.println("f'(3) = 0");
        if (f_1ra(-3) < 0) System.out.println("f'(-3) = "+f_1ra(-3)+" < 0");
        else if (f_1ra(-3) > 0) System.out.println("f'(-3) = "+f_1ra(-3)+" > 0");
        else System.out.println("f'(-3) = 0");
        
        if (f_2da(0) < 0) System.out.println("f''(0) = "+f_2da(0)+" < 0");
        else if (f_2da(0) > 0) System.out.println("f''(0) = "+f_2da(0)+" > 0");
        else System.out.println("f''(0) = 0");
        if (f_2da(3) < 0) System.out.println("f''(3) = "+f_2da(3)+" < 0");
        else if (f_2da(3) > 0) System.out.println("f''(3) = "+f_2da(3)+" > 0");
        else System.out.println("f''(3) = 0");
        if (f_2da(-3) < 0) System.out.println("f''(-3) = "+f_2da(-3)+" < 0");
        else if (f_2da(-3) > 0) System.out.println("f''(-3) = "+f_2da(-3)+" > 0");
        else System.out.println("f''(-3) = 0");
        
        System.out.println("\nG R A F I C A\n");
        graficar();
        System.out.println("Para resumir, los mínimos relativos ocurren en f en los puntos (3, -20.25) y (3, -20.25); y un máximo relativo se presenta en (0, 0).");
        
    }
    
    public static double f(double x) {
        return ((x*x*x*x)/4)-((9*x*x)/2);
    }
    
    public static double f_1ra(double x) {
        return (x*x*x)-(9*x);
    }
    
    public static double f_2da(double x) {
        return (3*x*x)-(9);
    }
    
    public static String graficar(){
        String mostrar = "";
        int p[] = new int [20];
        int grafica[] = new int[20]; int g[] = new int[20];
        g[0] = (int)f(-10); posiciones[0] = 0;
        g[1] = (int)f(-9); posiciones[0] = 1;
        g[2] = (int)f(-8); posiciones[0] = 2;
        g[3] = (int)f(-7); posiciones[0] = 3;
        g[4] = (int)f(-6); posiciones[0] = 4;
        g[5] = (int)f(-5); posiciones[0] = 5;
        g[6] = (int)f(-4); posiciones[0] = 6;
        g[7] = (int)f(-3); posiciones[0] = 7;
        g[8] = (int)f(-2); posiciones[1] = 8;
        g[9] = (int)f(-1); posiciones[2] = 9;
        g[10] = (int)f(0); posiciones[3] = 10;
        g[11] = (int)f(1); posiciones[4] = 11;
        g[12] = (int)f(2); posiciones[5] = 12;
        g[13] = (int)f(3); posiciones[6] = 13;
        g[14] = (int)f(4); posiciones[6] = 14;
        g[15] = (int)f(5); posiciones[6] = 15;
        g[16] = (int)f(6); posiciones[6] = 16;
        g[17] = (int)f(7); posiciones[6] = 17;
        g[18] = (int)f(8); posiciones[6] = 18;
        g[19] = (int)f(9); posiciones[6] = 19;
        
        int aux = -3;
        System.out.println(" x |  y");
        System.out.println("--------");
        for (int i = 0; i < 20; i++) {
            if (aux >= 0) System.out.println(" "+aux+" | "+g[i]);
            else System.out.println(aux+" | "+g[i]);
            aux ++;
            
        }
        int saltos = grafica[0];
        for (int i = 0; i < 20; i++) grafica[i] = saltos-grafica[i];
        int puntos[] = new int[20]; int contP = 0;
        for (int i = 0; i <= saltos; i++) {
            for (int d = 0; d < 20; d++) {
                if (i == grafica[d]) {
                    mostrar += "\n";
                contP = 0;
                int cont = d; int otra  = 0;
                    try {
                        while (i == grafica[cont]) {
                    if (otra > 0) {
                        posiciones[cont] = posiciones[cont] - posiciones[cont-1];
                    }
                    grafica[cont] = 10000;
                    for (int j = 0; j < posiciones[cont]; j++) mostrar += " ";
                    if (posiciones[cont] == 2) mostrar += "IN";
                    else mostrar += "P";
                    puntos[contP] = posiciones[cont]; contP ++;
                    cont ++; otra ++;
                }
                    } catch (Exception e) {
                    }
                
                } else {
                    mostrar += "\n";
                    for (int j = 0; j < contP; j++) {
                        for (int k = 0; k < puntos[j]; k++) mostrar += " ";
                        mostrar += "|";
                    }
                }
            } 
        }
        return mostrar;
    }
}
