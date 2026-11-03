package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class u4k extends com.aspose.slides.internal.v6g.h0<u4k> {
   public u4k() {
   }

   static void n5(int var0, int var1, int var2, boolean var3, n1g var4) {
      if (var4.n3().hasDataTable()) {
         DataTable var5 = (DataTable)var4.n3().getChartDataTable();
         com.aspose.slides.internal.o9b.p8 var6 = h6l.n5("a", var4.s7().u3()).u3();
         int var7 = var6.l6() * var4.q0().x8() / 300;
         com.aspose.slides.internal.o9b.p8 var8 = var4.s7().u9().u3();
         int var9 = var8.k5() + var4.s7().c8();
         com.aspose.slides.internal.o9b.f2 var10 = z7d.n5(var4).a6();
         List var11 = z7d.n5(true, var3, var4.s7().l6(), var4);
         com.aspose.slides.internal.o9b.y2 var12 = new com.aspose.slides.internal.o9b.y2(var0, var1, var2, var9);
         com.aspose.slides.internal.o9b.y2 var13 = new com.aspose.slides.internal.o9b.y2(var0 - var8.l6(), var1 + var4.s7().c8(), var2 + var8.l6(), var8.k5());
         if (var5.hasBorderOutline()) {
            w5k.n5(
               var4.s7().n5().o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var4, com.aspose.slides.internal.o9b.y1.n5(var12).y4(), (Format)var5.getFormat()
            );
            w5k.n5(
               var4.s7().n5().o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var4, com.aspose.slides.internal.o9b.y1.n5(var13).y4(), (Format)var5.getFormat()
            );
         }

         float var14 = (float)var8.k5() / var11.size();
         if (var5.hasBorderHorizontal()) {
            for (int var15 = 1; var15 < var11.size(); var15++) {
               float var16 = var13.u3();
               float var17 = var13.c8() + var15 * var14;
               float var18 = var13.u9();
               float var19 = var17;
               w5k.n5(
                  new com.aspose.slides.internal.o9b.w1(var16, var17),
                  new com.aspose.slides.internal.o9b.w1(var18, var19),
                  var4.s7().n5().o8(),
                  (LineFormat)var5.getFormat().getLine(),
                  var4
               );
            }
         }

         int var38 = n1g.u3(var4.y4());
         com.aspose.slides.internal.o9b.n3 var20 = var4.s7().k5();
         float var21 = (float)var2 / var38;
         boolean var22 = false;
         List var23 = var4.l6();
         List[] var24 = var4.u3();
         if (var4.q0().n3() && var23.size() > 0) {
            var22 = true;
         }

         if (var24 != null && var24.length > 0 && var23.size() > 0) {
            var22 = true;
         }

         for (int var25 = 0; var25 < var38; var25++) {
            if (var5.hasBorderVertical()) {
               float var39 = var0 + var21 * var25;
               float var41 = var12.c8();
               float var43 = var39;
               float var45 = var41 + var4.s7().t2();
               w5k.n5(
                  new com.aspose.slides.internal.o9b.w1(var39, var41),
                  new com.aspose.slides.internal.o9b.w1(var43, var45),
                  var4.s7().n5().o8(),
                  (LineFormat)var5.getFormat().getLine(),
                  var4
               );
            }

            int var26 = var25;
            if (var4.q0().c8().isPlotOrderReversed()) {
               var26 = var38 - var25 - 1;
            }

            String var27 = "";
            if (var26 <= var4.l6().size() - 1) {
               x4 var28 = (x4)var23.get_Item(var26);
               if (!var22) {
                  var27 = p4.n5(var28.l6(), var4.q0());
               } else {
                  String var29 = "";
                  boolean var30 = false;
                  var29 = var26 < var23.size() ? var28.u9() : "";
                  var30 = var26 < var23.size() && var28.a6();
                  var27 = t7k.n5(var28.l6(), var29, var30);
               }
            }

            com.aspose.slides.internal.o9b.y1 var53 = new com.aspose.slides.internal.o9b.y1(
               var0 + var25 * var21, (float)var1 + var7, var21, (float)var4.s7().t2() - var7
            );
            h6l.n5(var53.y4(), var27, 0, var4.s7().k5(), var4.s7().a6().o8(), 1, 2, var4);
         }

         if (var24 != null && var24.length > 0 && var4.l6().size() > 0) {
            l5 var47 = var4.q0();
            boolean var49 = false;
            float var51 = var13.c8();
            float var54 = 0.0F;
            if (!var4.q0().c8().isPlotOrderReversed()) {
               var54 = var12.u3();
            } else {
               var54 = var12.u9();
            }

            n5(var24, var54, var51, var7, var49, var21, 2, var1, var12.n3(), false, var47, var4);
         }

         for (int var48 = 0; var48 < var11.size(); var48++) {
            u5l var50 = (u5l)var11.get_Item(var48);
            g3y var52 = var50.u3();
            float var56 = var13.c8() + var48 * var14;
            float var58 = 0.0F;
            if (var5.getShowLegendKey()) {
               com.aspose.slides.internal.o9b.y1 var60 = new com.aspose.slides.internal.o9b.y1(var13.u3() + 4.0F, var56, var10.l6(), var14);
               z7d.n5(var60.y4(), var50, var4);
               var58 = var10.l6() + 4.0F;
            }

            String var61 = var52.k5();
            com.aspose.slides.internal.o9b.f2 var31 = h6l.l6(var61, var4.s7().u3()).a6();
            com.aspose.slides.internal.o9b.w1 var32 = new com.aspose.slides.internal.o9b.w1(var0 - var8.l6() + var58, var56 + var14 / 2.0F - var31.k5() / 2.0F);
            h6l.n5(new com.aspose.slides.internal.o9b.y1(var32.u3(), var31.a6()), var61, 0, var20, var4.s7().a6().o8(), 1, 2, var4);

            for (int var33 = 0; var33 < var52.c8().size(); var33++) {
               if (var5.hasBorderVertical() && var33 < var52.c8().size() - 1) {
                  float var40 = var0 + (var33 + 1) * var21;
                  float var42 = var56;
                  float var44 = var40;
                  float var46 = var56 + var14;
                  w5k.n5(
                     new com.aspose.slides.internal.o9b.w1(var40, var42),
                     new com.aspose.slides.internal.o9b.w1(var44, var46),
                     var4.s7().n5().o8(),
                     (LineFormat)var5.getFormat().getLine(),
                     var4
                  );
               }

               int var34 = var33;
               if (var4.q0().c8().isPlotOrderReversed()) {
                  var34 = var52.c8().size() - var33 - 1;
               }

               t9z var35 = var52.c8().get_Item(var34);
               if (!var35.c8()) {
                  String var36 = var35.u3();
                  boolean var37 = false;
                  var61 = t7k.n5(var35.n5(), var36, var37);
                  h6l.l6(var61, var4.s7().u3()).l6(var31);
                  var32 = new com.aspose.slides.internal.o9b.w1(
                     var0 + var33 * var21 + var21 / 2.0F - var31.l6() / 2.0F, var56 + var14 / 2.0F - var31.k5() / 2.0F
                  );
                  h6l.n5(new com.aspose.slides.internal.o9b.y1(var32.u3(), var31.a6()), var61, 0, var20, var4.s7().a6().o8(), 1, 2, var4);
               }
            }
         }
      }
   }

   private static void n5(
      List<x4>[] var0,
      float var1,
      float var2,
      float var3,
      boolean var4,
      double var5,
      int var7,
      float var8,
      com.aspose.slides.internal.o9b.y2 var9,
      boolean var10,
      l5 var11,
      n1g var12
   ) {
      byte var13 = 0;
      float var14 = var2;
      IDataTable var15 = var12.n3().getChartDataTable();
      a8e var16 = var12.s7();
      com.aspose.slides.internal.o9b.f2 var17 = new com.aspose.slides.internal.o9b.f2((float)var5, var9.l6() / 2.0F);

      for (int var18 = 0; var18 < var0.length; var18++) {
         List var19 = var0[var18];
         com.aspose.slides.internal.o9b.p8 var20 = n5(var19, var13, var16, var17.a6()).u3();
         float var21 = var1;

         for (int var22 = 0; var22 < var19.size(); var22++) {
            x4 var23 = (x4)var19.get_Item(var22);
            String var24 = t7k.n5(var23.l6(), var23.u9(), var23.a6());
            int var25 = p4.n5(var23);
            float var26 = (float)(var25 * var5);
            float var27;
            if (!var11.c8().isPlotOrderReversed()) {
               var27 = (float)(var21 + var26 / 2.0 - var20.l6() / 2.0);
            } else {
               var27 = (float)(var21 - var26 / 2.0 - var20.l6() / 2.0);
            }

            float var28 = var4 ? var14 : var14 - var20.k5();
            com.aspose.slides.internal.o9b.y1 var29 = new com.aspose.slides.internal.o9b.y1(var27, var28, var20.l6(), var20.k5());
            h6l.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var29.y4())).y4(),
               var24,
               var13,
               var16.k5(),
               var16.a6().o8(),
               1,
               var7,
               var12
            );
            if (var12.n3().getChartDataTable().hasBorderVertical()) {
               w5k.n5(
                  new com.aspose.slides.internal.o9b.w1(var21, var8),
                  new com.aspose.slides.internal.o9b.w1(var21, var14),
                  var12.s7().n5().o8(),
                  (LineFormat)var15.getFormat().getLine(),
                  var12
               );
               float var30 = var4 ? var14 + (var3 + var20.k5()) : var14 - (var3 + var20.k5());
               n5(var23.h0(), var21, var8, var30, var4, var5, var11, var12);
            }

            if (!var11.c8().isPlotOrderReversed()) {
               var21 += var26;
            } else {
               var21 -= var26;
            }
         }

         if (var15.hasBorderVertical()) {
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var21, var8),
               new com.aspose.slides.internal.o9b.w1(var21, var14),
               var12.s7().n5().o8(),
               (LineFormat)var15.getFormat().getLine(),
               var12
            );
         }

         if (var4) {
            var14 += var3 + var20.k5();
         } else {
            var14 -= var3 + var20.k5();
         }
      }
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

   private static void n5(List<x4> var0, float var1, float var2, float var3, boolean var4, double var5, l5 var7, n1g var8) {
      float var9 = var1;

      for (int var10 = 0; var10 < var0.size(); var10++) {
         x4 var11 = (x4)var0.get_Item(var10);
         int var12 = p4.n5(var11);
         float var13 = (float)(var12 * var5);
         if (!var7.c8().isPlotOrderReversed()) {
            var9 += var13;
         } else {
            var9 -= var13;
         }

         w5k.n5(
            new com.aspose.slides.internal.o9b.w1(var9, var2),
            new com.aspose.slides.internal.o9b.w1(var9, var3),
            var8.s7().n5().o8(),
            (LineFormat)var8.n3().getChartDataTable().getFormat().getLine(),
            var8
         );
      }
   }

   static com.aspose.slides.internal.o9b.p8 n5(n1g var0) {
      com.aspose.slides.internal.o9b.f2 var1 = new com.aspose.slides.internal.o9b.f2();
      DataTable var2 = (DataTable)var0.n3().getChartDataTable();
      l6(var0).l6(var1);
      int var4;
      if (var2.getShowLegendKey()) {
         com.aspose.slides.internal.o9b.f2 var3 = z7d.n5(var0).a6();
         var4 = com.aspose.slides.internal.v6g.k5.u3(var3.l6() + var1.l6(), 13) + 4 + 1;
      } else {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 13) + 1;
         if (var1.l6() == 0.0F) {
            var4 += 4;
         }
      }

      int var7;
      if (var1.k5() == 0.0F) {
         com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(1, 1);
         com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var8);
         com.aspose.slides.internal.o9b.f2 var6 = var5.n5("A", var0.s7().u3()).a6();
         var7 = com.aspose.slides.internal.v6g.k5.u3(var6.k5() + 0.5, 14) + 1 + 4;
      } else {
         var7 = com.aspose.slides.internal.v6g.k5.u3(var1.k5() + 0.5, 14) + 1 + 4;
      }

      if (var4 > var0.c4()) {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13);
      }

      if (var4 > var0.c4() - 16.0F) {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13) - 16;
      }

      return new com.aspose.slides.internal.o9b.p8(var4, var7 * var0.y4().size());
   }

   private static com.aspose.slides.internal.o9b.f2 l6(n1g var0) {
      List var1 = var0.y4();
      com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var4);

      for (int var6 = 0; var6 < var1.size(); var6++) {
         g3y var7 = (g3y)var1.get_Item(var6);
         var5.n5(var7.k5(), var0.s7().u3()).l6(var3);
         if (var2.l6() < var3.l6()) {
            var2.n5(var3.l6());
         }

         if (var2.k5() < var3.k5()) {
            var2.l6(var3.k5());
         }
      }

      return var2;
   }

   static int n5(com.aspose.slides.internal.o9b.y2 var0, n1g var1) {
      a8e var2 = var1.s7();
      com.aspose.slides.internal.o9b.p8 var3 = h6l.n5("a", var2.u3()).u3();
      int var4 = var3.l6() * var1.q0().x8() / 300;
      int var5 = 0;
      var5 += var4;
      com.aspose.slides.internal.o9b.n3 var6 = var2.u3();
      List var7 = var1.l6();
      List[] var8 = var1.u3();
      float var9 = var1.q0().c8() != null ? (float)var0.t2() / var1.q0().h0.size() : var7.size();
      com.aspose.slides.internal.o9b.f2 var10 = new com.aspose.slides.internal.o9b.f2(var9, var0.l6() / 2.0F);
      com.aspose.slides.internal.o9b.p8 var11 = new com.aspose.slides.internal.o9b.p8(0, 0);
      if (var7.size() > 0) {
         for (int var12 = 0; var12 < var7.size(); var12++) {
            x4 var13 = (x4)var7.get_Item(var12);
            String var14 = t7k.n5(var13.l6(), var13.u9(), var13.a6());
            com.aspose.slides.internal.o9b.p8 var15 = h6l.n5(var14, 0, var6, var10.a6(), 1, 1, true).u3();
            if (var15.l6() > var11.l6()) {
               var11.n5(var15.l6());
            }

            if (var15.k5() > var11.k5()) {
               var11.l6(var15.k5());
            }
         }
      } else {
         h6l.n5("123", 0, var6, var10.a6(), 1, 1).k5(var11);
      }

      var5 += var11.k5();
      var2.l6(var5);
      int var18 = 0;
      if (var8 != null && var8.length > 0 && var7.size() > 0) {
         var5 += var4 * var8.length;

         for (int var19 = 0; var19 < var8.length; var19++) {
            List var20 = var8[var19];
            com.aspose.slides.internal.o9b.p8 var21 = n5(var20, 0, var2, var10.a6()).u3();
            var18 += var21.k5();
         }
      }

      return var5 + var18;
   }

   public void n5(u4k var1) {
   }

   public u4k n5() {
      u4k var1 = new u4k();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(u4k var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u4k) ? false : this.l6((u4k)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u4k Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u4k bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
