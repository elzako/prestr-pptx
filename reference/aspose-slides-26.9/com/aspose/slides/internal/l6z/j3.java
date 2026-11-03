package com.aspose.slides.internal.l6z;

public abstract class j3 extends n1 {
   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.r4();
      if ((var2 & 65535) != (this.n5() & 65535)) {
         throw new d1();
      }

      this.l6(var1);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5() & 65535);
      this.l6(var1);
   }

   protected abstract void l6(com.aspose.slides.internal.z0k.n5 var1);

   protected abstract void l6(com.aspose.slides.internal.z0k.l6 var1);

   public abstract int n5();
}
