package Model;

public class Smartphone extends Product {
    private boolean has5G;
    Smartphone() {
    }
    public Smartphone( String name, String description, double price,boolean has5G) {
        super( name, description, price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public String getInfor(){
        return "\n____Smartphone____\n" +
                super.getInfor() +
                "Has 5G :" + (this.has5G ? " Có " : " Không ") + "\n";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString() +
                "has5G= " + has5G +
                '}';
    }
}
