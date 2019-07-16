import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListFileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 获取上传文件目录
        String uploadFilePath = this.getServletContext().getRealPath("/WEB-INF/upload");
        // 存储文件名
        Map<String, String> fileNameMap = new HashMap<String, String>();
        // 递归遍历filepath目录下的所有文件和目录，将文件的文件名存储到map集合中
        listFile(new File(uploadFilePath), fileNameMap);
        // 将Map集合发送到listfile.jsp页面进行显示
        request.setAttribute("fileNameMap", fileNameMap);
        request.getRequestDispatcher("/listFile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    //递归遍历所有文件
    public void listFile(File file, Map<String, String> map) {
        if(file == null) return;
        // 如果file是一个目录
        if (!file.isFile()) {
            // 列出该目录下的所有文件和目录
            File[] files = file.listFiles();
            if(files == null) return;
            // 遍历files[]数组
            for (File f : files) {
                // 递归
                listFile(f, map);
            }
        } else {
            String realName = file.getName().substring(file.getName().indexOf("_") + 1);
            // file.getName()得到的是文件的原始名称，realName是处理过后的名称
            map.put(file.getName(), realName);
        }
    }
}
