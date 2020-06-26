# TallerSolid

## Diseño de Software

### Grupo 10

#### _Integrantes:_

- William Venegas
- Danny Montenegro
- Luis Litardo
- Manuel Loor
- Gustavo Chonillo


- **Literal 1)** En las clases Helado y Pastel se violaba el Open-Closed Principle, ya que si se deseaba crear 
un nuevo tipo de postre era necesario crear una nueva clase desde cero, además si se deseaba realizar nuevas implementaciones
relacionadas a los postres era necesario modificar cada una de las clases relacionadas a los postres. Esto se solucionó al 
crear una clase padre llamada Postre de la cual extenderá cualquier postre que se venda, en caso de realizar un cambio 
solo será necesario modificar la clase padre sin alterar las clases hijas.

- **Literal 2)**  La clase OperacionesAderezo violaba el Open-Closed Principle(OCP), debido a que solo implementaba dos métodos para dos clases en especifico(Pastel y Helado), si deseabamos añadir un nuevo postre y agregarle o quitar un aderezo, debiamos implementar dos nuevos métodos para esa clase en concreto. Debido a esto se decidió eliminar la clase OperacionesAderezo y implementar dos métodos adicionales en la clase padre(método para agregar un aderezo y para quitar un aderezo), haciendo esto logramos que se cumpla el OCP, ya que si queremos agregar o quitar un aderezo de un nuevo postre simplemente llamamos al método de la clase padre.

- **Literal 3)** La clase Postre violaba el Single Responsability Principle (SRP) ya que también se encargaba del manejo del precio final y de la presentación del mismo.
Por tanto, decidimos crear en el paquete Procesos la clase ManejoDePrecios para que tenga como única responsabilidad el manejo de los precios.

- **Literal 4)** La clase enum `Aderezo` el paquete Adicionales violaba el Open-Close Principle (OCP) porque si era necesario agregar más aderezos, tendríamos que modificar el enum, es decir no era cerrado a modificaciones. Por tanto, convertimos la clase `Aderezo` a abstracta y agregamos el respectivo método para setear el nombre y el respectivo `toString()`, y por cada aderezo creamos una clase que extiende de la clase `Aderezo`, haciendo que sea abierto a modificaciones.
