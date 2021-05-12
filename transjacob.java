public double[][] transjacob(double[][] JArray, double[][] res) throws NoSquareException {
    Matrix r = new Matrix(res); // r
    Matrix J = new Matrix(JArray); // J
    Matrix JT = MatrixMathematics.transpose(J); // JT
    Matrix JTJ = MatrixMathematics.multiply(JT, J); // JT * J
    Matrix JTJ_1 = MatrixMathematics.inverse(JTJ); // (JT * J)^-1
    Matrix JTJ_1JT = MatrixMathematics.multiply(JTJ_1, JT); // (JT * J)^-1 * JT
    Matrix JTJ_1JTr = MatrixMathematics.multiply(JTJ_1JT, r); // (JT * J)^-1 * JT * r
    return JTJ_1JTr.getValues();};
