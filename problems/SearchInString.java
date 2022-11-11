package problems;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Elon Musk";
        char target ='M';
        System.out.println(searchChar(name, target));
    }

    static boolean searchChar (String str , char target){
        if (str.length()==0){
            return false;
        }

        for ( int i=0 ;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
