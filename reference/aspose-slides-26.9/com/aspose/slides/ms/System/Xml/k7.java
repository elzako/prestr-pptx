package com.aspose.slides.ms.System.Xml;

public class k7 extends w1 {
   protected String n5;
   protected String l6;

   public k7(q0 var1, String var2, String var3) {
      super(var1);
      this.n5 = var2;
      this.l6 = var3;
   }

   public k7(k7 var1) {
      super(var1);
      this.n5 = var1.n5;
      this.l6 = var1.l6;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new k7(this);
   }

   @Override
   protected boolean n5(l0 var1) {
      return v8.n5(var1.getLocalName(), this.n5) && v8.n5(var1.getNamespaceURI(), this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
