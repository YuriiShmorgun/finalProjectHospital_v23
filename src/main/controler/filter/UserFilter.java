package controler.filter;


import model.user.Role;
import model.user.User;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.LogRecord;

import static java.util.Objects.nonNull;

public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)

            throws IOException, ServletException {

        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;

        final String login = request.getParameter("login");
        final String password = request.getParameter("password");

        final HttpSession session = request.getSession();


        if (nonNull(session) &&
            nonNull(session.getAttribute("login")) &&
            nonNull(session.getAttribute("password"))){

            final Role userRole = (Role) session.getAttribute("Role");
            moveToMenu(request, response, userRole);

        } //else if ()



    }


    private void moveToMenu(HttpServletRequest request, HttpServletResponse response, Role role)
    throws ServletException, IOException{

        if (role.equals(Role.ADMINISTRATOR)){
            request.getRequestDispatcher("view/admin.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
