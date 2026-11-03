package com.aspose.slides.internal.q5;

import com.aspose.slides.exceptions.InvalidOperationException;

public class t2$h0 implements com.aspose.slides.internal.q9.l6 {
   private int n5 = 0;
   private t2$l6 l6 = null;
   private t2 k5;

   public t2$h0(t2$l6 var1, t2 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public final boolean n5() {
      if (this.l6 == null) {
         return this.n5 < this.k5.a6();
      }

      while (this.n5 < this.k5.a6()) {
         if (this.l6.n5(this.k5.n5(this.n5), this.k5.l6(this.n5), this.k5.k5(this.n5), this.k5.u3(this.n5))) {
            return true;
         }

         this.n5++;
      }

      return false;
   }

   @Override
   public final Object l6() {
      if (!this.n5()) {
         throw new InvalidOperationException();
      } else {
         return this.k5.u9(this.n5++);
      }
   }
}
