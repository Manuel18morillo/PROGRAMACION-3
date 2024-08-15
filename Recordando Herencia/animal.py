class Animal:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def imprimir_nombre(self):
        print(f'el nombre del animal es', self.nombre)
