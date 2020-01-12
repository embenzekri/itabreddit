package ma.itab.reddit.core;

public class Post {
    private String text;
    private int likes;
    private User user;

    public Post(String text, User user) {
        this.text = text;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int like() {
        return likes++;
    }

    public int dislike() {
        return likes--;
    }

    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", likes=" + likes +
                ", user=" + user.getUsername() +
                '}';
    }
}
