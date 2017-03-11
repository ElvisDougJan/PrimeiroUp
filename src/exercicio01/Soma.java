package exercicio01;

/**
 *
 * @author Elvis
 */
public class Soma {

    public Soma(){
        
    }
        private double resultado;
           
    double somar (double num1, double num2){
        resultado = num1 + num2;
        return resultado;
    }

           
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

      
    
}