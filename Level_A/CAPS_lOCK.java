    package Level_A;

    import java.util.Scanner;

    public class CAPS_lOCK {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s = sc.next();

            if (s.equals(s.toUpperCase())){
                System.out.println(s.toLowerCase());
            }
            else if(
            s.substring(0,1).equals(s.substring(0, 1).toLowerCase()) &&
            s.substring(1).equals(s.substring(1).toUpperCase())
            )
            {
                System.out.println(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());
            }
            else {
                System.out.println(s);
            }
        }
    }
//131A