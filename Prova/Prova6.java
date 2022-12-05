public class Prova6{
  public static void main(String[] args) {
    int contador = 0;
    for (int j = 0; j < 10; j++){
      contador = j;
      if ((contador + j) == 6) {
        System.out.println("Contador = " + contador);
      }
    }
  }
}