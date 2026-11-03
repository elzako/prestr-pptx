package com.aspose.slides.internal.r3;

import com.aspose.slides.internal.q7.c8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class k5 implements c8 {
   private final byte[] n5;

   public k5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public final byte[] n5() {
      return this.n5;
   }

   @Override
   public final t4 l6() {
      return new e2(this.n5);
   }

   @Override
   public final long k5() {
      return com.aspose.slides.internal.v6g.k5.h0(this.n5 == null ? 0 : this.n5.length, 9);
   }

   @Override
   public final void dispose() {
   }
}
