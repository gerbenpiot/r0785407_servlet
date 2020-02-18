package view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>r078407_servlet-index</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href='index.html' id='home'>Ga naar de home-pagina</a>");
        out.println("<p id='Dynamisch' >"+ LocalTime.now()+" <p>" );
        out.println("</body>");
        out.println("</html>");
    }
}
