package com.xixeon.screenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.text.SimpleDateFormat;
import java.util.*;

public class MultipleScreenSnips {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");

    public void robo() throws Exception {
        Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(screenShot, "png", new File("D://"+formatter.format(now.getTime())+".png"));
        System.out.println(formatter.format(now.getTime()));
    }

    public static void capture() throws Exception {
        MultipleScreenSnips s = new MultipleScreenSnips();
        while(true)
        {
            s.robo();
            Thread.sleep((long) 0.5);
        }
    }

}
