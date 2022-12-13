/* Desvio condicional simples
public class UnidadeIII {
    // definção de atributos
    private double saldo = 0;

    public void setSaldo(double vSaldo)

    public double getSaldo()

    public void sacar(double vValor) {
        if (vValor > saldo)
            System.out.println("Saldo insuficiente");
        else
            saldo = saldo - vValor;
    }
}

/* Desvio condicional composta

public class UnidadeIII{
    private float media, n1, n2;

    public void setN1(int varN1);
    public float getN1();
    public void setN2(int varN2);
    public float getN2();
    
    public void calcularMedia() {
    media = (n1 + n2) / 2;
    if (media >= 8 && media <= 10)
        System.out.println("Conceito A");
    else if (media >= 6 && media < 8)
        System.out.println("Conceito B");  
    else if (media >= 4 && media < 6)
        System.out.println("Conceito C");  
    else
        System.out.println("Conceito D");
    }
}

*/

/* Estrutura de decisão Switch Case 

import javax.swimg;
import javax.swing.JOptionPane;
public class Cambio{
    private float valorR$;

    public void setValor(float varValor){
        valorR$ = varValor;
    }
    public float getValor(){
        return valorR$;
    }

    public void converterMoeda (int op){
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null, " Total em 
                Dólares:" + (valorR$/1.89f));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " Total em 
                Euros:" + (valorR$/3.75f));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " Total em 
                Guaranis:" + (valorR$/0.20f));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, " Total em 
                Bolivares:" + (valorR$/0.89f));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
                
    }
}

*/

/* Estrutura de Repetição While 

public class QtdeNumPar {
    private int numero;

    public void setQtdeNumPar(int vNumero){
        numero = vNumero
    }
    public int getQtdeNumPar(){
        return numero;
    }

    public int retQtdeNumPar(int vNumero){
        if contador = 1;
        int qtdeNumPar = 0;

        while(contador <= vNumero){
            if(contador%2==0)
                qtdeNumPar++;
            contador++;
        }
        return qtdeNumPar;
    }
}
*/

/* Estrutura de Repetição Do While 

public class QtdeNumPar {
    private int numero;

    public void setQtdeNumPar(int vNumero){
        numero = vNumero
    }
    public int getQtdeNumPar(){
        return numero;
    }

    public int retQtdeNumPar(int vNumero){
        if contador = 1;
        int qtdeNumPar = 0;

        do{
            if(contador%2==0)
                qtdeNumPar++;
            contador++;
        } while(contador <= vNumero)

        return qtdeNumPar;
    }
}

*/

/* Estrutura de Repetição FOR

public class QtdeNumPar {
    private int numero;

    public void setQtdeNumPar(int vNumero){
        numero = vNumero
    }
    public int getQtdeNumPar(){
        return numero;
    }

    public int retQtdeNumPar(int vNumero){
        if contador = 1;
        int qtdeNumPar = 0;

        for (int contador + 1; contador <= vNumero; contador++){
            
            if(contador%2==0)
                qtdeNumPar++;
        }
        return qtdeNumPar;
    }
}
*/
