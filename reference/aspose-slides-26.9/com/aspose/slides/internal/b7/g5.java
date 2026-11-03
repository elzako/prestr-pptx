package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class g5 implements IGenericCloneable<g5> {
   private p3 n5 = new p3();
   private o3 l6 = new o3();
   private c4 k5;

   public void n5(p3 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      if (this.n5 != var1) {
         this.n5 = var1.n5();
      }
   }

   public void n5(o3 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      if (this.l6 != var1) {
         this.l6 = var1.n5();
      }
   }

   public void n5(c4 var1) {
      if (this.k5 != var1) {
         this.k5 = null != var1 ? var1.n5() : null;
      }
   }

   public g5() {
   }

   public g5 n5() {
      return new g5(this);
   }

   private g5(g5 var1) {
      this.n5(var1.n5);
      this.n5(var1.l6);
      this.n5(var1.k5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g5 cloneT() {
      return this.n5();
   }

}
