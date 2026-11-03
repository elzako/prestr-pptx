package com.aspose.slides.internal.h2;

public class o0 extends f0$n5 {
   private com.aspose.slides.internal.x7n.l6 h0 = com.aspose.slides.internal.x7n.l6.n5("en-US");

   public o0(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      a5 var4 = super.n5(var1, var2, var3);
      var4.z1().a6(z8.n5(118, "RETAIN"), true);
      var4.z1().u3(z8.n5(53, "FORCE"), true);
      return var4;
   }

   @Override
   protected a5 u3(com.aspose.slides.internal.e5.w1 var1) {
      a5 var2 = var1.u9(this.n5);
      if (var2 != null) {
         String var3 = var2.t9();
         if (var3 != null) {
            return this.n5(var1, var3, var1.l6());
         }
      }

      return null;
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      com.aspose.slides.internal.f2.u3 var4 = var1.u9();
      if (var4 != null && var4.l6() == 0) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.l6(var2), com.aspose.slides.internal.f2.h0.class)) {
            com.aspose.slides.internal.f2.k5 var5 = ((com.aspose.slides.internal.f2.h0)this.l6(var2)).k5();
            if (var5 != null && var5.k5()) {
               var1 = j5.n5(var4.n5() * var5.n5());
            } else {
               var1 = new t1(var4.n5(), this.l6(var2));
            }
         }

         a5 var6 = super.l6(var1, var2, var3);
         var6.n5(com.aspose.slides.ms.System.d2.n5(var4.n5(), this.h0));
         return var6;
      } else {
         return super.l6(var1, var2, var3);
      }
   }
}
