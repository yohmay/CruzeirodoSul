/* Construtores

class Carro {
    private codigo;
    private nome;
    private marca;

    Carro() { // Método construtor, mesmo nome da classe.
        marca = "Valor Padrão"; // Inicializa a marca com um valor padrão
    }

    public void MostrarMarca (){ 
        System.out.println("Marca: " + marca);
    }
}

class UsaCarro {
    public static void main (String args []){
        Carro c1 = new Carro (); // Invoca o método construtor
        c1.MostrarMarca();  
    }
}
*/

/* Construtor com parâmetros

class Carro {
    private codigo;
    private nome;
    private marca;

    Carro(String n) { // Método construtor, mesmo nome da classe.
        nome = n; // Inicializa o nome com um valor informado no programa
        marca = "Valor Padrão"; // Inicializa a marca com um valor padrão
    }

    public void ExibeInf(){ 
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
    }
}

class UsaCarro {
    public static void main (String args []){
        Carro c1 = new Carro ("Fiesta"); // Invoca o método construtor
        Carro c2 = new Carro ("Ecosport"); // Invoca o método construtor
        c1.ExibeInf();  
        c2.ExibeInf();  
    }
}


/* Utilizando o this

class Carro {
    private codigo;
    private nome;
    private marca;

    Carro(String nome, String marca) { // Método construtor, mesmo nome da classe.
        this.nome = n; // Inicializa o nome com um valor informado no programa
        thismarca = "Valor Padrão"; // Inicializa a marca com um valor padrão
    }

    public void ExibeInf(){ 
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
    }
}

class UsaCarro {
    public static void main (String args []){
        Carro c1 = new Carro ("Fiesta"); // Invoca o método construtor
        Carro c2 = new Carro ("Ecosport"); // Invoca o método construtor
        c1.ExibeInf();  
        c2.ExibeInf();  
    }
}


*/

/* Sobrecarga 

public class Operadores {
    public void multiplicar (float num1, float num2){
        System.out.println("Multiplicação: " + num1 * num2);
    }
}

public class UsaOperadores {
    public static void main (String args []){
        Operadores op = new Operadores();
        op.multiplicar(1.5, 3.85);
    }
}
 
/ Exemplo 2 

public class Operadores {
    public void multiplicar (float num1, float num2){
        System.out.println("Multiplicação: " + num1 * num2);
    }
    public void multiplicar (int num1, int num2){
        System.out.println("Multiplicação: " + (num1*num2));
    }   
}

*/

/* Herança 

class Veiculo{
    private String nome;
    private float velocidade;
    
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setVelocidade(float valocidade){
        this.velocidade = velocidade;
    }
    public float getVelocidade(){
        return velocidade;
    }

    public void acelera(){
        if (velocidade <= 10){
            velocidade++;
        }
    }

    public void frea(){
        if (velocidade > 0)
            velocidade--;
    }
}


classe Veiculo1 extends Veiculo {
    private boolean ligado;

    public void liga(){
        ligado = true;
    }
    public void desliga(){
        ligado = false
    }
}


import javax.swing.*;
public class UsaVeiculo{
    public static void main (Stirng args []){
        Veiculo1 v = new Veiculo1();
        v.liga();
        v.setNome(JOptionPane.showInputDialog("Digite o nome:"));
        v.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade:")))

        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + v.getVelocidade());
        v.acelera();

        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + v.
        getVelocidade());
        v.frea();

        JOptionPane.showMessageDialog(null, "Velocidade Atual: " + v.
        getVelocidade());
        v.desliga();
    }
}
 */