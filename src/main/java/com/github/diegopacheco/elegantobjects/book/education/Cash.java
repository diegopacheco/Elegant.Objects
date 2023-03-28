package com.github.diegopacheco.elegantobjects.book.education;

/**
 * Principles here:
 *  * Always use interfaces
 *  * Encapsulate as little as possible
 *  * Encapsulate something at the very least
 *  * Chose methods names carefully
 *  * Be Immutable
 */
public interface Cash {
    Cash sum(Integer amount);
    Cash multiply(Integer amount);
}

class USDCash implements Cash{

    private Integer value;

    public USDCash(Integer amount){
        this.value = amount;
    }

    @Override
    public Cash sum(Integer amount) {
        return new USDCash(amount + value);
    }

    @Override
    public Cash multiply(Integer amount) {
        return new USDCash(amount * value);
    }

    @Override
    public String toString() {
        return "$" + value.toString();
    }

    public static void main(String[] args) {
        Cash five = new USDCash(5);
        Cash ten  = five.multiply(2);
        System.out.println(ten);
    }

}
