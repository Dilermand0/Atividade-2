package Modelagem;

public class FilaEstudantes {
    private Estudante[] estudantes;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaEstudantes(int capacidade) {
        this.capacidade = capacidade;
        estudantes = new Estudante[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public void enfileirar(Estudante estudante) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia. Não é possível adicionar mais estudantes.");
            return;
        }
        fim = (fim + 1) % capacidade;
        estudantes[fim] = estudante;
        tamanho++;
    }

    public Estudante desenfileirar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia. Não é possível remover estudantes.");
            return null;
        }
        Estudante estudanteRemovido = estudantes[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return estudanteRemovido;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}

