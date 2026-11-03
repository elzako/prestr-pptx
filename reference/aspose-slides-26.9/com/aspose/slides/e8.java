package com.aspose.slides;

class e8 extends com.aspose.slides.internal.v6g.h0<e8> {
   public d2k n5 = new d2k();
   public d2k l6 = new d2k();
   public d2k k5 = new d2k();
   public d2k u3 = new d2k();

   public e8() {
   }

   public final double n5() {
      return d2k.l6(this.u3, this.n5).k5();
   }

   public final d2k n5(float var1) {
      d2k var2 = l0h.n5(this.n5.u3(), this.l6.u3(), var1).u3();
      d2k var3 = l0h.n5(this.l6.u3(), this.k5.u3(), var1).u3();
      d2k var4 = l0h.n5(this.k5.u3(), this.u3.u3(), var1).u3();
      d2k var5 = l0h.n5(var2.u3(), var3.u3(), var1).u3();
      d2k var6 = l0h.n5(var3.u3(), var4.u3(), var1).u3();
      return l0h.n5(var5.u3(), var6.u3(), var1);
   }

   public void n5(e8 var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
      this.k5.n5(var1.k5);
      this.u3.n5(var1.u3);
   }

   public e8 l6() {
      e8 var1 = new e8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   private boolean l6(e8 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof e8) ? false : this.l6((e8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public e8 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(e8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
