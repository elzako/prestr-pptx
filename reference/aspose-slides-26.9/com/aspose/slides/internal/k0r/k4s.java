package com.aspose.slides.internal.k0r;

import com.aspose.slides.IGenericCloneable;

public class k4s implements IGenericCloneable<k4s> {
   private boolean n5;
   private boolean l6;
   private boolean k5;

   public k4s() {
      this.n5(false);
      this.l6(false);
      this.k5(false);
   }

   public k4s(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1);
   }

   public k4s(boolean var1, boolean var2, boolean var3) {
      this.n5(var1);
      this.l6(var2);
      this.k5(var3);
   }

   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      short var2 = var1.k7();
      this.n5((var2 & 1) != 0);
      this.l6((var2 & 2) != 0);
      this.k5((var2 & 4) != 0);
   }

   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      byte var2 = 0;
      if (this.k5()) {
         var2 |= 1;
      }

      if (this.u3()) {
         var2 |= 2;
      }

      if (this.a6()) {
         var2 |= 4;
      }

      var1.n5((int)var2);
   }

   int n5() {
      return 2;
   }

   boolean n5(k4s var1) {
      if (this.k5() != var1.k5()) {
         return false;
      } else {
         return this.u3() != var1.u3() ? false : this.a6() == var1.a6();
      }
   }

   public k4s l6() {
      return new k4s(this.k5(), this.u3(), this.a6());
   }

   public boolean k5() {
      return this.k5;
   }

   public void n5(boolean var1) {
      this.k5 = var1;
   }

   public boolean u3() {
      return this.l6;
   }

   public void l6(boolean var1) {
      this.l6 = var1;
   }

   public boolean a6() {
      return this.n5;
   }

   public void k5(boolean var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k4s cloneT() {
      return this.l6();
   }

}
