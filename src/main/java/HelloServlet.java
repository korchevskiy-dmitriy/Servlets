import jakarta.servlet.http.*;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("alo");

    }



}