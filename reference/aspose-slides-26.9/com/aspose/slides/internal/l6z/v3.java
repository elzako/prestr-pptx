package com.aspose.slides.internal.l6z;

public class v3 extends j3 {
   private final int n5;
   private long l6;
   private long k5;
   private String u3;

   v3(int var1, String var2) {
      this.n5 = var1;
      this.u3 = var2;
   }

   v3(int var1) {
      this.n5 = var1;
   }

   @Override
   public int n5() {
      return 13;
   }

   public final String l6() {
      return this.u3;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = com.aspose.slides.internal.l6z.k5.n5(var1.c8((int)this.k5), this.n5);
      long var2 = var1.c4();
      if ((var2 & 4294967295L) != 0L) {
         throw new d1();
      }

      int var4 = var1.r4();
      if ((var4 & 65535) != 0) {
         throw new d1();
      }
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l7h.j5 var2 = com.aspose.slides.internal.n2d.x8.n5(this.n5);
      byte[] var3 = var2.u3(this.u3);
      this.k5 = var3.length & 4294967295L;
      this.l6 = (this.k5 & 4294967295L) + 10L & 4294967295L;
      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.n5(var3);
      var1.n5(0L);
      var1.n5(0);
   }
}
