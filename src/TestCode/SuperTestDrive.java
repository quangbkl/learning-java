package TestCode;

abstract class Report {
    void runReport() {
        System.out.println("Success!");
    }
    void printReport() {
        System.out.println("This is Report!");
    }
}

class BuzzwordsReport extends Report {
    void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }
    void buzzwordCompliance() {
        System.out.println("Compliance!");
    }
}

public class SuperTestDrive {
    public static void main(String[] args) {
        BuzzwordsReport br = new BuzzwordsReport();
        br.runReport();
    }
}
