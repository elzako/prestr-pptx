package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class d8 extends f7c {
   private float n5 = -0.08F;
   private List<e4> t2 = new List<>();
   private List<h3p> s7 = new List<>();
   private List<h3p> x8 = new List<>();
   private List<l1z> n3 = new List<>();
   private List<u0[]> y4 = new List<>();
   private List<u0[]> e2 = new List<>();
   private v3c t9;
   private o9[] z1;
   private o9[] t4;
   private o9[] q0;
   private o9[] z3;
   private o9[] m1;
   private o9[] k7;

   d8(p7m var1, g3y var2) {
      super(var1, var2);
      int var3 = var2.u9().s7().n5();
      if (var2.u9().getLabels().isVisible()) {
         this.z1 = new o9[var3];
         this.t4 = new o9[var3];
         this.q0 = new o9[var3];
         this.z3 = new o9[var3];
         this.k7 = new o9[var3];
         this.m1 = new o9[var3];
      }

      for (int var4 = 0; var4 < var2.u9().s7().n5(); var4++) {
         a0 var5 = this.e2().u9().s7().n5(var4);
         e4 var6 = new e4(var2);
         this.t2.addItem(var6);
         this.n5(var6);
         h3p var7 = new h3p(true, var2);
         this.s7.addItem(var7);
         this.n5(var7);
         h3p var8 = new h3p(false, var2);
         this.x8.addItem(var8);
         this.n5(var8);
         n1g var9 = var2.t2();
         if (var2.u9().getShowMeanMarkers()) {
            this.k5(var2);
            if (var2.u9().getLabels().isVisible()) {
               f3h var10 = new f3h((DataLabel)var5.n5(), var9);
               this.k7[var4] = new o9(var5, var10, 4);
               this.n5(this.k7[var4]);
            }
         }

         if (var2.u9().getLabels().isVisible()) {
            f3h var12 = new f3h((DataLabel)var5.u9(), var9);
            this.z1[var4] = new o9(var5, var12, 0);
            this.n5(this.z1[var4]);
            var12 = new f3h((DataLabel)var5.a6(), var9);
            this.t4[var4] = new o9(var5, var12, 1);
            this.n5(this.t4[var4]);
            var12 = new f3h((DataLabel)var5.u3(), var9);
            this.q0[var4] = new o9(var5, var12, 2);
            this.n5(this.q0[var4]);
            var12 = new f3h((DataLabel)var5.k5(), var9);
            this.z3[var4] = new o9(var5, var12, 3);
            this.n5(this.z3[var4]);
            var12 = new f3h((DataLabel)var5.l6(), var9);
            this.m1[var4] = new o9(var5, var12, 5);
            this.n5(this.m1[var4]);
         }

         this.y4.addItem(new u0[var5.k7().size()]);
         this.e2.addItem(new u0[var5.m3().size()]);

         for (int var17 = 0; var17 < var5.k7().size(); var17++) {
            u0 var11 = new u0(var2, var5.k7().get_Item(var17));
            this.y4.get_Item(var4)[var17] = var11;
            this.n5(var11);
         }

         for (int var18 = 0; var18 < var5.m3().size(); var18++) {
            u0 var19 = new u0(var2, var5.m3().get_Item(var18));
            this.e2.get_Item(var4)[var18] = var19;
            this.n5(var19);
         }
      }

      if (var2.u9().getShowMeanLine()) {
         this.t9 = new v3c(var2.u9().s7().n5(), var2);
         this.n5(this.t9);
      }
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());

      for (int var2 = 0; var2 < this.e2().u9().s7().n5(); var2++) {
         a0 var3 = this.e2().u9().s7().n5(var2);
         e4 var4 = this.t2.get_Item(var2);
         float var5 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, a0k.class).a5();
         float var6 = var5 / (this.t9().n5.size() - this.n5 * (this.t9().n5.size() - 1) + this.u3());
         float var7 = this.t9().l6.n5(var3.q0());
         float var8 = this.t9().l6.n5(var3.t4());
         var4.n3(new z5(var6, var8 - var7));
         float var9 = this.t9().l6.n5(var3.m1());
         float var10 = this.t9().l6.n5(var3.z3());
         this.s7.get_Item(var2).n3(new z5(var4.d2() / 4.0F, var7 - var9));
         this.x8.get_Item(var2).n3(new z5(var4.d2() / 4.0F, var10 - var8));
         u0[] var11 = this.y4.get_Item(var2);

         for (u0 var15 : var11) {
            var15.n3(var1);
         }

         u0[] var22 = this.e2.get_Item(var2);

         for (u0 var16 : var22) {
            var16.n3(var1);
         }

         if (this.e2().u9().getLabels().isVisible()) {
            this.z1[var2].n3(var1);
            this.t4[var2].n3(var1);
            this.q0[var2].n3(var1);
            this.z3[var2].n3(var1);
            this.m1[var2].n3(var1);
            if (this.e2().u9().getShowMeanMarkers()) {
               this.k7[var2].n3(var1);
            }
         }
      }

      List$Enumerator var20 = this.n3.iterator();

      try {
         while (var20.hasNext()) {
            l1z var21 = (l1z)var20.next();
            var21.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }

      if (this.t9 != null) {
         this.t9.n3(var1);
      }
   }

   @Override
   protected void l6(z5 var1) {
      d2 var2 = this.e2().u9().s7();

      for (int var3 = 0; var3 < var2.n5(); var3++) {
         a0 var4 = var2.n5(var3);
         e4 var5 = this.t2.get_Item(var3);
         var5.u9(this.t9().l6.n5(var4.q0()));
         float var6 = com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, a0k.class).a5();
         float var7 = var5.d2() * this.n5;
         float var8 = var5.d2() * this.u3();
         int var9 = this.t9().n5.indexOf(this);
         float var10 = var9 * (var5.d2() - var7);
         float var11 = var6 * var3 + var8 / 2.0F + var10;
         var5.a6(var11);
         var5.n5(this.t9().l6.n5(var4.z1()) - var5.o0());
         float var12 = var5.b3() + var5.d2() / 2.0F - this.s7.get_Item(var3).d2() / 2.0F;
         this.s7.get_Item(var3).a6(var12);
         this.x8.get_Item(var3).a6(var12);
         this.s7.get_Item(var3).u9(this.t9().l6.n5(var4.m1()));
         this.x8.get_Item(var3).u9(this.t9().l6.n5(var4.t4()));
         if (this.n3.size() > 0) {
            this.n3.get_Item(var3).a6(var5.b3() + var5.d2() / 2.0F - this.n3.get_Item(var3).d2() / 2.0F);
            this.n3.get_Item(var3).u9(this.t9().l6.n5(var4.t9()) - this.n3.get_Item(var3).d5() / 2.0F);
         }

         if (this.t9 != null) {
            this.t9.u3()[var3].a6(var5.b3() + var5.d2() / 2.0F);
            this.t9.u3()[var3].u9(this.t9().l6.n5(var4.t9()));
         }

         if (this.e2().u9().getLabels().isVisible()) {
            this.n5(this.s7.get_Item(var3), this.z1[var3], var4.m1());
            this.n5(this.x8.get_Item(var3), this.t4[var3], var4.z3());
            this.l6(var5, this.q0[var3], var4.q0());
            this.l6(var5, this.z3[var3], var4.t4());
            this.l6(var5, this.m1[var3], var4.z1());
            if (this.e2().u9().getShowMeanMarkers()) {
               this.n5(var5, this.k7[var3], var4.t9());
            }
         }

         u0[] var13 = this.y4.get_Item(var3);

         for (u0 var17 : var13) {
            var17.a6(var5.b3() + var5.d2() / 2.0F);
            var17.u9(this.t9().l6.n5(var2.n5(var17.u3())));
         }

         u0[] var23 = this.e2.get_Item(var3);

         for (u0 var18 : var23) {
            var18.a6(var5.b3() + var5.d2() / 2.0F);
            var18.u9(this.t9().l6.n5(var2.n5(var18.u3())));
         }
      }

      for (v6g var22 : this.a0()) {
         var22.t1();
      }
   }

   private void n5(e4 var1, o9 var2, double var3) {
      float var5 = var1.b3() + var1.d2() / 2.0F;
      float var6 = this.t9().l6.n5(var3);
      switch (this.e2().u9().getLabels().getDefaultDataLabelFormat().getPosition()) {
         case 0:
            var2.a6(var5 - var2.d2() / 2.0F);
            var2.u9(var6);
            break;
         case 5:
            var2.a6(var5 - var2.d2());
            var2.u9(var6 - var2.d5() / 2.0F);
            break;
         case 8:
            var2.a6(var5 - var2.d2() / 2.0F);
            var2.u9(var6 - var2.d5());
            break;
         default:
            var2.a6(var5);
            var2.u9(var6 - var2.d5() / 2.0F);
      }
   }

   private void l6(e4 var1, o9 var2, double var3) {
      float var5 = this.t9().l6.n5(var3);
      switch (this.e2().u9().getLabels().getDefaultDataLabelFormat().getPosition()) {
         case 0:
            var2.a6(var1.b3() + var1.d2() / 2.0F - var2.d2() / 2.0F);
            var2.u9(var5);
            break;
         case 5:
            var2.a6(var1.b3() - var2.d2());
            var2.u9(var5 - var2.d5() / 2.0F);
            break;
         case 8:
            var2.a6(var1.b3() + var1.d2() / 2.0F - var2.d2() / 2.0F);
            var2.u9(var5 - var2.d5());
            break;
         default:
            var2.a6(var1.b3() + var1.d2());
            var2.u9(var5 - var2.d5() / 2.0F);
      }
   }

   private void n5(h3p var1, o9 var2, double var3) {
      float var5 = this.t9().l6.n5(var3);
      switch (this.e2().u9().getLabels().getDefaultDataLabelFormat().getPosition()) {
         case 0:
            var2.a6(var1.b3() + var1.d2() / 2.0F - var2.d2() / 2.0F);
            var2.u9(var5);
            break;
         case 5:
            var2.a6(var1.b3() - var2.d2());
            var2.u9(var5 - var2.d5() / 2.0F);
            break;
         case 8:
            var2.a6(var1.b3() + var1.d2() / 2.0F - var2.d2() / 2.0F);
            var2.u9(var5 - var2.d5());
            break;
         default:
            var2.a6(var1.b3() + var1.d2());
            var2.u9(var5 - var2.d5() / 2.0F);
      }
   }

   private void k5(g3y var1) {
      Marker var2 = new Marker(null, var1.u9());
      var2.setSymbol(10);
      var2.n5 = 6;
      l6v var3 = u3(var1);
      var2.getFormat().getLine().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var2.getFormat().getLine().getFillFormat().getSolidFillColor()).n5(var3.h0().o8());
      var2.getFormat().getLine().setWidth(var3.n5());
      l1z var4 = new l1z(var2, var1);
      this.n3.addItem(var4);
      this.n5(var4);
   }

   static com.aspose.slides.internal.o9b.c8 n5(g3y var0) {
      return u3(var0).h0();
   }

   private static l6v u3(g3y var0) {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();

      try {
         var1.l6(0, 0, 1, 1);
         return n5(var0, var1);
      } finally {
         var1.dispose();
      }
   }

   @Override
   void n5(double[] var1, double[] var2) {
      a0 var3 = this.e2().u9().s7().n5(0);
      var1[0] = var3.y4();
      var2[0] = var3.e2();
      if (this.e2().u9().s7().n5() > 1) {
         for (int var4 = 1; var4 < this.e2().u9().s7().n5(); var4++) {
            var3 = this.e2().u9().s7().n5(var4);
            if (var3.e2() > var2[0]) {
               var2[0] = var3.e2();
            }

            if (var3.y4() < var1[0]) {
               var1[0] = var3.y4();
            }
         }
      }
   }

   protected final float u3() {
      return this.e2().u9().getGapWidth() / 100.0F * 1.5F;
   }

   static com.aspose.slides.internal.o9b.c8 l6(g3y var0) {
      FillFormat var1 = (FillFormat)var0.u9().getFormat().getFill();
      if (((Format)var0.u9().getFormat()).z3() && var1.getFillType() == 1) {
         return w5k.n5((ColorFormat)var1.getSolidFillColor(), (Chart)var0.u9().getChart());
      }

      IFormat var2 = h0(var0);
      return var2 != null && var2.getFill().getFillType() == 1
         ? w5k.n5((ColorFormat)var2.getFill().getSolidFillColor(), (Chart)var0.u9().getChart())
         : var0.u9().c8();
   }

   private static com.aspose.slides.internal.o9b.c8 a6(g3y var0) {
      com.aspose.slides.internal.o9b.c8 var1 = l6(var0).o8();
      LineFormat var2 = u9(var0);
      if (var2 != null && var2.getFillFormat().getFillType() == 1) {
         w5k.n5((ColorFormat)var2.getFillFormat().getSolidFillColor(), (Chart)var0.u9().getChart()).n5(var1);
      }

      com.aspose.slides.internal.o9b.c8 var3 = k3o.l6(var1.o8(), 0.6).o8();
      return com.aspose.slides.internal.o9b.c8.n5(255, var3.o8());
   }

   static l6v n5(g3y var0, com.aspose.slides.internal.x4g.s7 var1) {
      n1g var2 = var0.t2();
      com.aspose.slides.internal.o9b.c8 var3 = a6(var0).o8();
      LineFormat var4 = (LineFormat)var0.u9().getFormat().getLine();
      l6v var5 = w5k.l6(var3.o8(), var4, var2, 0.75F);
      var5.u9 = w5k.n5(var5.h0().o8(), (LineFillFormat)var4.getFillFormat(), var2, 1.0F, var1);
      var5.k5((byte)2);
      return var5;
   }

   private static LineFormat u9(g3y var0) {
      IFormat var1 = h0(var0);
      if (var1 == null) {
         return null;
      }

      LineFormat var2 = (LineFormat)var1.getLine();
      return var2.isFormatNotDefined() ? null : var2;
   }

   private static IFormat h0(g3y var0) {
      Chart var1 = (Chart)var0.u9().getChart();
      if (!var1.t9().k5()) {
         return null;
      }

      int var2 = var1.getChartData().getSeries().indexOf(var0.u9());
      return var2 < 0 ? null : var1.t9().u9().n5(var0.u9(), var2, var1.getChartData().getSeries().size());
   }
}
