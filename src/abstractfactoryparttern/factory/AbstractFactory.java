package abstractfactoryparttern.factory;

import abstractfactoryparttern.interfaces.Color;
import abstractfactoryparttern.interfaces.Shape;

/**
 * <p>
 *
 * </p>
 *
 * @Author: Shun
 * @CreateTime: 2019-08-19 00:46
 * @Emil: 381889220@qq.com
 */
public abstract class AbstractFactory {
    /** 获取图形的颜色
     * @param color 种类
     * @return 填充颜色
     */
    public abstract Color getColor(String color);

    /** 生成图形的外观
     * @param shape 种类
     * @return 图形外观
     */
    public abstract Shape getShape(String shape);

}
