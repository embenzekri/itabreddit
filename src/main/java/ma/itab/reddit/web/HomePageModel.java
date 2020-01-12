package ma.itab.reddit.web;

import ma.itab.reddit.core.Post;

import java.util.List;

public class HomePageModel {
    private String username;
    private List<Post> posts;

    public HomePageModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
