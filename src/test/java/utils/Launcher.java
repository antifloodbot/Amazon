package utils;

public class Launcher extends TestDataReader{
    public static void main(String[] args) {
        String expectedErrorMessage = TestDataReader.get("INVALID_PASSWORD_MESSAGE");
        System.out.println(expectedErrorMessage);
    }
}
