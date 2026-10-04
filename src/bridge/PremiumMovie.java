package bridge;

public class PremiumMovie extends Movie {

    public PremiumMovie(String title, StreamingPlatform platform) {
        super(title, platform);
    }

    @Override
    public void play() {
        System.out.println("Playing premium movie in high quality");
        platform.playMovie(title);
    }

    @Override
    public void stop() {
        platform.stopMovie(title);
    }
}
