package com.aspose.slides.internal.s6;

final class e9 {
   private p3 n5;
   private i9 l6;
   private t9 k5;
   private t9 u3;
   private v4 a6;

   public e9(p3 var1, d2 var2, byte[] var3) {
      this.n5 = var1;
      this.l6 = var1.n5();
      this.k5 = var1.l6();
      this.n5(var2);
      this.n5(var2, var3);
      var1.n5(this.u3);
      var1.n5(this.a6);
   }

   public e9(p3 var1) {
      this.n5 = var1;
      this.l6 = var1.n5();
      this.k5 = var1.l6();
      this.n5();
      var1.n5(this.a6);
   }

   private void n5(d2 var1, byte[] var2) {
      byte var3 = 1;
      byte var4 = -128;
      j4 var5 = null;
      j4 var6 = null;
      int var7 = var1.n5();
      this.u3 = new t9(var7);

      for (int var8 = 0; var8 < var7; var8++) {
         j4 var9 = new j4(var1.n5(var8).n5(), var1.n5(var8).l6());
         if ((var2[var8] & 255 & var3 & 255) != (var3 & 255)) {
            this.l6.n5(var9);
            var6 = var9;
            var5 = var6;
         }

         if ((var2[var8] & 255 & var4 & 255) == (var4 & 255)) {
            if (!var9.n5(var6)) {
               this.l6.n5(var9);
               this.u3.n5(new e2(var5, var9));
               var5 = var9;
            }

            if (!var5.n5(var6)) {
               this.u3.n5(new e2(var5, var6));
               var5 = var6;
            }
         } else if ((var2[var8] & 255 & var3 & 255) == (var3 & 255) && !var9.n5(var5)) {
            this.l6.n5(var9);
            this.u3.n5(new e2(var5, var9));
            var5 = var9;
         }
      }
   }

   private void n5(d2 var1) {
      d5 var2 = this.l6(var1).a6();
      this.n5(var2.a6());
   }

   private void n5() {
      d5 var1 = this.l6().a6();
      this.n5(var1.a6());
   }

   private d5 l6(d2 var1) {
      double var2 = var1.n5(0).n5();
      double var4 = var1.n5(0).n5();
      double var6 = var1.n5(0).l6();
      double var8 = var1.n5(0).l6();
      int var10 = var1.n5();

      for (int var11 = 1; var11 < var10; var11++) {
         if (var1.n5(var11).n5() < var2) {
            var2 = var1.n5(var11).n5();
         }

         if (var1.n5(var11).n5() > var4) {
            var4 = var1.n5(var11).n5();
         }

         if (var1.n5(var11).l6() < var6) {
            var6 = var1.n5(var11).l6();
         }

         if (var1.n5(var11).l6() > var8) {
            var8 = var1.n5(var11).l6();
         }
      }

      return new d5(var2, var6, var4, var8);
   }

   private d5 l6() {
      double var1 = this.l6.l6(0).n5();
      double var3 = this.l6.l6(0).n5();
      double var5 = this.l6.l6(0).l6();
      double var7 = this.l6.l6(0).l6();
      int var9 = this.l6.n5();

      for (int var10 = 1; var10 < var9; var10++) {
         if (this.l6.l6(var10).n5() < var1) {
            var1 = this.l6.l6(var10).n5();
         }

         if (this.l6.l6(var10).n5() > var3) {
            var3 = this.l6.l6(var10).n5();
         }

         if (this.l6.l6(var10).l6() < var5) {
            var5 = this.l6.l6(var10).l6();
         }

         if (this.l6.l6(var10).l6() > var7) {
            var7 = this.l6.l6(var10).l6();
         }
      }

      return new d5(var1, var5, var3, var7);
   }

   private void n5(d5 var1) {
      double var2 = var1.n5() - 50.0;
      double var4 = var1.k5() + 50.0;
      double var6 = var1.l6() - 50.0;
      double var8 = var1.u3() + 50.0;
      j4 var10;
      this.l6.n5(var10 = new j4(var2, var6));
      j4 var11;
      this.l6.n5(var11 = new j4(var4, var6));
      j4 var12;
      this.l6.n5(var12 = new j4(var4, var8));
      j4 var13;
      this.l6.n5(var13 = new j4(var2, var8));
      e2 var14;
      this.k5.n5(var14 = new e2(var10, var11));
      e2 var15;
      this.k5.n5(var15 = new e2(var11, var12));
      e2 var16;
      this.k5.n5(var16 = new e2(var12, var13));
      e2 var17;
      this.k5.n5(var17 = new e2(var13, var10));
      this.a6 = new v4();
      this.a6.n5().n5(var10);
      this.a6.n5().n5(var11);
      this.a6.n5().n5(var12);
      this.a6.n5().n5(var13);
      this.a6.l6().n5(var14);
      this.a6.l6().n5(var15);
      this.a6.l6().n5(var16);
      this.a6.l6().n5(var17);
      this.k5();
   }

   private void k5() {
      int var1 = this.a6.n5().n5();

      for (int var2 = 0; var2 < var1; var2++) {
         this.a6.n5().l6(var2).n5(true);
      }
   }
}
