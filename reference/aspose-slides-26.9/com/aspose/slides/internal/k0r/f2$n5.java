package com.aspose.slides.internal.k0r;

class f2$n5 {
   char[] n5;
   int l6 = 0;
   short k5 = 0;
   short u3 = 0;
   int a6 = 0;

   private f2$n5() {
   }

   int n5() {
      return (this.n5 == null ? 0 : this.n5.length) + 12;
   }

   void n5(byte[] var1, int var2) {
      if (var1.length >= this.n5() + var2) {
         for (int var3 = 0; var3 < this.n5.length; var3++) {
            var1[var2++] = (byte)this.n5[var3];
         }

         com.aspose.slides.internal.n8e.y2.l6(var1, var2, this.l6);
         com.aspose.slides.internal.n8e.y2.n5(var1, var2 + 4, this.k5);
         com.aspose.slides.internal.n8e.y2.n5(var1, var2 + 6, this.u3);
         com.aspose.slides.internal.n8e.y2.l6(var1, var2 + 8, this.a6);
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/k0r/f2$1;)V -> ()V
   f2$n5(com.aspose.slides.internal.k0r.f2$1 recoveredArg0) {
      this();
   }
}
