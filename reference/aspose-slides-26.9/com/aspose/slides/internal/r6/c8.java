package com.aspose.slides.internal.r6;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

public final class c8 {
   private final c8$n5 n5;
   private int l6;
   private long k5;
   private y2 u3 = new y2();
   private byte[] a6;

   public c8(c8$n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("onCollapsed");
      }

      this.n5 = var1;
      this.n5();
   }

   public final void n5(y2 var1, long var2) {
      if (this.l6 == 0) {
         this.k5 = var2;
         var1.u3(this.u3);
         this.l6 = 1;
      } else if (this.l6 == 2) {
         if (this.a6 != null && this.k5 == var2) {
            y2.n5(this.u3.n3(), var1.n3()).u3(this.u3);
            if (!this.u3.k5()) {
               this.n5.n5(this.k5, this.u3.n3(), this.a6);
            }
         }

         this.n5();
         this.k5 = var2;
         var1.u3(this.u3);
         this.l6 = 1;
      } else {
         this.n5();
         this.k5 = var2;
         var1.u3(this.u3);
         this.l6 = 1;
      }
   }

   public final void n5(y2 var1, com.aspose.slides.internal.o9b.l6 var2) {
      if (this.l6 == 1) {
         y2.n5(this.u3.n3(), var1.n3()).u3(this.u3);
         if (this.u3.k5()) {
            this.n5();
         } else {
            this.a6 = n5(var2);
            this.l6 = 2;
         }
      }
   }

   public final void n5() {
      this.l6 = 0;
      this.k5 = 0L;
      y2.n5.u3(this.u3);
      this.a6 = null;
   }

   private static byte[] n5(com.aspose.slides.internal.o9b.l6 var0) {
      e2 var1 = new e2();

      try {
         var0.n5(var1, x8.k5());
         return var1.toArray();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
