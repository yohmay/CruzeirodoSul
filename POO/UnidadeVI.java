// Classe Abstrata

/* 
public class Veiculo {
    //Atributos
    private float velocidade;
    private int passageiros;

    // Construtores
    public Veiculo (float v, int p){
        velocidade = v;
        passageiros = p;
    }
    public Veiculo(){
        this(0f, 0);
    }

    // Métodos de Acesso
    public void setVelocidade (float v) {
        velocidade = v;
    }

    public float getVelocidade(){
        return velocidade;
    }

    public void setPassageiros(int p ){
        passageiros = p;
    }
    
    public int gerPassageiros(){
        return passageiros;
    }

    // Métodos Abstratos
    public abstract void acelera();
    public abstract void freia();

}
*/

/* Exemplo 2 
public class Veiculo {
    //Atributos
    private float combustivel;


    // Construtores
    public Carro (float vel, int pas, float comb){
        super(vel, pas);
        combustivel = comb;       
    }
    public Carro(){
        this(0f, 0, 0f);
    }

    // Métodos de Acesso
    public void setCombustivel (float comb) {
        Combustivel = comb;
    }

    public float getCombustivel(){
        return Combustivel;
    }

    // Métodos Obrigátorios
    public void acelera(){
        setVelocidade (getVelocidade() + 1);
    }
    public void freia(){
        setVelocidade(getVelocidade() - 1);
    }
} 
*/

// Sobreposição

/*
public class Uno extends Carro{
    //Sem Atributos

    // Construtores
    public Uno (float vel, int pas, float comb){
        super(vel, pas, comb);
    }
    public Uno(){
        this(0f, 0, 0f);
    }

    //Sobreposição
    public void acelera(){
        setVelocidade (getVelocidade() + 0.5f);
    }   
    public void freia(){
        setVelocidade(getVelocidade() - 0.5f);
    }

}

public class Ferrari extends Carro{
    //Sem Atributos

    // Construtores
    public Ferrari (float vel, int pas, float comb){
        super(vel, pas, comb);
    }
    public Ferrari(){
        this(0f, 0, 0f);
    }

    //Sobreposição
    public void acelera(){
        setVelocidade (getVelocidade() + 3.5f);
    }   
    public void freia(){
        setVelocidade(getVelocidade() - 3.5f);
    }

}
*/

// Interface 

/*
public interface Imprimivel{
    final char nlin = '\n';                     // - Imprimível
    public String toString();
    public void toSystemOut();
}


public class Produto implements Imprimivel{
    private String descricao;
    private int quantidade;

    public Produto(String d, int q){
        descricao = d;
        quantidade = q;
    }

    public String toString(){
        String resp = "Descrição: " + descricao;            // Produto
        resp += nlin + "Qtde: " + quantidade;
        return resp;
    }

    public void toSystemOut(){
        String resp = "Descrição: " + descricao;
        resp += nlin + "Qtde: " + quantidade;
        System.out.print(resp);
    }
}

*/
