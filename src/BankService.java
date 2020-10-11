public class BankService {

    int cashBack(int percent, int sum) {
        int limit = 10_000;
        int result = sum * percent / 100;
        if (result > limit) {
            return limit;
        }
        return result;
    }

    int deposit(int percent, int sum) {
        int limit = 10_000;
        int increase = sum * percent / 100;
        if (increase > limit) {
            return limit + sum;
        }
        int result = increase + sum;
        return result;

    }

}
