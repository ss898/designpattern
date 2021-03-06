package com.lgh.designpattern.factorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public interface AbstractFactory {

    abstract Shape getShape(Class<? extends Shape> shape);
     abstract  Color getColor(Class<? extends Color> color);
}
