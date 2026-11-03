package com.aspose.slides.internal.s6;

final class j8 {
   private p3 n5;

   public j8(p3 var1) {
      this.n5 = var1;
   }

   public final void n5() {
      a5 var1 = null;
      t9 var2 = new t9();
      i9 var3 = new i9();
      boolean var4 = false;

      for (int var5 = 0; var5 < this.n5.n5().n5(); var5++) {
         j4 var6 = this.n5.n5().l6(var5);
         if (!var6.h0()) {
            if (!var4) {
               var2.n5(this.n5.a6().l6());
               var3.n5(this.n5.a6().n5());
               var4 = true;
            } else {
               a5[] var7 = new a5[]{var1};
               boolean var8 = this.l6(var6, var2, var3, var7);
               var1 = var7[0];
               if (!var8) {
                  var5--;
                  continue;
               }
            }

            a5[] var9 = new a5[]{var1};
            this.n5(var6, var2, var3, var9);
            var1 = var9[0];
         }
      }
   }

   private void n5(j4 var1, t9 var2, i9 var3, a5[] var4) {
      e2 var5 = new e2(var1, var3.l6(0));
      e2 var6 = var5;
      this.n5.l6().n5(var6);

      for (int var7 = 1; var7 < var3.n5(); var7++) {
         e2 var8;
         this.n5.u3().n5(new a5(var1, var3.l6(var7 - 1), var3.l6(var7), var6, var2.l6(var7 - 1), var8 = new e2(var1, var3.l6(var7))));
         var6 = var8;
         this.n5.l6().n5(var6);
      }

      this.n5.u3().n5(var4[0] = new a5(var1, var3.l6(var3.n5() - 1), var3.l6(0), var6, var2.l6(var2.n5() - 1), var5));
   }

   private boolean l6(j4 var1, t9 var2, i9 var3, a5[] var4) {
      if (var4[0] == null) {
         var4[0] = this.n5.u3().l6(0);
      }

      int var5 = 0;
      int[] var6 = new int[]{0};
      a5 var7 = var4[0] = j9.n5(var1, var4[0], this.n5.n5().n5(), var6);
      var5 = var6[0];
      if (var5 == 2) {
         this.n5(var1, var7);
         return false;
      }

      var2.k5();
      var2.n5(var7.l6());
      var3.k5();
      var3.n5(com.aspose.slides.ms.System.u3.n5(var7.n5()));

      for (int var8 = 0; var8 < var2.n5(); var8++) {
         a5 var9;
         if (var2.n5() == 3) {
            var9 = var2.l6(var8).n5(var7);
         } else {
            var9 = var2.l6(var8).a6();
         }

         if (var9 != null) {
            int var10 = var9.l6(var2.l6(var8));
            if (!t4.n5(var1, var9.n5()[(var10 + 2) % 3], var9.n5()[var10], var9.n5()[(var10 + 1) % 3])) {
               var3.n5(var8 + 1, var9.n5(var2.l6(var8)));
               e2 var11 = var2.l6(var8);
               var2.n5(var8, var9.k5(var2.l6(var8)));
               var2.l6(var8 + 1, var9.k5(var2.l6(var8)));
               var7 = null;
               z6.n5(this.n5, var11, true);
               var8--;
            }
         }
      }

      if (var2.n5() == 3) {
         z6.n5(this.n5, var7, true);
      }

      return true;
   }

   private void n5(j4 var1, a5 var2) {
      j4 var3 = null;

      for (int var4 = 0; var4 < 3; var4++) {
         if (var2.n5()[var4].n5(var1)) {
            var3 = var2.n5()[var4];
            break;
         }
      }

      for (int var5 = 0; var5 < this.n5.k5().n5(); var5++) {
         if (this.n5.k5().l6(var5).n5()[0] == var1) {
            this.n5.k5().l6(var5).n5()[0] = var3;
         }

         if (this.n5.k5().l6(var5).n5()[1] == var1) {
            this.n5.k5().l6(var5).n5()[1] = var3;
         }
      }

      this.n5.n5().l6(var1);
   }
}
