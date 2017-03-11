package exercicio02;

/**
 *
 * @author Elvis
 */

public class Calculadora {
    
   
    public Calculadora(){
        
    }
 
       private double resultado;
    
   
    double somar (double num1, double num2){
        resultado = num1 + num2;
        return resultado;
    }
    
    double subtrair (double num1, double num2){
        resultado = num1 - num2;
        return resultado;
    }
    
    double multiplicar (double num1, double num2){
        resultado = num1 * num2;
        return resultado;
    }
    
    double dividir (double num1, double num2){
        resultado = num1 / num2;
        return resultado;
    }
    

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
