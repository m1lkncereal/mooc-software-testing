package tudelft.chocolate;

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
/*
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;
*/

        if(small + (big*5) < total){
            return -1;
        }

        int maxBig = total/5;
        maxBig = big < maxBig ? big : maxBig;

        int result = total - (maxBig*5);
        if (result >  small)
            return -1;
        else
            return result;

    }

}
