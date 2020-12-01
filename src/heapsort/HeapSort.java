package heapsort;
import java.io.*;

public class HeapSort {
	
	public static void ordem(long vet[]){
		montaHeap(vet);
		
		int n=vet.length;
		
		for(int i=vet.length -1; i >=0; i--) {
			long aux=vet[i];
			vet[i]=vet[0];
			vet[0]=aux;
			heapTree(vet, 0, --n);
		}
	}
	
	public static void montaHeap(long[] vet) {
		
		//inicia-se  com o (tamanho do vetor -1) /2, /2 porque eh ordanado
		//metade para cada lado da raiz e -1 porque um dos elementos eh a raiz
		
		for(long i=(vet.length-1)/2; i>=0; i--){
			heapTree(vet, i, vet.length);
		}
	}
	
	
	public static void heapTree(long[] vet, long i, int tam) {
		
		long j=2*i+1;
		long k=j+1;
		
		//Compara os filhos e ordena, se filho 1(j) < filho 2(k) filho 1
		//filho 2 passa a ser filho 1.
		
		if(j<tam && k<tam) {
				
			if(vet[(int)j]<vet[(int) k]) {
				j=k;
			}
			
			//Verifica se filho 1 eh maior que a raiz,
			//se for filho 1 vira raiz e raiz vira filho 1,
			//ao final ocorre a reccusividade.
			
			if(vet[(int)j]>vet[(int)i]) {
				long aux = vet[(int)j];
				vet[(int)j]=vet[(int)i];
				vet[(int)i]=aux;
			
					heapTree(vet, j, tam);
			}
		}
	}
}
