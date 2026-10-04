package bridge;

public class Main {

    public static void main(String[] args) {

        StreamingPlatform netflix = new NetflixPlatform();
        StreamingPlatform amazonPrime = new AmazonPrimePlatform();

        Movie regularMovie = new RegularMovie("Interstellar", netflix);

        regularMovie.play();
        regularMovie.stop();

        System.out.println();

        Movie premiumMovie = new PremiumMovie("Inception", amazonPrime);

        premiumMovie.play();
        premiumMovie.stop();

        System.out.println("\nSwitching platform...");

        premiumMovie.setPlatform(netflix);

        premiumMovie.play();
        premiumMovie.stop();
    }
}