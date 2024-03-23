import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class YatzyApprovals {

    @Test
    void approvals_verify_chance() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(Yatzy::chance,
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_yatzy() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(Yatzy::yatzy,
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_ones() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(Yatzy::ones,
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_twos() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(Yatzy::twos,
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_threes() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(Yatzy::threes,
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_fours() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).fours(),
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_fives() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).fives(),
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }

    @Test
    void approvals_verify_sixes() {
        var diceValues1 = new Integer[]{1,2,3,4,5,6};
        var diceValues2 = new Integer[]{1,2,3,4,5,6};
        var diceValues3 = new Integer[]{1,2,3,4,5,6};
        var diceValues4 = new Integer[]{1,2,3,4,5,6};
        var diceValues5 = new Integer[]{1,2,3,4,5,6};
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).sixes(),
            diceValues1,
            diceValues2,
            diceValues3,
            diceValues4,
            diceValues5
        );
    }
}