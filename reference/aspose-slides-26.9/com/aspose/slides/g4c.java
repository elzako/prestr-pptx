package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class g4c {
   public static void n5(ILineFormatEffectiveData var0, com.aspose.slides.internal.k4y.p3w var1, x0a var2) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormatEffectiveData");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      l6(var0, var1, var2);
   }

   private static void l6(ILineFormatEffectiveData var0, com.aspose.slides.internal.k4y.p3w var1, x0a var2) {
      if (var0.getFillFormat() != null && var0.getFillFormat().getFillType() != -1 && var0.getFillFormat().getFillType() != 0) {
         var1.l6(t2f.n5(com.aspose.slides.ms.System.d2.k5(var0.getWidth()) ? 0.0 : var0.getWidth()));
         if (var0.getFillFormat().getFillType() == 1) {
            var1.k5(t2f.n5(((z1a)var0.getFillFormat()).u3().o8()));
            if ((((z1a)var0.getFillFormat()).u3().s7() & 255) < 255) {
               var1.c8(
                  t2f.n5(
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((((z1a)var0.getFillFormat()).u3().s7() & 255) * 100 / 255.0F), 14)
                  )
               );
            }
         } else if (var0.getFillFormat().getFillType() == 2 && var0.getFillFormat().getGradientFormat().getGradientStops().size() > 0) {
            var1.k5(t2f.n5(((GradientStopEffectiveData)var0.getFillFormat().getGradientFormat().getGradientStops().get_Item(0)).n5().o8()));
            if ((((GradientStopEffectiveData)var0.getFillFormat().getGradientFormat().getGradientStops().get_Item(0)).n5().s7() & 255) < 255) {
               var1.c8(
                  t2f.n5(
                     com.aspose.slides.internal.v6g.k5.u3(
                        com.aspose.slides.ms.System.q1.u3(
                           (((GradientStopEffectiveData)var0.getFillFormat().getGradientFormat().getGradientStops().get_Item(0)).n5().s7() & 255) * 100
                              / 255.0F
                        ),
                        14
                     )
                  )
               );
            }
         }

         if (var0.getBeginArrowheadStyle() != 0 && var0.getBeginArrowheadStyle() != -1) {
            var1.u3(n5(var0.getBeginArrowheadStyle(), var0.getBeginArrowheadLength(), var0.getBeginArrowheadWidth(), var2));
            var1.u9(t2f.n5((1 + (1 << com.aspose.slides.ms.System.q1.n5(var0.getBeginArrowheadWidth()))) * var0.getWidth() * 1.2));
         }

         if (var0.getEndArrowheadStyle() != 0 && var0.getEndArrowheadStyle() != -1) {
            var1.a6(n5(var0.getEndArrowheadStyle(), var0.getEndArrowheadLength(), var0.getEndArrowheadWidth(), var2));
            var1.h0(t2f.n5((1 + (1 << com.aspose.slides.ms.System.q1.n5(var0.getEndArrowheadWidth()))) * var0.getWidth() * 1.2));
         }

         if (var0.getDashStyle() == 0) {
            var1.n5(3);
         } else if (var0.getDashStyle() != -1) {
            com.aspose.slides.internal.k4y.t1g var3 = var2.l6().l6();
            com.aspose.slides.internal.k4y.x2k var4 = (com.aspose.slides.internal.k4y.x2k)var3.u3().n5("stroke-dash").l6();
            var4.n5(com.aspose.slides.ms.System.d1.n5("Dashes_{0}", new Object[]{var3.u3().n5().size()}));
            var4.n5(1);
            var1.n5(var4.n5());
            var1.n5(2);
            n5(var0, var4);
         }
      } else {
         var1.n5(1);
      }
   }

   private static void n5(ILineFormatEffectiveData var0, com.aspose.slides.internal.k4y.x2k var1) {
      switch (var0.getDashStyle()) {
         case 1:
            var1.l6(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(3.0 * var0.getWidth()));
            var1.l6(1);
            break;
         case 2:
            var1.l6(t2f.n5(4.0 * var0.getWidth()));
            var1.u3(t2f.n5(3.0 * var0.getWidth()));
            var1.l6(1);
            break;
         case 3:
            var1.l6(t2f.n5(8.0 * var0.getWidth()));
            var1.u3(t2f.n5(3.0 * var0.getWidth()));
            var1.l6(1);
            break;
         case 4:
            var1.l6(t2f.n5(4.0 * var0.getWidth()));
            var1.k5(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(3.0 * var0.getWidth()));
            var1.l6(1);
            var1.k5(1);
            break;
         case 5:
            var1.l6(t2f.n5(8.0 * var0.getWidth()));
            var1.k5(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(3.0 * var0.getWidth()));
            var1.l6(1);
            var1.k5(1);
            break;
         case 6:
            var1.l6(t2f.n5(8.0 * var0.getWidth()));
            var1.k5(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(3.0 * var0.getWidth()));
            var1.l6(1);
            var1.k5(2);
            break;
         case 7:
            var1.l6(t2f.n5(3.0 * var0.getWidth()));
            var1.u3(t2f.n5(1.0 * var0.getWidth()));
            var1.l6(1);
            break;
         case 8:
            var1.l6(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(1.0 * var0.getWidth()));
            var1.l6(1);
            break;
         case 9:
            var1.l6(t2f.n5(3.0 * var0.getWidth()));
            var1.k5(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(1.0 * var0.getWidth()));
            var1.l6(1);
            var1.k5(1);
            break;
         case 10:
            var1.l6(t2f.n5(3.0 * var0.getWidth()));
            var1.k5(t2f.n5(1.0 * var0.getWidth()));
            var1.u3(t2f.n5(1.0 * var0.getWidth()));
            var1.l6(1);
            var1.k5(2);
            break;
         case 11:
            if (var0.getCustomDashPattern() != null && var0.getCustomDashPattern().length >= 2) {
               var1.u3(t2f.n5(var0.getCustomDashPattern()[1] * var0.getWidth()));
               byte var2 = 0;
               byte var3 = 1;
               var1.l6(0);
               var1.k5(0);
               var1.l6(t2f.n5(var0.getCustomDashPattern()[0] * var0.getWidth()));
               float var4 = var0.getCustomDashPattern()[0];

               while (var2 < var0.getCustomDashPattern().length - 1) {
                  if (var0.getCustomDashPattern()[var2] == var4 && var3 == 1) {
                     var1.l6(var1.l6() + 1);
                  } else if (var0.getCustomDashPattern()[var2] == var4 && var3 == 2) {
                     var1.k5(var1.u3() + 1);
                  } else {
                     if (var0.getCustomDashPattern()[var2] == var4 || var3 != 1) {
                        break;
                     }

                     var3 = 2;
                     var4 = var0.getCustomDashPattern()[var2];
                     var1.k5(t2f.n5(var0.getCustomDashPattern()[var2] * var0.getWidth()));
                     var1.k5(var1.u3() + 1);
                  }

                  var2 += 2;
               }
            }
      }
   }

   private static String n5(byte var0, byte var1, byte var2, x0a var3) {
      com.aspose.slides.internal.k4y.s1v var4 = l6(var0, var1, var2, var3);
      if (var4 == null) {
         throw new PptxReadException("LineArrowhead cannot be null.");
      } else {
         return var4.n5();
      }
   }

   private static com.aspose.slides.internal.k4y.s1v l6(byte var0, byte var1, byte var2, x0a var3) {
      if (var0 != -1 && var0 != 0) {
         com.aspose.slides.internal.k4y.t1g var4 = var3.l6().l6();
         if (var4 == null) {
            throw new InvalidOperationException();
         }

         Object[] var5 = t2f.n5("marker", var4.u3().n5());
         com.aspose.slides.internal.k4y.s1v[] var6 = new com.aspose.slides.internal.k4y.s1v[var5.length];

         for (int var7 = 0; var7 < var5.length; var7++) {
            var6[var7] = (com.aspose.slides.internal.k4y.s1v)var5[var7];
         }

         String var14 = c3.n5(var0, var1, var2);
         String var8 = c3.l6(var0, var1, var2);
         String var9 = com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ c3.n5(var0), var6.length});

         for (com.aspose.slides.internal.k4y.s1v var13 : var6) {
            if (com.aspose.slides.ms.System.d1.a6(var13.k5(), var14) && !com.aspose.slides.ms.System.d1.a6(var13.l6(), var8)) {
               return var13;
            }
         }

         com.aspose.slides.internal.k4y.s1v var15 = (com.aspose.slides.internal.k4y.s1v)var4.u3().n5("marker").l6();
         var15.k5(var14);
         var15.l6(var8);
         var15.n5(var9);
         return var15;
      } else {
         return null;
      }
   }
}
