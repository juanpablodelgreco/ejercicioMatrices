import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {


	public static void main(String[] args) {
		//Matriz m = new Matriz(3,4);
		Matriz m = new Matriz(3,3);
		int [][]cuadrada = {{ 8, 2, -3,  4},
							{ 5, -6, -6, 20},
							{21,  1, -5,  0},
							{21,  1, -5,  0}};
		int [][]n =  {{ 8, 2, -3},{ 5, -6, -6},{21,  1, -5}};
		int [][]n4 =  {{ 1,  2,  3,  4},{ 5,  6,  7,  8},{ 9, 10, 11, 12}, {13, 14, 15, 16}};
		int [][]mat = {{2,1,1,1},{1,2,1,1},{1,1,4,1},{1,1,1,8}};
		int vec[] = new int[m.getX()];
		m.setM(n);
		m.consigna04();
		System.out.println("---------------------");
		ejercicio4(n);
		
	
		
		
		// m.setM(cuadrada);
		// System.out.println("Consigna 0");
		// m.mostrarMatriz();
		// System.out.println(m.consigna0());
		// System.out.pri ntln("Consigna 1");
		// System.out.println(m.consigna01());
		// System.out.println("Consigna 2");
		// m.consigna02();
		// m.mostrarMatriz( );
		// System.out.println("Consigna 3");
		// vec = m.consigna03();
		// mostrarVector(vec);
		// System.out.println("Consigna 4");
		// m.consigna04();
	}
	
	
	
	public static void ejercicio4(int[][] a) {
        int i=0,j=0,k=0;
        for(i=a.length-1;i>=0;i--)
        {
             for(k=i,j=0;k<a.length && j<a[0].length;k++,j++)
                  System.out.print(a[k][j]+" ");
             System.out.print("\n");
        }
        for(j=1;j<a[0].length;j++)
        {
            for(k=j,i=0;k<a[0].length && i<a.length;k++,i++)
                 System.out.print(a[i][k]+" ");
            System.out.print("\n");
        }
}
}
	
	
	
