public class PostageCalc {


    public static double calculatePostage(int zip1,int zip2,Package p1){
        int z1 = zip1;
        int z2 = zip2;
        double weight = p1.getWeight();
        double length = p1.getLength();
        double width = p1.getWidth();
        double height = p1.getHeight();
        double size = length+width+height;

        double cost = 3.75;
        if (size > 36){cost += (int)(size-36) * 0.10;}
        if (weight > 40){cost += ((int)((weight-40)*0.10))*.10;}
        // DO ZIP

        return cost;


    }


    public static double calculatePostage(Address zip1,Address zip2,Package p1){
        int z1 = zip1.getzipCode;
        int z2 = zip2.getzipCode;
        double weight = p1.getWeight();
        double length = p1.getLength();
        double width = p1.getWidth();
        double height = p1.getHeight();

    }
    public static double calculatePostage(Package p1){
        double weight = p1.getWeight();
        double length = p1.getLength();
        double width = p1.getWidth();
        double height = p1.getHeight();
    }





    }


