package Dzień_1_wzorce_projektowe.Zad4;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("some title");
        post.setContent("some content");

        post.attach(new FacebookObserwer());
        post.attach(new TwitterObserver());

        post.share();
    }
}
