/* Aplicação Hello Word */

public class UnidadeII {
    public static void main(String[] args) {
        System.out.println("Hello word!");
    }
}

/* Construindo a classe em Java

public class <nome_da_classe>{
    <lista de atributos>
    <lista de métodos>
}

*/

/* Tipo de dados em Java

public class Carro {
    String motor;
    String cor;
    String marca;
}

public class TestarCarro {
    public static void main(String args[]) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.motor = '2.0'
        c1.cor = 'Prata'
        c1.marca = 'Citroen';

        c1.motor = '1.6';
        c1.cor = 'Vermelho'
        c1..marca = 'Ford';
    }
} 

*/

/* Classes: Atributos (Propriedades) + Métodos (Comportamento) 
public class Carro {
    private String motor;
    private String cor;
    private String marca;

    public String getMotor() {
        return motor;
    }

    public String setMotor(String m) {
        motor = m;
    }
}


public class TestarCarro {
    public static void main(String args[]) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setMotor('2.0')
        c1.setCor('Prata')
        c1.setMarca('Citroen')

        c1.setMotor('1.6')
        c1.setCor('Vermelho')
        c1.setMarca('Ford')
    }
} 
*/

/* Métodos - Procedimentos 
void frase(){
    System.out.println("Procedimentos sem parâmetros");
}

*/

/* Métodos - Funções 
String frase(){
    String mensagem = "Função sem parâmetro";
    return mensagem;
}
*/

/* Métodos - Parâmetros
void numero (int n){
    int resposta;
    resposta = n *5;
    System.out.println(resposta);
} 
int soma(int num1, int num2){
    int resul;
    resul = num1 + num2
    return resul;
}
*/