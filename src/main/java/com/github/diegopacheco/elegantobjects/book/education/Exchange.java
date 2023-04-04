package com.github.diegopacheco.elegantobjects.book.education;

/**
 * Principles here:
 *  * Don't Mock, use Fakes
 *  * Always use interfaces
 *  * Be Immutable
 */
public interface Exchange {
    float rate(String target);
    float rate(String source,String target);

    final class Fake implements Exchange{
        @Override
        public float rate(String target) {
            return rate("USD",target);
        }
        @Override
        public float rate(String source, String target) {
            return 5.1f;
        }
    }
}

class TestSample{
    public static void main(String[] args) {
        Exchange exchange = new Exchange.Fake();
        Float dollarInReais = exchange.rate("USD", "BR");
        System.out.println(dollarInReais);
    }
}
