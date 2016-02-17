/**
 * Created by kpa on 18.02.16.
 *
 *  Card
 */

package domain;

public class Card {
    Nominal nominal;
    Suit suit;

    public Card(Nominal nominal, Suit suit) {
        this.nominal = nominal;
        this.suit = suit;
    }

    public Nominal getNominal() {
        return nominal;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return nominal.name() + "-" + suit.name();
    }
}
