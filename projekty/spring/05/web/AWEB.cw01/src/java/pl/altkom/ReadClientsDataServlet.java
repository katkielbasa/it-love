package pl.altkom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(name = "readClientsData", urlPatterns = "/readClientsData")
public class ReadClientsDataServlet extends HttpServlet {

    @Resource(lookup = "jdbc/jweb")
    private DataSource ds;
    List<Client> clients = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientDataDAO dao = new ClientDataDAOImpl();
        try {
            clients = dao.readClientsData(ds);
        } catch (Exception ex) {
            Logger.getLogger(ReadClientsDataServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lista klientów</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"lightblue\"><center>");
        out.println("<table align='center' border='1'>");
        for (Client c : clients) {
            out.println("<tr>");
            out.println("<td>" + c.getName() + "</td>");
            out.println("<td>" + c.getSurname()+ "</td>");
            out.println("<td>"+c.getAge()+"</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("<a href=\"controller\">Powrót</a>");
        out.println("</center></body>");
        out.println("</html>");
    }

}
