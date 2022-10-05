package Repositories;
import java.util.HashSet;
import lote.Lote;

public class loteRepository {
    HashSet<Lote> loteshashSet;

    public loteRepository(HashSet<Produto> loteshashSet) {
        this.loteshashSet = loteshashSet;
    }

    public void saveLote(Lote Lote){
        loteshashSet.add(lote);
    }


    public String listLotes(){
        return "Lotes: [" + loteshashSet +"]";
    }
}
