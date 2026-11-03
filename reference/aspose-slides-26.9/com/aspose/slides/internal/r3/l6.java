package com.aspose.slides.internal.r3;

import com.aspose.slides.internal.q7.c8;
import com.aspose.slides.internal.z0k.n3;
import com.aspose.slides.internal.z0k.t4;

public class l6 implements c8 {
   private final String n5;
   private byte[] l6;

   public l6(String var1) {
      this.n5 = var1;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public final byte[] n5() {
      if (this.l6 == null) {
         this.l6 = com.aspose.slides.internal.z0k.u9.h0(this.n5);
      }

      return this.l6;
   }

   @Override
   public final t4 l6() {
      return new n3(this.n5, 3, 1);
   }

   @Override
   public final long k5() {
      return com.aspose.slides.internal.v6g.k5.h0(this.l6 == null ? 0 : this.l6.length, 9);
   }

   public final String u3() {
      return this.n5;
   }

   public final boolean a6() {
      return com.aspose.slides.internal.z0k.u9.k5(this.n5);
   }
}
