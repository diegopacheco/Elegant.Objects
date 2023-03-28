package com.github.diegopacheco.elegantobjects.book.birth;

/**
 * Book Principles here:
 *  * Birth: Dont use -er Names (see the class is not named: CashFormatter or CashManager
 *  * Birth: Keep Constructors Code Free
 *  * Birth: Keep a primary constructor
 */
public class Cash {

    private Number dollars;

    // Primary constructor
    public Cash(Number amount){
        this.dollars = amount;
    }

    // secondary constructor
    public Cash(String amount){
        // it's code free and lazy loading by default.
        this.dollars = new StringAsNumber(amount);
    }

    public String format(){
        return String.format("$%d",dollars.intValue());
    }

    private class StringAsNumber extends Number {

        private String value;

        public StringAsNumber(String value){
            this.value = value;
        }

        @Override
        public int intValue() {
            return Integer.parseInt(value);
        }
        @Override
        public long longValue() {
            return Long.parseLong(value);
        }
        @Override
        public float floatValue() {
            return Float.parseFloat(value);
        }
        @Override
        public double doubleValue() {
            return Double.parseDouble(value);
        }
    }

    public static void main(String[] args) {
        Cash five = new Cash("5");
        System.out.println(five.format());
    }

}



