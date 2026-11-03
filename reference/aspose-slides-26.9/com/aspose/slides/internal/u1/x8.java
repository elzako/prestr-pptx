package com.aspose.slides.internal.u1;

public class x8 extends t2 {
   private com.aspose.slides.internal.v2.n5 a6;
   private u3 u9;
   private com.aspose.slides.internal.v2.k5 h0;

   public x8() {
      this.n5.l6(com.aspose.slides.internal.v2.c8.u7f, com.aspose.slides.internal.v2.c8.s2b);
   }

   public x8(com.aspose.slides.internal.v2.k5 var1) {
      super(var1);
      this.h0 = (com.aspose.slides.internal.v2.k5)this.n5().l6(0);
      if (this.h0 != null) {
         try {
            this.u9 = com.aspose.slides.internal.u1.h0.n5(this.h0);
         } catch (RuntimeException var3) {
         }
      }
   }

   @Override
   public float n5(byte[] var1, int var2, int var3) {
      return this.u9.n5(var1, var2, var3);
   }

   @Override
   public float n5(int var1) {
      return this.u9.n5(var1);
   }

   @Override
   public float l6(byte[] var1, int var2, int var3) {
      return this.u9.l6(var1, var2, var3);
   }

   @Override
   public float l6() {
      return this.u9.l6();
   }

   private com.aspose.slides.internal.v2.n5 n5() {
      if (this.a6 == null) {
         this.a6 = (com.aspose.slides.internal.v2.n5)this.n5.u9(com.aspose.slides.internal.v2.c8.p7);
      }

      return this.a6;
   }
}
