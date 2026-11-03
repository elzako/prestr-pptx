package com.aspose.slides.internal.y4u;

class y1$n5 {
   private double[] n5;

   public y1$n5(double[] var1) {
      this.n5 = com.aspose.slides.internal.r1x.k5.n5(var1);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      } else if (obj != null && com.aspose.slides.ms.System.j8.n5(this) == com.aspose.slides.ms.System.j8.n5(obj)) {
         y1$n5 var2 = (y1$n5)obj;
         return n5(this.n5, var2.n5);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return n5(this.n5);
   }

   public static int n5(double[] var0) {
      if (var0 == null) {
         return 0;
      }

      int var1 = 1;

      for (int var2 = 0; var2 < var0.length; var2++) {
         double var3 = var0[var2];
         var1 = 31 * var1 + com.aspose.slides.ms.System.d2.n5(var3);
      }

      return var1;
   }

   public static boolean n5(double[] var0, double[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null && var0.length == var1.length) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (com.aspose.slides.ms.System.d2.n5(var0[var2]) != com.aspose.slides.ms.System.d2.n5(var1[var2])) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
