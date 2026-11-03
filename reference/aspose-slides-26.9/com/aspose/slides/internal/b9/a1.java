package com.aspose.slides.internal.b9;

public class a1 extends s2 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;

   public a1(s9 var1) {
      super(var1);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, XNum: {1}, XDenom: {2}, YNum: {3}, YDenom: {4}", super.toString(), this.n5(), this.l6(), this.k5(), this.u3()
      );
   }

   protected final boolean n5(a1 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((a1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      return var1 * 397 ^ this.u3;
   }
}
