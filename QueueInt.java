public class QueueInt {
    // Parametros
    private int[] vet;
    private int cont;

    // Construtores
    public QueueInt(int tamanho) {
        this.vet = new int[tamanho];
        this.cont = 0;
    }

    public QueueInt() {
        this.vet = new int[10];
        this.cont = 0;
    }

    // isFull
    public boolean isFull() {
        if (this.cont == this.vet.length) {
            return true;
        } else {
            return false;
        }

        // return this.cont == this.vet.length;
    }

    // isEmpty
    public boolean isEmpty() {
        if (this.cont == 0) {
            return true;
        } else {
            return false;
        }
        // return this.cont == 0;
    }

    public int head() {
        return this.vet[0];
    }

    // Enqueue
    public void enqueue(int valor) {
        this.vet[this.cont] = valor;
        this.cont++;
    }

    // Dequeue
    public int dequeue() {
        int save = this.head(); // Variavel que salva o valor do head(primeiro da fila)
        int aux;// Variavel que vai ajudar a mover a fila
        for (int i = 1; i < vet.length; i++) {
            aux = this.vet[i]; // Variavel recebe o valor que está na posição i do vetor
            this.vet[i - 1] = aux; // Na posição i-1 vai ser a variavel auxiliar.
        }
        this.cont--;// Decrementar o contador
        return save;// Retornar a variavel que guardou o head
    }

}
