package com.aspose.slides.internal.c9b;

import com.aspose.slides.internal.x4g.k7;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class l6 {
   public static n5 n5(Shape var0) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof n5) {
         return (n5)var0;
      } else {
         return var0 instanceof com.aspose.slides.internal.x4g.s7 ? ((com.aspose.slides.internal.x4g.s7)var0).l6() : new n5(var0);
      }
   }

   public static GeneralPath n5(n5 var0) {
      return var0.y4();
   }

   public static com.aspose.slides.internal.x4g.s7 l6(Shape var0) {
      n5 var1 = n5(var0);
      k7 var2 = new k7(var1);
      return new com.aspose.slides.internal.x4g.s7(var2.n5(), var2.l6());
   }

   public static Shape k5(Shape var0) {
      if (var0 instanceof n5) {
         return n5((n5)var0);
      } else {
         return var0 instanceof com.aspose.slides.internal.x4g.s7 ? n5(((com.aspose.slides.internal.x4g.s7)var0).l6()) : var0;
      }
   }
}
