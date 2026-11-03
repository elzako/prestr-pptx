package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class t1 extends e5 {
   private double n5;
   private com.aspose.slides.internal.f2.a6 l6;

   public t1(double var1, com.aspose.slides.internal.f2.a6 var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public final double e2() {
      return this.n5 * 100.0;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public double n5() {
      return this.n5((com.aspose.slides.internal.f2.u9)null);
   }

   @Override
   public double n5(com.aspose.slides.internal.f2.u9 var1) {
      try {
         return this.n5 * this.l6.n5(var1);
      } catch (com.aspose.slides.internal.b3.z8 var3) {
         return 0.0;
      }
   }

   @Override
   public String j_() {
      return d1.n5(new String[]{com.aspose.slides.ms.System.d2.u9(this.n5 * 100.0), "%"});
   }

   @Override
   public int u3() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(), 14);
   }

   @Override
   public int l6(com.aspose.slides.internal.f2.u9 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5(var1), 14);
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(j8.n5(this).s7())
         .n5("[factor=")
         .n5(this.n5)
         .n5(",lbase=")
         .n5(this.l6)
         .n5("]");
      return var1.toString();
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
      return var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      t1 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, t1.class);
      return var2 == null ? false : com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5) && com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6);
   }
}
