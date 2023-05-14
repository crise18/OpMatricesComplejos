/**
 * @author Mariana.G
 **/

public class Complejo {

	private double real;  			// Parte real
	private double imaginario;       // Parte imaginaria

	/* Constructor por omisión */
	public Complejo() {
		real = 0.0;
		imaginario = 0.0;
	}

	/* Constructor que recibe dos parámetros*/

	public Complejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	/* Getters */

	public double getReal() {
		return real;
	}

	public double getImaginario() {
		return imaginario;
	}

	/* Setters */

	public void setReal(double real) {
		this.real = real;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

	/* Metodo para suma */

	public Complejo sumar(Complejo c) {


		double nuevoReal = this.real + c.real;
		double nuevoImaginario = this.imaginario + c.imaginario;


		return new Complejo(nuevoReal, nuevoImaginario);
	}


	/* Metodo para resta */

	public Complejo restar(Complejo c) {
		

		double nuevoReal = this.real - c.real;
		double nuevoImaginario = this.imaginario - c.imaginario;

		return new Complejo(nuevoReal, nuevoImaginario);
	}

		
	/* Metodo para multiplicación */	

	public Complejo multiplicar(Complejo c) {
	

		double nuevoReal = (this.real * c.real) - (this.imaginario * c.imaginario);
		double nuevoImaginario = (this.real * c.imaginario) + (this.imaginario * c.real);

		return new Complejo(nuevoReal, nuevoImaginario);
	}

		
	/* Metodo para división */

	public Complejo dividir(Complejo c) {
		

		double nuevoReal = (this.real * c.real + this.imaginario * c.imaginario) / (c.real * c.real + c.imaginario * c.imaginario);
		double nuevoImaginario = (this.imaginario * c.real - this.real * c.imaginario) / (c.real * c.real + c.imaginario * c.imaginario);
		
		return new Complejo(nuevoReal, nuevoImaginario); 
	}



	/*Método toString*/

	@Override
    public String toString() {
        String complejoEnString;
    
        if(this.real==0 & this.imaginario ==0){
            return "0.00";
        }
        else if(this.real > 0 & this.imaginario >= 0){
            return String.format(" %.2f " + " + " + " %.2fi ", real, imaginario);
        }
        else if(this.real >= 0 & this.imaginario < 0){
            return String.format(" %.2f " + " - " + " %.2fi ", real, -1 * imaginario);
        }
        else if(this.real < 0 & this.imaginario >= 0){
            return String.format(" %.2f " + " + " + " %.2fi ", real, imaginario);
        }
        else if(this.real < 0 & this.imaginario < 0){
            return String.format("%.2f" + "-" + "%.2fi", real, -1 * imaginario);
        }
        else{
            return null;
        }  

    }

	


	/*Método equals*/

    @Override
    public boolean equals(Object obj) {
        if (obj == null) 
            return false;
        
        if (!(obj instanceof Complejo)) 
            return false;
        
        Complejo otro_complejo = (Complejo)obj;
        
        if (this.real != otro_complejo.real) 
            return false;
        
        if (this.imaginario != otro_complejo.imaginario) 
            return false;
        

        return true;
    }
	
}