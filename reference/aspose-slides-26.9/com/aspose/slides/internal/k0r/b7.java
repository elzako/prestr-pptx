package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class b7 extends e6r {
   private long n5;
   private long l6;

   public b7() {
      super(61448, (byte)0);
   }

   public final int l6() {
      return com.aspose.slides.internal.n8e.v4.n5(this.w1().k5());
   }

   public final void n5(int var1) {
      if ((var1 & 65535) > 4079) {
         throw new ArgumentOutOfRangeException("value", "Value MUST be less than or equal to 0xFFE.");
      }

      this.w1().n5((short)var1);
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5(this.l6 & 4294967295L);
   }

   @Override
   public int n5() {
      return 8;
   }
}
