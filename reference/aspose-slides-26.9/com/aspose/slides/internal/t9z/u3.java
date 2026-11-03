package com.aspose.slides.internal.t9z;

import java.awt.Shape;
import java.awt.geom.PathIterator;
import java.util.Iterator;

public class u3 {
   public static void n5(com.aspose.slides.internal.v9l.k5 var0, k5 var1) {
      n5(var0.u9(), var1);
   }

   public static void l6(com.aspose.slides.internal.v9l.k5 var0, k5 var1) {
      n5(var0.h0(), var1);
   }

   private static void n5(Iterator<com.aspose.slides.internal.v9l.l6> var0, k5 var1) {
      while (var0.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var2 = (com.aspose.slides.internal.v9l.l6)var0.next();
         var2.n5(var1);
      }

      var1.l6();
   }

   public static void n5(Shape var0, k5 var1) {
      if (var0 != null) {
         PathIterator var2 = var0.getPathIterator(null);
         n5(var2, var1);
      }
   }

   public static void n5(PathIterator var0, k5 var1) {
      float[] var2 = new float[6];

      while (!var0.isDone()) {
         switch (var0.currentSegment(var2)) {
            case 0:
               var1.n5(var2[0], var2[1]);
               break;
            case 1:
               var1.l6(var2[0], var2[1]);
               break;
            case 2:
               var1.n5(var2[0], var2[1], var2[2], var2[3]);
               break;
            case 3:
               var1.n5(var2[0], var2[1], var2[2], var2[3], var2[4], var2[5]);
               break;
            case 4:
               var1.n5();
         }

         var0.next();
      }

      var1.l6();
   }
}
