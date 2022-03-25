package Logic_1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if((cigars >= 40 && cigars <= 60 &&!isWeekend) || (cigars >= 40 && isWeekend)) {
            return true;
        }
        return false;
    }
}
