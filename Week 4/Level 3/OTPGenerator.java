import java.util.Arrays;

public class OTPGenerator {

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Unique OTPs: " + areUnique(otps));
        for (int otp : otps) System.out.println("OTP: " + otp);
    }

    static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }
}
