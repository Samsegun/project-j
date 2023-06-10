public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if(isTeen(age1)
        ||  isTeen(age2)
                || isTeen(age3)
        ){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
