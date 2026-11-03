package com.aspose.slides.internal.k0r;

public class f6z extends e6r {
   private byte[] n5;

   public f6z() {
      this.w1().n5(1039);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c8(this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.n5 != null) {
         var1.n5(this.n5);
      }
   }

   @Override
   public int n5() {
      return this.n5 == null ? 0 : this.n5.length;
   }

   public final String l6() {
      return com.aspose.slides.internal.l7h.u6.z3().l6(this.n5);
   }

   public final void n5(String var1) {
      this.n5 = com.aspose.slides.internal.l7h.u6.z3().u3(var1);
   }
}
