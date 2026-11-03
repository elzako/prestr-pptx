package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.r1x.p6;

public class x8 extends c8 {
   private final com.aspose.slides.internal.b8u.k5 n5;
   private byte[] l6;
   private int k5;
   private int u3;
   private int a6 = 8;
   private int u9;

   public x8(com.aspose.slides.internal.b8u.k5 var1, int var2) {
      super(var2, 2);
      if (var1 == null) {
         throw new ArgumentNullException("bufferReader");
      }

      this.n5 = var1;
   }

   @Override
   protected int l6(int var1) {
      return var1 - 1;
   }

   @Override
   protected p6 y4() {
      this.a6 = this.a6 + this.u9();
      p6 var1 = new p6();
      var1.n5 = true;

      while (this.a6 > 8) {
         if (this.u9 < this.k5) {
            this.u3 = this.u3 << 8 | this.l6[this.u9++] & 255;
            this.a6 -= 8;
         } else {
            com.aspose.slides.internal.r1x.u9 var2 = this.n5.u9().n5();
            if (var2.k5 != 0) {
               var1.n5 = false;
               var1.k5 = var2.u3;
               break;
            }

            this.l6 = var2.n5;
            this.k5 = var2.l6;
            this.u9 = 0;
         }
      }

      var1.l6 = this.u3 >> 8 - this.a6 & this.h0();
      return var1;
   }
}
