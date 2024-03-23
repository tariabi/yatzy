import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class YatzyApprovals {

    private static final Integer[] DICE_VALUES = new Integer[]{1,2,3,4,5,6};

    @Test
    void approvals_verify_chance() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).chance(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_yatzy() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).yatzy(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_ones() {
        CombinationApprovals.verifyAllCombinations(Yatzy::ones,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_twos() {
        CombinationApprovals.verifyAllCombinations(Yatzy::twos,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_threes() {
        CombinationApprovals.verifyAllCombinations(Yatzy::threes,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_fours() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).fours(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_fives() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).fives(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_sixes() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).sixes(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_score_pair() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::scorePair,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_two_pair() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::twoPair,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_three_of_a_kind() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::threeOfAKind,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_four_of_a_kind() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::fourOfAKind,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_smallStraight() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::smallStraight,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_largeStraight() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::largeStraight,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_fullHouse() {
        CombinationApprovals.verifyAllCombinations(
            Yatzy::fullHouse,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }
}
