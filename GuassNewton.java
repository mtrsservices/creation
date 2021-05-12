GaussNewton gaussNewton = new GaussNewton() {

    @Override
    public double findY(double x, double[] b) {
        // y = (x * a1) / (a2 + x)
        return (x * b[0]) / (b[1] + x);
    }
;