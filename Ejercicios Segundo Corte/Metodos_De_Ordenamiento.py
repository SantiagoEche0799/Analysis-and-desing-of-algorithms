import math

def datosEntrada():
	
	n = int(input("Ingrese la cantidad de valores que seran ordenados: "))
	miLista = []

	for i in range(n):

		miLista.append(int(input(f"Introduce el valor {i+1} que deseas ordenar: ")))

	return miLista


def bubbleSortMayor(miLista):

	for i in range(0,len(miLista)-1):
		for j in range(i+1,len(miLista)):
			if miLista[i]<miLista[j]:
				aux = miLista[i]
				miLista[i] = miLista[j]
				miLista[j] = aux

	print(miLista[:] ," Ordenado de Mayor a Menor")


def bubbleSortMenor(miLista):

	for i in range(0,len(miLista)-1):
		for j in range(i+1,len(miLista)):
			if miLista[i]>miLista[j]:
				aux = miLista[i]
				miLista[i] = miLista[j]
				miLista[j] = aux

	print(miLista[:] ," Ordenado de Menor a Mayor")


def direccionalBubbleMayor(miLista):

	for j in range(1,len(miLista)):
		for i in range(0,len(miLista)-j):
			if miLista[i] > miLista[i+1]:
				temp = miLista[i]
				miLista[i] = miLista[i+1]
				miLista[i+1] = temp
		for k in range(len(miLista)-j,j,-1):
			if miLista[k]<miLista[k-1]:
				temp = miLista[k]
				miLista[k] = miLista[k-1]
				miLista[k-1] = temp
	print(miLista[:] ," Ordenado de Menor a Mayor")


def direccionalBubbleMenor(miLista):

	for j in range(1,len(miLista)):
		for i in range(0,len(miLista)-j):
			if miLista[i] < miLista[i+1]:
				temp = miLista[i]
				miLista[i] = miLista[i+1]
				miLista[i+1] = temp
		for k in range(len(miLista)-j,j,-1):
			if miLista[k]>miLista[k-1]:
				temp = miLista[k]
				miLista[k] = miLista[k-1]
				miLista[k-1] = temp
	print(miLista[:] ," Ordenado de Mayor a Menor")

			
def seleccionMenor(miLista):
	for i in range(0,len(miLista)):
		menor = miLista[i]
		pos = i
		for j in range(i+1,len(miLista)):
			if miLista[j] < menor:
				menor = miLista[j]
				pos = j
		if(pos != i):
			temp = miLista[i]
			miLista[i] = miLista[pos]
			miLista[pos] = temp

	print(miLista[:] ," Ordenado de Menor a Mayor")


def seleccionMayor(miLista):
	for i in range(0,len(miLista)):
		menor = miLista[i]
		pos = i
		for j in range(i+1,len(miLista)):
			if miLista[j] > menor:
				menor = miLista[j]
				pos = j
		if(pos != i):
			temp = miLista[i]
			miLista[i] = miLista[pos]
			miLista[pos] = temp

	print(miLista[:] ," Ordenado de Mayor a Menor")


def insercionDirectaMayor(miLista):
	for p in range(1,len(miLista)):
		aux = miLista[p]
		j = p - 1
		while (j >= 0) and (aux < miLista[j]):
			miLista[j+1] = miLista[j]
			j = j - 1
		miLista[j+1] = aux
	print(miLista[:] ," Ordenado de Menor a Mayor")


def insercionDirectaMenor(miLista):
	for p in range(1,len(miLista)):
		aux = miLista[p]
		j = p - 1
		while (j >= 0) and (aux > miLista[j]):
			miLista[j+1] = miLista[j]
			j = j - 1
		miLista[j+1] = aux
	print(miLista[:] ," Ordenado de Mayor a Menor")


def quickSortMayor(miLista):
	
	if len(miLista) > 1:
		inicio = []
		ultimo = []
		pivote = miLista[0]
		secuencia = miLista[1:]
		for i in secuencia:
			if i < pivote:
				ultimo.append(i)
			elif i > pivote:
				inicio.append(i)
		return quickSortMayor(ultimo)+[pivote]+quickSortMayor(inicio)
	else:
		return miLista


def quickSortMenor(miLista):
	
	if len(miLista) > 1:
		inicio = []
		ultimo = []
		pivote = miLista[0]
		secuencia = miLista[1:]
		for i in miLista:
			if i < pivote:
				ultimo.append(i)
			elif i > pivote:
				inicio.append(i)
		return quickSortMenor(inicio)+[pivote]+quickSortMenor(ultimo)
	else:
		return miLista


def shellSortMayor(miLista):
	inicio = 1
	for inicio in range(1,len(miLista),inicio*3+1):
		while inicio>0:
			for i in range(inicio,len(miLista)):
				j = i
				aux = miLista[i]
				while j >= inicio and miLista[j-inicio] > aux:
					miLista[j]=miLista[j-inicio]
					j = j - inicio
				miLista[j] = aux
			inicio = inicio//2
	print(miLista[:] ," Ordenado de Menor a Mayor")


