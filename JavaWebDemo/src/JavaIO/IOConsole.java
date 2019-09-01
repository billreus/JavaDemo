package JavaIO;

import java.io.*;

public class IOConsole {
    public static void main(String[] args) throws IOException{
        //01单个字符流测试;02单个字符流，在字符是q才会退出;03一行字符
        //test03();

        //04写入二进制文件;05输出二进制文件
        //test05();

        //06写入文本文件;07读取文本文件;0809字节流和字符流的转换类指定编码
        test09();
    }

    public static void test01() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符");
        char c;
        c = (char) bufferedReader.read();
        System.out.println("你输入的字符为"+c);
    }

    public static void test02() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符，按q结束");
        char c;
        do{
            c = (char) bufferedReader.read();
            System.out.println("你输入的字符为"+c);
        } while (c != 'q');
    }

    public static void test03() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一行字符");
        String str = bufferedReader.readLine();
        System.out.println("你输入的字符为" + str);
    }

    public static void test04() throws IOException{
        byte[] bytes = {12, 21, 34, 11, 21};
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/src/JavaIO/io/test.txt");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    public static void test05() throws IOException{
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/src/JavaIO/io/test.txt");
        int c;
        while ((c = fileInputStream.read()) != -1){
            System.out.print(c);
        }
    }

    public static void test06() throws IOException{
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/src/JavaIO/io/test1.txt");
        fileWriter.write("Hello, world! \n 欢迎");
        fileWriter.write("不会覆盖原本内容\n");
        //fileWriter.write(null); 不能直接写入null
        fileWriter.append("相对于write，append可以写入null\n");
        fileWriter.append(null);
        fileWriter.flush();//数据流存入文本
        System.out.println("文件默认编码" + fileWriter.getEncoding());
        fileWriter.close();
    }

    public static void test07() throws IOException{
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/src/JavaIO/io/test1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        fileReader.close();
        bufferedReader.close();
    }

    public static void test08() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/src/JavaIO/io/test2.txt");
        // 使用 GBK 编码文件
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        outputStreamWriter.write("Hello，world！\n欢迎来到 java 世界\n");
        outputStreamWriter.append("另外一行内容");
        outputStreamWriter.flush();
        System.out.println("文件的编码为" + outputStreamWriter.getEncoding());
        outputStreamWriter.close();
        fileOutputStream.close();
    }

    public static void test09() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/src/JavaIO/io/test2.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK"); // 使用 GBK 解码文件
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();
        inputStreamReader.close();
    }
}
