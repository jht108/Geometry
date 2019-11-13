package com.geometry.study.swing;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SwingDemo {

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Hello Swing");
        JLabel label = new JLabel("A label");
        jFrame.add(label);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,300);
        jFrame.setVisible(true);

        int minute = 1;
        int seconds = 12;
        timerCount(label,24,60);
        label.setText("休息5分钟吧！");
        timerCount(label,4,60);
        label.setText("休息结束！");

    }

    public static void timerCount(JLabel label,int minute,int seconds){
        while(minute >= 0 && --seconds >= 0){
            try {
//                TimeUnit.MILLISECONDS.sleep(1000);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(seconds == 0){
                minute--;
                seconds = 59;
            }
            if(seconds < 10){
                label.setText(minute + ":0" + seconds);
            }else{
                label.setText(minute + ":" + seconds);
            }
        }
    }
}
