package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class e5 implements IGenericCloneable<e5> {
   private String n5;
   private l5 l6;

   public String n5() {
      return this.n5;
   }

   public l5 l6() {
      return this.l6;
   }

   public void n5(l5 var1) {
      if (this.l6 != var1) {
         this.l6 = null != var1 ? var1.n5() : null;
      }
   }

   public e5 k5() {
      return new e5(this);
   }

   private e5(e5 var1) {
      if (null == var1) {
         throw new ArgumentNullException("src");
      }

      this.n5(var1.l6());
      this.n5 = var1.n5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public e5 cloneT() {
      return this.k5();
   }

}
