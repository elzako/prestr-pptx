package com.aspose.slides;

class d6b extends com.aspose.slides.internal.v6g.h0<d6b> {
   public static final d6b n5 = new d6b('\u0000');
   public boolean l6;
   public char k5;
   public char u3;

   public d6b() {
      this.l6 = false;
   }

   public d6b(char var1, char var2) {
      this.l6 = true;
      this.k5 = var1;
      this.u3 = var2;
   }

   public d6b(char var1) {
      this.l6 = false;
      this.k5 = var1;
      this.u3 = 0;
   }

   public final int n5() {
      return this.l6 ? com.aspose.slides.ms.System.t9.n5(this.k5, this.u3) : this.k5;
   }

   @Override
   public String toString() {
      return this.l6 ? com.aspose.slides.ms.System.t9.n5(com.aspose.slides.ms.System.t9.n5(this.k5, this.u3)) : com.aspose.slides.ms.System.d1.n5(this.k5, 1);
   }

   public void n5(d6b var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public d6b l6() {
      d6b var1 = new d6b();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(d6b var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d6b) ? false : this.l6((d6b)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d6b Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d6b bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
