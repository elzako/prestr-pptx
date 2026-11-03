package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.r1x.p6;

class u9$n5 {
   private byte[] n5 = null;
   private int l6;
   private int k5;
   private int u3 = 0;
   private int a6;
   private int u9;
   private com.aspose.slides.internal.b8u.k5 h0;

   public u9$n5(com.aspose.slides.internal.b8u.k5 var1) {
      this.h0 = var1;
   }

   public final p6 n5(byte[] var1) {
      new p6();
      int var3 = 0;
      int var4 = var1.length;

      while (var3 < var4) {
         if (this.n5 == null || this.k5 > this.l6 - 1) {
            com.aspose.slides.internal.r1x.u9 var5 = this.h0.u9().n5();
            if (var5.k5 == 1) {
               break;
            }

            if (var5.k5 == 2) {
               p6 var2 = new p6();
               var2.n5 = false;
               var2.k5 = var5.u3;
               return var2;
            }

            this.n5 = var5.n5;
            this.l6 = var5.l6;
            this.k5 = 0;
         }

         if (this.u3 == 0) {
            byte var8 = this.n5[this.k5++];
            if (var8 >= 0 && var8 <= 127) {
               this.u3 = 1;
               this.u9 = var8 + 1;
               this.a6 = 0;
            } else if (var8 <= -1 && var8 >= -127) {
               this.u3 = 2;
               this.u9 = -var8 + 1;
               this.a6 = 0;
            } else {
               this.k5++;
            }
         } else if (this.u3 == 1) {
            while (this.a6 < this.u9 && this.k5 < this.l6 && var3 < var4) {
               var1[var3++] = this.n5[this.k5++];
               this.a6++;
            }

            if (this.a6 == this.u9) {
               this.u3 = 0;
            }
         } else if (this.u3 == 2) {
            byte var7 = this.n5[this.k5];

            while (this.a6 < this.u9 && var3 < var4) {
               var1[var3++] = var7;
               this.a6++;
            }

            if (this.a6 == this.u9) {
               this.k5++;
               this.u3 = 0;
            }
         }
      }

      p6 var6 = new p6();
      var6.n5 = true;
      var6.l6 = var3;
      return var6;
   }
}
