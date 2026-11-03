package com.aspose.slides.ms.System.Xml;

public class j5 extends w1 {
   private String n5;

   public j5(q0 var1, String var2) {
      super(var1);
      this.n5 = var2;
   }

   public j5(j5 var1) {
      super(var1);
      this.n5 = var1.n5;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new j5(this);
   }

   @Override
   protected boolean n5(l0 var1) {
      return v8.n5(var1.getNamespaceURI(), this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
