package abstractfactoryparttern.implementses;

import abstractfactoryparttern.interfaces.Color;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:42
 * @Emil: 381889220@qq.com
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("填充红色...");
    }
}
