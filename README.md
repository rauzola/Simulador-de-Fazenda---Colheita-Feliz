# Simulador de Fazenda - Colheita Feliz

## Objetivo
Desenvolver um simulador de fazenda inspirado no jogo "Colheita Feliz", utilizando conceitos de Orientação a Objetos, com foco em herança, polimorfismo, e gerenciamento de recursos.

## Descrição
Este projeto consiste na criação de uma fazenda virtual onde o usuário pode plantar diferentes tipos de culturas, cuidar dos animais, e administrar os recursos da fazenda. O objetivo é maximizar a produtividade da fazenda através de um gerenciamento eficiente.

## Estrutura das Classes e Métodos

### 1. Classe `Fazenda`
- **Responsabilidade**: Gerenciar a fazenda, incluindo as culturas e animais, além de recursos como água, fertilizantes, e ração.
- **Atributos**:
  - `List<Cultura> culturas`: Lista de culturas plantadas na fazenda.
  - `List<Animal> animais`: Lista de animais criados na fazenda.
  - `int aguaDisponivel`: Quantidade de água disponível na fazenda.
  - `int fertilizantesDisponiveis`: Quantidade de fertilizantes disponíveis.
  - `int racaoDisponivel`: Quantidade de ração disponível.
  - `int moedas`: Quantidade de moedas que o jogador possui.
- **Métodos**:
  - `void plantarCultura(Cultura cultura)`: Adiciona uma nova cultura à fazenda.
  - `void colherCultura(Cultura cultura)`: Colhe uma cultura madura, adicionando moedas ao saldo do jogador.
  - `void alimentarAnimal(Animal animal)`: Alimenta um animal, garantindo que ele continue produzindo.
  - `void coletarProducao(Animal animal)`: Coleta a produção diária do animal (leite, ovos, etc.), convertendo-a em moedas.

### 2. Classe `Cultura` (Base)
- **Responsabilidade**: Representar uma cultura genérica na fazenda.
- **Atributos**:
  - `String nome`: Nome da cultura.
  - `int tempoDeCrescimento`: Tempo necessário para que a cultura cresça e esteja pronta para colheita.
  - `int diasDeCrescimento`: Dias já passados desde o plantio.
  - `int valorDeVenda`: Valor em moedas que a cultura gera ao ser colhida.
- **Métodos**:
  - `void plantar()`: Inicia o processo de crescimento da cultura.
  - `void crescer()`: Incrementa o `diasDeCrescimento`. Se atingir o `tempoDeCrescimento`, a cultura está pronta para colheita.
  - `int colher()`: Retorna o `valorDeVenda` da cultura. Pode ser sobrescrito nas subclasses.

#### Subclasses de Cultura
- **Classe Milho**:
  - Atributos: `valorDeVenda = 10 moedas`, `tempoDeCrescimento = 5 dias`.
  - Método sobrescrito: `int colher()`: Pode incluir bônus se o milho for colhido em condições ideais.
- **Classe Tomate**:
  - Atributos: `valorDeVenda = 15 moedas`, `tempoDeCrescimento = 4 dias`.
- **Classe Batata**:
  - Atributos: `valorDeVenda = 20 moedas`, `tempoDeCrescimento = 6 dias`.

### 3. Classe `Animal` (Base)
- **Responsabilidade**: Representar um animal genérico na fazenda.
- **Atributos**:
  - `String nome`: Nome do animal.
  - `int idade`: Idade do animal em dias.
  - `int producaoDiaria`: Quantidade de produção gerada diariamente.
  - `int consumoDeRacao`: Quantidade de ração que o animal consome diariamente.
- **Métodos**:
  - `void alimentar()`: Consome a quantidade necessária de ração. Se não houver ração, o animal não produz.
  - `int coletarProducao()`: Retorna a produção diária do animal. Pode ser sobrescrito nas subclasses.

#### Subclasses de Animal
- **Classe Vaca**:
  - Atributos: `producaoDiaria = 5 litros de leite`, `consumoDeRacao = 2 unidades de ração`.
  - Método sobrescrito: `int coletarProducao()`: Pode incluir bônus se a vaca for bem alimentada.
- **Classe Galinha**:
  - Atributos: `producaoDiaria = 3 ovos`, `consumoDeRacao = 1 unidade de ração`.
- **Classe Ovelha**:
  - Atributos: `producaoDiaria = 1 unidade de lã`, `consumoDeRacao = 2 unidades de ração`.

## Aplicação de Herança e Polimorfismo

### Herança
- **Cultura**: `Milho`, `Tomate`, e `Batata` herdam da classe base `Cultura`, compartilhando atributos e métodos comuns como `nome`, `tempoDeCrescimento`, e `colher()`. Cada subclasse pode especificar seus próprios valores de atributos e até mesmo sobrescrever métodos para comportamentos específicos.
- **Animal**: `Vaca`, `Galinha`, e `Ovelha` herdam da classe base `Animal`, compartilhando propriedades como `nome`, `idade`, `producaoDiaria`, e métodos como `alimentar()` e `coletarProducao()`.

### Polimorfismo
- Através do polimorfismo, o método `colher()` da classe `Cultura` pode ser chamado de forma genérica, mesmo quando se trabalha com objetos de subclasses específicas (`Milho`, `Tomate`, `Batata`). Isso permite que o método trate diferentes tipos de culturas de maneira uniforme, mas ainda assim respeitando as particularidades de cada uma.
- Similarmente, o método `coletarProducao()` da classe `Animal` pode ser chamado em objetos de `Vaca`, `Galinha`, ou `Ovelha`, permitindo uma interação uniforme com diferentes tipos de animais, mas garantindo que cada animal produza de acordo com suas características específicas.

## Entregáveis
- Código fonte completo do simulador.

## Dicas
- Utilize herança para organizar as classes de maneira lógica e eficiente.
- Explore polimorfismo para criar métodos genéricos que possam operar em diferentes tipos de culturas e animais.
- Pense em como o gerenciamento de recursos pode ser modelado para oferecer um desafio interessante ao jogador.
