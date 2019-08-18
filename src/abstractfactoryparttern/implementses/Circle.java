package abstractfactoryparttern.implementses;

import abstractfactoryparttern.interfaces.Shape;

/**
 * <p>
 * 圆形
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:37
 * @Emil: 381889220@qq.com
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画出Circle...");
    }
}
