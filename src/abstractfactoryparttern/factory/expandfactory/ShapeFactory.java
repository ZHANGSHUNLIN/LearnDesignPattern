package abstractfactoryparttern.factory.expandfactory;

import abstractfactoryparttern.factory.AbstractFactory;
import abstractfactoryparttern.implementses.Circle;
import abstractfactoryparttern.implementses.Rectangle;
import abstractfactoryparttern.implementses.Square;
import abstractfactoryparttern.interfaces.Color;
import abstractfactoryparttern.interfaces.Shape;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:51
 * @Emil: 381889220@qq.com
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }

        if ("CIRCLE".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }

        return null;
    }
}
