package servlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.JavaWebLearn_liststudent;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/liststudent")
public class JavaWebLearn_liststudentSerlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Danh Sách Sinh Viên</title></head><body>");
        out.println("<h1>Danh Sách Sinh Viên</h1>");

        List<JavaWebLearn_liststudent> liststudent = createDummySinhVienList();
        out.println("<table>");
        out.println("<tr><th>Mã Sinh Viên</th><th>Tên</th><th>Năm Sinh</th><th>Điện Thoại</th></tr>");

        for (JavaWebLearn_liststudent  studen : liststudent) {
            out.println("<tr>");
            out.println("<td>" + studen.getMaSinhVien() + "</td>");
            out.println("<td>" + studen.getTen() + "</td>");
            out.println("<td>" + studen.getNamSinh() + "</td>");
            out.println("<td>" + studen.getDienThoai() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }

    private List<JavaWebLearn_liststudent> createDummySinhVienList() {
        List<JavaWebLearn_liststudent> liststudent = new ArrayList<>();

        liststudent.add(new JavaWebLearn_liststudent(1,"SV001", "Nguyen Van A", 1995, "1234567890"));
        liststudent.add(new JavaWebLearn_liststudent(2,"SV002", "Tran Thi B", 1998, "9876543210"));
        // Thêm các sinh viên khác vào danh sách

        return liststudent;
    }

}
