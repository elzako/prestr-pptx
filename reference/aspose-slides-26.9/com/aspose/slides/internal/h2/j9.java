package com.aspose.slides.internal.h2;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

public class j9 extends e5 {
   private double n5;
   private com.aspose.slides.internal.e5.t9 l6;

   public j9(double var1, com.aspose.slides.internal.e5.t9 var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public final double e2() {
      return this.n5;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public double n5() {
      throw new NotSupportedException("Must call getNumericValue with PercentBaseContext");
   }

   @Override
   public double n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.n5 * var1.n5(11, this.l6);
   }

   @Override
   public int u3() {
      throw new NotSupportedException("Must call getValue with PercentBaseContext");
   }

   @Override
   public int l6(com.aspose.slides.internal.f2.u9 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5 * var1.n5(11, this.l6), 14);
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{com.aspose.slides.ms.System.d2.u9(this.n5), " table-column-units"});
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + com.aspose.slides.internal.v3.u3.n5(this.l6);
      return 31 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      j9 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, j9.class);
      return var2 == null ? false : com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6) && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }
}
