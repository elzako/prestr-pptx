package com.aspose.slides.internal.s7k;

import java.util.Arrays;

class n5$n5 {
   public double[] n5;

   private n5$n5(double[] var1) {
      this.n5 = new double[var1.length];
      System.arraycopy(var1, 0, this.n5, 0, var1.length);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         n5$n5 var2 = (n5$n5)o;
         return Arrays.equals(this.n5, var2.n5);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.n5);
   }

   // Restored original synthetic constructor delegation: ([DLcom/aspose/slides/internal/s7k/l6;)V -> ([D)V
   n5$n5(double[] recoveredArg0, com.aspose.slides.internal.s7k.l6 recoveredArg1) {
      this(recoveredArg0);
   }
}
