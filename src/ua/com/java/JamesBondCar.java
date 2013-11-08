package ua.com.java;

public class JamesBondCar extends Car{
    float distance;
    public float drive(float howLong){
        distance = distance +howLong *180;
        System.out.println("Ну вона і пече, я їду " +howLong +" годин");
        System.out.println("і проїхав " +distance +" кілометрів");
        return distance;
    }
    public static void main(String[] args) {
        JamesBondCar jamesBondCar = new JamesBondCar();
        jamesBondCar.drive(5.5f);
        jamesBondCar.drive(3);



    }


}
