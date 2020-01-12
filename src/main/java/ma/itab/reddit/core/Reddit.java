package ma.itab.reddit.core;

import java.util.List;

public interface Reddit {
    void addPost(Post post);
    List<Post> getAllPosts();
    int likePost(Post post);
    int dislikePost(Post post);
}
