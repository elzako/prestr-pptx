package com.aspose.slides.internal.z4;

import com.aspose.slides.exceptions.InvalidOperationException;

public class a0 extends z1 {
   private com.aspose.slides.internal.z0k.e2 n5 = new com.aspose.slides.internal.z0k.e2();
   private s3 k5 = new s3(this.n5);
   private com.aspose.slides.internal.c1.h0 u3;

   public a0(c8 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.z0k.t4 k5() {
      return this.n5;
   }

   public final s3 u3() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5.n5(var1);
   }

   public final void l6(String var1) {
      this.k5.k5(var1);
   }

   public final void l6(String var1, String var2) {
      this.k5.l6(var1, var2);
   }

   public final void l6(String var1, String var2, String var3) {
      this.k5.l6(var1, var2, var3);
   }

   public final void k5(String var1) {
      this.k5.l6(var1);
   }

   public final void k5(String var1, String var2) {
      this.k5.n5(var1, var2);
      this.k5.u9();
   }

   public final void k5(String var1, String var2, String var3) {
      this.k5.n5(var1, var2, var3);
      this.k5.u9();
   }

   public final void n5(byte[] var1, int var2, int var3) {
      this.k5.n5(var1, var2, var3);
   }

   public final void n5(byte var1) {
      this.k5.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      this.k5.n5(var1.l6());
      this.k5.u9();
      this.k5.n5(var1.k5());
   }

   public final void n5(float[] var1) {
      this.k5.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1, String var2) {
      this.k5.n5(var1);
      this.k5.u9();
      this.k5.n5(var2);
      this.k5.u9();
   }

   public final void u3(String var1) {
      this.k5.a6(var1);
   }

   public void l6(t4 var1) {
   }

   @Override
   public void n5(t4 var1) {
      this.n5(var1, this.n5.getBuffer(), (int)this.n5.getLength());
   }

   public final void n5(t4 var1, byte[] var2, int var3) {
      var1.n5(this);
      var1.c8();
      this.u3 = new com.aspose.slides.internal.c1.h0(this.l6);
      this.l6(var1);
      var1.k5("/Length", this.u3.t2());
      com.aspose.slides.internal.c1.n5 var4 = this.a6();
      if (var4 != null) {
         var4.n5(var1);
      }

      var1.t2();
      var1.k5("stream");
      com.aspose.slides.internal.z0k.t4 var5 = var1.u3();
      com.aspose.slides.internal.d0.k5 var6 = this.e2();
      if (var6 != null) {
         var5 = var6.n5(var5);
      }

      if (var4 != null) {
         var5 = var4.n5(var5);
      }

      long var7 = var5.getLength();
      var5.write(var2, 0, var3);
      long var9 = var5.getLength() - var7;
      var1.h0();
      var1.n5("endstream");
      var1.l6();
      this.u3.n5((int)var9);
      this.u3.n5(var1);
   }

   public com.aspose.slides.internal.c1.n5 a6() {
      if (this.l6.e2()) {
         return null;
      }

      short var1 = 200;
      if (this.u9() < 200L) {
         return null;
      }

      switch (this.l6.l6().u9()) {
         case 0:
            return null;
         case 1:
            return new com.aspose.slides.internal.c1.u9();
         case 2:
            return new com.aspose.slides.internal.c1.a6();
         case 3:
            return new com.aspose.slides.internal.c1.u3();
         default:
            throw new InvalidOperationException("Unknown text compression filter type.");
      }
   }

   protected long u9() {
      return this.n5.getLength();
   }

   protected void t9() {
      this.n5 = null;
      this.k5.s7();
   }
}
