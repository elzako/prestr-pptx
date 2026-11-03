package com.aspose.slides.internal.g7;

class g3j {
   private o6 n5 = new o6();
   private r0 l6 = new r0();
   private k6 k5;

   public g3j(k6 var1) {
      this.k5 = var1;
      var1.l6(1000);
   }

   public final k6 n5() {
      return this.k5;
   }

   public final void n5(double var1, double var3) {
      this.n5().n5(var1);
      this.n5().l6(var3);
   }

   public final void l6(double var1, double var3) {
      this.n5().k5(var1);
      this.n5().u3(var3);
   }

   public final void l6() {
      if (this.n5 != null) {
         this.n5().y4().n5(this.n5);
      }

      this.n5 = null;
   }

   public final void n5(double[][] var1, double[][] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         for (int var4 = 0; var4 < var1[var3].length; var4++) {
            if (var4 % 2 == 0) {
               var1[var3][var4] = var1[var3][var4] + this.n5().c8();
            }
         }
      }

      for (int var5 = 0; var5 < var2.length; var5++) {
         for (int var7 = 0; var7 < var2[var5].length; var7++) {
            if (var7 % 2 == 0) {
               var2[var5][var7] = var2[var5][var7] + this.n5().h0();
            }
         }
      }

      s9 var6 = new s9(var1, var2);
      this.n5.n5(var6);
   }

   public final void k5(double var1, double var3) {
      this.n5.n5(new m0(var1 + this.n5().c8(), var3));
   }

   public final void u3(double var1, double var3) {
      this.n5.n5(new h6t(var1 + this.n5().h0(), var3));
   }

   public final void k5() {
      this.n5().y4().n5(this.n5);
      this.n5 = new o6();
   }

   public final void n5(t8 var1) {
      f7 var2 = new f7(var1.n5(), var1.l6());
      var2.n5(this.n5);
      this.n5().u9().n5().n5(var2);
   }

   public final void n5(f3 var1) {
      j0 var2 = new j0(var1.n5(), var1.l6());
      var2.n5(this.n5);
      this.n5().u9().n5().n5(var2);
   }

   public final void n5(h7 var1) {
      z5 var2 = new z5(var1.n5(), var1.l6(), var1.k5(), var1.u3(), var1.a6(), var1.u9());
      var2.n5(this.n5);
      this.n5().u9().n5().n5(var2);
   }

   public final void n5(g4 var1) {
      b5 var2 = new b5(var1.n5(), var1.l6());
      var2.n5(this.n5);
      this.n5().u9().n5().n5(var2);
   }

   final void n5(n4 var1) {
      for (Object recoveredElement$var3$2231 : var1.n5()) {
         q9 var3 = (q9)recoveredElement$var3$2231;
         this.n5().u9().n5().n5(var3);
      }
   }

   final void n5(n4 var1, double var2, double var4) {
      for (Object recoveredElement$var7$2372 : var1.n5()) {
         q9 var7 = (q9)recoveredElement$var7$2372;
         q9 var8 = var7.k5();
         var8.n5(var2, var4);
         this.n5().u9().n5().n5(var8);
      }
   }
}
