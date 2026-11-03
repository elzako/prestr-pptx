package com.aspose.slides.internal.r2q;

import com.aspose.slides.internal.r1x.f5;

public class c8 extends a6 {
   private final com.aspose.slides.internal.b8u.n5 u3;
   private final byte[] a6;
   private final int u9;
   private int h0 = 8;

   public c8(com.aspose.slides.internal.b8u.n5 var1, int var2) {
      this.u3 = var1;
      this.a6 = com.aspose.slides.internal.d9r.u9.n5(0).n5(var2);
      this.u9 = this.a6.length;
   }

   public final void u3() {
      if (this.h0 != 8) {
         this.l6++;
         this.h0 = 8;
      }
   }

   public final void a6() {
      this.u9();
      this.u3.a6();
   }

   public final void n5(l6 var1) {
      int var2 = var1.k5();
      int var3 = var1.u3();

      while (var2 > this.h0) {
         this.a6[this.l6] = (byte)(this.a6[this.l6] & 0xFF | var3 >> var2 - this.h0);
         var2 -= this.h0;
         this.l6++;
         this.h0 = 8;
      }

      this.a6[this.l6] = (byte)(this.a6[this.l6] & 0xFF | (byte)((var3 & f5.l6[var2]) << this.h0 - var2) & 0xFF);
      this.h0 -= var2;
      if (this.h0 == 0) {
         this.l6++;
         this.h0 = 8;
      }

      if (this.l6 + 3 > this.u9) {
         this.u9();
      }
   }

   private void u9() {
      if (this.l6 > 0) {
         this.u3.n5(this.a6, this.l6);
         if (this.h0 == 8) {
            com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
         } else {
            this.a6[0] = this.a6[this.l6];
            com.aspose.slides.ms.System.u3.n5(this.a6, 1, this.a6.length - 1);
         }

         this.l6 = 0;
      }
   }
}
