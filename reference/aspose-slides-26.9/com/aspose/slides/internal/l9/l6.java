package com.aspose.slides.internal.l9;

import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class l6 extends u3 {
   private com.aspose.slides.internal.o9b.l6 n5;
   private static final x8 l6 = x8.x8();

   public l6(s7 var1) {
      super(var1, "tiff");
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      if (this.n5 != null) {
         return this.n5;
      }

      try {
         s7 var1 = this.t9();
         byte[] var2 = var1.n5();
         e2 var3 = new e2(var2);

         try {
            this.n5 = new com.aspose.slides.internal.o9b.l6(var3);
            return this.n5;
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var9) {
         return null;
      }
   }

   @Override
   public void n5(t4 var1) {
      this.n5();
      if (this.n5 != null) {
         this.n5.n5(var1, l6);
      }
   }
}
