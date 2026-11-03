package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class g3b {
   private boolean l6 = true;
   private List<u5l> k5;
   private n1g u3;
   n2z n5;

   g3b(Legend var1, n1g var2) {
      this.u3 = var2;
      this.n5 = new n2z((Format)var1.getFormat(), var2, var1);
      if (ChartTypeCharacterizer.is3DChart(var2.n3().getType())) {
         this.k5 = new List<>();
         this.n5(var1, var2);
      }
   }

   public final com.aspose.slides.internal.o9b.n3 n5() {
      Chart var1 = this.u3.n3();
      return var1.n5(com.aspose.slides.internal.v6g.k5.n5(var1.getLegend(), Legend.class).getTextFormat());
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      Chart var1 = this.u3.n3();
      com.aspose.slides.internal.o9b.c8 var2 = var1.n5((byte)(var1.getStyle() + 1 > 40 ? 1 : 0)).o8();
      return var1.n5(com.aspose.slides.internal.v6g.k5.n5(var1.getLegend(), Legend.class).getTextFormat(), var2.o8());
   }

   public final com.aspose.slides.internal.o9b.n3 k5() {
      float var1 = this.n5().c8() * 0.75F / w5k.n5();
      return com.aspose.slides.internal.o9b.n3.n5(this.n5().l6(), var1, this.n5().x8());
   }

   public final boolean u3() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final int a6() {
      return h6l.n5(this.k5());
   }

   public final int u9() {
      return g6z.k5(h6l.n5(this.k5()) * 0.2F);
   }

   public final int h0() {
      int var1 = g6z.k5(h6l.n5(this.k5()) * 0.2F);
      return var1 < 4 ? 4 : var1;
   }

   public final int c8() {
      float var1 = this.n5().c8() <= 6.0F ? 0.6F : 0.465F;
      int var2 = g6z.k5(this.a6() * var1);
      return var2 < 3 ? 3 : var2;
   }

   public final float t2() {
      float var1 = this.a6() * 0.25F;
      return var1 < 2.0F ? -2.0F : -var1;
   }

   public final int s7() {
      return this.z1() ? 24 : 18;
   }

   public final float x8() {
      float var1 = this.k5().c8() <= 6.0F ? 0.6F : 0.465F;
      var1 = this.n5().c8() <= 6.0F ? 0.0F : this.k5().c8() * 0.02F + 0.01F;
      float var2 = this.a6() * var1;
      return var2 > 10.0F ? -10.0F : -var2;
   }

   public final boolean n3() {
      return z7d.n5(this.u3.n3());
   }

   public final List<u5l> y4() {
      return this.k5;
   }

   private boolean z1() {
      List$Enumerator var1 = this.y4().iterator();

      try {
         while (var1.hasNext()) {
            u5l var2 = (u5l)var1.next();
            if (var2.l6() == 1) {
               g3y var3 = var2.u3();
               if (var3 != null
                  && ChartTypeCharacterizer.h0(var3.u9().getType())
                  && var3.u9().getFormat().getLine().getDashStyle() != 0
                  && var3.u9().getFormat().getLine().getDashStyle() != -1) {
                  return true;
               }
            } else {
               w3q var8 = var2.k5();
               if (var8 != null && var8.k5().getFormat().getLine().getDashStyle() != 0 && var8.k5().getFormat().getLine().getDashStyle() != -1) {
                  return true;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }

   final boolean e2() {
      if (this.y4() == null) {
         return false;
      }

      List$Enumerator var1 = this.y4().iterator();

      try {
         while (var1.hasNext()) {
            u5l var2 = (u5l)var1.next();
            if (var2.l6() == 2) {
               return true;
            }

            if (var2.l6() == 1 && ChartTypeCharacterizer.h0(var2.u3().u9().getType())) {
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

   final void n5(Legend var1, n1g var2) {
      if (var2.n3().getChartData().getSeries().size() != 0) {
         List var3 = var2.y4();
         boolean var4 = true;
         if (!z7d.n5(var2.n3())
            && !ChartTypeCharacterizer.isChartTypePie(var2.n3().getChartData().getSeries().get_Item(0).getType())
            && !ChartTypeCharacterizer.isChartTypeDoughnut(var2.n3().getChartData().getSeries().get_Item(0).getType())) {
            if (u6p.l6(var2.n3())) {
               this.y4().clear();
               g3y var20 = var2.y4().get_Item(0);
               List var22 = new List();
               com.aspose.slides.internal.o9b.c8[] var24 = p2y.n5(var2.n3());
               if (var2.m1() != null && var2.m1().h0.size() > 0) {
                  var22.clear();
                  l5 var27 = var2.m1();
                  boolean var29 = false;
                  String var31 = com.aspose.slides.ms.System.d1.n5;

                  for (int var11 = var2.m1().h0.size() - 1; var11 >= 0; var11--) {
                     double var12 = com.aspose.slides.internal.v6g.k5.u3(var2.m1().h0.get_Item(var11), double.class);
                     String var14 = var27.n3() ? t7k.n5(var12, var31, var29) : p4.n5(var12, var27);
                     var22.addItem(var14);
                  }
               } else {
                  for (int var26 = 0; var26 < var24.length; var26++) {
                     var22.addItem(com.aspose.slides.ms.System.a3.l6(var26));
                  }
               }

               for (int var28 = 0; var28 < var22.size() - 1; var28++) {
                  int var30;
                  if (var1.getPosition() != 1 && var1.getPosition() != 2) {
                     var30 = var28;
                  } else {
                     var30 = var22.size() - 2 - var28;
                  }

                  String var32 = com.aspose.slides.ms.System.d1.n5("{0}-{1}", var22.get_Item(var30), var22.get_Item(var30 + 1));
                  LegendEntryProperties var33 = (LegendEntryProperties)var1.getEntries().get_Item(var20.l6());
                  u5l var15 = new u5l(var33);
                  var15.n5(var32);
                  var15.n5(1);
                  var15.n5(var20);
                  var15.n5(var24[var30].o8());
                  this.y4().addItem(var15);
               }
            } else {
               for (int var19 = 0; var19 < var3.size(); var19++) {
                  g3y var21 = var2.y4().get_Item(var19);
                  if (var19 == 0 && var21.u9().getPlotOnSecondAxis()) {
                     var4 = false;
                  }

                  LegendEntryProperties var23 = (LegendEntryProperties)var1.getEntries().get_Item(var21.l6());
                  if (!var23.getHide() && var21.c8().size() > 0) {
                     u5l var8 = new u5l(var23);
                     var8.n5(var21.k5());
                     var8.n5(1);
                     var8.n5(var21);
                     this.y4().addItem(var8);
                  }

                  if (!var21.u9().getPlotOnSecondAxis() && var4 || var21.u9().getPlotOnSecondAxis() && !var4) {
                     List$Enumerator var25 = var21.a6().iterator();

                     try {
                        while (var25.hasNext()) {
                           w3q var9 = (w3q)var25.next();
                           u5l var10 = new u5l((Chart)var1.getChart());
                           var10.n5(var9.u3());
                           var10.n5(2);
                           var10.n5(var21);
                           var10.n5(var9);
                           this.y4().addItem(var10);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
                           var25.dispose();
                        }
                     }
                  }
               }
            }
         } else {
            for (int var5 = 0; var5 < var2.n3().getLegend().getEntries().getCount(); var5++) {
               LegendEntryProperties var6 = (LegendEntryProperties)var1.getEntries().get_Item(var5);
               u5l var7 = new u5l(var6);
               this.y4().addItem(var7);
            }
         }
      }
   }

   final int t9() {
      int var1 = 0;
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            u5l var3 = (u5l)var2.next();
            if (!var3.a6().getHide()) {
               var1++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
