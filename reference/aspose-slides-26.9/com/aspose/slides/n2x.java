package com.aspose.slides;

class n2x extends com.aspose.slides.internal.c8m.o5 {
   private final ChartDataWorkbook n5;
   private final p6f l6;
   private int k5;
   private int u3;

   public n2x(com.aspose.slides.internal.c8m.b6 var1, ChartDataWorkbook var2) {
      super(var1);
      this.n5 = var2;
      this.l6 = new p6f();
   }

   public com.aspose.slides.internal.c8m.b6 n5() {
      return (com.aspose.slides.internal.c8m.b6)super.v4();
   }

   void n5(String var1, int var2) {
      if (this.n5.u3() != null && this.n5.u3().n5() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.n5.u3().n5());
      }
   }

   public int l6() {
      return ++this.k5;
   }

   public int k5() {
      return ++this.u3;
   }

   final p6f u3() {
      return this.l6;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.c8m.b6 v4() {
      return this.n5();
   }

}
