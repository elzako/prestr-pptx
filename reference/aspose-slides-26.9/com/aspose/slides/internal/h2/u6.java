package com.aspose.slides.internal.h2;

public class u6 extends e5$n5 {
   public u6(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(int var1, com.aspose.slides.internal.e5.w1 var2, boolean var3, boolean var4) {
      a5 var5 = super.n5(0, var2, var3, var4);
      com.aspose.slides.internal.e5.t9 var6 = var2.n5();
      String var7 = this.n5 == 183 ? var6.q_().e2() : var6.q_().t9();
      if (var5.a6() == 64) {
         int var8 = this.n5 == 183 ? 186 : 183;
         int var9 = var2.u3(267).a6();
         int var10 = var2.u3(197).u9().u3();
         if (var2.l6(var8) != null && var2.l6(var8).a6() == 64) {
            if (var9 != 140 && (var10 == 0 || var10 == 180 || var10 == -180) || var9 == 140 && (var10 == 90 || var10 == 270 || var10 == -270)) {
               if (this.n5 == 186) {
                  return this.n5(var2, var7, var6);
               }
            } else if (this.n5 == 183) {
               return this.n5(var2, var7, var6);
            }
         }
      } else if (var5.t4()) {
         return this.n5(var2, var7, var6);
      }

      return var5;
   }
}
