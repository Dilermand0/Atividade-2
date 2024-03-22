package Modelagem;

import javax.swing.JOptionPane;

public class Visao {

	public static void main(String[] args) {
	        FilaEstudantes fila = new FilaEstudantes(5); // Capacidade da fila é 5

	        // Adicionando alguns estudantes à fila
	        fila.enfileirar(new Estudante("Helton", 27));
	        fila.enfileirar(new Estudante("Alan", 20));
	        fila.enfileirar(new Estudante("Vinicius", 25));

	        // Exibindo os estudantes da fila usando JOptionPane
	        StringBuilder mensagem = new StringBuilder("Estudantes na fila:\n");
	        while (!fila.estaVazia()) {
	            Estudante estudante = fila.desenfileirar();
	            mensagem.append("Nome: ").append(estudante.getNome()).append(", Idade: ").append(estudante.getIdade()).append("\n");
	        }
	        JOptionPane.showMessageDialog(null, mensagem.toString());
	    }
	}