package com.aspose.slides.internal.l8r;

import java.awt.Rectangle;
import java.io.IOException;

public final class k5 extends com.aspose.slides.internal.n2z.u3 {
   Rectangle l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      super.n5(var1, var2, var3);
      if (this.n5.width < 0) {
         this.l6 = new Rectangle(this.n5);
         this.l6.x = this.l6.x + this.l6.width;
         this.l6.width = -this.l6.width;
      }

      if (this.n5.height < 0) {
         if (this.l6 == null) {
            this.l6 = new Rectangle(this.n5);
         }

         this.l6.y = this.l6.y + this.l6.height;
         this.l6.height = -this.l6.height;
      }

      if (this.l6 == null) {
         this.l6 = this.n5;
      }
   }

   @Override
   public int n5() {
      return 30;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.l6, 1);
   }
}
