package com.aspose.slides.internal.r4;

import com.aspose.slides.internal.l7h.a5;

public class n3 {
   private int n5;
   private int l6;
   private int k5;
   private double u3;
   private double a6;
   private int u9;

   public n3(int var1, int var2, double var3, double var5, float var7) {
      this.n5(var1, var2);
      this.n5(var3, var5);
      this.u9 = com.aspose.slides.internal.v6g.k5.u3(72000.0F / var7, 13);
   }

   public final void n5(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5(double var1, double var3) {
      this.u3 = var1;
      this.a6 = var3;
   }

   public final int n5() {
      return this.k5;
   }

   public final int l6() {
      return this.n5;
   }

   public final int k5() {
      return this.l6;
   }

   public final int u3() {
      return this.n5 * this.u9;
   }

   public final int a6() {
      return this.l6 * this.u9;
   }

   public final double u9() {
      return this.u3;
   }

   public final double h0() {
      return this.a6;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("Size: ");
      var1.k5(this.u3()).n5('x').k5(this.a6()).n5(" mpt");
      var1.n5(" (");
      var1.k5(this.l6()).n5('x').k5(this.k5()).n5(" px");
      var1.n5(" at ").n5(this.u9()).n5('x').n5(this.h0());
      var1.n5(" dpi");
      var1.n5(")");
      return var1.toString();
   }
}
