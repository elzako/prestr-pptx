package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class f1 extends z3 {
   private z6e n5 = new z6e();

   public z6e u9() {
      return this.n5;
   }

   public void n5(z6e var1) {
      if (this.n5 != var1) {
         if (var1 == null) {
            throw new ArgumentNullException("value");
         }

         this.n5 = var1.a6();
         this.k5();
      }
   }

   protected f1(z6e var1) {
      this.n5(var1);
   }
}
