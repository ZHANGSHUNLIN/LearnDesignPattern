package abstractfactoryparttern.implementses;

import abstractfactoryparttern.interfaces.Color;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:44
 * @Emil: 381889220@qq.com
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("填充蓝色...");
    }
}
