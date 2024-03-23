public class ScoreUtils {

    public int[] buildIntArrayFromParametersList(int[] dices) {
        int[] tallies = new int[6];
        for (int die: dices) {
            tallies[die - 1]++;
        }
        return tallies;
    }

}
