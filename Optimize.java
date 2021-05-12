public double[] optimise(double[][] x, double[] y, double[] b) throws NoSquareException {
        int maxIteration = 1000;
        double oldError = 100;
        double precision = 1e-6;
        double[] b2 = b.clone();
        double gamma = .01;
        for (int i = 0; i < maxIteration; i++) {
            double[][] res = calculateResiduals(x, y, b2);
            double error = calculateError(res);
            System.out.println("Iteration : " + i + ", Error-diff: " + 
                    (Math.abs(oldError - error)) + ", b = "+ Arrays.toString(b2));
            if (Math.abs(oldError - error) <= precision) {
                break;
            } 
            oldError = error;
            double[][] jacobs = jacob(b2, x, y.length);
            double[][] values = transjacob(jacobs, res);
            IntStream.range(0, values.length).forEach(j -> b2[j] = b2[j] - gamma * values[j][0]);
        }
        return b2;

    };