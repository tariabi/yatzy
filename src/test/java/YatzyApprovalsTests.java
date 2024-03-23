import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class YatzyApprovalsTests {

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
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).ones(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_twos() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).twos(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }

    @Test
    void approvals_verify_threes() {
        CombinationApprovals.verifyAllCombinations(
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).threes(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).scorePair(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).twoPair(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).threeOfAKind(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).fourOfAKind(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).smallStraight(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).largeStraight(),
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
            (dice1, dice2, dice3, dice4, dice5) -> new Yatzy(dice1, dice2, dice3, dice4, dice5).fullHouse(),
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES,
            DICE_VALUES
        );
    }
}
