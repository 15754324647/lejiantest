package com.lejian.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class TestApplicationTests {


    /**
     * 递归获取最长对称字符串,若初始集合存在对称字符串则直接返回,否则截取子集递归
     *
     * @param list 目标字符串集合
     * @return Set<String>
     */
    private static Set<String> getStr(List<String> list) {
        Set<String> results = new HashSet<>();
        for (String s : list) {
            StringBuilder sb = new StringBuilder(s);
            if (sb.reverse().toString().equals(s)) {
                results.add(s);
            }
        }
        if (results.size() > 0) {
            return results;
        } else {
            List<String> sbList = new ArrayList<>();
            for (String s : list) {
                for (int j = 0; j < s.length(); j++) {
                    sbList.add(new StringBuilder(s).deleteCharAt(j).toString());
                }
            }
            return getStr(sbList);
        }
    }

    @Test
    void contextLoads() {
        //输出最长对称字符串：goog
        String input1 = "google";

        //输出3个最长对称字符串：aba/aca/ada
        String input2 = "abcda";

        //输出2个最长对称字符串：pop/upu，不会输出特殊字符的对称字符串p-p
        String input3 = "pop-upu";
        System.out.println(getStr(getReplaceStrList(input1)));
    }

    /**
     * 格式化字符串,去掉特殊字符,首尾空格
     *
     * @param str 目标字符串
     * @return List<String>
     */
    private List<String> getReplaceStrList(String str) {
        //特殊字符串正则
        String regEx = "([`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）[-]——+|{}【】‘；：”“’。，、？])";
        return Collections.singletonList(str.replaceAll(regEx, "").trim());
    }

}