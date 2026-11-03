package com.aspose.slides.internal.b8c;

public final class n3 extends p7 {
   private static void n5(l0 var0, s7 var1, s7 var2, s7[] var3) {
      s7 var4 = new s7(var1.n5());
      s7 var5 = new s7(var2.n5());
      var0.n5(var4, var5, var3);
      var1.l6(var4);
      var2.l6(var5);
   }

   @Override
   public void n5(s7 var1, s7 var2, s7[] var3) {
      s7 var4 = new s7(var1.n5());
      s7 var5 = new s7(var2.n5());
      n3 var6 = this;

      l0 var7;
      do {
         n5(var6.k5(), var4, var5, var3);
         var7 = var6.l6();
         var6 = com.aspose.slides.internal.v6g.k5.n5(var7, n3.class);
      } while (var6 != null);

      var7.n5(var1, var2, var3);
      var1.l6(var4);
      var2.l6(var5);
   }

   @Override
   public boolean n5() {
      n3 var1 = this;

      while (!var1.k5().n5()) {
         l0 var2 = var1.l6();
         var1 = com.aspose.slides.internal.v6g.k5.n5(var2, n3.class);
         if (var1 == null) {
            return var2.n5();
         }
      }

      return true;
   }

   @Override
   public void n5(p7 var1, n2 var2, c5 var3) {
      this.l6(var1, var2, var3);
   }
}
