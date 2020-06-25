# TallerSolid

## Diseño de Software

### Grupo 10

- William Venegas
- Danny Montenegro
- Luis Litardo
- Manuel Loor
- Gustavo Chonillo


-Literal 1) En las clases Helado y Pastel se violaba el Open-Closed Principle, ya que si se deseaba crear 
un nuevo tipo de postre era necesario crear una nueva clase desde cero, además si se deseaba realizar nuevas implementaciones
relacionadas a los postres era necesario modificar cada una de las clases relacionadas a los postres. Esto se solucionó al 
crear una clase padre llamada Postre de la cual extenderá cualquier postre que se venda, en caso de realizar un cambio 
solo será necesario modificar la clase padre sin alterar las clases hijas.
