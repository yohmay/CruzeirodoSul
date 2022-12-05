Algoritmo "semnome"

Var
A, B, C: logico
X, Y: real
R1, R2, R3: inteiro
Inicio
A <- verdadeiro
B <- falso
C <- verdadeiro
X <- 2.5
Y <- 3.5

se C ou (X-Y > 0) entao
   R1<-1
senao
   R1<-0
fimse
se ((A E B) OU C) E ((X > Y) OU NAO(A)) entao
   R2<-1
senao
   R2<-0
fimse
se B OU (X-Y<0) E (B E NAO (A)) OU (NAO(C)) entao
   R3<-1
senao
   R3<- 0
fimse
Fimalgoritmo