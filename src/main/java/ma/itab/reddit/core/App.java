package ma.itab.reddit.core;

import java.util.List;

public class App {

    public static void main(String[] args) {
        User mehdi = new User("M@hdi");
        User anas = new User("Ana$");

        Post post1 = new Post("post1", mehdi);
        Post post2 = new Post("post2", mehdi);
        Post post3 = new Post("post2", anas);
        Reddit reddit = new DefaultReddit();
        reddit.addPost(post1);
        reddit.addPost(post2);
        reddit.addPost(post3);

        reddit.likePost(post1);
        reddit.likePost(post1);

        reddit.likePost(post2);
        reddit.dislikePost(post2);
        reddit.dislikePost(post2);

        List<Post> allPosts = reddit.getAllPosts();
        for (Post post : allPosts) {
            System.out.println(post);
        }
    }
}
