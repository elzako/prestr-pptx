package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class u4 implements IGenericCloneable<u4> {
   private int n5;
   private int l6;

   public u4(int var1, int var2) {
      this.n5(var1);
      this.l6(var2);
   }

   public void n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public void l6(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public u4 n5() {
      return new u4(this.n5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u4 cloneT() {
      return this.n5();
   }

}
