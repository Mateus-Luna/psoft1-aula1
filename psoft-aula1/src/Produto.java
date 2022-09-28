public class Produto {
    private String name;
    private String fabricante;
    private double price;

    public Produto(String name) {
        this.name = name;
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
}
