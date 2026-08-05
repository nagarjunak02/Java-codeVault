package Core.Oops.StringPrg.UserRegisterSystem;

public class main {
    public static void main(String[] args) {

        Student s = new Student("      NagarjUnA     K");
        System.out.println(s);

        String s1 = s.name.trim();    //removes extra space before and at the end of string
        System.out.println(s1);

        String s2 = s1.replaceAll(" +"," ");
        System.out.println(s2);

        String s3 = s2.substring(0,1);
        String s4 = s2.substring(1);

        String s5 = s3.toUpperCase() + s4.toLowerCase();

        System.out.println(s5);
    }

}



/*
* package Core.Oops.StringPrg.UserRegisterSystem;

public class Main {

    public static void main(String[] args) {

        StudentClass s = new StudentClass("      NagarjUnA     K");

        // Step 1: Remove leading and trailing spaces
        String name = s.getName().trim();

        // Step 2: Replace multiple spaces with a single space
        name = name.replaceAll("\\s+", " ");

        // Step 3: Split into words
        String[] words = name.split(" ");

        // Step 4: Convert each word to Proper Case
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            String formattedWord =
                    word.substring(0, 1).toUpperCase()
                    + word.substring(1).toLowerCase();

            result.append(formattedWord).append(" ");
        }

        // Step 5: Display final result
        System.out.println(result.toString().trim());
    }
}
* */