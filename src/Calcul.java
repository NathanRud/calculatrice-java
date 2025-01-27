public class Calcul {

    double res = 0;

    public void addition(double premnbr, double secondnbr) {
        res = premnbr + secondnbr;
    }

    public void soustraction(double premnbr, double secondnbr) {
        res = premnbr - secondnbr;

    }

    public void division(double premnbr, double secondnbr) {
        res = premnbr / secondnbr;

    }

    public void multiplication(double premnbr, double secondnbr) {

        res = premnbr * secondnbr;


    }

    public double rajoutadd(double res, double rajout) {
        res += rajout;
        return this.res = res;
    }

    public double rajoutsous(double res, double rajout) {
        res -= rajout;
        return this.res = res;
    }

    public double rajoutdiv(double res, double rajout) {
        res /= rajout;
        return this.res = res;
    }

    public double rajoutmult(double res, double rajout) {
        res *= rajout;
        return this.res = res;
    }

    public double getRes() {
        return this.res;
    }


}
