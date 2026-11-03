package com.aspose.slides.internal.v4;

import com.aspose.slides.exceptions.Exception;

class t2$n5 extends com.aspose.slides.internal.e5.k5 {
   private boolean n5 = true;
   private t2 l6;

   public t2$n5(t2 var1) {
      this.l6 = var1;
   }

   @Override
   public boolean l6() {
      return this.n5;
   }

   @Override
   public char u3() {
      if (this.n5) {
         this.n5 = false;
         return t2.n5(this.l6);
      } else {
         throw new Exception("The character element not found");
      }
   }

   @Override
   public void n5() {
      this.l6.n5.l6(this.l6);
   }

   @Override
   public void n5(char var1) {
      t2.n5(this.l6, var1);
   }
}
