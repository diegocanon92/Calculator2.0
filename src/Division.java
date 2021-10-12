public class Division extends Operacion{
   
       
    public Division(double num1, double num2) {
             
    super(num1, num2, '/');
    if(num2==0) System.out.println("No se puede dividir entre cero");
    else this.result = num1 / num2;
    this.mostrarResultado();
    }    
}
