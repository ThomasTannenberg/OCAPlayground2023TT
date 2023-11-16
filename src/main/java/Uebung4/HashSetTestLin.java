package Uebung4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetTestLin {
    public static void main(String[] args) {
        // 创建一个Set来存储唯一的随机数。
        Set<Integer> 唯一随机数集合 = new HashSet<>();

        // 定义需要生成的唯一数字的数量。
        int 唯一数字数量 = 1000;

        // 使用循环来生成随机数。
        while (唯一随机数集合.size() < 唯一数字数量) {
            // 生成一个介于1和10000之间的随机数。
            int 随机数 = (int) (Math.random() * 10000) + 1;

            // 将随机数添加到Set中。
            唯一随机数集合.add(随机数);
        }

        // 将Set转换为ArrayList。
        ArrayList<Integer> 排序后的列表 = new ArrayList<>(唯一随机数集合);

        // 对ArrayList进行排序。
        Collections.sort(排序后的列表);

        // 按顺序输出所有唯一的随机数。
        for (int 数字 : 排序后的列表) {
            System.out.println(数字);
        }
    }
}
