package com.stringLab.core.transformer;

public interface StringTransformer {
	// 문자열 변환 메서드 정의
	String toUpperCase(String input);     // 대문자로 변환
    String toLowerCase(String input);     // 소문자로 변환
    String toCamelCase(String input);     // snake_case -> camelCase 변환
    String toSnakeCase(String input);     // camelCase -> snake_case 변환
}
