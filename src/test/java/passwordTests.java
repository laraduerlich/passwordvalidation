import org.example.PasswordChecks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class passwordTests {
    @Test
    void checkLength_ExpectTrue_WhenMin8Letters() {
        // GIVEN
        String password = "password";
        // WHEN
        boolean length = PasswordChecks.checkLength(password);
        // THEN
        Assertions.assertTrue(length);
    }

    @Test
    void checkDigits_ExpectTrue_WhenDigits() {
        // GIVEN
        String password = "password123";
        // WHEN
        boolean digits = PasswordChecks.checkDigits(password);
        // THEN
        Assertions.assertTrue(digits);
    }

    @Test
    void checkUpperAndLower_ExpectTrue_WhenUpperAndLower() {
        // GIVEN
        String password = "Password123";
        // WHEN
        boolean UpperLower = PasswordChecks.checkUpperAndLower(password);
        // THEN
        Assertions.assertTrue(UpperLower);
    }

    @Test
    void checkWeak_ExpectTrue_WhenWeak() {
        // GIVEN
        String password = "Password";
        // WHEN
        boolean Notweak = PasswordChecks.checkWeak(password);
        // THEN
        Assertions.assertTrue(Notweak);
    }

    @Test
    void checkSpecialCharacters_ExpectTrue_WhenSpecialCharacters() {
        // GIVEN
        String password = "Password123?";
        // WHEN
        boolean special = PasswordChecks.checkSpecialCharacters(password);
        // THEN
        Assertions.assertTrue(special);
    }
}
