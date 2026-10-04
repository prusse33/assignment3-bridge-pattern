package bridge;

public class RegularMovie extends Movie {

    public RegularMovie(String title, StreamingPlatform platform) {
        super(title, platform);
    }

    @Override
    public void play() {
        System.out.println("Playing regular movie");
        platform.playMovie(title);
    }

    @Override
    public void stop() {
        platform.stopMovie(title);
    }
}