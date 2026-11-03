package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public class m5 extends g1p {
   private String n5;

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.n5 = var1;
   }

   public m5(String var1) {
      this.n5(var1);
   }

   @Override
   public g1p l6() {
      return new m5(this);
   }

   protected m5(m5 var1) {
      super(var1);
      this.n5(var1.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g1p cloneT() {
      return this.l6();
   }

}
