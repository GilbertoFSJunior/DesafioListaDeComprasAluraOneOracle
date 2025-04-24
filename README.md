Código 1 (meu exemplo):
Estrutura:
- Define uma classe Compra com atributos básicos para cada compra.
- Gerencia as compras diretamente em métodos estáticos na classe principal (GerenciadorDeCompras).
- Utiliza listas para armazenar compras e ordená-las quando necessário.
- Inclui um menu com opções claras para realizar compras e exibir a lista de compras ordenadas.

Prós:
- Simplicidade e clareza na implementação: a lógica do programa está em um único lugar.
- A ordenação por valor decrescente das compras é explícita na exibição das compras realizadas.
- Interface interativa com menu, o que torna o programa mais organizado para o usuário.

Contras:
- Toda a lógica está concentrada em métodos estáticos, dificultando a reutilização e extensibilidade.
- Não há separação de responsabilidades entre diferentes classes além de Compra.


Código 2 (Desenvolvido durante o curso Alura):
Estrutura:
- Define uma classe Principal para lógica de execução e interação com o usuário.
- Cria uma classe CartaoDeCredito, que encapsula os limites do cartão e a lista de compras.
- A classe Compra possui atributos básicos, um método de comparação (compareTo) e usa o método toString para exibir as compras formatadas.
- Não há menu no programa, mas utiliza um loop para repetição e controle baseado na entrada do usuário.

Prós:
- Boa separação de responsabilidades: CartaoDeCredito gerencia o limite e as compras, enquanto Principal foca na interação.
- Reutilizável: a classe CartaoDeCredito pode ser usada em outros contextos sem mudanças significativas.
- Implementa ordenação natural usando Comparable, facilitando futuras manipulações da lista de compras.

Contras:
- Não há ordenação explícita no momento de exibir as compras realizadas.
- O loop de entrada do usuário é menos estruturado (não usa um menu), o que pode dificultar extensões futuras.
- Algumas partes do código têm problemas técnicos, como:- Método getCompras() retorna uma lista vazia (List.of()), tornando impossível exibir compras realizadas.
- Saldo inicial não foi devidamente atribuído (this.saldo deveria ser inicializado como limite).








