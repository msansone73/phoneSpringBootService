package br.com.msansone.test.phoneSpringBootService.enums;

public enum PhoneType {
    Cameroon("\\(237\\)\\ ?[2368]\\d{7,8}$"),
    Ethiopia("\\(251\\)\\ ?[1-59]\\d{8}$"),
    Morocco("\\(212\\)\\ ?[5-9]\\d{8}$"),
    Mozambique("\\(258\\)\\ ?[28]\\d{7,8}$"),
    Uganda("\\(256\\)\\ ?\\d{9}$");

    private final String text;

    /**
     * @param text
     */
    PhoneType(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }


}
