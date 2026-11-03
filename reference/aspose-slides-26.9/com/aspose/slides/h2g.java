package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class h2g extends com.aspose.slides.internal.v6g.h0<h2g> {
   public h2g() {
   }

   static com.aspose.slides.internal.o9b.f2 n5(List<g3y> var0, int var1, int var2, double var3, float var5, float var6, double var7, n1g var9) {
      g3y var10 = (g3y)var0.get_Item(var1);
      t9z var11 = var10.c8().get_Item(var2);
      if (var11 == null) {
         var11 = var10.x8();
      }

      List var12;
      l5 var13;
      if (!var10.u9().getPlotOnSecondAxis()) {
         var12 = var9.l6();
         var13 = var9.q0();
      } else {
         var12 = var9.k5();
         var13 = var9.z3();
      }

      DataLabel var14 = var11.t9().l6();
      String var15 = var10.k5();
      boolean var16 = var14.getDataLabelFormat().isNumberFormatLinkedToSource();
      if (var14.getDataLabelFormat().getShowPercentage()) {
         var16 = true;
      }

      String var17 = var14.getDataLabelFormat().getShowPercentage() ? "" : var14.getDataLabelFormat().getNumberFormat();
      String var19;
      if (var16) {
         var17 = var2 >= 0 && var2 < var12.size() ? ((x4)var12.get_Item(var2)).u9() : "";
         boolean var18 = var2 >= 0 && var2 < var12.size() && ((x4)var12.get_Item(var2)).a6();
         var19 = var2 >= 0 && var2 < var13.h0.size() ? t7k.n5(var13.h0.get_Item(var2), var17, var18) : "Other";
      } else {
         var19 = var2 == -1 ? "Other" : t7k.n5(var13.h0.get_Item(var2), var17, var14.getDataLabelFormat().getShowCategoryName());
      }

      boolean var33 = var14.getDataLabelFormat().isNumberFormatLinkedToSource();
      if (var14.getDataLabelFormat().getShowPercentage()) {
         var33 = true;
      }

      String var20 = var14.getDataLabelFormat().getShowPercentage() ? "" : var14.getDataLabelFormat().getNumberFormat();
      String var21;
      if (var33) {
         var21 = var2 == -1 ? t7k.n5(var7, var20, false) : t7k.n5(var11.n5(), var11.u3(), false);
      } else {
         var21 = var2 == -1 ? t7k.n5(var7, var20, false) : t7k.n5(var11.n5(), var20, false);
      }

      String var22;
      if (var14.getDataLabelFormat().isNumberFormatLinkedToSource()) {
         var22 = t7k.n5(var3, "0%", false);
      } else {
         String var23 = !"".equals(var14.getDataLabelFormat().getNumberFormat()) && !"General".equals(var14.getDataLabelFormat().getNumberFormat())
            ? var14.getDataLabelFormat().getNumberFormat()
            : "0%";
         var22 = t7k.n5(var3, var23, false);
      }

      String var34 = t7k.l6(var14);
      int var24 = com.aspose.slides.internal.v6g.k5.u3(var11.t9().h0(), 13);
      boolean var25 = true;
      com.aspose.slides.internal.o9b.f2 var26 = z7d.k5(var10, var9).a6();
      String var27 = "";
      if (com.aspose.slides.ms.System.d1.n5(var11.t9().k5().getText())) {
         if (var14.getDataLabelFormat().getShowSeriesName()) {
            var27 = com.aspose.slides.ms.System.d1.n5(var27, var15);
         }

         if (var14.getDataLabelFormat().getShowCategoryName()) {
            if (!"".equals(var27)) {
               var27 = com.aspose.slides.ms.System.d1.n5(var27, var34);
            }

            var27 = com.aspose.slides.ms.System.d1.n5(var27, var19);
         }

         if (var14.getDataLabelFormat().getShowValue()) {
            if (!"".equals(var27)) {
               var27 = com.aspose.slides.ms.System.d1.n5(var27, var34);
            }

            var27 = com.aspose.slides.ms.System.d1.n5(var27, var21);
         }

         if (var14.getDataLabelFormat().getShowPercentage()) {
            if (!"".equals(var27)) {
               var27 = com.aspose.slides.ms.System.d1.n5(var27, var34);
            }

            var27 = com.aspose.slides.ms.System.d1.n5(var27, var22);
         }
      } else {
         var27 = var11.t9().k5().getText();
      }

      com.aspose.slides.internal.o9b.f2 var28 = new com.aspose.slides.internal.o9b.f2(var5, var6);
      com.aspose.slides.internal.o9b.n3 var29 = var11.t9().t2();
      com.aspose.slides.internal.o9b.p8 var30 = h6l.n5(var27, 0.0F, var29, 1, var9, var28.a6()).u3();
      new com.aspose.slides.internal.o9b.f2();
      if ("".equals(var27)) {
         return new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      }

      com.aspose.slides.internal.o9b.f2 var31;
      if (var14.getDataLabelFormat().getShowLegendKey()) {
         var31 = new com.aspose.slides.internal.o9b.f2(var30.l6() + var26.l6(), var30.k5());
      } else {
         var31 = new com.aspose.slides.internal.o9b.f2(var30.l6(), var30.k5());
      }

      if (var14.getDataLabelFormat().getShowLegendKey()) {
         var31.n5(var31.l6() + 6.0F);
      }

      var31.n5(var31.l6() + 1.0F);
      var31.l6(var31.k5() + 4.0F);
      return var31;
   }

   static void n5(int var0, int var1, double var2, com.aspose.slides.internal.o9b.y1 var4, double var5, n1g var7) {
      com.aspose.slides.internal.o9b.y1[] var8 = new com.aspose.slides.internal.o9b.y1[]{var4};
      var7.n5(var8);
      var8[0].a6(var4);
      g3y var9 = var7.y4().get_Item(var0);
      t9z var10 = var9.c8().get_Item(var1);
      if (var10 == null) {
         var10 = var9.x8();
      }

      List var11;
      l5 var12;
      if (!var9.u9().getPlotOnSecondAxis()) {
         var11 = var7.l6();
         var12 = var7.q0();
      } else {
         var11 = var7.k5();
         var12 = var7.z3();
      }

      DataLabel var13 = var10.t9().l6();
      IDataLabelFormat var14 = var13.getDataLabelFormat();
      if (var14.getShowBubbleSize()
         || var14.getShowCategoryName()
         || var14.getShowLegendKey()
         || var14.getShowSeriesName()
         || var14.getShowValue()
         || !var14.getShowPercentage()
         || var2 != 0.0) {
         String var15 = var9.k5();
         boolean var16 = var14.isNumberFormatLinkedToSource();
         if (var14.getShowPercentage()) {
            var16 = true;
         }

         String var17 = var14.getShowPercentage() ? "" : var14.getNumberFormat();
         boolean var18 = false;
         String var20;
         if (var16) {
            var17 = var1 >= 0 && var1 < var11.size() ? ((x4)var11.get_Item(var1)).u9() : "";
            boolean var19 = var1 >= 0 && var1 < var11.size() && ((x4)var11.get_Item(var1)).a6();
            var20 = var1 >= 0 && var1 < var12.h0.size() ? t7k.n5(var12.h0.get_Item(var1), var17, var19) : "Other";
            if (var1 >= 0 && var1 < var12.h0.size()) {
               var18 = t7k.n5(var12.h0.get_Item(var1), var17);
            }
         } else {
            var20 = var1 == -1 ? "Other" : t7k.n5(var12.h0.get_Item(var1), var17, var14.getShowCategoryName());
         }

         boolean var40 = var14.isNumberFormatLinkedToSource();
         if (var14.getShowPercentage()) {
            var40 = true;
         }

         String var21 = var14.getShowPercentage() ? "" : var14.getNumberFormat();
         boolean var22 = false;
         String var23;
         if (var40) {
            var23 = var1 == -1 ? t7k.n5(var5, var21, false) : t7k.n5(var10.n5(), var10.u3(), false);
            if (var1 != -1) {
               var22 = t7k.n5(var10.n5(), var10.u3());
            }
         } else {
            var23 = var1 == -1 ? t7k.n5(var5, var21, false) : t7k.n5(var10.n5(), var21, false);
         }

         String var24;
         if (var14.isNumberFormatLinkedToSource()) {
            var2 = com.aspose.slides.ms.System.q1.n5((double)(var2), 2);
            var24 = t7k.n5(var2, "0%", false);
         } else {
            String var25 = !"".equals(var14.getNumberFormat()) && !"General".equals(var14.getNumberFormat()) ? var14.getNumberFormat() : "0%";
            var24 = t7k.n5(var2, var25, false);
         }

         String var41 = t7k.l6(var13);
         com.aspose.slides.internal.o9b.n3 var26 = var10.t9().t2();
         com.aspose.slides.internal.o9b.c8 var27 = var10.t9().s7().o8();
         int var28 = com.aspose.slides.internal.v6g.k5.u3(var10.t9().h0(), 13);
         byte var29 = 1;
         byte var30 = 2;
         com.aspose.slides.internal.o9b.f2 var31 = z7d.k5(var9, var7).a6();
         var10.t9().k5.n5 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(var4.x8(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.n3(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.s7(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13)
         );
         var10.t9().k5.n5();
         int var32 = var14.getShowLegendKey()
            ? com.aspose.slides.internal.v6g.k5.u3(var4.x8() + 3.0F, 13)
            : com.aspose.slides.internal.v6g.k5.u3(var4.x8(), 13);
         int var33 = com.aspose.slides.internal.v6g.k5.u3(var4.n3(), 13) + 3;
         int var34 = var14.getShowLegendKey()
            ? com.aspose.slides.internal.v6g.k5.u3(var4.s7() - 6.0F, 13)
            : com.aspose.slides.internal.v6g.k5.u3(var4.s7(), 13);
         int var35 = com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13) - 6;
         if (var14.getShowLegendKey()) {
            com.aspose.slides.internal.o9b.y1 var36 = new com.aspose.slides.internal.o9b.y1(var4.x8(), var4.n3() + 3.0F, var31.l6(), var31.k5());
            z7d.n5(var36.y4(), var9, var1, var7);
            var32 += com.aspose.slides.internal.v6g.k5.u3(var31.l6(), 13);
            var34 -= com.aspose.slides.internal.v6g.k5.u3(var31.l6(), 13);
         }

         String var42 = "";
         if (com.aspose.slides.ms.System.d1.n5(var10.t9().k5().getText())) {
            if (var14.getShowSeriesName()) {
               var42 = com.aspose.slides.ms.System.d1.n5(var42, var15);
            }

            if (var14.getShowCategoryName()) {
               if (!"".equals(var42)) {
                  var42 = com.aspose.slides.ms.System.d1.n5(var42, var41);
               }

               var42 = com.aspose.slides.ms.System.d1.n5(var42, var20);
            }

            if (var14.getShowValue()) {
               if (!"".equals(var42)) {
                  var42 = com.aspose.slides.ms.System.d1.n5(var42, var41);
               }

               var42 = com.aspose.slides.ms.System.d1.n5(var42, var23);
            }

            if (var14.getShowPercentage()) {
               if (!"".equals(var42)) {
                  var42 = com.aspose.slides.ms.System.d1.n5(var42, var41);
               }

               var42 = com.aspose.slides.ms.System.d1.n5(var42, var24);
            }
         } else {
            var42 = var10.t9().k5().getText();
         }

         if (!"".equals(var42)) {
            com.aspose.slides.internal.o9b.y2 var37 = new com.aspose.slides.internal.o9b.y2(var32, var33, var34, var35);
            if (var18 || var22) {
               com.aspose.slides.internal.o9b.c8.z0().n5(var27);
            }

            h6l.n5(com.aspose.slides.internal.o9b.y1.n5(var37).y4(), var42, var28, var26, var27.o8(), var29, var30, var7);
         }
      }
   }

   public void n5(h2g var1) {
   }

   public h2g n5() {
      h2g var1 = new h2g();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(h2g var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof h2g) ? false : this.l6((h2g)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h2g Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(h2g bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
