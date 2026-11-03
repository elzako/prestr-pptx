package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class x7i implements IGenericCloneable<x7i> {
   private o9 n5;
   private final o9[] l6 = new o9[9];

   public x7i() {
   }

   public x7i n5() {
      return new x7i(this);
   }

   private x7i(x7i var1) {
      this.n5 = var1.n5.n3();

      for (int var2 = 0; var2 < this.l6.length; var2++) {
         o9 var3 = var1.l6[var2];
         if (null != var3) {
            this.l6[var2] = var3.n3();
         }
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x7i cloneT() {
      return this.n5();
   }

}
