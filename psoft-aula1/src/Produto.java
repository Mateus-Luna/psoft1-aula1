public class Produto {
    private String name;
    private String fabricante;
    private double price;

    public Produto(String name, String fabricante, double price) {

        this.name = name;
        this.fabricante = fabricante;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Nome: " + getName() +"; Fabricante: " + getFabricante() + "; Preço: " + getPrice();
    }
}
