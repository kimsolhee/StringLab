package com.stringLab.core.masker;

/**
 * 기본 문자열 마스킹 구현체
 */
public class DefaultStringMasker implements StringMasker {

    @Override
    public String maskEmail(String email) {
        if (email == null || !email.contains("@")) {
            return email; // 유효하지 않은 이메일은 그대로 반환
        }
        String[] parts = email.split("@");
        String localPart = parts[0];
        String domainPart = parts[1];
        if (localPart.length() <= 2) {
            return "*@".concat(domainPart);
        }
        return localPart.substring(0, 2) + "***@" + domainPart;
    }

    @Override
    public String maskPhoneNumber(String phone) {
    	if (phone == null || phone.length() == 0) {
            return phone; // null 또는 빈 문자열은 그대로 반환
        }
        if (phone.length() <= 4) {
            return phone.replaceAll(".", "*"); // 4자리 이하인 경우 전체를 *로 변환
        }
        return phone.substring(0, phone.length() - 4).replaceAll(".", "*")
                + phone.substring(phone.length() - 4); // 마지막 4자리 제외 마스킹
    }

    @Override
    public String maskCardNumber(String card) {
        if (card == null || card.length() < 12) {
            return card; // 유효하지 않은 카드 번호는 그대로 반환
        }
        return "****-****-****-" + card.substring(card.length() - 4);
    }
}
