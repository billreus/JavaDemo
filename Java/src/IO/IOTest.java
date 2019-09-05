package IO;

import java.io.*;

/**
 * @Author liu
 * @Date 2019/9/5 17:04
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        test09();
    }
    ///控制台输入///
    public static void test01() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符，按 q 键结束");
        char c;
        do {
            c = (char) bufferedReader.read();
            System.out.println("你输入的字符为"+c);
        } while (c != 'q');
    }
    public static void test02() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一行字符");
        String str = bufferedReader.readLine();
        System.out.println("你输入的字符为" + str);
    }
    /**
     * 二进制文件输入读取
     */
    public static void test04() throws IOException {
        byte[] bytes = {12,21,34,11,21};
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/io/test.txt");
        // 写入二进制文件，直接打开会出现乱码
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
    public static void test05() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/io/test.txt");
        int c;
        // 读取写入的二进制文件，输出字节数组
        while ((c = fileInputStream.read()) != -1) {
            System.out.print(c);
        }
    }
    /**
     * 文本写入和读取
     */
    public static void test06() throws IOException {
        //最加模式
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/src/IO/test.txt");
        fileWriter.write("Hello，world！\n欢迎来到 java 世界\n");
        fileWriter.write("不会覆盖文件原本的内容\n");
        fileWriter.append("并不是追加一行内容，不要被方法名迷惑\n");
        fileWriter.append(null);
        fileWriter.flush();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
        fileWriter.close();
    }
    public static void test07() throws IOException {
        // 关闭追加模式，变为覆盖模式
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/src/IO/test.txt", false);
        fileWriter.write("Hello，world！欢迎来到 java 世界\n");
        fileWriter.write("我来覆盖文件原本的内容");
        fileWriter.append("我是下一行");
        fileWriter.flush();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
        fileWriter.close();
    }

    /**
     * 文件读取
     */
    public static void test08() throws IOException {
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/src/IO/test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        fileReader.close();
        bufferedReader.close();
    }
    public static void test09() throws IOException {
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/src/IO/test.txt");
        int c;
        while ((c = fileReader.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
