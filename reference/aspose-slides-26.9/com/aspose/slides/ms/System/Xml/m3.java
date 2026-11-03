package com.aspose.slides.ms.System.Xml;

public final class m3 extends k7 {
   public m3(q0 var1, String var2, String var3) {
      super(var1, var2, var3);
   }

   public m3(m3 var1) {
      super(var1);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new m3(this);
   }

   @Override
   public boolean l6() {
      if (this.u3() == 0) {
         q0 var1 = (q0)this.k5();
         l0 var2 = (l0)var1.n3();
         if (var2.getNodeType() == 1 && this.n5(var2)) {
            this.n5(1);
            return true;
         }
      }

      return super.l6();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
