package ma.itab.reddit.web;

import ma.itab.reddit.core.Post;
import ma.itab.reddit.core.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class RedditServlet extends HttpServlet {

    public static final String SAMPLE_TEXT = "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor\n" +
            "                    mauris\n" +
            "                    condimentum nibh, ut fermentum massa justo sit amet risus.";
    private HomePageModel model;

    @Override
    public void init() throws ServletException {
        model = new HomePageModel();
        User mehdi = new User("M@hdi");
        User anas = new User("Ana$");

        Post post1 = new Post(SAMPLE_TEXT, mehdi);
        Post post2 = new Post(SAMPLE_TEXT, mehdi);
        Post post3 = new Post(SAMPLE_TEXT, anas);
        model.setPosts(Arrays.asList(post1, post2, post3));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("model", model);
        System.out.println(model);
        req.getRequestDispatcher("homePage.jsp").forward(req, resp);
    }
}
