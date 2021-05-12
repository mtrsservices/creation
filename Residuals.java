public double[][] calculateResiduals(double[][] x, double[] y, double[] b) {
     double[][] res = new double[y.length][1];

     for (int i = 0; i < res.length; i++) {
         res[i][0] = findY(x[i][0], b) - y[i];
     }
     return res;
}
