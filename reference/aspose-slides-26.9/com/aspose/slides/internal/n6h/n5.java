package com.aspose.slides.internal.n6h;

import java.util.HashMap;
import java.util.Map;

public class n5 extends com.aspose.slides.internal.g7i.n5 {
   private Map<n5$n5, double[]> n5 = new HashMap<>();

   @Override
   public void n5(float[] var1, float[] var2) {
      super.n5(var1, var2);
   }

   @Override
   public void n5(double[] var1, double[] var2) {
      n5$n5 var3 = new n5$n5(var1, null);
      double[] var4 = this.n5.get(var3);
      if (var4 == null) {
         super.n5(var1, var2);
         double[] var5 = new double[var2.length];
         System.arraycopy(var2, 0, var5, 0, var2.length);
         this.n5.put(var3, var5);
      } else {
         System.arraycopy(var4, 0, var2, 0, var4.length);
      }
   }
}
