package com.aspose.slides.internal.l6z;

class z8 extends j3 {
   private final int n5;
   private long l6;
   private String k5;
   private long u3;
   private String a6;

   public z8(int var1, String var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.a6 = var2;
   }

   public z8(int var1) {
      this.n5 = var1;
   }

   @Override
   public int n5() {
      return 26;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.c4();
      this.k5 = com.aspose.slides.internal.l6z.k5.n5(var1.c8((int)this.l6), this.n5);
      int var2 = var1.r4();
      if ((var2 & 65535) != 50) {
         throw new d1();
      }

      this.u3 = var1.c4();
      this.a6 = com.aspose.slides.internal.l6z.n5.n5(var1, (int)this.u3, com.aspose.slides.internal.l7h.t1.z1());
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l6z.l6.l6(var1, this.k5, this.n5);
      var1.n5(50);
      com.aspose.slides.internal.l6z.l6.l6(var1, this.a6, com.aspose.slides.internal.l7h.t1.z1());
   }

   public final String l6() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }
}
