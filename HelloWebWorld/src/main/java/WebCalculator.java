import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/webCalculator")
public class WebCalculator extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("com.seavus.hellowebworld.WebCalculator.doGet");
       // printMessage(req, resp);

        makeOperation(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("com.seavus.hellowebworld.WebCalculator.doPost");
        //printMessage(req, resp);
        makeOperation(req,resp);
    }

    private void printMessage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");

        resp.setContentType("text/html");
        resp.getWriter().println("Hello " + name);
    }

    private void makeOperation(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        Integer integer1 = Integer.parseInt(req.getParameter("integer1"));
        String operation = req.getParameter("operation");
        Integer integer2 = Integer.parseInt(req.getParameter("integer2"));
        Integer evaluator;

        if (operation.equals("+")){
            evaluator = new Integer(integer1 + integer2);
        }
        else if (operation.equals("-")){
            evaluator = integer1 - integer2;
        }
        else {
            evaluator = new Integer(-231);
        }

        resp.setContentType("text/html");
        resp.getWriter().println("Rezultat = "+ evaluator.toString());



    }




}
