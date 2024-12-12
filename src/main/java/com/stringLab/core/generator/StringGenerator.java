package com.stringLab.core.generator;

/**
 * 문자열 생성 기능을 제공하는 인터페이스.
 * 랜덤 문자열 및 GUID를 생성할 수 있습니다.
 */
public interface StringGenerator {
	
	/**
     * 지정된 길이의 랜덤 문자열을 생성합니다.
     *
     * @param length 생성할 문자열의 길이
     * @return 랜덤으로 생성된 문자열
     * @throws IllegalArgumentException 길이가 0 이하일 경우 예외 발생
     */
    String generateRandomString(int length);

    /**
     * GUID(글로벌 고유 식별자)를 생성합니다.
     *
     * @return GUID 형식의 문자열
     */
    String generateGUID();
}
