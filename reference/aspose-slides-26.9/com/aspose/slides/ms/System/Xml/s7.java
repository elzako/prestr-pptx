package com.aspose.slides.ms.System.Xml;

public class s7 extends com.aspose.slides.internal.l7h.q0 {
   private x8 n5;
   private int[] l6;
   private int k5;
   private int u3;
   private int a6;

   @Override
   public com.aspose.slides.internal.l7h.z3 n5() {
      if (this.n5 == null) {
         this.n5 = new x8(this);
      }

      return this.n5;
   }

   @Override
   public int l6() {
      return 12;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final void n5(int[] var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = 0;
   }

   public final boolean l6(int var1) {
      int var2 = this.u3;
      int var3 = this.a6 + var1;

      while (var2 < this.k5 && var3 >= this.l6[var2 + 1]) {
         var2++;
      }

      this.u3 = var2;
      return (var2 & 1) != 0;
   }
}
