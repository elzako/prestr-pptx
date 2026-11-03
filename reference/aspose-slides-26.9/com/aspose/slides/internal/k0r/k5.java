package com.aspose.slides.internal.k0r;

public class k5 extends e6r {
   protected long n5;
   protected int l6;
   protected int k5 = 12298;

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.r4() & 65535;
      this.k5 = var1.r4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5(this.l6 & 65535);
      var1.n5(this.k5);
   }

   @Override
   public int n5() {
      return 8;
   }

   public final boolean l6() {
      return (this.l6 & 1) == 1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.l6 |= 1;
      } else {
         this.l6 &= -2;
      }
   }

   public final boolean k5() {
      return (this.l6 & 2) == 2;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.l6 |= 2;
      } else {
         this.l6 &= -3;
      }
   }

   public final boolean u3() {
      return (this.l6 & 4) == 4;
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.l6 |= 4;
      } else {
         this.l6 &= -5;
      }
   }

   public final long a6() {
      return this.n5;
   }

   public final boolean u9() {
      return (this.c4() & 255) == 1;
   }
}
