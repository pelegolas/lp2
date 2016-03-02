/**
 * Created by Pelegolas O Elfo on 02/03/2016.
 */
public class Calculadora{
    int x, y;
    public void soma (){
        System.out.println ("A soma dos dois valores é: " + (x+y));
    }
    public void subtracao (){
        System.out.println ("A subtracao dos dois valores é: " + (x-y));
    }
    public void multiplicacao (){
        System.out.println ("A multiplicacao dos dois valores é: " + (x*y));
    }
    public void divisao (){
        System.out.println ("A divisao dos dois valores é: " + (x/y));
    }

    public static void main (String [] args){
        Calculadora a1 = new Calculadora();
        a1.x=25;
        a1.y=5;
        a1.soma();
        a1.subtracao();
        a1.multiplicacao();
        a1.divisao();

        Calculadora a2 = new Calculadora();
        a2.x=30;
        a2.y=3;
        a2.soma();
        a2.subtracao();
        a2.multiplicacao();
        a2.divisao();

        Calculadora a3 = new Calculadora();
        a3.x=1000;
        a3.y=10;
        a3.soma();
        a3.subtracao();
        a3.multiplicacao();
        a3.divisao();

    }

}
