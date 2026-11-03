package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;

final class s3 {
   private static Boolean n5(s3$n5 var0, int var1, com.aspose.slides.internal.v6g.a6<Integer> var2, com.aspose.slides.internal.v6g.a6<Integer> var3) {
      int var4 = (Integer)var2.n5;
      var2.n5 = -1;

      for (var3.n5 = -1; var4 < var0.n5() + var0.k5(); var4++) {
         boolean var5 = s3$n5.n5(var0).n5(var4, var1);
         if ((Integer)var2.n5 == -1) {
            if (var5) {
               com.aspose.slides.internal.v6g.a6 var6 = var2;
               var6.n5 = (Integer)var6.n5 + var4 + 1;
            }
         } else if (!var5) {
            var3.n5 = var4 - (Integer)var2.n5;
            return true;
         }
      }

      if ((Integer)var2.n5 != -1) {
         var3.n5 = var4 - (Integer)var2.n5;
         return true;
      } else {
         return false;
      }
   }

   private static int n5(s3$n5 var0, y1[] var1, int var2) {
      HashMap var3 = new HashMap();
      y2 var4 = new y2(-4194304, 0, 8388608, 0);
      com.aspose.slides.internal.v6g.a6 var5 = new com.aspose.slides.internal.v6g.a6<>(0);
      com.aspose.slides.internal.v6g.a6 var6 = new com.aspose.slides.internal.v6g.a6<>(0);
      int var7 = 0;

      for (int var8 = var0.l6(); var8 < var0.l6() + var0.u3(); var8++) {
         var5.n5 = var0.n5();

         while (n5(var0, var8, var5, var6)) {
            String var9 = var5.n5 + ":" + var6.n5 + ":" + var8;
            if (var3.containsKey(var9)) {
               int var10 = (Integer)var3.get(var9);
               if (var1 != null && var10 >= 0) {
                  var1[var10].n5(var1[var10].k5() + 1.0F);
                  var3.remove(var9);
                  var3.put((int)var1[var10].x8() + ":" + (int)var1[var10].s7() + ":" + (int)(var1[var10].n3() + var1[var10].k5()), var10);
               }
            } else {
               var4.k5((Integer)var5.n5);
               var4.u3(var8);
               var4.l6((Integer)var6.n5);
               var4.n5(1);
               if (var1 != null && var7 < var2) {
                  var1[var7].k5(var4.s7());
                  var1[var7].u3(var4.x8());
                  var1[var7].l6(var4.t2());
                  var1[var7].n5(var4.l6());
                  var3.put(var4.s7() + ":" + var4.t2() + ":" + (var4.x8() + var4.l6()), var7);
               }

               var7++;
            }

            com.aspose.slides.internal.v6g.a6 var11 = var5;
            var11.n5 = (Integer)var11.n5 + (Integer)var6.n5 + 1;
         }
      }

      return var7;
   }

   private static boolean n5(a0 var0, com.aspose.slides.internal.v6g.a6<Integer> var1) {
      if (var0 != null && var1.n5 != null) {
         com.aspose.slides.internal.c9b.n5 var2 = new com.aspose.slides.internal.c9b.n5();
         var2.n5(var0.n5());
         if (!s3$n5.n5(var2)) {
            var1.n5 = 0;
         } else {
            s3$n5 var3 = new s3$n5(var0.l6());
            var1.n5 = n5(var3, null, -1);
         }

         return true;
      } else {
         throw new ArgumentException("count or region");
      }
   }

   private static boolean n5(a0 var0, y1[] var1, com.aspose.slides.internal.v6g.a6<Integer> var2) {
      if (var0 != null && var1 != null && var2 != null) {
         s3$n5 var3 = new s3$n5(var0.l6());
         var2.n5 = n5(var3, var1, (Integer)var2.n5);
         return true;
      } else {
         throw new ArgumentException("region or rects or count");
      }
   }

   protected static y1[] n5(a0 var0) {
      com.aspose.slides.internal.v6g.a6 var1 = new com.aspose.slides.internal.v6g.a6<>(0);
      if (var0 == null) {
         return new y1[0];
      }

      Rectangle2D var2 = var0.getBounds2D();
      if (var0.contains(var2)) {
         return new y1[]{new y1((float)var2.getX(), (float)var2.getY(), (float)var2.getWidth(), (float)var2.getHeight())};
      }

      if (!n5(var0, var1)) {
         throw new RuntimeException("unknown error in gdiGetRegionScansCount");
      }

      if ((Integer)var1.n5 == 0) {
         Rectangle2D var3 = var0.getBounds2D();
         double var4 = var3.getWidth();
         double var6 = var3.getHeight();
         if (var3.getX() < 0.0) {
            var4 += var3.getX();
         }

         if (var3.getY() < 0.0) {
            var6 += var3.getY();
         }

         if (var4 >= 1.0 && var6 >= 1.0) {
            return new y1[]{new y1((float)var3.getX(), (float)var3.getY(), (float)var3.getWidth(), (float)var3.getHeight())};
         }
      }

      y1[] var9 = new y1[(Integer)var1.n5];

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = y1.n5.y4();
      }

      if ((Integer)var1.n5 > 0 && !n5(var0, var9, var1)) {
         throw new RuntimeException("unknown error in gdiGetRegionScans");
      }

      y1[] var10 = var9;
      if ((Integer)var1.n5 < var9.length) {
         var10 = new y1[(Integer)var1.n5];
         System.arraycopy(var9, 0, var10, 0, (Integer)var1.n5);
      }

      return var10;
   }
}
