package factorypattern.run;

import factorypattern.factory.ShapeFactory;
import factorypattern.interfaces.Shape;

/**
 * <p>
 * 获取实例
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 23:02
 * @Emil: 381889220@qq.com
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        /*创建工厂类*/
        ShapeFactory shapeFactory = new ShapeFactory();
        /*画圆*/
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        /*长方形*/
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        /*正方形*/
        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
