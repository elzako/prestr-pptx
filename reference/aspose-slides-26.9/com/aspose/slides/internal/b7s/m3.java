package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.q1;

public class m3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;

   public m3() {
      this(0);
   }

   public m3(int var1) {
      this.n5 = var1;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 1;
   }

   public final int n5() {
      return this.k5;
   }

   public final int n5(int var1) {
      return var1 != 0 ? 0 : u6.n5(2 * this.l6 + this.u3 - 1);
   }

   public final void n5(int var1, int var2, int var3) {
      com.aspose.slides.internal.f8y.n5.n5(this.u3 != 0, "Condition N[Q] != 0 is violated.");
      this.n5 = this.n5 + q1.n5(var1);
      this.l6 += var1 * (2 * var2 + 1);
      com.aspose.slides.internal.f8y.n5.n5(this.n5 < 16777216, "Condition A[Q] < 65536 * 256 is violated.");
      com.aspose.slides.internal.f8y.n5.n5(q1.n5(this.l6) < 16777216, "Condition Abs(B[Q]) < 65536 * 256 is violated.");
      if (this.u3 == var3) {
         this.n5 >>= 1;
         this.l6 >>= 1;
         this.u3 >>= 1;
      }

      this.u3++;
      if (this.l6 <= -this.u3) {
         this.l6 = this.l6 + this.u3;
         if (this.k5 > -128) {
            this.k5--;
         }

         if (this.l6 <= -this.u3) {
            this.l6 = -this.u3 + 1;
         }
      } else if (this.l6 > 0) {
         this.l6 = this.l6 - this.u3;
         if (this.k5 < 127) {
            this.k5++;
         }

         if (this.l6 > 0) {
            this.l6 = 0;
         }
      }

      com.aspose.slides.internal.f8y.n5.n5(this.u3 != 0, "Condition N[Q] != 0 is violated.");
   }

   public final int l6() {
      int var1;
      for (var1 = 0; this.u3 << var1 < this.n5; var1++) {
         com.aspose.slides.internal.f8y.n5.n5(var1 <= 32, "Condition k <= 32 is violated.");
      }

      return var1;
   }
}
