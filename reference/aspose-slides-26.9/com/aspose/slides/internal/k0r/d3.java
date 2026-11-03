package com.aspose.slides.internal.k0r;

public class d3 extends r4 {
   private d2a n5 = new d2a(this);
   private r5w l6 = this.n5.k5();

   public d3() {
      super(61453);
   }

   public final r5w l6() {
      return this.l6;
   }

   public final String u3() {
      r5w var1 = this.l6();
      return var1 != null && var1.u9() ? var1.m3() : null;
   }

   public final int a6() {
      r5w var1 = this.l6();
      return var1 != null && var1.a6() ? var1.m1().l6() : 4;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if (!this.x8.n5()) {
         this.x8.n5((byte)15);
      }

      this.n5.n5(var1, this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
   }

   @Override
   public int n5() {
      return this.n5.a6();
   }
}
