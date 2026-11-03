package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;

abstract class s3 {
   private int n5 = 0;
   private int l6 = 0;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "l", "ctr", "r", "none", "b", "mid", "t", "fromB", "fromL", "fromR", "fromT"
   );

   public final int n5() {
      return this.n5;
   }

   protected final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   protected final void l6(int var1) {
      this.l6 = var1;
   }

   public static s3 n5(com.aspose.slides.internal.k4y.p5i var0) {
      switch (var0.n5()) {
         case 0:
            return new k7m(var0);
         case 1:
            return new a3p(var0);
         case 2:
            return new y4g(var0);
         case 3:
            return new o9d(var0);
         case 4:
            return new e8a(var0);
         case 5:
            return new y4t(var0);
         case 6:
            return new h5z(var0);
         case 7:
            return new s4b(var0);
         case 8:
            return new y1g(var0);
         case 9:
            return new o5t(var0);
         default:
            throw new ArgumentException("Unknown algorithm parameter", "element");
      }
   }

   protected static int n5(String var0) {
      switch (k5.n5(var0)) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 0;
         default:
            return 1;
      }
   }

   protected static int l6(String var0) {
      switch (k5.n5(var0)) {
         case 3:
            return 0;
         case 4:
            return 3;
         case 5:
            return 2;
         case 6:
            return 1;
         default:
            return 1;
      }
   }

   protected static int k5(String var0) {
      switch (k5.n5(var0)) {
         case 7:
            return 1;
         case 8:
            return 2;
         case 9:
            return 3;
         case 10:
            return 4;
         default:
            return 0;
      }
   }

   protected static double n5(String var0, double var1) {
      try {
         return com.aspose.slides.ms.System.Xml.f4.k7(var0);
      } catch (FormatException var4) {
         com.aspose.slides.internal.n8e.v4.n5(var4);
         return var1;
      }
   }
}
