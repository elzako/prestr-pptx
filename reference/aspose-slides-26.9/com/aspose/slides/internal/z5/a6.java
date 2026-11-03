package com.aspose.slides.internal.z5;

import com.aspose.slides.ms.System.d1;

public class a6 {
   private float n5;
   private int l6;
   private static final com.aspose.slides.internal.x7n.l6 k5 = new com.aspose.slides.internal.x7n.l6("en-US");

   public a6(float var1, int var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final float l6() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5(k5, "{0}{1}", this.n5, l6(this.n5()));
   }

   public static String l6(int var0) {
      switch (var0) {
         case 0:
         default:
            return "px";
         case 1:
            return "cm";
         case 2:
            return "mm";
         case 3:
            return "in";
         case 4:
            return "pt";
      }
   }
}
