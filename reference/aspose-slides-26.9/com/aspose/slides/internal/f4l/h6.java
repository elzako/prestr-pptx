package com.aspose.slides.internal.f4l;

public final class h6 {
   private final byte[] n5;
   private int l6;

   public h6(int var1) {
      this.n5 = new byte[var1];
      this.l6 = 0;
   }

   public final byte[] n5() {
      return this.n5;
   }

   public final boolean n5(byte[] var1) {
      if (this.l6 >= this.n5.length) {
         throw new com.aspose.slides.internal.e2o.n5("Buffer is filled yet.");
      }

      if (this.l6 + var1.length > this.n5.length) {
         throw new com.aspose.slides.internal.e2o.n5("Too much data.");
      }

      com.aspose.slides.ms.System.y4.n5(var1, 0, this.n5, this.l6, var1.length);
      this.l6 += var1.length;
      return this.l6 == this.n5.length;
   }
}
