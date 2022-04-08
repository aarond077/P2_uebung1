import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getMatrikelnummer() {
        Student stan = new Student(123456, "Stan", "Johnson");
        Student phil = new Student(123456, "Phil", "Jackson");
        assertEquals(stan.getMatrikelnummer(), phil.getMatrikelnummer());

    }

    @Test
    void testEquals() {
        Student stan = new Student(123456, "Stan", "Johnson");
        Student stan2 = new Student(123456, "Stan", "Johnson");
        assertTrue(stan.equals(stan2));
    }
}