package ru.job4j.calculator;

/**
 * Простой калькулятор
 * @author Alexander Tsakharias (alexandertsakharias@gmail.com)
 * @since 19.05.2019
 * @version 1
 */
public class Calculator {

    /**
     *
     * @param first
     * @param second
     * @return first + second
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     *
     * @param first
     * @param second
     * @return first - second
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     *
     * @param first
     * @param second
     * @return first / second
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     *
     * @param first
     * @param second
     * @return first * second
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}