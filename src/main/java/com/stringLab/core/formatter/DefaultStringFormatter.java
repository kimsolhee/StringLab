package com.stringLab.core.formatter;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DefaultStringFormatter implements StringFormatter {

	/**
     * 금액을 통화 형식으로 변환합니다.
     *
     * @param amount 포맷팅할 금액
     * @return "$xx.xx" 형식의 문자열
     */
    @Override
    public String formatCurrency(double amount) {
        return String.format("$%.2f", amount); // 금액을 "$xx.xx" 형식으로 포맷팅
    }

    /**
     * 날짜를 특정 패턴으로 포맷팅합니다.
     *
     * @param pattern 날짜 포맷 패턴
     * @param date    포맷팅할 날짜 객체
     * @return 포맷팅된 날짜 문자열
     * @throws IllegalArgumentException 패턴이나 날짜가 null인 경우 예외 발생
     */
    @Override
    public String formatDate(String pattern, Date date) {
        if (pattern == null || date == null) {
            throw new IllegalArgumentException("패턴과 날짜는 null일 수 없습니다.");
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date); // SimpleDateFormat으로 날짜 포맷팅
    }

    /**
     * 숫자를 소수점 자리수에 맞게 포맷팅합니다.
     *
     * @param number        포맷팅할 숫자
     * @param decimalPlaces 소수점 자리수
     * @return 포맷팅된 숫자 문자열
     * @throws IllegalArgumentException 소수점 자리수가 음수인 경우 예외 발생
     */
    @Override
    public String formatNumber(double number, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("소수점 자리수는 음수일 수 없습니다.");
        }
        
        // "0.00" 형식의 패턴을 생성
        StringBuilder pattern = new StringBuilder("0");
        if (decimalPlaces > 0) {
            pattern.append(".");
            for (int i = 0; i < decimalPlaces; i++) {
                pattern.append("0");
            }
        }
        
        DecimalFormat decimalFormat = new DecimalFormat(pattern.toString());
        return decimalFormat.format(number);
    }

}
