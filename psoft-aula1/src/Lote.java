import java.util.Date;

public class Lote {
    private int quantidade;
    private Date dataValidade;
    public Produto produto;

    public Lote(Produto produto) {
        this.produto = produto;
    }
}
