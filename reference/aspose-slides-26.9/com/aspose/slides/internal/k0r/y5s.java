package com.aspose.slides.internal.k0r;

public class y5s extends e6r {
   private int n5;
   private e8p l6;
   private e8p k5;
   private e8p u3;

   public y5s() {
      this.w1().n5(61749);
      this.l6 = new e8p();
      this.k5 = new e8p();
      this.u3 = new e8p();
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6.n5(var1);
      this.k5.n5(var1);
      this.u3.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      this.l6.n5(var1);
      this.k5.n5(var1);
      this.u3.n5(var1);
   }

   @Override
   public int n5() {
      return 52;
   }

   public final void n5(e8p var1) {
      this.l6 = var1;
   }

   public final e8p l6() {
      return this.k5;
   }

   public final void l6(e8p var1) {
      this.k5 = var1;
   }

   public final e8p k5() {
      return this.u3;
   }

   public final void k5(e8p var1) {
      this.u3 = var1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.n5 |= 1;
      } else {
         this.n5 &= -2;
      }
   }

   public final boolean u3() {
      return (this.n5 & 2) == 2;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.n5 |= 2;
      } else {
         this.n5 &= -3;
      }
   }

   public final boolean a6() {
      return (this.n5 & 4) == 4;
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.n5 |= 4;
      } else {
         this.n5 &= -5;
      }
   }

   public final boolean u9() {
      return (this.n5 & 8) == 8;
   }

   public final void u3(boolean var1) {
      if (var1) {
         this.n5 |= 8;
      } else {
         this.n5 &= -9;
      }
   }

   public final boolean h0() {
      return (this.n5 & 16) == 16;
   }

   public final void a6(boolean var1) {
      if (var1) {
         this.n5 |= 16;
      } else {
         this.n5 &= -17;
      }
   }
}
