package bridge;

public class NetflixPlatform implements StreamingPlatform {

    @Override
    public void playMovie(String title) {
        System.out.println("Netflix is playing: " + title);
    }

    @Override
    public void stopMovie(String title) {
        System.out.println("Netflix stopped: " + title);
    }
}