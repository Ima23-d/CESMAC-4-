class Produto:
    def __init__(self,nome,preco,estoque):
        self._nome = nome
        self._preco = preco
        self._estoque = estoque


    def get_nome(self):
        return self._nome

    def get_preco(self):
        return self._preco

    def get_estoque(self):
        return self._estoque

    def set_nome(self,nome):
        self._nome = nome

    def set_preco(self,preco):
        self._preco = preco

    def set_estoque(self,estoque):
        self._estoque = estoque