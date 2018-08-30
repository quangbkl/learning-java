class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("Bang Bang Ba-Bang.");
    }

    void playTopHat() {
        System.out.println("Bing Bing Bi-Bing.");
    }
}

public class DrunKitTestDrive {
    public static void main(String[] args) {
        DrumKit newDrumKit = new DrumKit();

        if (newDrumKit.topHat) newDrumKit.playTopHat();
        if (newDrumKit.snare) newDrumKit.playSnare();
    }
}
