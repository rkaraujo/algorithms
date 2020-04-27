package software.renato.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MochilaSolution {

    public void itensMaisValiosos() {
        // resposta: agua, comida, camera

        List<MochilaItem> allItens = Arrays.asList(
                new MochilaItem("Agua", 3, 10),
                new MochilaItem("Livro", 1, 3),
                new MochilaItem("Comida", 2, 9),
                new MochilaItem("Casaco", 2, 5),
                new MochilaItem("Camera", 1, 6)
        );

        int capacity = 6;
        Mochila[] mochilas = new Mochila[capacity];
        Mochila[] calculatingMochilas = new Mochila[capacity];

        for (MochilaItem item : allItens) {
            for (int i = 0; i < mochilas.length; i++) {
                int capacidadeMochila = i + 1;
                if (item.peso <= capacidadeMochila) {
                    Mochila mochila = mochilas[i];

                    if (mochila == null) {
                        calculatingMochilas[i] = new Mochila(item);
                        continue;
                    }

                    int valorAtual = mochila.valor;

                    int indexMochilaCapacidadeOciosa = capacidadeMochila - item.peso - 1;
                    Mochila mochilaCapacidadeOciosa = indexMochilaCapacidadeOciosa >= 0 ? mochilas[indexMochilaCapacidadeOciosa] : null;
                    int novoValor = item.valor;
                    if (mochilaCapacidadeOciosa != null) {
                        novoValor += mochilaCapacidadeOciosa.valor;
                    }

                    if (novoValor > valorAtual) {
                        if (mochilaCapacidadeOciosa == null) {
                            calculatingMochilas[i] = new Mochila(new Mochila(item));
                        } else {
                            calculatingMochilas[i] = new Mochila(new Mochila(item), mochilaCapacidadeOciosa);
                        }
                    }
                }
            }
            System.arraycopy(calculatingMochilas, 0, mochilas, 0, capacity);
        }

        Mochila resultado = calculatingMochilas[capacity - 1];
        System.out.println("Peso: " + resultado.peso);
        System.out.println("Valor: " + resultado.valor);
        System.out.println("Items:");
        for (MochilaItem item : resultado.itens) {
            System.out.println(item.nome);
        }
    }

    private class Mochila {
        public int peso;
        public int valor;
        public List<MochilaItem> itens = new ArrayList<>();

        public Mochila(MochilaItem item) {
            this.peso = item.peso;
            this.valor = item.valor;
            this.itens.add(item);
        }

        public Mochila(Mochila... mochilas) {
            for (int i = 0; i < mochilas.length; i++) {
                this.peso += mochilas[i].peso;
                this.valor += mochilas[i].valor;
                this.itens.addAll(mochilas[i].itens);
            }
        }
    }

    private class MochilaItem {
        public String nome;
        public int peso;
        public int valor;

        public MochilaItem(String nome, int peso, int valor) {
            this.nome = nome;
            this.peso = peso;
            this.valor = valor;
        }
    }

}
