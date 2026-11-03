package com.aspose.slides.internal.b3;

import com.aspose.slides.ms.System.q1;

public class m1 {
   public static com.aspose.slides.internal.f2.u3 n5(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      return var0.k5() && var1.k5() ? n5(var0, var1, null) : new y2(1, var0, var1);
   }

   public static com.aspose.slides.internal.f2.u3 n5(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      if (var0.l6() != var1.l6()) {
         throw new z8("Can't subtract Numerics of different dimensions");
      } else {
         return n5(var0.n5(var2) + var1.n5(var2), var0.l6());
      }
   }

   public static com.aspose.slides.internal.f2.u3 l6(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      return var0.k5() && var1.k5() ? l6(var0, var1, null) : new y2(2, var0, var1);
   }

   public static com.aspose.slides.internal.f2.u3 l6(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      if (var0.l6() != var1.l6()) {
         throw new z8("Can't subtract Numerics of different dimensions");
      } else {
         return n5(var0.n5(var2) - var1.n5(var2), var0.l6());
      }
   }

   public static com.aspose.slides.internal.f2.u3 k5(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      return var0.k5() && var1.k5() ? k5(var0, var1, null) : new y2(3, var0, var1);
   }

   public static com.aspose.slides.internal.f2.u3 k5(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      return n5(var0.n5(var2) * var1.n5(var2), var0.l6() + var1.l6());
   }

   public static com.aspose.slides.internal.f2.u3 u3(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      return var0.k5() && var1.k5() ? u3(var0, var1, null) : new y2(4, var0, var1);
   }

   public static com.aspose.slides.internal.f2.u3 u3(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      return n5(var0.n5(var2) / var1.n5(var2), var0.l6() - var1.l6());
   }

   public static com.aspose.slides.internal.f2.u3 a6(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      return n5(var0.n5(var2) % var1.n5(var2), var0.l6());
   }

   public static com.aspose.slides.internal.f2.u3 n5(com.aspose.slides.internal.f2.u3 var0) {
      return var0.k5() ? n5(var0, (com.aspose.slides.internal.f2.u9)null) : new y2(7, var0);
   }

   public static com.aspose.slides.internal.f2.u3 n5(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u9 var1) {
      return n5(q1.n5(var0.n5(var1)), var0.l6());
   }

   public static com.aspose.slides.internal.f2.u3 l6(com.aspose.slides.internal.f2.u3 var0) {
      return var0.k5() ? l6(var0, (com.aspose.slides.internal.f2.u9)null) : new y2(6, var0);
   }

   public static com.aspose.slides.internal.f2.u3 l6(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u9 var1) {
      return n5(-var0.n5(var1), var0.l6());
   }

   public static com.aspose.slides.internal.f2.u3 a6(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      return var0.k5() && var1.k5() ? u9(var0, var1, null) : new y2(8, var0, var1);
   }

   public static com.aspose.slides.internal.f2.u3 u9(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      if (var0.l6() != var1.l6()) {
         throw new z8("Arguments to max() must have same dimensions");
      } else {
         return var0.n5(var2) > var1.n5(var2) ? var0 : var1;
      }
   }

   public static com.aspose.slides.internal.f2.u3 u9(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      return var0.k5() && var1.k5() ? h0(var0, var1, null) : new y2(9, var0, var1);
   }

   public static com.aspose.slides.internal.f2.u3 h0(
      com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1, com.aspose.slides.internal.f2.u9 var2
   ) {
      if (var0.l6() != var1.l6()) {
         throw new z8("Arguments to min() must have same dimensions");
      } else {
         return var0.n5(var2) <= var1.n5(var2) ? var0 : var1;
      }
   }

   private static com.aspose.slides.internal.f2.u3 n5(double var0, int var2) {
      return new k7(var0, var2);
   }
}
