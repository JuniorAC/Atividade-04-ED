package controller;

public class MetodosOrganizadores {

	public MetodosOrganizadores () {
		super();
	}
	
public void quickSort (int vet[], int ini, int fim){
	int divisao;
	if (ini < fim) {
		divisao = particao (vet, ini, fim );
		quickSort (vet, ini, divisao-1);
		quickSort (vet, divisao+1, fim);
	}
	
}

private static int particao(int[] vet, int ini, int fim) {
	int pivo = vet[ini], i = ini+1, f= fim, aux;
	while (i<=f) {
		while (i <=fim && vet [i] <= pivo) 
			++i;
		while (pivo < vet[f])
			--f;
		if (i <f) {
			aux = vet[i];
			vet[i] = vet[f];
			vet[f] = aux;
			++i;
			--f;
		
		}
	}
	if (ini !=f) {
		vet[ini] = vet[f];
		vet[f] = pivo;
	}
	return f;
}

public void mergeSortRecursivo(int lista[], int inicio, int fim) {
	if (inicio < fim) {
		int meio = (inicio + fim) /2;
		mergeSortRecursivo(lista, inicio, meio);
		mergeSortRecursivo(lista, meio+1, fim);
		mesclar (lista, inicio, meio, meio+1, fim);
		
		
	}
}

private static void mesclar(int lista[], int inicioA, int fimA, int inicioB, int fimB){
	int i1 = inicioA;
	int i2 = inicioB;
	int iaux = inicioA;
	int aux[]= new int [lista.length];
	while (i1 <= fimA && i2 <= fimB) {
		if (lista[i1]<= lista[i2])
			aux[iaux++]=lista[i1++];
		else 
			aux[iaux++]= lista[i2++];
	}
	while (i1<=fimA)
		aux[iaux++]=lista[i1++];
	while (i2<=fimB)
		aux[iaux++]= lista[i2++];
	for (int i = inicioA; i<=fimB;i++)
		lista[i] = aux[i];
	}
		
	

}

