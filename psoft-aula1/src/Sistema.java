import java.util.HashSet;
import Repositories.*;
public class Sistema {

    Produto p;
    public static void main(String args[]) {
       Produto p = new Produto("leite", "Parmalat", 80.00);
       Lote l = new Lote(p, 400, "20/08/2025");

       productRepository prodRepo = new productRepository();
       prodRepo.saveProduct(p);


   }
    /

}
