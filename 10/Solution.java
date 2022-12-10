class Solution {
    public String calculatePower(String number, int exp) {
        if (exp == 0)) {
            return "1";
        }
        BigDecimal num = new BigDecimal(number);
        BigDecimal result = num;
        for (int i = 0; i < exp - 1; i++) {
            result = result.multiply(num);
        }
        return result.toPlainString();
    }
}
