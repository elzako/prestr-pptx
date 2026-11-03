package com.aspose.slides.internal.h9q;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class l6 implements k5 {
   protected y1 n5;
   protected float l6;
   protected float k5;

   public l6(y1 var1) {
      this.n5 = new y1(var1.x8(), var1.n3(), var1.s7(), var1.k5());
      this.l6 = this.n5.x8() + this.n5.s7() - 1.0F;
      this.k5 = this.n5.n3() + this.n5.k5() - 1.0F;
   }

   @Override
   public void l6(w1 var1, w1 var2) {
      if (this.n5.l6(var1.l6(), var1.k5())) {
         var2.n5(var1.l6());
         var2.l6(var1.k5());
      } else {
         this.n5(var1, var2);
      }

      this.n5(var2);
   }

   protected void n5(w1 var1, w1 var2) {
      this.k5(var1, var2);
      this.u3(var1, var2);
   }

   protected void k5(w1 var1, w1 var2) {
      if (var1.l6() < this.n5.x8()) {
         int var3 = this.u3(var1);
         var2.n5(var1.l6() + var3 * this.n5.s7());
      } else {
         float var4 = (var1.l6() - this.n5.x8()) % this.n5.s7();
         if (Math.abs(var4 - this.n5.s7()) < 1.0E-5) {
            var4 = 0.0F;
         }

         var2.n5(var4 + this.n5.x8());
      }
   }

   protected void u3(w1 var1, w1 var2) {
      if (var1.k5() < this.n5.n3()) {
         int var3 = this.a6(var1);
         var2.l6(var1.k5() + var3 * this.n5.k5());
      } else {
         float var4 = (var1.k5() - this.n5.n3()) % this.n5.k5();
         if (Math.abs(var4 - this.n5.k5()) < 1.0E-5) {
            var4 = 0.0F;
         }

         var2.l6(var4 + this.n5.n3());
      }
   }

   protected void n5(w1 var1) {
      this.l6(var1);
      this.k5(var1);
   }

   protected void l6(w1 var1) {
      if (var1.l6() < this.n5.x8()) {
         var1.n5(this.n5.x8());
      }

      if (var1.l6() > this.l6) {
         var1.n5(this.l6);
      }
   }

   protected void k5(w1 var1) {
      if (var1.k5() < this.n5.n3()) {
         var1.l6(this.n5.n3());
      }

      if (var1.k5() > this.k5) {
         var1.l6(this.k5);
      }
   }

   protected int u3(w1 var1) {
      return var1.l6() < this.n5.x8() ? (int)Math.ceil((this.n5.x8() - var1.l6()) / this.n5.s7()) : (int)((var1.l6() - this.n5.x8()) / this.n5.s7());
   }

   protected int a6(w1 var1) {
      return var1.k5() < this.n5.n3() ? (int)Math.ceil((this.n5.n3() - var1.k5()) / this.n5.k5()) : (int)((var1.k5() - this.n5.n3()) / this.n5.k5());
   }
}
