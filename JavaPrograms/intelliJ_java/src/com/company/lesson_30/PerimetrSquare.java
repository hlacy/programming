package com.company.lesson_30;

public class PerimetrSquare {
    public void getPerimetr(String str) throws PerimetrExeption {
        Square square = new Square();

        try {
            double side = Double.parseDouble(str);
            square.setSide(0);
        } catch (NumberFormatException e) {
            throw new PerimetrExeption("String is incorrect", e);
        } catch (PerimetrExeption ex) {
            System.err.println(ex.getMessage());
        }
    }
}
