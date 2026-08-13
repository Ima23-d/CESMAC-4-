class Cubo:
    '''
    Classe para calcular o cubo de um numero
    '''
    def __init__(self,valor):
        self.x = valor
        print("Objeto Criado!")
    
    def calcula_cubo(self):
        cubo = self.x * self.x * self.x
        return cubo

teste = Cubo(6)
print(teste.calcula_cubo())