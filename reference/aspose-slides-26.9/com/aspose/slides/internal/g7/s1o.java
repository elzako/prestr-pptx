package com.aspose.slides.internal.g7;

public class s1o implements q7 {
   private t1z n5;
   private p6r l6;
   private q8 k5;
   private int u3;

   public s1o(t1z var1, p6r var2, int var3, q8 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var4;
      this.u3 = var3;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      int var3 = this.n5.l6().k5(var1.n5(var2[0]).n5());
      if (var3 == -1) {
         return false;
      }

      int var4 = this.n5.u3().l6(var1.n5(var2[0]).n5());
      x7n var5 = this.n5(var1, var2[0], var4);
      if (var5 == null) {
         return false;
      }

      boolean var6 = false;
      return var6 ? false : this.n5(var1, var2, var5);
   }

   protected final x7n n5(g2x var1, int var2, int var3) {
      z0k var4 = this.n5.n5(var3);
      if (var4 == null) {
         return null;
      }

      for (x7n var8 : var4.l6()) {
         if (j3b.n5(var1, var2, var8.u3(), this.n5.u3(), true)
            && j3b.n5(var1, var2, var8.l6(), this.n5.k5(), false)
            && j3b.n5(var1, var2, var8.a6(), this.n5.a6(), true)) {
            return var8;
         }
      }

      return null;
   }

   private boolean n5(g2x var1, int[] var2, x7n var3) {
      int var4 = 0;

      while (var4 < var3.k5() && var2[0] < var1.l6()) {
         while (j3b.n5(var1.n5(var2[0]).n5(), var1.u9().l6().m1(), this.l6)) {
            var2[0]++;
            if (var2[0] == var1.l6()) {
               return true;
            }
         }

         int var5 = var2[0];
         boolean var6 = this.k5.n5(this.u3, var3.n5(var4).l6() & 65535).n5(var1, var2, var2[0] + var3.k5());
         if (!var6) {
            var2[0]++;
            var4++;
         } else {
            var4 += var2[0] - var5;
         }
      }

      return true;
   }
}
