package com.aspose.slides.internal.k0r;

public class l8r {
   private long n5;
   private u7f l6 = new u7f();

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final u7f l6() {
      return this.l6;
   }

   public final void n5(u7f var1) {
      this.l6 = var1;
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1, int var2) {
      this.n5 = var1.c4();
      this.l6 = new u7f();
      if ((this.n5 & 4294967295L) > var2) {
         this.n5 = var2 & 4294967295L;
         var1.x8().setPosition(var1.x8().getPosition() - 4L);
      } else {
         this.l6.n5(var1);
      }
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6.n5(var1);
   }

   final int k5() {
      return 4 + this.l6.q0();
   }

   final boolean n5(l8r var1) {
      return this.l6.k5(var1.l6);
   }
}
