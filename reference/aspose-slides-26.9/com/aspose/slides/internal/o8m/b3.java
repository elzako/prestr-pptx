package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;

public abstract class b3 extends f2 {
   protected byte[] a6;

   protected b3() {
   }

   public byte[] u9() {
      return (byte[])this.a6.clone();
   }

   public void n5(byte[] var1) {
      if (this.u3 != 0) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Key can't be changed at this state."));
      }

      this.a6();
      this.a6 = (byte[])var1.clone();
   }

   @Override
   protected void n5(boolean var1) {
      this.a6();
      super.n5(var1);
   }

   private void a6() {
      if (this.a6 != null) {
         com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
      }
   }
}
