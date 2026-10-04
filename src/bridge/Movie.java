package bridge;

public abstract class Movie {

    protected String title;
    protected StreamingPlatform platform;

    public Movie(String title, StreamingPlatform platform) {
        this.title = title;
        this.platform = platform;
    }

    public abstract void play();

    public abstract void stop();

    public void setPlatform(StreamingPlatform platform) {
        this.platform = platform;
    }
}