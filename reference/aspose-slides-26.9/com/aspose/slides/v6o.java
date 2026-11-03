package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class v6o {
   public static <T extends i8f> String[] n5(IGenericEnumerable<T> var0, int var1, boolean var2) {
      String[] var3 = new String[var1];
      int[] var4 = new int[10];
      i8f[] var5 = new i8f[10];
      i8f var6 = null;
      int var7 = 0;
      IGenericEnumerator var8 = var0.iterator();

      try {
         while (var8.hasNext()) {
            i8f var9 = (i8f)var8.next();
            t4t var10 = var9.l6();
            String var11;
            if (!n5(var9)) {
               var11 = null;
               if (var10.n5().getType() == 0) {
                  var5[var10.l6()] = null;
               }
            } else {
               switch (var10.n5().getType()) {
                  case 1:
                     String var16 = var10.n5().l6();
                     if (var2 && var16.length() > 1 && !com.aspose.slides.ms.System.t9.a6(var16.charAt(0))) {
                        var11 = com.aspose.slides.ms.System.d1.n5(var16.charAt(0), 1);
                        break;
                     }

                     var11 = var16;
                     break;
                  case 2:
                     i8f var12 = var5[var10.l6()];
                     if (var12 != null
                        && n5(var12)
                        && (var6 == null || var10.l6() <= var6.l6().l6())
                        && var12.l6().n5().n5()
                        && 2 == var12.l6().n5().getType()
                        && var10.n5().getNumberedBulletStyle() == var12.l6().n5().getNumberedBulletStyle()
                        && var10.n5().getNumberedBulletStartWith() == var12.l6().n5().getNumberedBulletStartWith()) {
                        var4[var10.l6()]++;
                     } else {
                        var4[var10.l6()] = var10.n5().getNumberedBulletStartWith();
                     }

                     com.aspose.slides.internal.l7h.a5 var13 = new com.aspose.slides.internal.l7h.a5();
                     x7h$n5 var14 = x7h.k5();
                     byte var15 = var10.n5().getNumberedBulletStyle();
                     if (var15 < 0) {
                        var15 = 3;
                     }

                     if (var15 < x7h.l6().length) {
                        var14 = x7h.l6()[var15];
                     }

                     if (var15 < x7h.n5().length) {
                        var13.n5(x7h.n5()[var15],new Object[]{ var14.n5(var4[var10.l6()])});
                     } else {
                        var13.n5(var14.n5(var4[var10.l6()]));
                     }

                     var11 = var13.toString();
                     break;
                  case 3:
                  default:
                     var11 = null;
               }

               var5[var10.l6()] = var9;
            }

            var6 = var9;
            var3[var7] = var11;
            var7++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      return var3;
   }

   public static boolean n5(i8f var0) {
      if (var0.l6().n5().getType() <= 0) {
         return false;
      }

      if (var0.n5()) {
         return true;
      }

      IGenericEnumerator var1 = var0.k5().iterator();

      try {
         while (var1.hasNext()) {
            f1b var2 = (f1b)var1.next();
            m4i var3 = com.aspose.slides.internal.v6g.k5.n5(var2, m4i.class);
            if (!com.aspose.slides.ms.System.d1.n5(var2.n5()) || var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3.k5, MathPortion.class)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }
}
