package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class o8 implements IGenericCloneable<o8> {
   private p6 n5;
   private double l6;

   public o8(p6 var1, double var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public p6 n5() {
      return this.n5;
   }

   public void n5(p6 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.n5 = var1;
   }

   public double l6() {
      return this.l6;
   }

   public void n5(double var1) {
      if (!n9q.n5(var1)) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public o8 k5() {
      return new o8(this.n5().n5(), this.l6());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o8 cloneT() {
      return this.k5();
   }

}
