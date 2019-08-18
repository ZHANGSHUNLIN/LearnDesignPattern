package factorypattern.implementses;

import factorypattern.interfaces.Shape;

/**
 * <p>
 * 正方形
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-14 22:52
 * @Emil: 381889220@qq.com
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画出Square...");
    }
}
