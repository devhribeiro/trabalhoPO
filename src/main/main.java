package main;
import heapsort.HeapSort;


public class main {

	public static void main(String[] args) {
		int[] vet = {32,84,12,43,21,11,90,22,44,45};
		
		System.out.print("Lista: ");
		
		for(int i:vet) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		HeapSort.ordem(vet);
		
		System.out.print("Lista ordenada: ");
		for(int i:vet) {
			System.out.print(i+" ");
		}
		
	}

}
