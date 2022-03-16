package CodingBat.String_1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        String middle = str.substring(1, str.length()-1);
        return middle;
    }
}
