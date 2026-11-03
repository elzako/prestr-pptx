package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class u7n {
   static void n5(ILineFillFormat var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      com.aspose.slides.internal.k0r.w8 var3 = var2.a6() != null ? var2.a6().l6() : null;
      if (var3 == null) {
         var3 = new com.aspose.slides.internal.k0r.w8();
      }

      int var4 = var2.u3().t2();
      com.aspose.slides.internal.k0r.f5 var5 = (com.aspose.slides.internal.k0r.f5)var3.n5(383);
      com.aspose.slides.internal.k0r.a7 var6 = (com.aspose.slides.internal.k0r.a7)var3.n5(511);
      com.aspose.slides.internal.k0r.q5 var7 = null;
      if (var1.z1() != null) {
         var7 = (com.aspose.slides.internal.k0r.q5)var1.z1().k5();
      }

      if (var6 == null && var7 != null) {
         var6 = (com.aspose.slides.internal.k0r.a7)var7.a6().l6().n5(511);
      }

      if (var6 == null) {
         var6 = var5 == null && var4 != 75 ? new com.aspose.slides.internal.k0r.a7(1572872L) : new com.aspose.slides.internal.k0r.a7();
      }

      if (var3.n5(448) != null || var3.n5(449) != null) {
         u0b.n5((ColorFormat)var0.getSolidFillColor(), var2, var7, 448, 449, 0L);
      }

      if (var6.u3()) {
         var0.setFillType((byte)(var6.h0() ? 1 : 0));
         com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(452), com.aspose.slides.internal.k0r.z5.class);
         if (var8 != null && (var8.j5() & 4294967295L) == 1L) {
            var0.setFillType((byte)3);
            s8f.n5((PatternFormat)var0.getPatternFormat(), true, var1);
         }
      } else {
         boolean var10 = var5 != null && var5.u3();
         if (var3.n5(511) != null) {
            if (var10) {
               var0.setFillType((byte)1);
            } else if (var4 == 1) {
               com.aspose.slides.internal.k0r.z5 var9 = (com.aspose.slides.internal.k0r.z5)var3.n5(769);
               if (var9 != null && (var9.j5() & 4294967295L) == 0L) {
                  var0.setFillType((byte)1);
               }
            }
         } else if (var3.n5(459) != null && var10) {
            var0.setFillType((byte)1);
         }
      }
   }

   static void n5(ILineFillFormat var0, com.aspose.slides.internal.k0r.q5 var1, g6o var2) {
      com.aspose.slides.internal.k0r.w8 var3 = var1.a6().l6();
      com.aspose.slides.internal.k0r.a7 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.n5(511), com.aspose.slides.internal.k0r.a7.class);
      var3.k5(513);
      var3.k5(448);
      var3.k5(449);
      switch (var0.getFillType()) {
         case -1:
            var4.x8(false);
            break;
         case 0:
            var4.x8(false);
            break;
         case 1:
            var4.x8(true);
            u0b.n5(var0.getSolidFillColor(), var3, 448, 449, var2);
            break;
         case 2:
            var2.n5("Line fill type FillType.Gradient PPT serialization is not implemented yet.", 3);
            break;
         case 3:
            var4.x8(true);
            s8f.n5((PatternFormat)var0.getPatternFormat(), var1.a6(), true, var2);
            break;
         default:
            throw new NotImplementedException();
      }
   }
}
