class Tax {


    public double calculateTax(Item[] items, State state, double discountAmt){
        int total = 0;
        switch (state) {
            case MT:
                return 0;
            case IN:
                for(Item i : items){
                    total += i.getPrice() * discountAmt * 0.07;
                }
                return total;
            case NV:
                for(Item i : items){
                    total += i.getPrice() * discountAmt * 0.08;
                }
                return total;
            default:
                return -1;
        }
    }
}
