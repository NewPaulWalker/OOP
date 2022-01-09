import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/* servlet implementation class NotesList */
public class NotesList extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /* HttpServlet */
    public NotesList(){
        super();
    }

    /* HttpServlet doGET */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String res =
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Notes List</title>\n" +
                "    <style>\n" +
                "        *{\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        body{\n" +
                "            font-size: 12px;\n" +
                "            color: black;\n" +
                "            font-family: 宋体;\n" +
                "            background: url(\"images/索引.webp\");\n" +
                "            background-size: cover;\n" +
                "        }\n" +
                "        .new{\n" +
                "            left: 100px;\n" +
                "            top: 100px;\n" +
                "            position: absolute;\n" +
                "        }\n" +
                "        .new:hover{\n" +
                "            background: darkorange;\n" +
                "            color: red;\n" +
                "        }\n" +
                "        .notes{\n" +
                "            height: 200px;\n" +
                "            background: url(\"images/便签纸2.jfif\");\n" +
                "            background-size: cover;\n" +
                "        }\n" +
                "        .notes:hover{\n" +
                "            background: darkorange;\n" +
                "            color: red;\n" +
                "        }\n" +
                "        #新建文本1{\n" +
                "            left: 400px;\n" +
                "            top: 100px;\n" +
                "            position: absolute;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <!-- 新建 -->\n" +
                "    <div class=\"new\">\n" +
                "        <form action=\"Create\" method=\"GET\">\n" +
                "            <input type=\"submit\" name=\"note\"\n" +
                "                   style=\"border-radius: 25px; background-color: unset; border: none;\n" +
                "                          width: 210px; height: 100px; color: black; font-size: 50px; font-family: 宋体\"\n" +
                "                   value=\"新建便签\">\n" +
                "        </form>\n" +
                "    </div>\n" +
                "    <!-- 已有便签 -->\n";

                String path = "D:\\StickyNotes\\notes";
                File list = new File(path);
                File[] files = list.listFiles();
                SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
                for(int i=0;i<files.length;i++){
                    res +=
                "    <div class=\"notes\" style=\"left: " + ((i+1)%3 * 500 + 30) + "px; top: " + ((i+1)/3 * 250 + 100) + "px; position: absolute\">\n";
                    res +=
                "        <form action=\"Show\" method=\"GET\">\n" +
                "            <br>\n" +
                "            <br>\n" +
                "            <input type=\"submit\"\n name=\"note\"" +
                "                   style=\"border-radius: 25px; background-color: unset; border: none;\n" +
                "                          width: 450px; height: 70px; color: black; font-size: 50px; font-family: 宋体\"\n";
                    res +=
                "                   value=\"" + files[i].getName() + "\">\n";
                    res +=
                "            <br>\n";
                    res +=
                "            <h2 style=\"text-indent: 30px\">";
                    long time = files[i].lastModified();
                    Date date = new Date(time);
                    res +=  formatter.format(date);
                    res +=
                "</h2>\n";
                    res +=
                "        </form>\n" +
                "    </div>";

                }

                res +=
                "</body>\n" +
                "</html>";
        out.println(res);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}


