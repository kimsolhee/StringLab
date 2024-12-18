package com.stringLab.core.masker;

/**
 * 문자열 마스킹 인터페이스
 * 특정 문자열을 부분적으로 숨기기 위해 사용됩니다.
 */
public interface StringMasker {
    String maskEmail(String email);        // 이메일 마스킹
    String maskPhoneNumber(String phone); // 전화번호 마스킹
    String maskCardNumber(String card);   // 카드 번호 마스킹
}
