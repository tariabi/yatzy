import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void chance_23451_yields_15() {
        assertEquals(15, new Yatzy(2, 3, 4, 5, 1).chance());
    }

    @Test
    void chance_33451_yields_16() {
        assertEquals(16, new Yatzy(3, 3, 4, 5, 1).chance());
    }

    @Test
    void yatzy_44444_yields_50() {
        assertEquals(50, new Yatzy(4, 4, 4, 4, 4).yatzy());
    }

    @Test
    void yatzy_66666_yields_50() {
        assertEquals(50, new Yatzy(6, 6, 6, 6, 6).yatzy());
    }

    @Test
    void yatzy_66663_yields_0() {
        assertEquals(0, new Yatzy(6, 6, 6, 6, 3).yatzy());
    }

    @Test
    void ones_12345_yields_1() {
        assertEquals(1, new Yatzy(1, 2, 3, 4, 5).ones());
    }

    @Test
    void ones_12145_yields_2() {
        assertEquals(2, new Yatzy(1, 2, 1, 4, 5).ones());
    }

    @Test
    void ones_62245_yields_0() {
        assertEquals(0, new Yatzy(6, 2, 2, 4, 5).ones());
    }

    @Test
    void ones_12111_yields_4() {
        assertEquals(4, new Yatzy(1, 2, 1, 1, 1).ones());
    }

    @Test
    void twos_12326_yields_4() {
        assertEquals(4, new Yatzy(1, 2, 3, 2, 6).twos());
    }

    @Test
    void twos_22222_yields_10() {
        assertEquals(10, new Yatzy(2, 2, 2, 2, 2).twos());
    }

    @Test
    void threes_12323_yields_6() {
        assertEquals(6, new Yatzy(1, 2, 3, 2, 3).threes());
    }

    @Test
    void threes_23333_yields_12() {
        assertEquals(12, new Yatzy(2, 3, 3, 3, 3).threes());
    }

    @Test
    void fours_44455_yields_12() {
        assertEquals(12, new Yatzy(4, 4, 4, 5, 5).fours());
    }

    @Test
    void fours_44555_yields_8() {
        assertEquals(8, new Yatzy(4, 4, 5, 5, 5).fours());
    }

    @Test
    void fours_45555_yields_4() {
        assertEquals(4, new Yatzy(4, 5, 5, 5, 5).fours());
    }

    @Test
    void fives_44455_yields_10() {
        assertEquals(10, new Yatzy(4, 4, 4, 5, 5).fives());
    }

    @Test
    void fives_44555_yields_15() {
        assertEquals(15, new Yatzy(4, 4, 5, 5, 5).fives());
    }

    @Test
    void fives_45555_yields_20() {
        assertEquals(20, new Yatzy(4, 5, 5, 5, 5).fives());
    }

    @Test
    void sixes_44455_yields_0() {
        assertEquals(0, new Yatzy(4, 4, 4, 5, 5).sixes());
    }

    @Test
    void sixes_44655_yields_6() {
        assertEquals(6, new Yatzy(4, 4, 6, 5, 5).sixes());
    }

    @Test
    void sixes_65665_yields_18() {
        assertEquals(18, new Yatzy(6, 5, 6, 6, 5).sixes());
    }

    @Test
    void score_pair_34356_yields_6() {
        assertEquals(6, new Yatzy(3, 4, 3, 5, 6).scorePair());
    }

    @Test
    void score_pair_53335_yields_10() {
        assertEquals(10, new Yatzy(5, 3, 3, 3, 5).scorePair());
    }

    @Test
    void score_pair_53665_yields_12() {
        assertEquals(12, new Yatzy(5, 3, 6, 6, 5).scorePair());
    }

    @Test
    void two_pair_33545_yields_16() {
        assertEquals(16, new Yatzy(3, 3, 5, 4, 5).twoPair());
    }

    @Test
    void two_pair_33555_yields_16() {
        assertEquals(16, new Yatzy(3, 3, 5, 5, 5).twoPair());
    }

    @Test
    void three_of_a_kind_33345_yields_9() {
        assertEquals(9, new Yatzy(3, 3, 3, 4, 5).threeOfAKind());
    }

    @Test
    void three_of_a_kind_53545_yields_15() {
        assertEquals(15, new Yatzy(5, 3, 5, 4, 5).threeOfAKind());
    }

    @Test
    void three_of_a_kind_33335_yields_9() {
        assertEquals(9, new Yatzy(3, 3, 3, 3, 5).threeOfAKind());
    }

    @Test
    void four_of_a_kind_33335_yields_12() {
        assertEquals(12, new Yatzy(3, 3, 3, 3, 5).fourOfAKind());
    }

    @Test
    void four_of_a_kind_55545_yields_20() {
        assertEquals(20, new Yatzy(5, 5, 5, 4, 5).fourOfAKind());
    }

    @Test
    void four_of_a_kind_33333_yields_12() {
        assertEquals(12, new Yatzy(3, 3, 3, 3, 3).fourOfAKind());
    }

    @Test
    void smallStraight_12345_yields_15() {
        assertEquals(15, new Yatzy(1, 2, 3, 4, 5).smallStraight());
    }

    @Test
    void smallStraight_23451_yields_15() {
        assertEquals(15, new Yatzy(2, 3, 4, 5, 1).smallStraight());
    }

    @Test
    void smallStraight_12245_yields_0() {
        assertEquals(0, new Yatzy(1, 2, 2, 4, 5).smallStraight());
    }

    @Test
    void largeStraight_62345_yields_20() {
        assertEquals(20, new Yatzy(6, 2, 3, 4, 5).largeStraight());
    }

    @Test
    void largeStraight_23456_yields_20() {
        assertEquals(20, new Yatzy(2, 3, 4, 5, 6).largeStraight());
    }

    @Test
    void largeStraight_12245_yields_0() {
        assertEquals(0, new Yatzy(1, 2, 2, 4, 5).largeStraight());
    }

    @Test
    void fullHouse_62226_yields_18() {
        assertEquals(18, new Yatzy(6, 2, 2, 2, 6).fullHouse());
    }

    @Test
    void fullHouse_23456_yields_0() {
        assertEquals(0, new Yatzy(2, 3, 4, 5, 6).fullHouse());
    }
}
