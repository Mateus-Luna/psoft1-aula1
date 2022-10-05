import java.util.Date;

public class Lote {
    private int quantidade;
    private String dataValidade;

    public Produto produto;

    public Lote(Produto produto, int quantidade, String dataValidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString(){
        return "Quantidade: " + quantidade +"; Validade: " + dataValidade + "; Produto: " +  produto;
    }
}
