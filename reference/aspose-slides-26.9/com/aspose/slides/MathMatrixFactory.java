package com.aspose.slides;

public class MathMatrixFactory implements IMathMatrixFactory {
   @Override
   public final IMathMatrix createMathMatrix(int rowCount, int columnCount) {
      return new MathMatrix(rowCount, columnCount);
   }
}
