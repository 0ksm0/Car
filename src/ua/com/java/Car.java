package ua.com.java;

public class Car {
    public void start(){
        System.out.println("Давай газу бо глохнем");
    }
    public void stop(){
        System.out.println("Пррррррр мала");
    }
    float distance;
    public float drive(float howLong){
        distance = distance +howLong*80;
        System.out.println("Я їду уже "+howLong +" годин");
        System.out.println("Ні хе... собі як далеко заїхав " +distance +" кілометрів");
        return distance;
    }
}