def shellSortMenor(miLista):
	inicio = 1
	for inicio in range(1,len(miLista),inicio*3+1):
		while inicio>0:
			for i in range(inicio,len(miLista)):
				j = i
				aux = miLista[i]
				while j >= inicio and miLista[j-inicio] < aux:
					miLista[j]=miLista[j-inicio]
					j = j - inicio
				miLista[j] = aux
			inicio = inicio//2
	print(miLista[:] ," Ordenado de Mayor a Menor")


def gnomeMayor(miLista):
	i = 1
	while i < len(miLista):
		if miLista[i] >= miLista[i - 1]:
			i = i + 1 
		else:
			aux = miLista[i - 1]
			miLista[i - 1] = miLista[i]
			miLista[i] = aux
			if i > 1 :
				i = i - 1
	print(miLista[:] ," Ordenado de Menor a Mayor")


def gnomeMenor(miLista):
	i = 1
	while i < len(miLista):
		if miLista[i] <= miLista[i - 1]:
			i = i + 1 
		else:
			aux = miLista[i - 1]
			miLista[i - 1] = miLista[i]
			miLista[i] = aux
			if i > 1 :
				i = i - 1
	print(miLista[:] ," Ordenado de Mayor a Menor")


def peineMayor(miLista):
	permutacion = True
	gap = len(miLista)
	while (permutacion == True) or (gap>1):
		permutacion = False
		gap = math.floor(gap / 1.3)
		if gap < 1: 
			gap = 1
		for actual in range(0,len(miLista)-gap):
			if miLista[actual] > miLista[actual + gap]:
				permutacion = True
				aux = miLista[actual]
				miLista[actual] = miLista[actual + gap] 
				miLista[actual + gap] = aux
	print(miLista[:] ," Ordenado de Menor a Mayor")


def peineMenor(miLista):
	permutacion = True
	gap = len(miLista)
	while (permutacion == True) or (gap>1):
		permutacion = False
		gap = math.floor(gap / 1.3)
		if gap < 1: 
			gap = 1
		for actual in range(0,len(miLista)-gap):
			if miLista[actual] < miLista[actual + gap]:
				permutacion = True
				aux = miLista[actual]
				miLista[actual] = miLista[actual + gap] 
				miLista[actual + gap] = aux
	print(miLista[:] ," Ordenado de Mayor a Menor")


def opcion(lista):
	
	while(True):

		print("1. Metodo de la burbuja\n2. Metodo de burbuja direccional\n3. Metodo de selección\n4. Metodo de inserción directa\n5. Metodo de Quick Sort\n6. Metodo de Shell Sort\n7. Metodo de Gnome\n8. Metodo de Peine\n9. Salir")
		print("")
		opc = input("Digite la opción que desea realizar: ")
		print("")

		if(opc == '1'):
			bubbleSortMayor(lista)
			bubbleSortMenor(lista)
			print("")
		elif(opc == '2'):
			direccionalBubbleMayor(lista)
			direccionalBubbleMenor(lista)
			print("")
		elif(opc == '3'):
			seleccionMenor(lista)
			seleccionMayor(lista)
			print("")
		elif(opc == '4'):
			insercionDirectaMayor(lista)
			insercionDirectaMenor(lista)
			print("")
		elif(opc == '5'):
			print(quickSortMayor(lista), "Ordenado De Menor a Mayor")
			print(quickSortMenor(lista), "Ordenado de Mayor a Menor")
			print("")
		elif(opc == '6'):
			shellSortMayor(lista)
			shellSortMenor(lista)
			print("")
		elif(opc == '7'):
			gnomeMayor(lista)
			gnomeMenor(lista)
			print("")
		elif(opc == '8'):
			peineMayor(lista)
			peineMenor(lista)
			print("")
		elif(opc == '9'):
			print("Proceso finalizado")
			break
		else:
			print("opción no válida, vuelva a digitarla")
			print("")

def main():
	lista = datosEntrada()
	print("")
	opcion(lista)
	#lista = datosEntrada()
	#bubbleSortMayor(lista)
	#bubbleSortMenor(lista)
	#direccionalBubbleMayor(lista)
	#direccionalBubbleMenor(lista)
	#seleccionMenor(lista)
	#seleccionMayor(lista)
	#insercionDirectaMayor(lista)
	#insercionDirectaMenor(lista)
	#print(quickSortMayor(lista))
	#print(quickSortMenor(lista))
	#shellSortMayor(lista)
	#shellSortMenor(lista)
	#gnomeMayor(lista)
	#gnomeMenor(lista)
	#peineMayor(lista)
	#peineMenor(lista)


if __name__ == "__main__" :
	main()