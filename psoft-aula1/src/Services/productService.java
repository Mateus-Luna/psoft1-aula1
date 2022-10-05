package Services;

import Repositories.productRepository;
import produto.Produto;

public class productService {
    productRepository prodRepo = new productRepository();
    public void saveProduct(Produto produto){
        Produto p = new Produto("leite", "Parmalat", 80.00);
        prodRepo.saveProduct(p);

    }
    void
    @Override
    public String toString(){
        return prodRepo.listProd();

    }

}
