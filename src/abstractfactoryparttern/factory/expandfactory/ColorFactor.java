package abstractfactoryparttern.factory.expandfactory;

import abstractfactoryparttern.factory.AbstractFactory;
import abstractfactoryparttern.implementses.Blue;
import abstractfactoryparttern.implementses.Green;
import abstractfactoryparttern.implementses.Red;
import abstractfactoryparttern.interfaces.Color;
import abstractfactoryparttern.interfaces.Shape;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:59
 * @Emil: 381889220@qq.com
 */
public class ColorFactor extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(color)) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
