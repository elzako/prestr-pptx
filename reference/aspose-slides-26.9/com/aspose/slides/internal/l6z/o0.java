package com.aspose.slides.internal.l6z;

public class o0 extends j3 {
   private final int n5;
   private long l6;
   private String k5;

   @Override
   public int n5() {
      return 4;
   }

   public o0(int var1) {
      this.n5 = var1;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.c4();
      this.k5 = com.aspose.slides.internal.l6z.k5.n5(var1.c8((int)this.l6), this.n5);
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l6z.l6.l6(var1, this.k5, this.n5);
   }

   public final String l6() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }
}
