from animal import Animal

class Ave(Animal):
    def __init__(self, nombre, peso, año_nacimiento, propietario):
        super().__init__(nombre, peso)
        self.año_nacimiento = año_nacimiento
        self.propietario = propietario

    def calcular_edad(self): 
        año_actual = 2024
        edad = año_actual - self.año_nacimiento
        print('Tiene', edad, 'años')
        
        if edad > 5:
            print("ES MAYOR DE EDAD")
        else:
            print("ES MENOR DE EDAD")

ave = Ave(nombre="Cavo", peso="6 kg", año_nacimiento=2022, propietario="Manuel")
ave.imprimir_nombre()
ave.calcular_edad()
