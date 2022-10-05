package Services;
import Repositories.loteRepository;
import Repositories.productRepository;
import lote.Lote;

public class loteService {
    loteRepository loteRepo = new loteRepository(lote);
    productRepository produto = new productRepository(produto)
    public void saveProduct(Lote lote){
        Lote l= new Lote(produto, 400, "20/08/2025");
        loteRepo.saveLote(l);

    }
    public String toString(){
        return prodRepo.listProd();

    }
}
