package constant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    private static final String REGEX = "[a-zа-я]+";
    public boolean сheck(String input){
        boolean flag;
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(input);
        flag= m.lookingAt();
        return flag;
    }
}
