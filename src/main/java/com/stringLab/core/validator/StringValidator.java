package com.stringLab.core.validator;

public interface StringValidator {
	// 문자열 검증 메서드
	boolean isEmail(String input);      // 이메일 형식 검증
    boolean isUrl(String input);        // URL 형식 검증
    boolean isBlank(String input);      // 빈 문자열 또는 공백 검증
}
