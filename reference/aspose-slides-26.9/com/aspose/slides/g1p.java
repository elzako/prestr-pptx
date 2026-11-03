package com.aspose.slides;

class g1p {
   private final String n5;
   private final int l6;
   private final int k5;
   private final int u3;
   private final int a6;

   public final String n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final int u3() {
      return this.k5 - this.l6 + 1;
   }

   public final int a6() {
      return this.u3;
   }

   public final int u9() {
      return this.a6;
   }

   public final int h0() {
      return this.a6 - this.u3 + 1;
   }

   public g1p(String var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public final boolean n5(g1p var1) {
      return com.aspose.slides.ms.System.d1.a6(this.n5, var1.n5())
         && this.a6 >= var1.a6()
         && this.u3 <= var1.u9()
         && this.k5 >= var1.l6()
         && this.l6 <= var1.k5();
   }

   public final boolean n5(int var1, int var2) {
      return var1 >= this.u3 && var1 <= this.a6 && var2 >= this.l6 && var2 <= this.k5;
   }
}
