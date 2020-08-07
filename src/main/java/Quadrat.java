public class Quadrat {

    private double side;

    public Quadrat(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.getSide() * this.getSide();
    }
}
