class Gato:
    def __init__(self,nome,cor,idade):
        self.nome = nome
        self.cor = cor 
        self.idade = idade

    def peso_gato(self, peso):
        self.peso = peso
        if (self.peso > 5.0):
            print("Esta gordo")
        elif (self.peso > 3.5):
            print("Ideal")
        else:
            print("O animal esta abaixo do peso")

    def _dieta_especial_gato(self):
        self.msg = "tudo ok"
        if(self.peso < 3.5):
            self.msg = "Aumente a ração"
        if(self.peso >= 5.0):
            self.msg = "Reduza a ração" 
        return self.msg
    
    def daods_gato(self):
        print(self._dieta_especial_gato())
        return f"Nome: {self.nome}, Cor: {self.cor}, Idade: {self.idade}, Peso: {self.peso}"
        
    



if __name__ == "__main__":
    gato = Gato("Mingau", "Cinza", 2)
    print(f"Nome do gato: {gato.nome}")
    print(f"Peso do gato: {gato.peso_gato(4.0)}")
    print(gato.daods_gato())