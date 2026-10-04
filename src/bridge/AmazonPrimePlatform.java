package bridge;

public class AmazonPrimePlatform implements StreamingPlatform {

    @Override
    public void playMovie(String title) {
        System.out.println("Amazon Prime is playing: " + title);
    }

    @Override
    public void stopMovie(String title) {
        System.out.println("Amazon Prime stopped: " + title);
    }
}