package com.project;

import javax.swing.*;

public class Player {
    public static int x;
    public static int y;
    public Object current;
    ImageIcon imageClass;
    JLabel img;

    public void Player(){
        this.x = 0;
        this.y = 0;
        this.current =  Lista.elements.getHead();
    }
    public void set(){
        imageClass = new ImageIcon("src"+Main.divider+"Images_Datos"+Main.divider+"icon_exit.png");
//        ImageIcon img2 = new ImageIcon(imageClass.getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        img = new JLabel(imageClass);
        img.setSize(this.x,this.y);
        img.setLocation(x,y);
        Main.example.pane.add(img);


    }
}
