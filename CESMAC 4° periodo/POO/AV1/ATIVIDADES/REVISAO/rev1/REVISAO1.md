1. Conceitos Fundamentais
a. Classe: É o molde ou projeto que define os atributos (características) e métodos (comportamentos) que os objetos criados a partir dela terão.

b. Objeto & Instância:

Objeto: É a entidade concreta criada a partir da classe, com dados reais na memória.

Instância: É o processo/resultado da criação do objeto (ex: Carro meuCarro = new Carro(); aqui meuCarro é uma instância de Carro).

2. Visibilidade: private vs public
private: Restringe o acesso apenas à própria classe.

Uso: Essencial para atributos. Garante o encapsulamento, impedindo que dados sejam alterados diretamente por fora sem validação.

public: Permite o acesso por qualquer classe do sistema.

Uso: Recomendado para a declaração da classe, construtores e métodos (getters, setters e métodos de ação). Deve ser evitado em atributos para não expor a estrutura interna do objeto.