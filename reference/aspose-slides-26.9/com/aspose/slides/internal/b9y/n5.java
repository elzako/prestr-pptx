package com.aspose.slides.internal.b9y;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.y5s.d2;

public class n5 extends u3 {
   private final int n5;
   private final a0 l6;
   private byte[] k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;

   public n5(a0 var1, int var2) {
      this(var1, var2, 0, 1);
   }

   protected n5(a0 var1, int var2, int var3, int var4) {
      super(var2, var3);
      if (var1 == null) {
         throw new ArgumentNullException("streamContainer");
      }

      this.l6 = var1;
      this.n5 = var4;
      this.k5 = new byte[255 + this.n5];
      this.h0 = (1 << this.s7()) - 1;
      this.c8 = this.n5;
      this.u9 = this.n5;
   }

   @Override
   protected d2 n5() {
      d2 var1 = new d2();
      var1.n5 = true;
      int var2 = this.u9();

      while (this.a6 < this.s7()) {
         if (this.u9 < this.c8) {
            this.u3 = (this.k5[this.u9++] & 255) << this.a6 | this.u3;
            this.a6 += 8;
         } else {
            d2 var3 = this.a6().n5();
            if (!var3.n5) {
               return var3;
            }

            this.c8 = var3.l6;
            if (this.c8 <= 0) {
               break;
            }

            this.c8 = this.c8 + this.n5;
            this.u9 = this.n5;
         }
      }

      if (this.c8 > 0) {
         var2 = this.u3 & this.h0;
         this.t2 = this.u3;
         this.u3 = this.u3 >> this.s7();
         this.s7 = this.a6;
         this.a6 = this.a6 - this.s7();
      }

      var1.l6 = var2;
      return var1;
   }

   @Override
   protected d2 l6() {
      d2 var1 = this.n5().n5();
      if (this.c8 != 0 && var1.n5 && var1.l6 != this.h0()) {
         this.k5();
         return this.l6();
      } else {
         return var1;
      }
   }

   protected void k5() {
      this.u3 = this.t2;
      this.u3 >>= 1;
      this.a6 = this.s7;
      this.a6--;
   }

   @Override
   protected void u3() {
      this.h0 = (1 << this.s7()) - 1;
   }

   protected d2 a6() {
      d2 var1 = new d2();
      var1.n5 = false;
      if (this.l6.n5(this.k5, 0, 1) != 1) {
         var1.k5 = "Unexpected end of stream. Cannot decompress data.";
      } else {
         int var2 = this.k5[0] & 255;
         if (this.l6.n5(this.k5, 1, var2) == var2) {
            var1.n5 = true;
            var1.l6 = var2;
         } else {
            var1.k5 = "Unexpected end of stream. Cannot decompress data.";
         }
      }

      return var1;
   }
}
