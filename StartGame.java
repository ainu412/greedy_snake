package com.hit.greedy_snake;

import javax.swing.*;
import java.awt.*;

/**
 * 功能描述:
 *
 * @param:
 * @return:
 * @auther: ziyiguo
 * @discription:游戏开始界面
 * @date: 2020-08-09 22:15
 */
public class StartGame {
    final static int WIDTH = 800;
    final static int HEIGHT = 800;
//    public static void main(String[] args) {
//        //1.创建一个窗体：
//        JFrame jf = new JFrame();
//        jf.setTitle("0516训练营-贪吃蛇小游戏");
//        /*
//        setBounds方法有四个参数：
//        第一个参数，第二个参数：分别为距离屏幕左上角的x,y轴的距离
//        第三个参数，第四个参数：分别为窗体的宽高
//         */
//        jf.setBounds(10,20,800,800);
//        //设置窗口大小不可变：
//        jf.setResizable(false);
//        //点击窗口的右上角的×的时候，窗口关闭的同时要让游戏停止：
//        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        //窗体是有了，但是必须得设置让它显现出来
//        //注意：这句话尽量放在最后一行
//        jf.setVisible(true);
//    }
    public static void main(String[] args) {
        //创建窗口：
        JFrame jf = new JFrame();
        jf.setTitle("贪吃蛇小游戏");
        int x = Toolkit.getDefaultToolkit().getScreenSize().width;//获取屏幕宽度:
        int y = Toolkit.getDefaultToolkit().getScreenSize().height;//获取屏幕高度:
        jf.setBounds((x-WIDTH)/2,(y-HEIGHT)/2,WIDTH,HEIGHT);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建一个面板：
        GamePanel gp = new GamePanel();
        //面板添加在窗口：
        jf.add(gp);
        //展现
        jf.setVisible(true);
    }
}
