package hr.fer.zemris.linearna;

/**
 * Provides some generic methods for vectors.
 */
public interface IVector {

    /**
     * @param index position.
     * @return vector's value at position <i>index</i>.
     * @throws IllegalArgumentException if provided <i>index</i> is out of bounds.
     */
    double get(int index);

    /**
     * Sets provided <i>value</i> at provided <i>index</i>.
     *
     * @param index position.
     * @param value value.
     * @return modified vector.
     * @throws IllegalArgumentException if provided <i>index</i> is out of bounds.
     */
    IVector set(int index, double value);

    /**
     * @return vector's dimension.
     */
    int getDimension();

    /**
     * Copies elements of <b>this</b> vector into a new one.
     *
     * @return copied vector.
     */
    IVector copy();

    /**
     * Copies <i>n</i> number of components from <b>this</b> vector. If <i>n</i> is higher than
     * vector's dimension, then last <i>n-dimension</i> elements will be set to 0.
     *
     * @param n number of components.
     * @return copied vector.
     * @throws IllegalArgumentException if provided <i>n</i> is less than 1.
     */
    IVector copyPart(int n);

    /**
     * Creates a new <i>n</i> dimensional null-vector.
     *
     * @param n number of components.
     * @return new null-vector.
     * @throws IllegalArgumentException if provided <i>n</i> is less than 1.
     */
    IVector newInstance(int n);

    /**
     * Adds <b>this</b> vector to <i>other</i> vector.
     *
     * @param other vector.
     * @return modified <b>this</b> vector.
     */
    IVector add(IVector other);

    /**
     * Adds <b>this</b> vector to <i>other</i> vector.
     *
     * @param other vector.
     * @return new vector as a result.
     */
    IVector nAdd(IVector other);

    /**
     * Subtracts <b>this</b> vector from <i>other</i> vector.
     *
     * @param other vector.
     * @return modified <b>this</b> vector.
     */
    IVector sub(IVector other);

    /**
     * Subtracts <b>this</b> vector from <i>other</i> vector.
     *
     * @param other vector.
     * @return new vector as a result.
     */
    IVector nSub(IVector other);

    /**
     * Performs scalar multiplication of <b>this</b> vector with provided <i>scalar</i>.
     *
     * @param scalar scalar.
     * @return modified <b>this</b> vector.
     */
    IVector scalarMultiply(double scalar);

    /**
     * Performs scalar multiplication of <b>this</b> vector with provided <i>scalar</i>.
     *
     * @param scalar scalar.
     * @return new vector as a result.
     */
    IVector nScalarMultiply(double scalar);

    /**
     * @return <b>this</b> vector's norm.
     */
    double norm();

    /**
     * Normalizes <b>this</b> vector.
     *
     * @return modified <b>this</b> vector.
     */
    IVector normalize();

    /**
     * Normalizes <b>this</b> vector.
     *
     * @return new vector as a result.
     */
    IVector nNormalize();

    /**
     * Calculates cosinus angle between <b>this</b> vector and <i>other</i> vector.
     *
     * @param other vector.
     * @return cosinus angle.
     */
    double cosine(IVector other);

    /**
     * Performs scalar product between <b>this</b> vector and <i>other</i> vector.
     *
     * @param other vector.
     * @return scalar product.
     */
    double scalarProduct(IVector other);

    /**
     * Performs vector product between <b>this</b> vector and <i>other</i> vector.
     *
     * @param other vector.
     * @return new vector as a result.
     */
    IVector nVectorProduct(IVector other);

    IVector nFromHomogeneous();

    /**
     * @return <b>this</b> vector as an array of doubles.
     */
    double[] toArray();

}
