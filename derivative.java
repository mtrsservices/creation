public double derivative(double x, double[] b, int bIndex) {
    double[] bCopy = b.clone();
    bCopy[bIndex] += alpha;
    double y1 = findY(x, bCopy);
    bCopy = b.clone();
    bCopy[bIndex] -= alpha;
    double y2 = findY(x, bCopy);
    return (y1 - y2) / (2 * alpha);
};