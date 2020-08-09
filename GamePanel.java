package com.hit.greedy_snake;

/**
 * 功能描述:
 *
 * @param:
 * @return:
 * @auther: ziyiguo
 * @discription:游戏彩色面板
 * @date: 2020-08-09 22:15
 */

import javax.swing.*;
import java.awt.*;
/**
 * @Auther: msb-zhaoss
 */
public class GamePanel extends JPanel {
//    //paintComponent:方法不需要我们自己去调用，系统线程会去调用，
//    //这个方法作用：所有画的动作都在这个方法中执行：
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        //给面板设置一个背景色：
//        this.setBackground(new Color(235, 194, 168));
//        //画头部图片：
//        Images.headerImg.paintIcon(this,g,10,10);
//        //画一个矩形：
//        //换一下画笔的颜色：
//        g.setColor(new Color(213, 238, 232));
//        g.fillRect(10,70,770,685);
//    }
    //小蛇的长度：
    int length;
    //定义一个数组，专门存储小蛇的头和身体对应的x轴坐标
    int[] snakeX = new int[500];//500小蛇长度
    //定义一个数组，专门存储小蛇的头和身体对应的y轴坐标
    int[] snakeY = new int[500];//500小蛇长度

    //定义一个变量来判断小蛇的方向：
    String direction = "R";//默认情况下小蛇是向右的

    public GamePanel() {
        init();
    }
    //初始化：蛇头与两个蛇身
    public void init(){
        length = 3;
        //初始化蛇头的信息：
        snakeX[0] = 200;
        snakeY[0] = 375;
        //第一节身子的信息：
        snakeX[1] = 175;
        snakeY[1] = 375;
        //第二节身子的信息：
        snakeX[2] = 150;
        snakeY[2] = 375;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //给面板设置一个背景色：
        this.setBackground(new Color(235, 194, 168));
        //画头部图片：
        Images.headerImg.paintIcon(this,g,10,10);
        //画一个矩形：
        //换一下画笔的颜色：
        g.setColor(new Color(213, 238, 232));
        g.fillRect(10,70,770,685);

        //根据小蛇的方向来画蛇头：
        switch (direction){
            case "L" : Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "R" : Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "U" : Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "D" : Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
        }

        //画蛇头：
        Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        /*//画第一节身子：
        Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        //画第二节身子：
        Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);*/
        //对蛇身子的画法进行优化，加入循环：
        for(int i=1; i<length; i++){
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }
    }
}
