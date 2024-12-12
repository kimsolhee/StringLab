package com.stringLab.core.formatter;

public interface StringFormatter {
	
	/**
     * 금액을 통화 형식으로 변환합니다.
     *
     * @param amount 포맷팅할 금액
     * @return "$xx.xx" 형식의 문자열
     */
	String formatCurrency(double amount);

    /**
     * 날짜를 특정 패턴으로 포맷팅합니다.
     *
     * @param pattern 날짜 포맷 패턴 (예: "yyyy-MM-dd")
     * @param date    포맷팅할 날짜 객체
     * @return 포맷팅된 날짜 문자열
     */
    String formatDate(String pattern, java.util.Date date);

    /**
     * 숫자를 소수점 자리수에 맞게 포맷팅합니다.
     *
     * @param number        포맷팅할 숫자
     * @param decimalPlaces 소수점 자리수
     * @return 포맷팅된 숫자 문자열
     */
    String formatNumber(double number, int decimalPlaces);
}
