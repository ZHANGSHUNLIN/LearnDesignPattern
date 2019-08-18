package abstractfactoryparttern.factory.producer;

import abstractfactoryparttern.factory.expandfactory.ColorFactor;
import abstractfactoryparttern.factory.AbstractFactory;
import abstractfactoryparttern.factory.expandfactory.ShapeFactory;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 01:01
 * @Emil: 381889220@qq.com
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if (choice == null) {
            return null;
        }

        if ("SHAPE".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactor();
        }

        return null;
    }
}
