package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class v7y {
   public static boolean n5(TextFrame var0) {
      if (var0.h0()) {
         return false;
      }

      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      IGenericEnumerator var5 = var0.getParagraphs().iterator();

      try {
         while (var5.hasNext()) {
            IParagraph var6 = (IParagraph)var5.next();
            if (var1) {
               break;
            }

            IGenericEnumerator var7 = var6.getPortions().iterator();

            try {
               while (var7.hasNext()) {
                  IPortion var8 = (IPortion)var7.next();
                  IEffectFormatEffectiveData var9 = var8.getPortionFormat().getEffective().getEffectFormat();
                  var1 = var1 || var9.getInnerShadowEffect() != null;
                  if (var9.getReflectionEffect() != null
                     && var9.getReflectionEffect().getScaleHorizontal() != 0.0
                     && var9.getReflectionEffect().getScaleVertical() != 0.0) {
                     var2 = true;
                  }

                  if (var1 && var2) {
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var1 || var2 || var3 || var4;
   }

   public static boolean n5(e3 var0, s5u var1, GeometryShape var2, TextFrame var3) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var0, r1c.class) && !var3.h0()) {
         e4c var4 = var2.z7().u9();
         d2k var5 = new d2k(var2.getX(), var2.getY());

         try {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            float var11 = 0.0F;
            IGenericEnumerator var12 = var3.getParagraphs().iterator();

            try {
               while (var12.hasNext()) {
                  IParagraph var13 = (IParagraph)var12.next();
                  if (var6) {
                     break;
                  }

                  IGenericEnumerator var14 = var13.getPortions().iterator();

                  try {
                     while (var14.hasNext()) {
                        IPortion var15 = (IPortion)var14.next();
                        IEffectFormatEffectiveData var16 = var15.getPortionFormat().getEffective().getEffectFormat();
                        var6 = var6 || var16.getInnerShadowEffect() != null;
                        if (var16.getReflectionEffect() != null
                           && var16.getReflectionEffect().getScaleHorizontal() != 0.0
                           && var16.getReflectionEffect().getScaleVertical() != 0.0) {
                           var7 = true;
                           var11 = com.aspose.slides.ms.System.q1.n5((float)(var11), (float)((float)var16.getReflectionEffect().getDistance()));
                        }

                        if (var6 && var7) {
                           break;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                        var14.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }

            if (var6 || var7 || var8 || var9) {
               h9z var92 = var3.s7().d2();
               if (var92.getTextVerticalType() == 0 && !com.aspose.slides.ms.System.d1.n5(var3.getText()) && var92.u9().n5() == 0 && var92.s7() == 0) {
                  s3z.l6(var3.u3);
                  if (var3.u3.k5().n5 > var2.getWidth() || var3.u3.k5().l6 > var2.getHeight()) {
                     double var19 = var3.u3.k5().n5 + var92.getMarginLeft() + var92.getMarginRight();
                     double var21 = var3.u3.k5().l6 + var92.getMarginTop() + var92.getMarginBottom();
                     var2.n5(com.aspose.slides.ms.System.q1.l6(var19, var2.getWidth()), com.aspose.slides.ms.System.q1.l6(var21, var2.getHeight()));
                     if (var92.getAnchoringType() == 2 && var21 > var4.l6) {
                        var2.setY(var2.getY() - (float)(var21 - var4.l6));
                     }

                     if (var92.getAnchoringType() == 1 && var21 > var4.l6) {
                        var2.setY(var2.getY() - (float)(var21 - var4.l6) / 2.0F);
                     }

                     if (var92.getCenterText() && var19 > var4.n5) {
                        var2.setX(var2.getX() - (float)(var19 - var4.n5) / 2.0F);
                     }
                  }
               }

               com.aspose.slides.internal.w0.c8 var93 = s3z.n5(var3.u3, var1);
               int var94 = com.aspose.slides.internal.v6g.k5.u3(var2.getWidth(), 13);
               int var95 = com.aspose.slides.internal.v6g.k5.u3(var2.getHeight(), 13);
               if (var7) {
                  var95 = 2 * var95 + com.aspose.slides.internal.v6g.k5.u3(3.0F * var11, 13);
               }

               if (var9) {
                  var95 += com.aspose.slides.internal.v6g.k5.u3(3.0F * var11, 13);
               }

               com.aspose.slides.internal.o9b.l6 var17 = new com.aspose.slides.internal.o9b.l6(var94, var95, 2498570);

               try {
                  var17.n5(96.0F, 96.0F);
                  com.aspose.slides.internal.o9b.z1 var18 = com.aspose.slides.internal.o9b.z1.n5(var17);

                  try {
                     var18.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
                  } finally {
                     if (var18 != null) {
                        var18.dispose();
                     }
                  }

                  r1c var23 = new r1c(var17, var17.e2(), var17.h0());

                  try {
                     var3.u3.n5(var23, var1);
                  } finally {
                     if (var23 != null) {
                        var23.dispose();
                     }
                  }

                  var0.k5(var93);

                  try {
                     var0.n5(var17, 0, 0, var94, var95);
                  } finally {
                     var0.z3();
                  }
               } finally {
                  if (var17 != null) {
                     var17.dispose();
                  }
               }

               return true;
            }
         } catch (RuntimeException var90) {
            com.aspose.slides.internal.n8e.v4.n5(var90);
         } finally {
            var2.k5(var4.u9());
            var2.n5(var5.u3());
         }

         return false;
      } else {
         return false;
      }
   }
}
