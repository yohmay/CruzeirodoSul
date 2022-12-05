Algoritmo "semnome"
Var
   x, n, a, resp, b, ep: inteiro

Inicio
      escreval("Digite o valor de n")
      leia(n)
      escreval("Digite o valor de x")
      leia(x)
      a <- 2
      resp <- x
      enquanto a<=n faca
           ep <- x
           b <- 1
           enquanto b<a faca
               ep <- ep*x
               b <- b + 1
      fimenquanto
      resp <- resp + ep
      a <- a + 2
      fimenquanto
      escreval(resp)
Fimalgoritmo