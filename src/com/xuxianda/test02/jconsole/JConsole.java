package com.xuxianda.test02.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xianda Xu on 2018/4/21.
 */
public class JConsole {

    private byte b[] = new byte[1024*1024];

    public static void main(String[] args) throws Exception{
        fill(1000);
    }

    private static void fill(Integer num) throws Exception{
        List<JConsole> jList = new ArrayList<>();
        for (int i = 0 ;i < num ;i++) {
            Thread.sleep(100);
            jList.add(new JConsole());
        }
    }

}
