package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class z6 extends j4 {
   private float n5;

   public z6() {
      this.l6((short)16432);
   }

   public z6(b3 var1) {
      super(var1);
   }

   public final int k5() {
      return this.q0() & 0xFF;
   }

   public final float u3() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   protected final boolean n5(z6 var1) {
      return super.n5(var1) && n1.l6(this.u3(), var1.u3());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z6)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ n1.n5(this.u3());
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, PageUnit: {1}, PageScale: {2}",
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t1.class, this.k5()),
         this.u3()
      );
   }

   @Override
   public int u9() {
      return 4;
   }
}
