public class Doctor {
    boolean worksAtHospital;

    void treatPatient() {
        //perfrom a checkup
    }
}

public class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    void giveAdvice() {
        //give homespun advice
    }
}

public class Surgeon extends Doctor {
    void treatPatient() {
        //Perfrom surgery
    }

    void makeIncision() {
        //Make incision (yikes!)
    }
}

public class TestJava {
    public static void main(String[] args) {
        String s1 = "Hello.";
        String s2 = "Hello.";

        System.out.println("s1 == s2: " + s1 == s2);
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}