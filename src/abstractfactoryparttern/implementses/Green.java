package abstractfactoryparttern.implementses;

import abstractfactoryparttern.interfaces.Color;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:43
 * @Emil: 381889220@qq.com
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色...");
    }
}
