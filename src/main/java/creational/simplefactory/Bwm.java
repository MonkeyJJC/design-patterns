package creational.simplefactory;

import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: youye
 * @createTime: 2019-10-11
 */
@Builder
@NoArgsConstructor
public class Bwm extends Car {

    @Override
    public void drive(){
        System.out.println("Bwm start engine");
    }
}