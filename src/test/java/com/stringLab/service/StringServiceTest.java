package com.stringLab.service;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import service.StringService;

public class StringServiceTest {
	private final StringService service = new StringService();
	
	 // ===== 변환 기능 테스트 =====
    @Test
    public void testToUpperCase() {
    	Assertions.assertEquals("HELLO", service.toUpperCase("hello"));
    	Assertions.assertEquals("", service.toUpperCase("")); // 빈 문자열 테스트
    	Assertions.assertNull(service.toUpperCase(null));     // null 입력 테스트
    }

    @Test
    public void testToLowerCase() {
    	Assertions.assertEquals("hello", service.toLowerCase("HELLO"));
    	Assertions.assertEquals("", service.toLowerCase("")); // 빈 문자열 테스트
    	Assertions.assertNull(service.toLowerCase(null));     // null 입력 테스트
    }

    @Test
    public void testToCamelCase() {
    	Assertions.assertEquals("helloWorld", service.toCamelCase("hello_world"));
    	Assertions.assertEquals("javaSpring", service.toCamelCase("java_spring"));
    	Assertions.assertEquals("example", service.toCamelCase("example")); // 단어 하나
    	Assertions.assertEquals("", service.toCamelCase(""));               // 빈 문자열
    	Assertions.assertNull(service.toCamelCase(null));                  // null 입력
    }

    @Test
    public void testToSnakeCase() {
    	Assertions.assertEquals("hello_world", service.toSnakeCase("helloWorld"));
    	Assertions.assertEquals("java_spring", service.toSnakeCase("javaSpring"));
    	Assertions.assertEquals("example", service.toSnakeCase("example")); // 단어 하나
        Assertions.assertEquals("", service.toSnakeCase(""));               // 빈 문자열
        Assertions.assertNull(service.toSnakeCase(null));                  // null 입력
    }

    // ===== 검증 기능 테스트 =====
    @Test
    public void testIsValidEmail() {
    	Assertions.assertTrue(service.isValidEmail("test@example.com"));
    	Assertions.assertFalse(service.isValidEmail("invalid-email"));
    	Assertions.assertFalse(service.isValidEmail(null));                // null 입력
    	Assertions.assertFalse(service.isValidEmail(""));                  // 빈 문자열
    }

    @Test
    public void testIsValidUrl() {
        Assertions.assertTrue(service.isValidUrl("https://example.com"));
        Assertions.assertTrue(service.isValidUrl("http://example.com"));
        Assertions.assertFalse(service.isValidUrl("invalid-url"));
        Assertions.assertFalse(service.isValidUrl(null));                  // null 입력
        Assertions.assertFalse(service.isValidUrl(""));                    // 빈 문자열
    }

    @Test
    public void testIsBlank() {
        Assertions.assertTrue(service.isBlank(""));                        // 빈 문자열
        Assertions.assertTrue(service.isBlank("   "));                     // 공백 문자열
        Assertions.assertFalse(service.isBlank("hello"));                  // 정상 문자열
        Assertions.assertTrue(service.isBlank(null));                      // null 입력
    }

    // ===== 포맷팅 기능 테스트 =====
    @Test
    public void testFormatCurrency() {
        Assertions.assertEquals("$123.45", service.formatCurrency(123.45));
        Assertions.assertEquals("$0.00", service.formatCurrency(0.0));
        Assertions.assertEquals("$-45.67", service.formatCurrency(-45.67)); // 음수 테스트
    }

    @Test
    public void testFormatDate() {
        Date date = new Date(0); // Epoch time (1970-01-01)
        Assertions.assertEquals("1970-01-01", service.formatDate("yyyy-MM-dd", date));
        Assertions.assertEquals("01-01-1970", service.formatDate("MM-dd-yyyy", date));
    }

    @Test
    public void testFormatNumber() {
        Assertions.assertEquals("123.46", service.formatNumber(123.456, 2));
        Assertions.assertEquals("123", service.formatNumber(123, 0));       // 소수점 없는 경우
        Assertions.assertEquals("0.00", service.formatNumber(0, 2));        // 0 값
    }

    // ===== 생성 기능 테스트 =====
    @Test
    public void testGenerateRandomString() {
        String randomString = service.generateRandomString(10);
        Assertions.assertEquals(10, randomString.length());                // 길이 확인
        Assertions.assertTrue(randomString.matches("[A-Za-z0-9]+"));       // 알파벳/숫자로 구성 확인
    }

    @Test
    public void testGenerateGUID() {
        String guid = service.generateGUID();
        Assertions.assertNotNull(guid);                                   // null 여부 확인
        Assertions.assertEquals(36, guid.length());                       // GUID 표준 길이 확인
    }
}
