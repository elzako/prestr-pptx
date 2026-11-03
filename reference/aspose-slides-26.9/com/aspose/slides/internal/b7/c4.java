package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class c4 implements IGenericCloneable<c4> {
   private c1 n5 = new c1();
   private l3 l6 = new l3();
   private l3 k5 = new l3();

   public c4() {
      this.n5 = new c1(0.0, 0.0, 0.0);
      this.l6 = new l3(0.0, 0.0, 1.0);
      this.k5 = new l3(0.0, 1.0, 0.0);
   }

   public c4 n5() {
      c4 var1 = new c4();
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
      this.k5.n5(var1.k5);
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c4 cloneT() {
      return this.n5();
   }

}
