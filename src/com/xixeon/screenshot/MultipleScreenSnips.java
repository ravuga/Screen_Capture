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

    public void robo(String filename) throws Exception {
        Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(screenShot, "png", new File(filename +formatter.format(now.getTime())+".png"));
        System.out.println(formatter.format(now.getTime()));
    }

    public static void capture(String filename) throws Exception {
        MultipleScreenSnips s = new MultipleScreenSnips();
        while(true)
        {
            s.robo(filename);
            Thread.sleep((long) 0.5);
        }
    }

}
