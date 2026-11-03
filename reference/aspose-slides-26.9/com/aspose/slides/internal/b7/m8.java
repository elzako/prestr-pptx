package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class m8 implements IGenericCloneable<m8> {
   private final double n5;
   private final double l6;
   private final double k5;
   private final double u3;
   private final w9 a6;
   private final j6 u9;

   public m8(double var1, double var3, double var5, double var7) {
      this.l6 = var3;
      this.n5 = var1;
      this.u3 = var7;
      this.k5 = var5;
      this.a6 = new w9(var1, var3);
      this.u9 = new j6(var5 - var1, var7 - var3);
   }

   public m8(w9 var1, j6 var2) {
      this.l6 = var1.l6();
      this.n5 = var1.n5();
      this.u3 = this.l6 + var2.l6();
      this.k5 = this.n5 + var2.n5();
      this.a6 = var1.k5();
      this.u9 = var2.k5();
   }

   public w9 n5() {
      return this.a6;
   }

   public j6 l6() {
      return this.u9;
   }

   public m8 k5() {
      return new m8(this.n5, this.l6, this.k5, this.u3);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m8 cloneT() {
      return this.k5();
   }

}
