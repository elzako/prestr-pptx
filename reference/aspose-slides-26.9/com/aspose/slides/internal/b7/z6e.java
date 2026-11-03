package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class z6e implements IGenericCloneable<z6e> {
   private boolean n5;
   private boolean l6;
   private double k5;
   private w9 u3 = new w9(0.0, 0.0);
   private j6 a6 = new j6(0.0, 0.0);

   public z6e() {
      this(new w9(0.0, 0.0), new j6(0.0, 0.0));
   }

   public z6e(w9 var1, j6 var2, double var3, boolean var5, boolean var6) {
      this.n5 = var5;
      this.l6 = var6;
      this.k5 = var3;
      this.n5(var1);
      this.n5(var2);
   }

   public z6e(w9 var1, j6 var2) {
      this.n5 = false;
      this.l6 = false;
      this.k5 = 0.0;
      this.n5(var1);
      this.n5(var2);
   }

   public w9 n5() {
      return this.u3;
   }

   public void n5(w9 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.u3 = var1.k5();
   }

   public j6 l6() {
      return this.a6;
   }

   public void n5(j6 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.a6 = var1.k5();
   }

   public boolean k5() {
      return this.l6;
   }

   public double u3() {
      return this.k5;
   }

   public z6e a6() {
      return new z6e(this.u3, this.a6, this.k5, this.n5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z6e cloneT() {
      return this.a6();
   }

}
