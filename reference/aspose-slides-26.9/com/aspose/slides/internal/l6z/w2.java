package com.aspose.slides.internal.l6z;

public class w2 extends j3 {
   private final int n5;
   private long l6;
   private String k5;
   private long u3;
   private String a6;

   w2(int var1, String var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.a6 = var2;
   }

   w2(int var1) {
      this.n5 = var1;
   }

   @Override
   public int n5() {
      return 22;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.c4();
      this.k5 = com.aspose.slides.internal.l6z.k5.n5(var1.c8((int)this.l6), this.n5);
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 62) {
         var1.r4();
         this.u3 = var1.c4();
         this.a6 = com.aspose.slides.internal.l6z.n5.n5(var1, (int)this.u3, com.aspose.slides.internal.l7h.t1.z1());
      } else {
         byte[] var2 = com.aspose.slides.internal.l7h.j5.z1().u3(this.k5);
         this.u3 = var2.length & 4294967295L;
         this.a6 = com.aspose.slides.internal.l7h.j5.z1().l6(var2);
      }
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l6z.l6.l6(var1, this.k5, this.n5);
      var1.n5(62);
      com.aspose.slides.internal.l6z.l6.l6(var1, this.a6, com.aspose.slides.internal.l7h.t1.z1());
   }

   public final String l6() {
      return this.k5;
   }
}
