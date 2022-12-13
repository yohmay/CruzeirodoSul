/* Vetores

public class UnidadeIV {
    public static void main(String args[]) {
        char CaracterArray[] = ['a','b','c','d','e','f','g'];
        
        System.out.println(" Mostrando o Array" + String.valueOf(CaracterArray));
        System.out.println("Quant. de elementos" + CaracterArray.length);
        System.out.println("1º ao 3º caracter" + String.valueOf(CaracterArray,0,3));

        String StringArray[] = ("Aprendendo", "a", "utilizar", "array");

        for(int = 0; i < StringArray.length; i++){
            nomes = nomes + StringArray[i] + " ";
        }

        System.out.println(" Mostrando o Array" + nomes);
        System.out.println("Quant. de elementos do array:" + StringArray.length);
        System.out.println("Mostrando o 1º elemento: " + StringArray[0]);
        System.out.println("Mostrando o último elemento do array:" + StringArray[StringArray.length -1]);
    }
}
 

/* Array Bidimensionais 

public class Veiculo {
    private int velocidade;

    public void setVelocidade(int vVelocidade){
        velocidade = vVelocidade;
    }

    public int getVelocidade(){
        return velocidade;
    }
}

public class Exemplo {
    public static void main (String arg []){
        Veiculo veic[] = new Veiculo [300];

        for (int indice = 0; indice <300; indice++){
            veic[indice] = new Veiculo();
        }

        veic[0].setVelocidade(10);
        veic[10].setVelocidade(200);
        veic[250].setVelocidade(150);
        
        for(int i=0; i<300; i++){
            veic[i].setVelocidade(0);
        }
    }
}

*/
























