package factorypattern.factory;

import factorypattern.implementses.Circle;
import factorypattern.implementses.Rectangle;
import factorypattern.implementses.Square;
import factorypattern.interfaces.Shape;

/**
 * <p>
 * 模型工厂
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 22:55
 * @Emil: 381889220@qq.com
 */
public class ShapeFactory {
    private final static String CIRCLE = "CIRCLE";
    private final static String RECTANGLE = "RECTANGLE";
    private final static String SQUARE = "SQUARE";

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (CIRCLE.equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (RECTANGLE.equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if (SQUARE.equalsIgnoreCase(shapeType)) {
            return new Square();
        }

        return null;
    }

}
