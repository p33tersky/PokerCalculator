import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      "♠", "♣", "♦", "♥"
        DealService dealService = new DealService();
        SequenceCheckers sequenceCheckers = new SequenceCheckers();
        BestSequenceReturner bestSequenceReturner = new BestSequenceReturner();

//        tool simulating N games with two players
//        dealService.simulateNGames(10);


//        Position position1 = new Position(new Card("3", "♣"), new Card("2", "♣"));
//        Position position2 = new Position(new Card("10", "♦"), new Card("K", "♥"));
//        tool simulating n deals where cards on positions are known, receiving rate of each position effectiveness giving approximately chances of winning
//        dealService.simulate_N_dealsAgainstGivenPositionsAndReturnEachEffectiveness(position1, position2, 10000);

//        tool simulating games with two players till one of them has sequence X and another one has sequence Y
        dealService.simulateTillOnePlayerHas_XSequence_AndSecondHas_YSequence(PokerSequenceType.FULL_HOUSE,PokerSequenceType.STRAIGHT);

    }

}
