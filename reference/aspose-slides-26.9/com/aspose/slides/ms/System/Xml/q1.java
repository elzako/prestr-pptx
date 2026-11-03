package com.aspose.slides.ms.System.Xml;

public class q1 extends v9 {
   private v9 n5;
   private z6 l6;
   private y7 k5;
   private v6 u3;
   private com.aspose.slides.internal.z0k.a0 a6;
   private com.aspose.slides.internal.z0k.t4 u9;

   private q1(y7 var1) {
      this.k5 = var1.e2();
      this.k5.k5(true);
      this.u3 = new v6(com.aspose.slides.ms.System.d1.n5, true);
   }

   public q1(com.aspose.slides.internal.z0k.a0 var1, y7 var2) {
      this(var2);
      this.a6 = var1;
   }

   public q1(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      this(var2);
      this.u9 = var1;
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      this.l6(0);
      this.n5.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      if (this.n5 == null) {
         if (var3.length() == 0 && s7(var2)) {
            this.a6(1);
         } else {
            this.a6(0);
         }
      }

      this.n5.n5(var1, var2, var3);
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      this.l6(0);
      this.n5.u3(var1, var2, var3);
   }

   @Override
   public void l6() {
      this.n5.l6();
   }

   @Override
   public void a6(String var1) {
      if (this.x8(var1)) {
         this.n5.a6(var1);
      } else {
         this.u3.a6(var1);
      }
   }

   @Override
   public void u9(String var1) {
      if (this.n5 == null) {
         this.u3.u9(var1);
      } else {
         this.n5.u9(var1);
      }
   }

   @Override
   public void n5(String var1, String var2) {
      if (this.n5 == null) {
         this.u3.n5(var1, var2);
      } else {
         this.n5.n5(var1, var2);
      }
   }

   @Override
   public void h0(String var1) {
      if (this.n5 == null) {
         this.u3.h0(var1);
      } else {
         this.n5.h0(var1);
      }
   }

   @Override
   public void l6(String var1) {
      if (this.x8(var1)) {
         this.n5.l6(var1);
      } else {
         this.u3.l6(var1);
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      this.l6(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      this.c8(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
   }

   @Override
   public void c8(String var1) {
      if (this.x8(var1)) {
         this.n5.c8(var1);
      } else {
         this.u3.c8(var1);
      }
   }

   @Override
   public void k5(String var1) {
      this.l6(0);
      this.n5.k5(var1);
   }

   @Override
   public void n5(char var1) {
      this.l6(0);
      this.n5.n5(var1);
   }

   @Override
   public void n5(char var1, char var2) {
      this.l6(0);
      this.n5.n5(var1, var2);
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) {
      this.l6(0);
      this.n5.n5(var1, var2, var3);
   }

   @Override
   public void l6(byte[] var1, int var2, int var3) {
      this.l6(0);
      this.n5.l6(var1, var2, var3);
   }

   @Override
   public void a6() {
      this.l6(0);
      this.n5.a6();
   }

   @Override
   public void u9() {
      this.l6(0);
      this.n5.u9();
   }

   @Override
   public void t2(String var1) {
      this.l6(0);
      this.n5.t2(var1);
   }

   @Override
   public void n5(a3 var1) {
      this.f2 = var1;
      if (this.n5 == null) {
         this.u3.n5(var1);
      } else {
         this.n5.n5(var1);
      }
   }

   @Override
   public void n5(int var1) {
      this.l6(0);
      this.n5.n5(var1);
   }

   @Override
   public void n5(String var1) {
      this.l6(0);
      this.n5.n5(var1);
   }

   @Override
   public void n5() {
      this.n5.n5();
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.n5.l6(var1, var2, var3);
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      this.n5.k5(var1, var2, var3);
   }

   @Override
   public void l6(String var1, String var2) {
      this.l6(0);
      this.n5.l6(var1, var2);
   }

   @Override
   public boolean aa_() {
      return this.n5.aa_();
   }

   @Override
   public void u3(String var1) {
      this.l6(0);
      this.n5.u3(var1);
   }

   @Override
   public void u3() {
      this.n5.u3();
   }

   private static boolean s7(String var0) {
      if (var0.length() != 4) {
         return false;
      } else if (var0.charAt(0) != 'H' && var0.charAt(0) != 'h') {
         return false;
      } else if (var0.charAt(1) != 'T' && var0.charAt(1) != 't') {
         return false;
      } else {
         return var0.charAt(2) != 'M' && var0.charAt(2) != 'm' ? false : var0.charAt(3) == 'L' || var0.charAt(3) == 'l';
      }
   }

   private void l6(int var1) {
      if (this.n5 == null) {
         this.a6(var1);
      }
   }

   private boolean x8(String var1) {
      if (this.n5 == null) {
         if (u4.n5().n5(var1)) {
            return false;
         }

         this.a6(0);
      }

      return true;
   }

   private void a6(int var1) {
      this.k5.k5(false);
      this.k5.n5(var1);
      if (var1 == 1 && this.k5.z8() == -1) {
         this.k5.l6(true);
      }

      this.k5.k5(true);
      if (this.a6 != null) {
         this.n5 = ((b6)n5(this.a6, this.k5)).n5();
      } else {
         this.n5 = ((b6)n5(this.u9, this.k5)).n5();
      }

      this.u3.h0();
      this.u3.n5(this.n5);
      if (this.l6 != null) {
         this.l6.n5(this.n5);
      }
   }
}
