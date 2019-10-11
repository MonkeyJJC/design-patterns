package creational.simplefactory;

import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @description: 具体产品角色
 * @author: youye
 * @createTime: 2019-10-11
 */
@Builder
@NoArgsConstructor
public class Audi extends Car {

    @Override
    public void drive(){
        System.out.println("Audi start engine");
    }
}