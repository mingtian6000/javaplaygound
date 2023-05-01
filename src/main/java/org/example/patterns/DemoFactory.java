package org.example.patterns;

interface Car{
    void drive();
}

class Sedan implements Car{
    public void drive(){
        System.out.println("driver a Sedan");
    }
}
class SUV implements Car{
    public void drive(){
        System.out.println("driving a SUV");
    }
}

class CarFactory{
    public static Car createCar(String type){
        if(type.equalsIgnoreCase("sedan")){
            return new Sedan();
        }else if(type.equalsIgnoreCase("suv")){
            return new SUV();
        }else{
            throw new IllegalArgumentException("Invalid car type:"+type);

        }
    }
}
public class DemoFactory {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("sedan");
        Car car2 = CarFactory.createCar("SUV");
        car1.drive();
        car2.drive();
    }
}
