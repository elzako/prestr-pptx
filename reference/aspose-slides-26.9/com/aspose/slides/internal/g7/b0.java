package com.aspose.slides.internal.g7;

public abstract class b0 implements x1 {
   private i7 n5;

   b0(i7 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(b6 var1, r9 var2, v2 var3) {
      v2 var4 = new v2();
      var4.n5(var3.n5());
      var4.l6(var3.l6());
      var4.k5(var3.k5());
      var4.u3(var3.u3());
      var4.a6(var3.a6());
      var4.u9(var3.u9());
      if (var1.a6() == 2) {
         var4 = ((y0)var1.t2()).n5(var2).n5(var4);
      } else {
         var4 = var1.t2().k5().n5(var4);
      }

      k6 var5 = l6(var1, var2, var4);
      if (var5 != null) {
         this.n5(var4, var5, this.n5);
      }
   }

   private static k6 l6(b6 var0, r9 var1, v2 var2) {
      return var0.n5(var1);
   }

   abstract void n5(v2 var1, k6 var2, i7 var3);
}
