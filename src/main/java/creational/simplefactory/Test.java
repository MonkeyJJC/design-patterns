package creational.simplefactory;

/**
 * @description:
 * @author: youye
 * @createTime: 2019-10-11
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Car car = Driver.getCar("Audi");
        car.drive();
    }
}