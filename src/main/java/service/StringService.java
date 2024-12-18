package service;

import com.stringLab.core.formatter.DefaultStringFormatter;
import com.stringLab.core.formatter.StringFormatter;
import com.stringLab.core.generator.DefaultStringGenerator;
import com.stringLab.core.generator.StringGenerator;
import com.stringLab.core.masker.DefaultStringMasker;
import com.stringLab.core.masker.StringMasker;
import com.stringLab.core.transformer.DefaultStringTransformer;
import com.stringLab.core.transformer.StringTransformer;
import com.stringLab.core.validator.DefaultStringValidator;
import com.stringLab.core.validator.StringValidator;

/**
 * 문자열과 관련된 다양한 기능을 제공하는 통합 서비스 클래스
 * 변환, 검증, 생성, 포맷팅 기능을 포함
 */
public class StringService {
	private final StringTransformer transformer;
    private final StringValidator validator;
    private final StringFormatter formatter;
    private final StringGenerator generator;
    private final StringMasker masker;

    /**
     * 기본 구현 클래스를 사용하여 서비스 초기화.
     */
    public StringService() {
    	 this.transformer = new DefaultStringTransformer();  // 문자열 변환
         this.validator = new DefaultStringValidator();      // 문자열 검증
         this.formatter = new DefaultStringFormatter();      // 문자열 포맷팅
         this.generator = new DefaultStringGenerator();      // 문자열 생성
         this.masker = new DefaultStringMasker();			// 마스킹 처리
    }
    
    // ===== 변환 기능 =====
    /**
     * 문자열을 대문자로 변환합니다.
     *
     * @param input 변환할 문자열
     * @return 대문자로 변환된 문자열
     */
    public String toUpperCase(String input) {
        return transformer.toUpperCase(input);
    }

    /**
     * 문자열을 소문자로 변환합니다.
     *
     * @param input 변환할 문자열
     * @return 소문자로 변환된 문자열
     */
    public String toLowerCase(String input) {
        return transformer.toLowerCase(input);
    }
    
    /**
     * snake_case 문자열을 camelCase로 변환합니다.
     *
     * @param input 변환할 문자열
     * @return camelCase로 변환된 문자열
     */
    public String toCamelCase(String input) {
        return transformer.toCamelCase(input);
    }

    /**
     * camelCase 문자열을 snake_case로 변환합니다.
     *
     * @param input 변환할 문자열
     * @return snake_case로 변환된 문자열
     */
    public String toSnakeCase(String input) {
        return transformer.toSnakeCase(input);
    }

    // ===== 검증 기능 =====
    /**
     * 입력값이 유효한 이메일인지 확인합니다.
     *
     * @param input 검증할 문자열
     * @return 이메일이 유효하면 true, 그렇지 않으면 false
     */
    public boolean isValidEmail(String input) {
        return validator.isEmail(input);
    }

    /**
     * 입력값이 유효한 URL인지 확인합니다.
     *
     * @param input 검증할 문자열
     * @return URL이 유효하면 true, 그렇지 않으면 false
     */
    public boolean isValidUrl(String input) {
        return validator.isUrl(input);
    }
    
    /**
     * 입력값이 빈 문자열 또는 공백인지 확인합니다.
     *
     * @param input 검증할 문자열
     * @return 비어있거나 공백이면 true, 그렇지 않으면 false
     */
    public boolean isBlank(String input) {
        return validator.isBlank(input);
    }

    // ===== 포맷팅 기능 =====
    /**
     * 금액을 통화 형식으로 변환합니다.
     *
     * @param amount 변환할 금액
     * @return "$xx.xx" 형식의 문자열
     */
    public String formatCurrency(double amount) {
        return formatter.formatCurrency(amount);
    }

    /**
     * 날짜를 특정 형식으로 변환합니다.
     *
     * @param pattern 날짜 포맷 패턴
     * @param date    변환할 날짜 객체
     * @return 변환된 날짜 문자열
     */
    public String formatDate(String pattern, java.util.Date date) {
        return formatter.formatDate(pattern, date);
    }
    
    /**
     * 숫자를 소수점 자리수에 맞게 포맷팅합니다.
     *
     * @param number        포맷팅할 숫자
     * @param decimalPlaces 소수점 자리수
     * @return 포맷팅된 숫자 문자열
     */
    public String formatNumber(double number, int decimalPlaces) {
        return formatter.formatNumber(number, decimalPlaces);
    }

    // ===== 생성 기능 =====
    /**
     * 랜덤 문자열을 생성합니다.
     *
     * @param length 생성할 문자열의 길이
     * @return 랜덤으로 생성된 문자열
     */
    public String generateRandomString(int length) {
        return generator.generateRandomString(length);
    }

    /**
     * GUID(글로벌 고유 식별자)를 생성합니다.
     *
     * @return GUID 형식의 문자열
     */
    public String generateGUID() {
        return generator.generateGUID();
    }
    
    // ===== 마스킹 기능 =====

    /**
     * 이메일 주소를 마스킹합니다.
     *
     * @param email 마스킹할 이메일 주소
     * @return 마스킹된 이메일 주소
     */
    public String maskEmail(String email) {
        return masker.maskEmail(email);
    }

    /**
     * 전화번호를 마스킹합니다.
     *
     * @param phone 마스킹할 전화번호
     * @return 마스킹된 전화번호
     */
    public String maskPhoneNumber(String phone) {
        return masker.maskPhoneNumber(phone);
    }

    /**
     * 카드 번호를 마스킹합니다.
     *
     * @param card 마스킹할 카드 번호
     * @return 마스킹된 카드 번호
     */
    public String maskCardNumber(String card) {
        return masker.maskCardNumber(card);
    }
}	
