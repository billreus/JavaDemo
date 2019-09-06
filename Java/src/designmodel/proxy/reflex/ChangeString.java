package designmodel.proxy.reflex;

import java.lang.reflect.Field;

/**
 * @Author liu
 * @Date 2019/9/6 19:36
 */
public class ChangeString {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        String s = "abcd";
        //修改前
        System.out.println("s = " + s);
        //获取String类中的value字段
        Field valueField = String.class.getDeclaredField("value");
        //改变value属性的访问权限
        valueField.setAccessible(true);
        //获取s对象上的value属性的值
        char[] value = (char[]) valueField.get(s);
        //改变value所引用的数组中的第5个字符
        value[3] = 'e';
        //修改后
        System.out.println("s = " + s);
        //改变整个字符串
        valueField.set(s, new char[]{'1', '2', '3'});
        //特别注意这里，因为改变了value的值，字符串长度已经改变了，需要同时改变count的值，不然使用s时会报数组越界
        Field countField = String.class.getDeclaredField("count");
        countField.setAccessible(true);
        countField.set(s, 3);
        //123
        System.out.println("s = " + s);
    }
}
