package com.hp.Test;
//测试String 类的性能  总结:频繁修改字符串，会造成性能的损失，需要StringBuilder/Buffer
/*StringBuilder(线程不安全，速度很快），StringBuffer(线程安全，速度稍微慢）解决字符串频繁修改的问题
 * 意思是String升级了
 *  String 类 重点  重用性
 *  StringBuffer / Builder 倾向于 对字符串的修改
 *  当用到字符大量的  追加/修改/删除的时候，就用StringBuffer ,StringBuilder
 */
public class StringClazz1 {
    public static void main(String[] args) {
      //  System.out.println(System.currentTimeMillis());
        long str=System.currentTimeMillis();
        String a="a";
        for (int i = 0; i <10 ; i++) {
            a+=a;
            System.out.println("str = " + a);

        }
        System.out.println(System.currentTimeMillis()-str);
    }
}
