package creational.simplefactory;

/**
 * @description: Factory工厂类，实现创建具体产品角色逻辑
 * @author: youye
 * @createTime: 2019-10-11
 */
public class Driver {

    private static final String BWM = "Bwm";
    private static final String AUDI = "Audi";

    public static Car getCar(String type) throws Exception {
        if (BWM.equals(type)) {
            return Bwm.builder().build();
        } else if (AUDI.equals(type)) {
            return Audi.builder().build();
        } else {
            throw new Exception("非法类型");
        }
    }
}