public class Package {
    private double weight;
    private double length;
    private double width;
    private double height;
    private Address origin;
    private Address destination;


    // Precondition
    // Package needs to be weight < 0.1 || length <2 || weight < 2 || height < 2
    public Package(Address start,Address end,double weight, double length, double width,double height){
            this.length = length;
            this.width = width;
            this.height = height;
            this.weight = weight;
            origin = start;
            destination = end;


    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }
}
