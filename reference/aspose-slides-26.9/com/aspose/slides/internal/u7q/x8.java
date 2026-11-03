package com.aspose.slides.internal.u7q;

import com.aspose.slides.ms.System.q1;

class x8 extends n5 {
   private short l6;

   @Override
   public void n5(com.aspose.slides.internal.w2i.s7 var1) {
      this.h0 = (int)var1.k5();
      this.y4();
      this.c8 = var1.k5();
      this.l6 = (short)var1.l6();
      var1.l6();
      byte var2;
      switch (this.l6) {
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

      if ((var2 & '\uffff') != 0) {
         this.n5 = var1.u3(var2 & 65535);
      }
   }

   @Override
   public boolean l6() {
      switch (this.l6) {
         case 0:
            return com.aspose.slides.internal.g7i.k5.n5(this.n5[0]);
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
      var1 = com.aspose.slides.internal.g7i.k5.k5(var1);
      switch (this.l6) {
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

   @Override
   protected void y4() {
      if (this.h0 != 1885434465) {
         throw new com.aspose.slides.internal.d3l.h0();
      }
   }
}
