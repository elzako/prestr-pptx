package com.aspose.slides.internal.e5;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;

class x8$l6 extends k5 {
   private x8 n5;
   private int l6 = 0;
   private boolean k5 = false;
   private boolean u3 = false;

   public x8$l6(x8 var1) {
      this.n5 = var1;
   }

   @Override
   public boolean l6() {
      return this.l6 < this.n5.u3.c8();
   }

   @Override
   public char u3() {
      if (this.l6 < this.n5.u3.c8()) {
         this.k5 = true;
         this.u3 = true;
         return this.n5.u3.k5(this.l6++);
      } else {
         throw new Exception("Element was not found");
      }
   }

   @Override
   public void n5() {
      if (this.k5) {
         this.n5.u3.l6(this.l6);
         this.n5.u3.t2();
         this.l6--;
         this.k5 = false;
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public void n5(char var1) {
      if (this.u3) {
         this.n5.u3.n5(this.l6 - 1, var1);
      } else {
         throw new InvalidOperationException();
      }
   }
}
