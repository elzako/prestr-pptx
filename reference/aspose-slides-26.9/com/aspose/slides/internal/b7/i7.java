package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class i7 implements IGenericCloneable<i7> {
   private int n5;
   private int l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "lg", "med", "sm", "arrow", "diamond", "none", "oval", "stealth", "triangle"
   );

   public void n5(int var1) {
      this.l6 = var1;
   }

   public void l6(int var1) {
      this.n5 = var1;
   }

   public void k5(int var1) {
      this.k5 = var1;
   }

   public i7() {
      this.l6 = -1;
      this.n5 = -1;
      this.k5 = -1;
   }

   public i7(int var1, int var2, int var3) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = var3;
   }

   public i7 n5() {
      return new i7(this.l6, this.n5, this.k5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public i7 cloneT() {
      return this.n5();
   }

}
