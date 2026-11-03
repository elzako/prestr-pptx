package com.aspose.slides.internal.c4i;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class a5 extends p8 {
   private com.aspose.slides.internal.k5w.n5 n5 = new com.aspose.slides.internal.k5w.n5();
   private int l6;
   private byte[] k5;
   private com.aspose.slides.internal.f4l.z7 u3;

   public a5(e5 var1) {
      super(var1);
   }

   @Override
   public short ap_() {
      return super.ap_();
   }

   @Override
   public void n5(short var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      super.n5(var1);
   }

   public final com.aspose.slides.internal.k5w.n5 u3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k5w.n5 var1) {
      if (!com.aspose.slides.internal.j3z.h0.n5(var1.toString())) {
         throw new ArgumentOutOfRangeException("value");
      }

      var1.n5(this.n5);
   }

   public final int u9() {
      return this.l6;
   }

   public final void k5(int var1) {
      this.l6 = var1;
   }

   public final byte[] h0() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final void n5(com.aspose.slides.internal.f4l.z7 var1) {
      this.u3 = var1;
   }
}
