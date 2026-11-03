package com.aspose.slides.internal.t9z;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.m3;

class a6 {
   com.aspose.slides.internal.x4g.u9 n5;
   com.aspose.slides.internal.x4g.u9 l6;

   public a6(m3 var1) {
      if (var1.n3() == 255) {
         try {
            this.n5 = var1.h0();
         } catch (ArgumentException var4) {
         }
      }

      if (var1.y4() == 255) {
         try {
            this.l6 = var1.u9();
         } catch (ArgumentException var3) {
         }
      }
   }

   public void n5(m3 var1) {
      if (this.n5 != null && var1.n3() == 255) {
         var1.l6(this.n5);
      }

      if (this.l6 != null && var1.y4() == 255) {
         var1.n5(this.l6);
      }
   }
}
