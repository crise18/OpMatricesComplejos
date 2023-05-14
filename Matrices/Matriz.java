
/**
 * Clase que trabaja con matrices
 * @author Crise
 * @version 23/04/23
 */
public class Matriz{
    
    /* Atributos */
    private int[][] datos;
    private int filas;
    private int columnas;

    /* Metodos Constructores */
    public Matriz(){
        this.filas = 2;
        this.columnas = 2;
        datos = new int[filas][columnas];
    }

    public Matriz(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        datos = new int[filas][columnas];
    }

    /* Metodos get */
    public int getFilas(){
        return filas;
    }
    public int getColumnas(){
        return columnas;
    }

    public int[][] getDatos(){
        return datos;
    }  
    
    /* Metodos set */
    public int setFilas(){
        return filas;
    }
    public int setColumnas(){
        return columnas;
    }

    public int[][] setDatos(){
        return datos;
    }  


    //Metodos
    public Matriz sumar(Matriz m){
        if(filas != m.filas || columnas != m.columnas){
            System.out.println("Las matrices deben tener las mismas dimensiones!");
            return null;
        }
    
        Matriz resultado = new Matriz(filas, columnas);
    
        for(int i = 0; i < filas; i++){ // Recorrer filas
            for(int j = 0; j < columnas; j++){ // Recorrer columnas
                resultado.datos[i][j] = datos[i][j] + m.datos[i][j];
            }
        }

        return resultado;
    }

    public Matriz restar(Matriz m){
        if(filas != m.filas || columnas != m.columnas){
            System.out.println("Las matrices deben tener las mismas dimensiones!");
            return null;
        }
    
        Matriz resultado = new Matriz(filas, columnas);
    
        for(int i = 0; i < filas; i++){ // Recorrer filas
            for(int j = 0; j < columnas; j++){ // Recorrer columnas
                resultado.datos[i][j] = datos[i][j] - m.datos[i][j];
            }
        }

        return resultado;
    }

    public Matriz multiplicar(Matriz m){
        if(columnas != m.filas){
            System.out.println("El numero de columnas de la primera matriz debe coincidir con el numero de filas de la segunda! ");
            return null;
        }
    
        Matriz resultado = new Matriz(filas, m.columnas);
    
        for(int i = 0; i < filas; i++){ // Recorrer filas en C
            for(int j = 0; j < m.columnas; j++){ // Recorrer columnas en C
                for(int l = 0; l < columnas ; l++){
                    resultado.datos[i][j] += datos[i][l]*m.datos[l][j];
                }
            }
        }

        return resultado;
    }

    public boolean equals(Matriz m){

        if(filas != m.filas || columnas != m.columnas){
            return false;
        }
    
        //Matriz resultado = new Matriz(filas, columnas);
    
        for(int i = 0; i < filas; i++){ // Recorrer filas
            for(int j = 0; j < columnas; j++){ // Recorrer columnas
                if(datos[i][j] != m.datos[i][j]){
                    return false;
                }
            }
        }

        return true;

    }

    /* Metodo toString */
    public String toString(){
        String c = "";

        for(int i = 0; i < filas; i++){ // Recorrer filas
            for(int j = 0; j < columnas; j++){ // Recorrer columnas
                c +=  datos[i][j] + " ";
            }
            //c = c.substring(0,c.length() -1 );
            c += "| \n|";
        }
        c = c.substring(0,c.length()-1);
        return "|" + c ;
    }
}