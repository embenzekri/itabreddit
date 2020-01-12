package ma.itab.reddit.core;

import java.util.ArrayList;
import java.util.List;

public class DefaultReddit implements Reddit {
    private List<Post> posts = new ArrayList<>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    public int likePost(Post post) {
        return post.like();
    }

    public int dislikePost(Post post) {
        return post.dislike();
    }
}
