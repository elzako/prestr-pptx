package com.aspose.slides.internal.k0r;

public class m0l extends com.aspose.slides.internal.v6g.h0<m0l> {
   public int n5;
   public int l6;

   static m0l n5(com.aspose.slides.internal.z0k.t4 var0) {
      m0l var1 = new m0l();
      var1.n5 = com.aspose.slides.internal.n8e.y2.n5(var0);
      var1.l6 = com.aspose.slides.internal.n8e.y2.n5(var0);
      return var1;
   }

   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.n5));
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.l6));
   }

   public void n5(m0l var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public m0l n5() {
      m0l var1 = new m0l();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(m0l var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof m0l) ? false : this.l6((m0l)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m0l Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(m0l bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
