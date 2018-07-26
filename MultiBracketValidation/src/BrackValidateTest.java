import static org.junit.jupiter.api.Assertions.*;

class BrackValidateTest {

    @org.junit.jupiter.api.Test
    void multiBracketValidator() {
        String test = "()[]{}Hello{}()[]";
        Boolean testMethod = BrackValidate.multiBracketValidator(test);
        assertTrue(testMethod);

    }

    @org.junit.jupiter.api.Test
    void multiBracketValidatorAStepHarder() {
        String test = "(C)[B]{A}Hello{D}(E)[F]";
        Boolean testMethod = BrackValidate.multiBracketValidator(test);
        assertTrue(testMethod);

    }

    @org.junit.jupiter.api.Test
    void multiBracketValidatorFailureEdition() {
        String test = "(The}{}()";
        Boolean testMethod = BrackValidate.multiBracketValidator(test);
        assertFalse(testMethod);
    }
    @org.junit.jupiter.api.Test
    void multiBracketValidatorFailureEditionTakeTwo() {
        String test = "(The{}{}{}()()()()()()()()()()()()()[][][][]][][][]]]][[[[]]]}{}()";
        Boolean testMethod = BrackValidate.multiBracketValidator(test);
        assertFalse(testMethod);
    }

}