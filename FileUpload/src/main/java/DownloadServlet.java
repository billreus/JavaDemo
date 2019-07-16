import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {
    //用于判断序列化文件是否已经失效（过期）
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 得到要下载的文件名
        String fileName = request.getParameter("filename");
        fileName = new String(fileName.getBytes("iso8859-1"), "UTF-8");
        // 上传的文件在target/FileUpload/WEB-INF/upload目录下的子目录当中
        String fileSaveRootPath = this.getServletContext().getRealPath("/WEB-INF/upload");
        // 得到要下载的文件
        File file = new File(fileSaveRootPath + "\\" + fileName);
        // 如果文件不存在
        if (!file.exists()) {
            request.setAttribute("message", "您要下载的资源已被删除！！");
            request.getRequestDispatcher("/message.jsp").forward(request, response);
            return;
        }
        // 处理文件名
        String realname = fileName.substring(fileName.indexOf("_") + 1);
        // 设置响应头
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
        // 读取要下载的文件，保存到文件输入流
        FileInputStream in = new FileInputStream(fileSaveRootPath + "\\" + fileName);
        // 创建输出流
        OutputStream out = response.getOutputStream();
        // 创建缓冲区
        byte buffer[] = new byte[1024];
        int len = 0;
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
        // 关闭文件输入流
        in.close();
        // 关闭输出流
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
