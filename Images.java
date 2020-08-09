package com.hit.greedy_snake;

import javax.swing.*;
import java.net.URL;
/**
 * 功能描述:
 *
 * @param:
 * @return:
 * @auther: ziyiguo
 * @discription:
 * @date: 2020-08-09 22:17
 */

public class Images {
    // Class.getResource(String path)
    // path不以'/'开头时，默认是从此类所在的包下取资源；
    // path以'/'开头时，则是从项目的ClassPath根下获取资源。在这里'/'表示ClassPath的根目录。
    // 来自：https://www.cnblogs.com/haitaofeiyang/p/7737360.html
    public static URL headrURL = Images.class.getResource("images/header.png");// 从此类所在包下取资源
    public static ImageIcon headerImg = new ImageIcon(headrURL);
    public static URL bodyURL = Images.class.getResource("images/body.png");
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    public static URL downURL = Images.class.getResource("images/down.png");
    public static ImageIcon downImg = new ImageIcon(downURL);
    public static URL foodURL = Images.class.getResource("images/food.png");
    public static ImageIcon foodImg = new ImageIcon(foodURL);
    public static URL leftURL = Images.class.getResource("images/left.png");
    public static ImageIcon leftImg = new ImageIcon(leftURL);
    public static URL rightURL = Images.class.getResource("images/right.png");
    public static ImageIcon rightImg = new ImageIcon(rightURL);
    public static URL upURL = Images.class.getResource("images/up.png");
    public static ImageIcon upImg = new ImageIcon(upURL);
}
