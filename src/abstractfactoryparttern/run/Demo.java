package abstractfactoryparttern.run;

import abstractfactoryparttern.factory.AbstractFactory;
import abstractfactoryparttern.factory.producer.FactoryProducer;
import abstractfactoryparttern.interfaces.Shape;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 01:05
 * @Emil: 381889220@qq.com
 */
public class Demo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");
        Shape square =  abstractFactory.getShape("SQUARE");

        square.draw();
    }

}
