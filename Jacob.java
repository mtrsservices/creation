public double[][] jacob(double[] b, double[][] x, int numberOfObservations) {
    int numberOfVariables = b.length;
    double[][] jc = new double[numberOfObservations][numberOfVariables];

    for (int i = 0; i < numberOfObservations; i++) {
        for (int j = 0; j < numberOfVariables; j++) {
            jc[i][j] = derivative(x[i][0], b, j);
        }
    }
    return jc;
};