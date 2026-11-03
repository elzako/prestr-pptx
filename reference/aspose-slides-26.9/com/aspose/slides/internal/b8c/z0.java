package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Generic.Stack;

public final class z0 extends p7 {
   @Override
   public void n5(s7 var1, s7 var2, s7[] var3) {
      Stack var4 = new Stack();
      z0$n5 var5 = new z0$n5(this, var1, var2);

      while (true) {
         z0 var6 = var5.n5;
         var5.u3 = new s7(var2.n5());
         if (!com.aspose.slides.internal.v6g.k5.l6(var6.l6(), z0.class)) {
            var6.l6().n5(var5.l6, var5.u3, var3);

            while (true) {
               var5.a6 = new s7(var1.n5());
               var6.k5().n5(var5.a6, var5.k5, var3);
               if (var6.l6().n5() && !var6.k5().u9()) {
                  var5.l6.l6(var5.a6);
               }

               if (var6.k5().n5()) {
                  var5.k5.l6(var5.u3);
               }

               for (int var7 = var5.u3.u3(-1); var7 != -1; var7 = var5.u3.u3(var7)) {
                  var3[var7].l6(var5.a6);
               }

               if (var6.k5().u9()) {
                  ((f4)var6.k5()).n5(var5.l6.k5());
               }

               if (var4.size() == 0) {
                  return;
               }

               ((z0$n5)var4.pop()).n5(var5);
               var6 = var5.n5;
            }
         }

         var4.push(var5.n5());
         var5 = new z0$n5((z0)var6.l6(), var5.l6, var5.u3);
      }
   }

   @Override
   public boolean n5() {
      z0 var1 = this;

      while (!var1.k5().u9() || !com.aspose.slides.ms.System.c4.c8(((f4)var1.k5()).u3(), com.aspose.slides.internal.v6g.k5.s7(0, 9))) {
         if (!var1.k5().n5() && !var1.k5().u9()) {
            return false;
         }

         l0 var2 = var1.l6();
         var1 = com.aspose.slides.internal.v6g.k5.n5(var2, z0.class);
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
