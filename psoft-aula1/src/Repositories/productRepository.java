package Repositories;
import java.util.HashSet;
import produto.Produto;

public class productRepository {
    HashSet<Produto> produtohashSet;
    Produto produto;

    public productRepository(HashSet<Produto> produtohashSet) {
        this.produtohashSet = produtohashSet;
    }

    public void saveProduct(Produto produto){
        produtohashSet.add(produto);
    }


    public String listProd(){
        return "Produtos: [" + produtohashSet +"]";
    }
}
