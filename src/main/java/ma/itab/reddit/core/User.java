package ma.itab.reddit.core;

import java.util.List;

public class User {
    private String username;
    private List<Post> posts;

    public User(String username) {
        this.username = username;
    }

    public List<Post> addPost(Post post) {
        posts.add(post);
        return posts;
    }

    public String getUsername() {
        return username;
    }
}
