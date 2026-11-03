package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class s0m extends f7c {
   private List<l3t> n5 = new List<>();
   private List<s1y> t2 = new List<>();

   s0m(p7m var1, g3y var2) {
      super(var1, var2);
      int var3 = var2.u9().s7().n5();
      boolean var4 = false;
      IAxis var5 = this.e2().u9().getChart().getAxes().getHorizontalAxis();
      if (var5 != null && var5.getAggregationType() == 0) {
         IAxis var6 = this.e2().u9().getChart().getAxes().getSecondaryVerticalAxis();
         var4 = var6 != null && "0%".equals(var6.getNumberFormat());
      }

      for (int var11 = 0; var11 < var3; var11++) {
         a0 var7 = this.e2().u9().s7().n5(var11);
         l3t var8 = new l3t(var2, var7);
         this.n5.addItem(var8);
         this.n5(var8);
         if (var2.u9().getLabels().isVisible()) {
            if (var4 && com.aspose.slides.ms.System.d1.n5(var7.h0().getDataLabelFormat().getNumberFormat())) {
               var7.h0().getDataLabelFormat().setNumberFormat("0%");
            }

            f3h var9 = new f3h((DataLabel)var7.h0(), var2.t2());
            s1y var10 = new s1y(var7, var9);
            this.t2.addItem(var10);
            this.n5(var10);
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      float var2 = var1.n5() / this.e2().u9().s7().n5();
      float var3 = var2 / (1.0F + this.u3());

      for (int var4 = 0; var4 < this.e2().u9().s7().n5(); var4++) {
         a0 var5 = this.e2().u9().s7().n5(var4);
         l3t var6 = this.n5.get_Item(var4);
         float var7 = this.t9().l6.n5(var5.n3());
         var6.n3(new z5(var3, var1.l6() - var7));
         if (this.e2().u9().getLabels().isVisible()) {
            this.t2.get_Item(var4).n3(var1);
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      int var2 = this.e2().u9().s7().n5();
      float var3 = var1.n5() / var2;

      for (int var4 = 0; var4 < var2; var4++) {
         a0 var5 = this.e2().u9().s7().n5(var4);
         float var6 = this.t9().l6.n5(var5.n3());
         this.n5.get_Item(var4).u9(var6);
         this.n5.get_Item(var4).a6(var4 * var3 + var3 / 2.0F - this.n5.get_Item(var4).d2() / 2.0F);
         this.n5.get_Item(var4).t1();
      }

      if (this.e2().u9().getLabels().isVisible()) {
         this.h0();
      }
   }

   private void h0() {
      int var1 = this.e2().u9().s7().n5();

      for (int var2 = 0; var2 < var1; var2++) {
         l3t var3 = this.n5.get_Item(var2);
         s1y var4 = this.t2.get_Item(var2);
         a0 var5 = this.e2().u9().s7().n5(var2);
         switch (var5.h0().getDataLabelFormat().getPosition()) {
            case 2:
               var4.u9(var3.o0() + var3.d5() / 2.0F - var4.d5() / 2.0F);
               break;
            case 3:
               var4.u9(var3.o0() + var3.d5() - var4.d5());
               break;
            case 4:
               var4.u9(var3.o0());
               break;
            default:
               var4.u9(var3.o0() - var4.d5());
         }

         var4.a6(var3.b3() + var3.d2() / 2.0F - var4.d2() / 2.0F);
         var4.t1();
      }
   }

   @Override
   void n5(double[] var1, double[] var2) {
      a0 var3 = this.e2().u9().s7().n5(0);
      var1[0] = var3.n3();
      var2[0] = var3.n3();
      if (this.e2().u9().s7().n5() > 1) {
         for (int var4 = 1; var4 < this.e2().u9().s7().n5(); var4++) {
            var3 = this.e2().u9().s7().n5(var4);
            if (var3.n3() > var2[0]) {
               var2[0] = var3.n3();
            }

            if (var3.n3() < var1[0]) {
               var1[0] = var3.n3();
            }
         }
      }
   }

   protected final float u3() {
      return this.e2().u9().getGapWidth() / 100.0F;
   }
}
