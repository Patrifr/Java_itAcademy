package SPRINT1.TASCA4.N2.EX1;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.hamcrest.Matchers.is;


public class MatcherTest {
    @Test
    public void testStringLenght(){
        MatcherClass matcherCorrect = new MatcherClass(is(8));
        Assert.assertThat("mordor",matcherCorrect);
    }
}
