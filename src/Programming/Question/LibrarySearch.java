package Programming.Question;

public class LibrarySearch {


    public static int searchBook(int n, int pos) {
        int count=1;
        if (pos == 1) {
            return count;
        }
        // Recursive case: look at top + search rest
        int result = searchBook(n, pos - 1);
        return count+result;
    }

    public static void main(String[] args) {
        int n = 10;
        int pos = 7;

        int count = searchBook(n, pos);
        System.out.println("Book found after looking at " + count + " books.");
    }
}
