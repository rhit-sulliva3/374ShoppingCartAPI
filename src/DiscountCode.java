import java.util.Arrays;

class DiscountCode {
    private String code;
    private double discountAmount;
    private String[] reqItemIDs;
    private String[] conflictingCodes;

    public DiscountCode(String code, double discountAmount, String[] reqItemIDs, String[] conflictingCodes) {
        this.code = code;
        this.discountAmount = discountAmount;
        this.reqItemIDs = reqItemIDs;
        this.conflictingCodes = conflictingCodes;
    }

    public String getCode() {
        return code;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public String[] getReqItemIDs() {
        return reqItemIDs;
    }

    public String[] getConflictingCodes() {
        return conflictingCodes;
    }

    @Override
    public String toString() {
        return "DiscountCode{" +
                "code='" + code + '\'' +
                ", discountAmount=" + discountAmount +
                ", reqItemIDs=" + Arrays.toString(reqItemIDs) +
                ", conflictingCodes=" + Arrays.toString(conflictingCodes) +
                '}';
    }
}
