package com.aspose.slides;

class v3q {
   t4y n5;
   z9j l6;
   w0l k5;
   w0l u3;
   private int a6 = 2;
   private v9d u9;
   private static final boolean[][] h0 = new boolean[][]{
      {true, false, false, false, false, false, false, false, false, false, false, false},
      {false, false, true, true, true, true, true, false, false, false, false, false}
   };

   public final void n5(v9d var1) {
      this.u9 = var1;
   }

   public v3q(t4y var1) {
      this.n5 = var1;
      this.l6 = new z9j();
   }

   private void n5(int var1) {
      if (this.a6 >= 2) {
         this.l6.n5(this.u3.a6, this.u3.u3, var1);
      }

      this.a6 = 0;
   }

   private void l6() {
      while (true) {
         this.k5 = this.u3;
         this.u3 = this.n5.n5();
         if (this.u3.n5 <= 10) {
            this.a6++;
            return;
         }

         this.u3 = this.k5;
      }
   }

   private void l6(int var1) {
      if (this.u3.n5 == var1) {
         this.l6();
      } else {
         this.n5(var1);
      }
   }

   private boolean k5(int var1) {
      return h0[var1][this.u3.n5];
   }

   private void k5() {
      this.l6(2);
   }

   private void u3() {
      this.l6(3);
   }

   private void a6() {
      this.l6(4);
   }

   private void u9() {
      this.l6(5);
   }

   private void h0() {
      this.l6(6);
   }

   private void c8() {
      this.l6(7);
   }

   private void t2() {
      this.l6(8);
   }

   private void n5(String[] var1) {
      this.k5();
      this.c8();
      this.l6(1);
      var1[0] = this.k5.u9;
      this.t2();
   }

   private void n5(String[] var1, String[] var2) {
      this.u3();
      this.c8();
      this.l6(1);

      for (var2[0] = var1[0] = this.k5.u9; this.u3.n5 == 9; var2[0] = this.k5.u9) {
         this.l6();
         this.l6(1);
      }

      this.t2();
   }

   private void l6(String[] var1) {
      this.a6();
      this.c8();
      this.l6(1);
      var1[0] = this.k5.u9;
      this.t2();
   }

   private void k5(String[] var1) {
      this.u9();
      this.c8();
      this.l6(1);
      var1[0] = this.k5.u9;
      this.t2();
   }

   private void l6(String[] var1, String[] var2) {
      this.h0();
      this.c8();
      this.l6(1);
      var2[0] = "0";

      for (var1[0] = this.k5.u9; this.u3.n5 == 1; var2[0] = this.k5.u9) {
         this.l6();
      }

      this.t2();
   }

   private void s7() {
      String var1 = null;
      String var2 = null;
      if (this.u3.n5 == 2) {
         String[] var3 = new String[]{var1};
         this.n5(var3);
         var1 = var3[0];
         this.u9.n5(var1);
      } else if (this.u3.n5 == 3) {
         String[] var12 = new String[]{var1};
         String[] var4 = new String[]{var2};
         this.n5(var12, var4);
         var1 = var12[0];
         var2 = var4[0];
         this.u9.n5(var1, var2);
      } else if (this.u3.n5 == 4) {
         String[] var13 = new String[]{var1};
         this.l6(var13);
         var1 = var13[0];
         this.u9.l6(var1);
      } else if (this.u3.n5 == 5) {
         String[] var14 = new String[]{var1};
         this.k5(var14);
         var1 = var14[0];
         this.u9.k5(var1);
      } else if (this.u3.n5 == 6) {
         String[] var15 = new String[]{var1};
         String[] var16 = new String[]{var2};
         this.l6(var15, var16);
         var1 = var15[0];
         var2 = var16[0];
         this.u9.l6(var1, var2);
      } else {
         this.n5(11);
      }
   }

   private void x8() {
      this.s7();

      while (this.k5(1)) {
         this.s7();
      }
   }

   public final void n5() {
      this.u3 = new w0l();
      this.u3.u9 = "";
      this.l6();
      this.x8();
      this.l6(0);
   }
}
