package com.aspose.slides.internal.g7;

public final class g3 {
   private double l6;
   private double k5;
   public static final g3 n5 = new g3(-Double.MAX_VALUE, -Double.MAX_VALUE);

   public g3(double var1, double var3) {
      this.n5(var1);
      this.l6(var3);
   }

   public final double n5() {
      return this.l6;
   }

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final double l6() {
      return this.k5;
   }

   public final void l6(double var1) {
      this.k5 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      g3 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, g3.class);
      return var2 == null ? super.equals(obj) : var2.n5() == this.n5() && var2.l6() == this.l6();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.ms.System.d1.n5("{0}_{1}", this.n5(), this.l6()).hashCode();
   }
}
