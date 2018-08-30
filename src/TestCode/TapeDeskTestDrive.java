class TapeDesk {
    boolean canRecord = false;

    void playTape() {
        System.out.println("Tape playing...");
    }

    void recordTape() {
        System.out.println("Tape recording...");
    }
}

public class TapeDeskTestDrive {
    public static void main(String[] args) {
        TapeDesk t = new TapeDesk();
        t.canRecord = true;

        t.playTape();

        if (t.canRecord) {
            t.recordTape();
        }
    }
}
