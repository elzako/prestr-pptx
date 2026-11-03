package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a8e {
   private List<u5l> l6;
   com.aspose.slides.internal.o9b.y2 n5;
   private n1g k5;
   private DataTable u3;
   private com.aspose.slides.internal.o9b.p8 a6;
   private int u9;
   private int h0;

   a8e(DataTable var1, n1g var2) {
      this.n5 = com.aspose.slides.internal.o9b.y2.n5.n3();
      this.a6 = com.aspose.slides.internal.o9b.p8.n5.u3();
      this.k5 = var2;
      if (var2.n3().hasDataTable()) {
         this.l6(0);
         this.n5(0);
         this.l6 = new List<>();
         this.n5(var1);
      }
   }

   final com.aspose.slides.internal.o9b.c8 n5() {
      com.aspose.slides.internal.o9b.c8 var1 = (this.k5.n3().y4().n5() && this.k5.n3().getThemeManager().isOverrideThemeEnabled()
            ? ((ColorFormat)this.k5.n3().getThemeManager().getOverrideTheme().getColorScheme().getDark1()).u3()
            : ((y4u)((s8u)this.k5.n3().getSlide().createThemeEffective()).n5(com.aspose.slides.internal.o9b.c8.u3.o8())).n5())
         .o8();
      w5k.n5(var1.o8(), 0.75).n5(var1);
      return com.aspose.slides.internal.o9b.c8.n5(255, var1.o8());
   }

   final List<u5l> l6() {
      return this.l6;
   }

   final void n5(DataTable var1) {
      this.u3 = var1;
      List var2 = this.k5.y4();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         g3y var4 = (g3y)var2.get_Item(var3);
         u5l var5 = new u5l((Chart)var1.getChart());
         var5.n5(var4.k5());
         var5.n5(1);
         var5.n5(var4);
         this.l6.addItem(var5);
      }
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3) {
      com.aspose.slides.internal.o9b.c8 var4 = this.n5().o8();
      com.aspose.slides.internal.o9b.c8 var5 = com.aspose.slides.internal.o9b.c8.u3.o8();
      float var6 = 1.0F;
      LineFormat var7 = (LineFormat)this.u3.getFormat().getLine();
      FillFormat var8 = (FillFormat)this.u3.getFormat().getFill();
      l6v var9 = w5k.l6(var4.o8(), var7, this.k5, (float)var7.getEffective().getWidth());
      var9.u9 = w5k.n5(var4.o8(), (LineFillFormat)var7.getFillFormat(), this.k5, var6, var1);
      a1v var10 = w5k.n5(var5.o8(), var8, this.k5, 1.0F, var1);
      boolean var11 = ChartTypeCharacterizer.isChartTypeBar(this.k5.n3().getType());
      if (!var11 && this.k5.n3().getRotation3D().getRightAngleAxes()) {
         com.aspose.slides.internal.o9b.y1 var12 = this.k5.o0().y4();
         com.aspose.slides.internal.x4g.s7 var13 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

         try {
            j9e var14 = this.k5.c8();
            var14.n5(var12.y4(), var10, var9, var13, var2, var3);
         } finally {
            if (var13 != null) {
               var13.dispose();
            }
         }
      }
   }

   public final com.aspose.slides.internal.o9b.n3 k5() {
      Chart var1 = this.k5.n3();
      return var1.n5(com.aspose.slides.internal.v6g.k5.n5(var1.getChartDataTable(), DataTable.class).getTextFormat());
   }

   public final com.aspose.slides.internal.o9b.n3 u3() {
      float var1 = this.k5().c8() * 0.75F / w5k.n5();
      return com.aspose.slides.internal.o9b.n3.n5(this.k5().l6(), var1, this.k5().x8());
   }

   public final com.aspose.slides.internal.o9b.c8 a6() {
      Chart var1 = this.k5.n3();
      com.aspose.slides.internal.o9b.c8 var2 = (var1.y4().n5() && var1.getThemeManager().isOverrideThemeEnabled()
            ? ((ColorFormat)var1.getThemeManager().getOverrideTheme().getColorScheme().getDark1()).u3()
            : ((y4u)((s8u)var1.getSlide().createThemeEffective()).n5(com.aspose.slides.internal.o9b.c8.u3.o8())).n5())
         .o8();
      return var1.n5(com.aspose.slides.internal.v6g.k5.n5(var1.getChartDataTable(), DataTable.class).getTextFormat(), var2.o8());
   }

   final com.aspose.slides.internal.o9b.p8 u9() {
      return this.a6;
   }

   final void n5(com.aspose.slides.internal.o9b.p8 var1) {
      var1.k5(this.a6);
   }

   public final n1g h0() {
      return this.k5;
   }

   final int c8() {
      return this.u9;
   }

   final void n5(int var1) {
      this.u9 = var1;
   }

   final int t2() {
      return this.h0;
   }

   final void l6(int var1) {
      this.h0 = var1;
   }
}
