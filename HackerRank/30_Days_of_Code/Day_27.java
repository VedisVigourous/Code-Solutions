/*
 * Day 27: Testing
 * Link: https://www.hackerrank.com/challenges/30-testing
 * Difficulty: Easy
 * Language Used: Java 15
 *
 */


    
static class TestDataEmptyArray{
    static int [] get_array(){
        return new int[0];
    }
}

static class TestDataUniqueValues{
    static int[] get_array(){
        return new int[] {12,2};
    }
    
    static int get_expected_result(){
        return 1;
    }
}

static class TestDataExactlyTwoDifferentMinimums{
    static int[] get_array(){
        return new int[] {2 , 5 , 12 , 2};
    }
    
    static int get_expected_result(){
        return 0;
    }
}
    
    
/* By: Vadanta Kumar Chauhaan
 * HackerRank: https://www.hackerrank.com/profile/codegrounds666
 * GitHub: https://github.com/VedisVigourous
 * Contact vadanta592007@hotmail.com
 */