package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class w3p extends w6n {
   static void n5(v5s var0) {
      l3c var1 = (l3c)var0.a6();
      GroupShape var2 = var1.u3();
      u3(var0);
      v0q.n5(var0);
      if (var2.getPlaceholder() != null
         && (
            var2.getPlaceholder().getType() == 8 && (int)var2.getPlaceholder().getIndex() == -1
               || var2.getPlaceholder().getType() == 4
               || var2.getPlaceholder().getType() == 5
               || var2.getPlaceholder().getType() == 6
         )) {
         var2.removePlaceholder();
      }
   }

   static void n5(t2s var0) {
      List var1 = new List();
      IGenericEnumerator var2 = var0.k7().iterator();

      try {
         while (var2.hasNext()) {
            v5s var3 = (v5s)var2.next();
            var3.u3().a6().n5(var0.a6().c4());
            if (var3.z1()) {
               v0a.n5(var3);
               l3c var4 = com.aspose.slides.internal.v6g.k5.n5(var3.a6(), l3c.class);
               if (var4 != null && var4.e2() != null && var3.c8() == 1) {
                  var1.insertItem(0, var3);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var13 = var1.iterator();

      try {
         while (var13.hasNext()) {
            v5s var14 = (v5s)var13.next();
            var0.a6().e2().throwIfInterruptionRequested();
            GroupShape var5 = com.aspose.slides.internal.v6g.k5.n5(var14.a6().m1(), GroupShape.class);
            if (var5 != null) {
               w9v.n5(var5, var14.k5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   public static void n5(n6s var0) {
      GroupShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.q0(), GroupShape.class);
      if (var1 == null) {
         var1 = (GroupShape)var0.s7();
      }

      com.aspose.slides.internal.k0r.q5 var2 = var0.z3();
      com.aspose.slides.internal.k0r.q9 var3 = var2.l6();
      e4c var4 = var1.k5().u9();
      e4c var5 = var1.u9().u9();
      var3.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4.n5 * 12700.0), 14));
      var3.l6(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4.l6 * 12700.0), 14));
      var3.k5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5.n5 * 12700.0), 14));
      var3.u3(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5.l6 * 12700.0), 14));
      com.aspose.slides.internal.k0r.r3 var6 = var2.a6();
      float var7 = var1.R_().k5();
      if (com.aspose.slides.ms.System.q1.n5(var7) > 1.0E-6) {
         com.aspose.slides.internal.k0r.z5 var8 = new com.aspose.slides.internal.k0r.z5(
            4, false, (((com.aspose.slides.internal.v6g.k5.a6(var7 + 180.0F, 13) & 4294967295L) % 360L & 4294967295L) - 180L & 4294967295L) << 16 & 4294967295L
         );
         var6.l6().l6(var8);
      }

      u3(var0);
      a6(var0);
      o7.n5(var0);
      com.aspose.slides.internal.k0r.p1 var9 = var2.u3();
      var9.s7(true);
      var9.l6(!var0.y4() && var1.isGrouped());
      e4c var10 = var1.z7().u9();
      if (var9.k5()) {
         double var11;
         double var13;
         double var15;
         double var17;
         if (var7 >= 45.0F && var7 < 135.0F || var7 >= 225.0F && var7 < 315.0F) {
            double var10001 = var10.l6 - var10.n5;
            var11 = (var1.R_().n5().n5 - var10001 / 2.0) * 12700.0;
            var10001 = var10.n5 - var10.l6;
            var13 = (var1.R_().n5().l6 - var10001 / 2.0) * 12700.0;
            var15 = var10.l6 * 12700.0;
            var17 = var10.n5 * 12700.0;
            var2.u3().h0(var1.R_().a6() == 1);
            var2.u3().c8(var1.R_().u3() == 1);
         } else {
            var11 = var1.R_().n5().n5 * 12700.0;
            var13 = var1.R_().n5().l6 * 12700.0;
            var15 = var10.n5 * 12700.0;
            var17 = var10.l6 * 12700.0;
            var2.u3().h0(var1.R_().u3() == 1);
            var2.u3().c8(var1.R_().a6() == 1);
         }

         com.aspose.slides.internal.k0r.v7 var19 = new com.aspose.slides.internal.k0r.v7();
         var19.n5(
            new com.aspose.slides.internal.o9b.y2(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var11), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var13), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var15), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var17), 14)
            )
         );
         var2.n5(var19);
      } else {
         double var20;
         double var21;
         double var22;
         double var23;
         if (var7 >= 45.0F && var7 < 135.0F || var7 >= 225.0F && var7 < 315.0F) {
            var20 = (var1.getX() - (var1.getHeight() - var1.getWidth()) / 2.0F) * 8.0F;
            var21 = (var1.getY() - (var1.getWidth() - var1.getHeight()) / 2.0F) * 8.0F;
            var22 = var1.getHeight() * 8.0F;
            var23 = var1.getWidth() * 8.0F;
            var2.u3().h0(var1.R_().a6() == 1);
            var2.u3().c8(var1.R_().u3() == 1);
         } else {
            var20 = var1.getX() * 8.0F;
            var21 = var1.getY() * 8.0F;
            var22 = var1.getWidth() * 8.0F;
            var23 = var1.getHeight() * 8.0F;
            var2.u3().h0(var1.R_().u3() == 1);
            var2.u3().c8(var1.R_().a6() == 1);
         }

         com.aspose.slides.internal.k0r.t7 var24 = new com.aspose.slides.internal.k0r.t7();
         var24.n5(
            new com.aspose.slides.internal.o9b.y2(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var20), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var21), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var22), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var23), 14)
            )
         );
         var2.n5(var24);
      }

      u8j.n5(var0);
   }
}
