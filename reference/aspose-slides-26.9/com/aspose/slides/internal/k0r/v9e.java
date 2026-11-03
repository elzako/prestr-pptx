package com.aspose.slides.internal.k0r;

public class v9e {
   private d2n n5 = new d2n();
   private s1o l6 = new s1o();
   private x4a k5 = new x4a();

   public d2n n5() {
      return this.n5;
   }

   public s1o l6() {
      return this.l6;
   }

   public x4a k5() {
      return this.k5;
   }

   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
      this.k5.n5(var1);
   }

   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
      this.k5.n5(var1);
   }

   int u3() {
      return this.n5.z8() + this.l6.q0() + this.k5.c8();
   }

   public boolean n5(v9e var1) {
      if (!this.n5.k5(var1.n5())) {
         return false;
      } else {
         return !this.l6.k5(var1.l6()) ? false : this.k5.n5(var1.k5());
      }
   }
}
