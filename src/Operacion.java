
public class Operacion {
	
	double num1;
	double num2;
	double result;
	char operacion;
	
	public Operacion(double num1, double num2, char operacion){
		
		this.num1 = num1;
		this.num2 = num2;
		this.operacion = operacion;
	}
	
	public void mostrarResultado() {
		
		System.out.println(this.num1+" "+this.operacion+" "+this.num2+" = "+this.result);
	}



}


