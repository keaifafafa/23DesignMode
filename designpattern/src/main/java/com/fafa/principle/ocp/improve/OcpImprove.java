package com.fafa.principle.ocp.improve;

/**
 * 使用开放关闭原则
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-15 18:18
 */
public class OcpImprove {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor {
    /**
     * 画图
     *
     * @param shape
     */
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

/**
 * 形状接口
 */
interface Shape {
    /**
     * 绘画
     */
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}



