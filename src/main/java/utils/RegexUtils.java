package utils;

import java.util.regex.Pattern;

public class RegexUtils {
	// 정규식 패턴 및 유틸리티 메서드
	
	public static final String EMAIL_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String URL_PATTERN = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";

    public static boolean matches(String regex, String input) {
        return Pattern.compile(regex).matcher(input).matches();
    }
}
