package com.stylefeng.guns.lsq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by liushangqing on 2017/8/28.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        for (String temp : list) {
//            if ("2".equals(temp)) {
//                list.remove(temp);
//            }
//        }
        Iterator<String> iterable = list.iterator();
        while (iterable.hasNext()) {
            String temp = iterable.next();
            if (Objects.equals("2", temp)) {
                iterable.remove();
            }
        }

        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
