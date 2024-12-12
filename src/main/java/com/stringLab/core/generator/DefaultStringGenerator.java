package com.stringLab.core.generator;

import java.util.Random;
import java.util.UUID;

/**
 * StringGenerator 인터페이스의 기본 구현 클래스
 * 랜덤 문자열 및 GUID 생성 기능을 제공
 */
public class DefaultStringGenerator implements StringGenerator {
	
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	 /**
     * 지정된 길이의 랜덤 문자열을 생성합니다.
     *
     * @param length 생성할 문자열의 길이
     * @return 랜덤으로 생성된 문자열
     * @throws IllegalArgumentException 길이가 0 이하일 경우 예외 발생
     */
    @Override
    public String generateRandomString(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("문자열 길이는 0보다 커야 합니다.");
        }
        
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            result.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        
        return result.toString();
    }

    /**
     * GUID(글로벌 고유 식별자)를 생성합니다.
     *
     * @return GUID 형식의 문자열
     */
    @Override
    public String generateGUID() {
        return UUID.randomUUID().toString(); // UUID 클래스를 이용해 GUID 생성
    }

}
