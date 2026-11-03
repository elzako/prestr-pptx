package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class j5 extends e5 {
   public static final j5 n5 = new j5(0.0, "mpt", 1.0F);
   private final int l6;

   private j5(double var1, String var3, float var4) {
      this.l6 = l6(var1, var3, var4);
   }

   public static j5 n5(double var0, String var2, float var3) {
      return var0 == 0.0 ? n5 : new j5(var0, var2, var3);
   }

   public static j5 n5(double var0, String var2) {
      return n5(var0, var2, 1.0F);
   }

   public static j5 n5(double var0) {
      return n5(var0, "mpt", 1.0F);
   }

   private static int l6(double var0, String var2, float var3) {
      if (d1.a6(var2, "px")) {
         var0 *= var3 * 1000.0F;
      } else if (d1.a6("in", var2)) {
         var0 *= 72000.0;
      } else if (d1.a6("cm", var2)) {
         var0 *= 28346.4567;
      } else if (d1.a6("mm", var2)) {
         var0 *= 2834.64567;
      } else if (d1.a6("pt", var2)) {
         var0 *= 1000.0;
      } else if (d1.a6("pc", var2)) {
         var0 *= 12000.0;
      } else if (!d1.a6("mpt", var2)) {
         var0 = 0.0;
      }

      return com.aspose.slides.internal.v6g.k5.u3(var0, 14);
   }

   @Override
   public int u3() {
      return this.l6;
   }

   @Override
   public int l6(com.aspose.slides.internal.f2.u9 var1) {
      return this.l6;
   }

   @Override
   public double n5() {
      return this.l6;
   }

   @Override
   public double n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.l6;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{com.aspose.slides.ms.System.a3.l6(this.l6), "mpt"});
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      j5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, j5.class);
      return var2 != null && var2.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return this.l6;
   }
}
