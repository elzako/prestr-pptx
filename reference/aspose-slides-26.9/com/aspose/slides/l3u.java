package com.aspose.slides;

class l3u implements j9u {
   private final com.aspose.slides.internal.z0k.t4 n5;

   public l3u(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5 = var1;
   }

   @Override
   public final boolean n5() {
      return this.n5.getPosition() == 0L;
   }

   @Override
   public final void n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         byte[] var2 = com.aspose.slides.internal.l7h.j5.z3().u3(var1);
         this.n5.write(var2, 0, var2.length);
      }
   }
}
