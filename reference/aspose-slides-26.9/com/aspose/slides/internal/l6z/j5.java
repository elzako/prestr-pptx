package com.aspose.slides.internal.l6z;

public class j5 extends j3 {
   private int n5;

   @Override
   public int n5() {
      return this.n5;
   }

   public final boolean l6() {
      return (this.n5 & 65535) == 33;
   }

   public final void n5(boolean var1) {
      this.n5 = 33;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.r4();
      if ((this.n5 & 65535) != 33 && (this.n5 & 65535) != 34) {
         throw new d1();
      }

      this.l6(var1);
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.c4();
      if ((var2 & 4294967295L) != 0L) {
         throw new d1();
      }
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(0L);
   }
}
