package Warmup1;

public class StringE {
    public boolean stringE(String str) {
        int i = 0, a = 0;
        for(char element: str.toCharArray()){
            if (element == 'e') a++;
        }
        if (a <=3 & a > 0) {return true;}
        return false;
    }
}
