package com.aspose.slides.internal.k0r;

public class x5 extends e6r {
   private short n5;
   private int l6;

   public x5() {
      this.w1().n5(4058);
      this.l6 = 2;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.k7();
      this.l6 = var1.r4() & 65535;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5((short)this.l6);
   }

   @Override
   public int n5() {
      return 4;
   }

   public final short l6() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return (this.l6 & 1) != 0;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.l6 |= 1;
      } else {
         this.l6 &= -2;
      }
   }

   public final boolean u3() {
      return (this.l6 & 8) != 0;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.l6 |= 8;
      } else {
         this.l6 &= -9;
      }
   }

   public final boolean a6() {
      return (this.l6 & 16) != 0;
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.l6 |= 16;
      } else {
         this.l6 &= -17;
      }
   }

   public final boolean u9() {
      return (this.l6 & 32) != 0;
   }

   public final void u3(boolean var1) {
      if (var1) {
         this.l6 |= 32;
      } else {
         this.l6 &= -33;
      }
   }

   public final boolean h0() {
      return (this.l6 & 4) != 0;
   }

   public final void a6(boolean var1) {
      if (var1) {
         this.l6 &= -3;
         this.l6 |= 4;
      } else {
         this.l6 &= -5;
         this.l6 |= 2;
      }
   }
}
