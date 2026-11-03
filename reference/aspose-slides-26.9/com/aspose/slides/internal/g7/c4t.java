package com.aspose.slides.internal.g7;

public class c4t implements q7 {
   private c1x n5;
   private p6r l6;
   private q8 k5;
   private int u3;

   public c4t(c1x var1, p6r var2, int var3, q8 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var4;
      this.u3 = var3;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      if (!this.n5.l6().l6(var1.n5(var2[0]).n5())) {
         return false;
      }

      int var3 = this.n5.k5().l6(var1.n5(var2[0]).n5());
      w3k var4 = this.n5(var1, var2[0], var3);
      if (var4 == null) {
         return false;
      }

      boolean var5 = false;

      for (int var6 = 0; var6 < var4.k5(); var6++) {
         int var7;
         if (var5) {
            var7 = var2[0] - (var4.n5(var6).n5() & 65535);
            if (var7 < 0) {
               throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect sequence index in Lookup record #{0} in lookup {1}",new Object[]{ var6, this.n5.u3()}));
            }
         } else {
            var7 = var2[0] + (var4.n5(var6).n5() & 65535);
            if (var7 > var1.l6()) {
               throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect sequence index in Lookup record #{0} in lookup {1}",new Object[]{ var6, this.n5.u3()}));
            }
         }

         int[] var8 = new int[]{var7};
         this.k5.n5(this.u3, var4.n5(var6).l6() & 65535).n5(var1, var8, var2[0] + var4.l6());
         var7 = var8[0];
      }

      if (!var5) {
         var2[0] += var4.l6() - 1;
      }

      return true;
   }

   private w3k n5(g2x var1, int var2, int var3) {
      x5h var4 = this.n5.n5(var3);
      if (var4 == null) {
         return null;
      }

      boolean var5 = false;

      for (w3k var9 : (w3k[])var4.l6()) {
         if (j3b.n5(var1, var2, var9.u3(), this.n5.k5(), !var5)) {
            return var9;
         }
      }

      return null;
   }
}
