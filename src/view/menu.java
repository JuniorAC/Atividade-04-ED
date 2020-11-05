package view;

import javax.swing.JOptionPane;

import controller.MetodosOrganizadores;

public class menu {

	public static void main(String[] args) {
		//int vet[] = new int [16];
		String mostra = "";
		MetodosOrganizadores M = new MetodosOrganizadores();
		int op = 0;
		
		
		while (op != 99) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1-teste Quick sort \n2-teste Merge Sort \n99-Sair"));
			switch (op) {
			case 1:
				int vet[] = { 11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78 };
				mostra = "";
				System.out.println("vetor desorganizado antes do Quick sort");
                for (int i = 0; i < 17; i++) {
					mostra = mostra + vet[i] + " ";
				}
				System.out.println(mostra);
				
				M.quickSort(vet, 0, 16);
				
				System.out.println("vetor organizado após o Quick sort");
				mostra = "";
				for (int i = 0; i < 17; i++) {
					mostra = mostra + vet[i] + " ";
				}
				System.out.println(mostra);
				break;

			case 2:
				int vet1[] = { 11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78 };
				mostra = "";
				System.out.println("vetor desorganizado antes do Merge Sort");
                for (int i = 0; i < 17; i++) {
					mostra = mostra + vet1[i] + " ";
				}
				System.out.println(mostra);
				
				M.mergeSortRecursivo(vet1, 0, 16);
				
				System.out.println("vetor organizado após o Merge Sort");
				mostra = "";
				for (int i = 0; i < 17; i++) {
					mostra = mostra + vet1[i] + " ";
				}
				System.out.println(mostra);
				M.mergeSortRecursivo(vet1, 0, 16);
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}

	}

}
