
/**
 * Programa que hace uso de la clase Matriz para hacer operaciones con
 * matrices
 * @author Crise
 * @version 23/04/23
 * @see Matriz
 */

import java.util.Scanner;


public class PruebaMatriz {
    Scanner teclado = new Scanner(System.in);
    
    public static void llenar_matriz(Matriz m){
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingresa los valores de tu matriz: ");

        for(int i = 0; i < m.getFilas(); i++){ // Recorrer filas
            for(int j = 0; j < m.getColumnas(); j++){ // Recorrer columnas
                System.out.print("Posicion " + "[" + (i+1) + "," + (j+1) + "]" + " = ");
                m.getDatos()[i][j] = Integer.parseInt(teclado.nextLine());
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filasA = 0, filasB = 0;
        int columnasA = 0, columnasB = 0;
        int seleccion = 1;
        String repetir = "SI";
        System.out.println("Este programa te permitira calcular operaciones básicas entre dos matrices.");

        
        while(!repetir.equalsIgnoreCase("NO")){
            System.out.println("Ingresa el numero de filas y columnas para la 1era matriz: ");
            filasA = teclado.nextInt();
            columnasA = teclado.nextInt();
    
            System.out.println("Ingresa el numero de filas y columnas para la 2da matriz: ");
            filasB = teclado.nextInt();
            columnasB = teclado.nextInt();

            if(filasA < 0 || filasB < 0 || columnasA < 0 || columnasB < 0){
                System.out.println("El numero de columnas y filas debe ser mayor o igual que cero!");
                break;
            }
        
            Matriz m1 = new Matriz(filasA,columnasA); 
            llenar_matriz(m1);
            Matriz m2 = new Matriz(filasB,columnasB);
            llenar_matriz(m2);
            
            while(seleccion != 0){
                System.out.println("Seleccion algunas de las siguientes opciones: \n Operacion   Identificador \n   Salir         0\n   Suma          1\n   Resta         2\n Multiplicar     3");
                System.out.println("Ingresa tu seleccion: ");
                seleccion = teclado.nextInt();
        
                switch(seleccion){ //en la parte de arriba inicializo seleccion = 1                
                    case 0:
                        seleccion = 0;
                        break;
                    case 1:
                        Matriz suma = m1.sumar(m2);
                        System.out.println("Suma de matrices: \n" + suma);
                        break;
                    case 2:
                        Matriz resta = m1.restar(m2);
                        System.out.println("Resta de matrices: \n" + resta);
                        break;
                    case 3:
                        Matriz multiplicacion = m1.multiplicar(m2);
                        System.out.println("Multiplicacion de matrices: \n" + multiplicacion);
                        break;
                    default:
                        System.out.println("Ingresa una operacion valida!");
                }
            }
            seleccion = 1; //reiniciamos seleccion

            System.out.println("Las matrices eran iguales? " + m1.equals(m2));
            teclado.nextLine();
            System.out.println("Desea ingresas nuevas matrices? (SI/NO)");
            repetir = teclado.nextLine();
        
        }
        System.out.println("Vuelva pronto!");
    }
}




