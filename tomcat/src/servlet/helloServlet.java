package servlet;

import java.io.IOException;
        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletContext;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class helloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getContextPath() + "/index.jsp";
        response.sendRedirect(path);
    }
}