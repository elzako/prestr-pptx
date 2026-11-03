package com.aspose.slides.internal.c4i;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class a6 extends e5 {
   private byte[] n5;

   public a6(e5 var1) {
      super(var1);
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
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
}
