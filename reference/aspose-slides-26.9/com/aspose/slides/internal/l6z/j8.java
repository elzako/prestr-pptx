package com.aspose.slides.internal.l6z;

public class j8 extends n1 {
   private final int n5;
   private s0 l6;
   private int k5;
   private long u3;
   private String a6;
   private long u9;
   private w2 h0;
   private long c8;
   private long t2;
   private String s7;
   private com.aspose.slides.ms.System.o0 x8 = new com.aspose.slides.ms.System.o0();
   private long n3;

   j8(int var1) {
      this.n5 = var1;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 51) {
         this.l6 = new s0();
         this.l6.n5(var1);
      }

      this.k5 = var1.r4();
      if ((this.k5 & 65535) != 47) {
         throw new d1();
      }

      this.u3 = var1.c4();
      this.u9 = var1.c4();
      this.a6 = com.aspose.slides.internal.l6z.k5.n5(var1.c8((int)this.u9), this.n5);
      long var2 = var1.c4();
      if ((var2 & 4294967295L) != 0L) {
         throw new d1();
      }

      int var4 = var1.r4();
      if ((var4 & 65535) != 0) {
         throw new d1();
      }

      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 22) {
         this.h0 = new w2(this.n5);
         this.h0.n5(var1);
      }

      int var5 = var1.r4();
      if ((var5 & 65535) != 48) {
         throw new d1();
      }

      this.c8 = var1.c4();
      this.t2 = var1.c4();
      this.s7 = com.aspose.slides.internal.l6z.k5.n5(var1.c8((int)this.t2), this.n5);
      var1.c4();
      var1.r4();
      byte[] var6 = var1.c8(16);
      this.x8 = new com.aspose.slides.ms.System.o0(var6);
      this.n3 = var1.c4();
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.l6 != null) {
         this.l6.n5(var1);
      }

      var1.n5(47);
      var1.n5(this.u3 & 4294967295L);
      com.aspose.slides.internal.l6z.l6.l6(var1, this.a6, this.n5);
      var1.n5(0L);
      var1.n5(0);
      if (this.h0 != null) {
         this.h0.n5(var1);
      }

      var1.n5(48);
      var1.n5(this.c8 & 4294967295L);
      com.aspose.slides.internal.l6z.l6.l6(var1, this.s7, this.n5);
      var1.n5(0L);
      var1.n5(0);
      var1.n5(this.x8.n5());
      var1.n5(this.n3 & 4294967295L);
   }
}
