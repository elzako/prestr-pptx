package com.aspose.slides.internal.b7s;

public class z8 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;

   public z8() {
   }

   public z8(int var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = (byte)var3 & 255;
      this.u3 = 1;
      this.a6 = 0;
   }

   public final int n5() {
      return this.l6;
   }

   public final int l6() {
      int var1 = this.n5 + (this.u3 >> 1) * this.l6;
      int var2 = this.u3;

      int var3;
      for (var3 = 0; var2 < var1; var3++) {
         var2 <<= 1;
         com.aspose.slides.internal.f8y.n5.n5(var3 <= 32, "Condition k <= 32 is violated.");
      }

      return var3;
   }

   public final void n5(int var1, int var2) {
      if (var1 < 0) {
         this.a6++;
      }

      this.n5 = this.n5 + (var2 + 1 - this.l6 >> 1);
      if (this.u3 == this.k5) {
         this.n5 >>= 1;
         this.u3 >>= 1;
         this.a6 >>= 1;
      }

      this.u3++;
   }

   public final int l6(int var1, int var2) {
      int var3 = var1 & 1;
      int var4 = (var1 + var3) / 2;
      boolean var5 = var3 == 1;
      if ((var2 != 0 || 2 * this.a6 >= this.u3) == var5) {
         com.aspose.slides.internal.f8y.n5.n5(var3 == this.k5(-var4, var2), "Condition map == ComputeMap(-errValAbs, k) is violated.");
         return -var4;
      } else {
         com.aspose.slides.internal.f8y.n5.n5(var3 == this.k5(var4, var2), "Condition map == ComputeMap(errValAbs, k) is violated.");
         return var4;
      }
   }

   public final int k5(int var1, int var2) {
      if (var2 == 0 && var1 > 0 && 2 * this.a6 < this.u3) {
         return 1;
      } else if (var1 < 0 && 2 * this.a6 >= this.u3) {
         return 1;
      } else {
         return var1 < 0 && var2 != 0 ? 1 : 0;
      }
   }
}
