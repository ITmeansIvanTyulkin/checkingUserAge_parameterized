import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class checkingUserAge {

    @RunWith(Parameterized.class)
    public class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {
            this.age = age;
            this.result = result;
        }

        @Parameterized.Parameters
        public static Object[][] getTextData() {
            return new Object[][] {
                    {17, false},
                    {18, true},
                    {19, true},
                    {21, true},
            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program();
            int userAge = age;
            boolean isAdult = program.checkIsAdult(userAge);
            assertEquals("Wrong user's age", result, isAdult);
        }
    }
}
