package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v7u {
   static void n5(n1g var0) {
      if (!g6z.n5(var0.n5.n5.n3()) && var0.n3().hasDataTable()) {
         a8e var1 = var0.s7();
         com.aspose.slides.internal.o9b.p8 var2 = u4k.n5(var0).u3();
         int var3 = n5(var0.n5.n5.n3(), var0);
         int var4 = var2.k5() + var3;
         if (var4 * 2 > var0.n3().getHeight()) {
            var1.n5(var3);
            var1.n5.n5(com.aspose.slides.internal.v6g.k5.u3(var4 * 0.9F, 13));
            var1.n5(new com.aspose.slides.internal.o9b.p8(var2.l6(), com.aspose.slides.internal.v6g.k5.u3(var2.k5() * 0.9, 14)));
         } else {
            var1.n5(var3);
            var1.n5.n5(com.aspose.slides.internal.v6g.k5.u3(var4 * 0.9F, 13));
            var1.n5(var2.u3());
         }
      }
   }

   static void n5(n1g var0, com.aspose.slides.internal.o9b.y2[] var1) {
      byte var2 = var0.n3().getRotation3D().getRotationX();
      boolean var3 = ChartTypeCharacterizer.isChartTypeBar(var0.n3().getType());
      boolean var4 = com.aspose.slides.internal.v6g.k5.n5(var0.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
      if (!g6z.n5(var1[0].n3()) && var0.n3().hasDataTable()) {
         a8e var5 = var0.s7();
         com.aspose.slides.internal.o9b.p8 var6 = var5.u9().u3();
         int var7 = var5.c8();
         int var8 = var6.k5() + var7;
         if (var2 > 0 && !var3) {
            if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
               var1[0].n5(var1[0].l6() + var8 + 2);
               var1[0].k5(var1[0].s7() - var6.l6());
               var1[0].l6(var1[0].t2() + var6.l6());
            } else {
               var1[0].n5(var1[0].l6() - (var8 + 2));
               var1[0].k5(var1[0].s7() + var6.l6());
               var1[0].l6(var1[0].t2() - var6.l6());
            }

            if (var4 || var0.n3().getPlotArea().getLayoutTargetType() == 1) {
               o8m.n5(var0, var3, var1[0].n3());
            }
         } else {
            if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
               var1[0].n5(var1[0].l6() + var8);
            } else {
               var1[0].n5(var1[0].l6() - var8);
            }

            o8m.n5(var0, var3, var1[0].n3());
         }
      }
   }

   private static int n5(com.aspose.slides.internal.o9b.y2 var0, n1g var1) {
      a8e var2 = var1.s7();
      com.aspose.slides.internal.o9b.n3 var3 = var2.u3();
      List var4 = var1.l6();
      List[] var5 = var1.u3();
      float var6 = var1.q0().c8() != null ? (float)var0.t2() / var1.q0().h0.size() : var4.size();
      com.aspose.slides.internal.o9b.f2 var7 = com.aspose.slides.internal.o9b.f2.n5.a6();
      int var8 = 0;
      List$Enumerator var9 = var4.iterator();

      try {
         while (var9.hasNext()) {
            x4 var10 = (x4)var9.next();
            String var11 = t7k.n5(var10.l6(), var10.u9(), var10.a6());
            if (!com.aspose.slides.ms.System.d1.n5(var11)) {
               com.aspose.slides.internal.o9b.f2 var12 = n5(com.aspose.slides.ms.System.t9.q0(var11.charAt(0)), var2).a6();
               int var13 = com.aspose.slides.internal.v6g.k5.u3(var12.l6() * var1.q0().x8() / 300.0F, 13);
               if (var13 > var8) {
                  var12.l6(var7);
                  var8 = var13;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      int var19 = var8;
      com.aspose.slides.internal.o9b.f2 var21 = new com.aspose.slides.internal.o9b.f2(var6 - 2.0F * var7.l6(), var0.l6() / 2.0F);
      com.aspose.slides.internal.o9b.p8 var22 = new com.aspose.slides.internal.o9b.p8(0, 0);
      if (var4.size() > 0) {
         for (int var23 = 0; var23 < var4.size(); var23++) {
            x4 var14 = (x4)var4.get_Item(var23);
            String var15 = t7k.n5(var14.l6(), var14.u9(), var14.a6());
            com.aspose.slides.internal.o9b.p8 var16 = h6l.n5(var15, 0, var3, var21.a6(), 1, 1, true).u3();
            if (var16.l6() > var22.l6()) {
               var22.n5(var16.l6());
            }

            if (var16.k5() > var22.k5()) {
               var22.l6(var16.k5());
            }
         }
      } else {
         h6l.n5("123", 0, var3, var21.a6(), 1, 1).k5(var22);
      }

      var19 += var22.k5();
      var2.l6(var19);
      int var24 = 0;
      if (var5 != null && var5.length > 0 && var4.size() > 0) {
         var19 += var8 * var5.length;

         for (int var25 = 0; var25 < var5.length; var25++) {
            List var26 = var5[var25];
            com.aspose.slides.internal.o9b.p8 var27 = n5(var26, 0, var2, var21.a6()).u3();
            var24 += var27.k5();
         }
      }

      return var19 + var24;
   }

   static com.aspose.slides.internal.o9b.p8 n5(List<x4> var0, int var1, a8e var2, com.aspose.slides.internal.o9b.f2 var3) {
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < var0.size(); var6++) {
         x4 var7 = (x4)var0.get_Item(var6);
         String var8 = t7k.n5(var7.l6(), var7.u9(), var7.a6());
         com.aspose.slides.internal.o9b.p8 var9 = h6l.n5(var8, var1, var2.u3(), var3.a6(), 1, 1).u3();
         if (var9.l6() > var4) {
            var4 = var9.l6();
         }

         if (var9.k5() > var5) {
            var5 = var9.k5();
         }
      }

      return new com.aspose.slides.internal.o9b.p8(var4, var5);
   }

   static com.aspose.slides.internal.o9b.f2 n5(String var0, a8e var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(1, 1);

      try {
         com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var2);

         try {
            com.aspose.slides.internal.o9b.f2 var4 = var3.n5(var0, var1.u3()).a6();
            return new com.aspose.slides.internal.o9b.f2(
               (float)com.aspose.slides.ms.System.q1.l6((double)var4.l6()), (float)com.aspose.slides.ms.System.q1.l6((double)var4.k5())
            );
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
