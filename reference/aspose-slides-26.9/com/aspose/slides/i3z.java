package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

class i3z {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("prstDash", "custDash", "round", "bevel", "miter");

   public static void n5(ILineFormat var0, com.aspose.slides.internal.k4y.r5w var1) {
      if (var1 != null) {
         r9x.n5(var0.getFillFormat(), var1.h0());
         com.aspose.slides.internal.k4y.g7 var2 = var1.c8();
         if (var2 != null) {
            switch (n5.n5(var2.n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.f3l var3 = (com.aspose.slides.internal.k4y.f3l)var2.l6();
                  var0.setDashStyle(var3.n5());
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.e5a var4 = (com.aspose.slides.internal.k4y.e5a)var2.l6();
                  var0.setDashStyle((byte)11);
                  List var5 = new List();

                  for (com.aspose.slides.internal.k4y.t4r var9 : var4.l6()) {
                     if (var9.n5() != 0.0F && var9.l6() != 0.0F) {
                        var5.addItem(var9.n5() / 100.0F);
                        var5.addItem(var9.l6() / 100.0F);
                     }
                  }

                  var0.setCustomDashPattern(com.aspose.slides.internal.n8e.v4.a6(var5));
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var2.n5(), "\""}));
            }
         } else {
            var0.setDashStyle((byte)-1);
         }

         var0.setWidth(var1.k5());
         var0.setCapStyle(var1.u3());
         var0.setStyle(var1.a6());
         var0.setAlignment(var1.u9());
         com.aspose.slides.internal.k4y.g7 var10 = var1.t2();
         if (var10 != null) {
            switch (n5.n5(var10.n5())) {
               case 2:
                  var0.setJoinStyle((byte)0);
                  break;
               case 3:
                  var0.setJoinStyle((byte)1);
                  break;
               case 4:
                  com.aspose.slides.internal.k4y.w4w var11 = (com.aspose.slides.internal.k4y.w4w)var10.l6();
                  var0.setJoinStyle((byte)2);
                  var0.setMiterLimit(var11.n5() / 100.0F);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var10.n5(), "\""}));
            }
         } else {
            var0.setJoinStyle((byte)-1);
         }

         if (var1.s7() != null) {
            var0.setBeginArrowheadStyle(var1.s7().n5());
            var0.setBeginArrowheadWidth(var1.s7().l6());
            var0.setBeginArrowheadLength(var1.s7().k5());
         }

         if (var1.x8() != null) {
            var0.setEndArrowheadStyle(var1.x8().n5());
            var0.setEndArrowheadWidth(var1.x8().l6());
            var0.setEndArrowheadLength(var1.x8().k5());
         }

         h8v.n5(var0.getSketchFormat(), var1.n3());
      }
   }

   public static void n5(ILineFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.r5w> var1) {
      n5(var0, var1, false);
   }

   public static void n5(ILineFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.r5w> var1, boolean var2) {
      if (var0 != null && (var2 || !var0.isFormatNotDefined())) {
         l6(var0, (com.aspose.slides.internal.k4y.r5w)var1.invoke());
      }
   }

   public static void l6(ILineFormat var0, com.aspose.slides.internal.k4y.r5w var1) {
      n5(var0, var1, false);
   }

   public static void n5(ILineFormat var0, com.aspose.slides.internal.k4y.r5w var1, boolean var2) {
      if (var0 != null && (var2 || !var0.isFormatNotDefined())) {
         r9x.n5(var0.getFillFormat(), new i3z$1(var1));
         if (var0.getDashStyle() != -1) {
            if (var0.getDashStyle() != 11) {
               com.aspose.slides.internal.k4y.f3l var3 = (com.aspose.slides.internal.k4y.f3l)var1.n5("prstDash").l6();
               var3.n5(var0.getDashStyle());
            } else {
               com.aspose.slides.internal.k4y.e5a var7 = (com.aspose.slides.internal.k4y.e5a)var1.n5("custDash").l6();
               float[] var4 = var0.getCustomDashPattern();
               if (var4 != null) {
                  if ((var4.length & 1) == 1) {
                     for (int var5 = 0; var5 < var4.length * 2; var5 += 2) {
                        com.aspose.slides.internal.k4y.t4r var6 = var7.n5();
                        var6.n5(var4[var5 % var4.length] * 100.0F);
                        var6.l6(var4[(var5 + 1) % var4.length] * 100.0F);
                     }
                  } else {
                     for (int var11 = 0; var11 < var4.length; var11 += 2) {
                        com.aspose.slides.internal.k4y.t4r var12 = var7.n5();
                        var12.n5(var4[var11] * 100.0F);
                        var12.l6(var4[var11 + 1] * 100.0F);
                     }
                  }
               }
            }
         }

         var1.n5(var0.getWidth());
         var1.n5(var0.getCapStyle());
         var1.l6(var0.getStyle());
         var1.k5(var0.getAlignment());
         switch (var0.getJoinStyle()) {
            case -1:
            default:
               break;
            case 0:
               var1.k5("round");
               break;
            case 1:
               var1.k5("bevel");
               break;
            case 2:
               com.aspose.slides.internal.k4y.w4w var8 = (com.aspose.slides.internal.k4y.w4w)var1.k5("miter").l6();
               var8.n5(var0.getMiterLimit() * 100.0F);
         }

         if (var0.getBeginArrowheadStyle() != -1) {
            com.aspose.slides.internal.k4y.v9e var9 = var1.n5();
            var9.n5(var0.getBeginArrowheadStyle());
            var9.l6(var0.getBeginArrowheadWidth());
            var9.k5(var0.getBeginArrowheadLength());
         }

         if (var0.getEndArrowheadStyle() != -1) {
            com.aspose.slides.internal.k4y.v9e var10 = var1.l6();
            var10.n5(var0.getEndArrowheadStyle());
            var10.l6(var0.getEndArrowheadWidth());
            var10.k5(var0.getEndArrowheadLength());
         }

         h8v.n5(var0.getSketchFormat(), var1);
      }
   }
}
