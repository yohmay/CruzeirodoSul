Algoritmo "semnome"

Var
qtde, total: real
t: inteiro

Inicio
escreva("Digite a quantidade")
leia(qtde)
escreva("Digite o tipo")
leia(t)
se t = 1 entao
   total <- qtde*2
senao (t=2) entao
   se (t=2) entao
      total <- qtde*3
   senao
      total <- qtde *5
   fimse
fimse
   escreval("Total a pagar é: ", total)

Fimalgoritmo