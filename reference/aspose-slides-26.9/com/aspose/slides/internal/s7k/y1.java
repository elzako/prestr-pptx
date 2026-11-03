package com.aspose.slides.internal.s7k;

import com.aspose.slides.ms.System.q1;

class y1 extends s7 {
   private int l6;
   private int k5;

   @Override
   public void n5(m1 var1) {
      this.h0 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 10);
      this.n3();
      this.c8 = var1.k5();
      this.k5 = var1.l6();
      this.l6 = var1.l6();
      byte var2;
      switch (this.k5) {
         case 0:
            var2 = 1;
            break;
         case 1:
            var2 = 3;
            break;
         case 2:
            var2 = 4;
            break;
         case 3:
            var2 = 5;
            break;
         case 4:
            var2 = 7;
            break;
         default:
            var2 = 0;
      }

      if (com.aspose.slides.internal.v6g.k5.k5(Integer.valueOf(var2), 8) != 0) {
         this.n5 = var1.u3(com.aspose.slides.internal.v6g.k5.u3(Integer.valueOf(var2), 8));
      }
   }

   @Override
   protected void n3() {
      if (this.h0 != 1885434465) {
         throw new e2();
      }
   }

   @Override
   public boolean l6() {
      switch (this.k5) {
         case 0:
            return d2.n5(this.n5[0]);
         case 1:
         case 2:
         case 3:
         case 4:
            return false;
         default:
            return true;
      }
   }

   @Override
   public float n5(float var1) {
      if (var1 < 0.0) {
         var1 = 0.0F;
      }

      if (var1 > 1.0) {
         var1 = 1.0F;
      }

      switch (this.k5) {
         case 0:
            return (float)q1.a6(var1, this.n5[0]);
         case 1:
            if (var1 >= -this.n5[2] / this.n5[1]) {
               return (float)q1.a6(this.n5[1] * var1 + this.n5[2], this.n5[0]);
            }

            return 0.0F;
         case 2:
            if (var1 >= -this.n5[2] / this.n5[1]) {
               return (float)q1.a6((double)this.n5[1] * var1 + this.n5[2], this.n5[0]) + this.n5[3];
            }

            return this.n5[3];
         case 3:
            if (var1 >= this.n5[4]) {
               return (float)q1.a6((double)this.n5[1] * var1 + this.n5[2], this.n5[0]);
            }

            return this.n5[3] * var1;
         case 4:
            if (var1 >= this.n5[4]) {
               return (float)q1.a6((double)this.n5[1] * var1 + this.n5[2], this.n5[0]) + this.n5[5];
            }

            return this.n5[3] * var1 + this.n5[6];
         default:
            return var1;
      }
   }
}
