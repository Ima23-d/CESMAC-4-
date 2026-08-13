class Gato:
    def __init__(self,nome,cor,idade):
        self.nome = nome
        self.cor = cor 
        self.idade = idade


if __name__ == "__main__":
    gato = Gato("Mingau", "Cinza", 2)
    print(f"Nome do gato: {gato.nome}")
    print(f"Idade do gato em anos humanos: {gato.calcular_idade_em_anos_humanos()}")