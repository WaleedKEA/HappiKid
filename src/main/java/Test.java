public class Test {

    void run() {
        Kid k1 = new Kid("Julie", 6);
        Kid k2 = new Kid("Julie", 6);
        Kid k3 = new Kid("Julie", 6);

        k1.name = "Brian";
        k2.name = "Diesel";
        k3.name = "Oliver";

        System.out.println(k1.name);
        System.out.println(k2.name);
        System.out.println(k3.name);

        System.out.println("\n--------\n");

        Kid theKid = new Kid("Julie", 6);
        theKid.name = "Billy";
        theKid.age = 5;
        theKid.gender = ' ';
        theKid.height = 1.02;
        theKid.weight = 14.30;
        theKid.sweetness = 0.00002;

        System.out.println(theKid + "\n");
        System.out.println("Name: " + theKid.name);
        System.out.println("Age: " + theKid.age);
        System.out.println("Gender: " + theKid.gender);
        System.out.println(theKid.height);
        System.out.println(theKid.weight);
        System.out.println(theKid.sweetness);

    }

    public static void main(String[] args) {
        new Test ().run();
    }
}

