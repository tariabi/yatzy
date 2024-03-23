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
}
