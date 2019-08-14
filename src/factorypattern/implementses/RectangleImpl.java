package factorypattern.implementses;

import factorypattern.interfaces.Shape;

/**
 * <p>
 * 方块实现
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 22:47
 * @Emil: 381889220@qq.com
 */
public class RectangleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("画出Rectangle...");
    }
}
