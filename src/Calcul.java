public class Calcul {

    int res = 0;

    public int addition(int premnbr, int secondnbr) {
        res = premnbr + secondnbr;
        return res;
    }

    public int soustraction(int premnbr, int secondnbr) {
        res = premnbr - secondnbr;
        return res;
    }

    public int division(int premnbr, int secondnbr) {
        res = premnbr / secondnbr;
        return res;
    }

    public int multiplication(int premnbr, int secondnbr) {

        res = premnbr * secondnbr;

        return res;
    }

    public int rajoutadd(int res, int rajout) {
        res += rajout;
        return this.res = res;
    }

    public int rajoutsous(int res, int rajout) {
        res -= rajout;
        return this.res = res;
    }

    public int rajoutdiv(int res, int rajout) {
        res /= rajout;
        return this.res = res;
    }

    public int rajoutmult(int res, int rajout) {
        res *= rajout;
        return this.res = res;
    }

    public int getRes() {
        return this.res;
    }


}
