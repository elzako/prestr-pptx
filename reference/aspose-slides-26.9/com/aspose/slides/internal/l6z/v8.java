package com.aspose.slides.internal.l6z;

public class v8 extends j3 {
   private long n5;
   private byte[] l6;

   @Override
   public int n5() {
      return 14;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c8((int)this.n5);
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6);
   }
}
