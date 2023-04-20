public class exercise1 {
    
    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;

    public static void main(String[] args) throws Exception {



        assert iwillBehave == true : "You have behavioral problem!";

        college();

        assert iwillGraduate == true: "Better luck next term!";

    }

    static void college(){

        iwillGraduate = false;
        System.out.println("Today is Graduation Day!");
        
    }
    
}
