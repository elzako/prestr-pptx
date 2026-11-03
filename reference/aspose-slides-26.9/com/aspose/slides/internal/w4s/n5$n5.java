package com.aspose.slides.internal.w4s;

import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.z0k.e2;

class n5$n5 {
   public long n5;
   public long l6;
   public long k5;
   public long u3;
   public byte[] a6;
   public String u9;

   private n5$n5() {
   }

   public final void n5() {
      e2 var1 = new e2(this.a6);

      try {
         t4 var2 = t4.n5(var1);

         try {
            var2.n5(this.u9, x8.s7());
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public final void l6() {
      this.a6 = null;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/w4s/n5$1;)V -> ()V
   n5$n5(com.aspose.slides.internal.w4s.n5$1 recoveredArg0) {
      this();
   }
}
