package com.aspose.slides;

class AutoShapeImpBase$l6 extends com.aspose.slides.internal.v6g.h0<AutoShapeImpBase$l6> {
   com.aspose.slides.internal.o9b.j5 n5 = new com.aspose.slides.internal.o9b.j5();
   com.aspose.slides.internal.o9b.j5 l6 = new com.aspose.slides.internal.o9b.j5();

   public AutoShapeImpBase$l6() {
   }

   public AutoShapeImpBase$l6(com.aspose.slides.internal.o9b.j5 var1, com.aspose.slides.internal.o9b.j5 var2) {
      var1.k5(this.n5);
      var2.k5(this.l6);
   }

   public AutoShapeImpBase$l6(int var1, int var2, int var3, int var4) {
      this.n5 = new com.aspose.slides.internal.o9b.j5(var1, var2);
      this.l6 = new com.aspose.slides.internal.o9b.j5(var3, var4);
   }

   public void n5(AutoShapeImpBase$l6 var1) {
      this.n5.k5(var1.n5);
      this.l6.k5(var1.l6);
   }

   public AutoShapeImpBase$l6 n5() {
      AutoShapeImpBase$l6 var1 = new AutoShapeImpBase$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(AutoShapeImpBase$l6 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
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
         return !(obj instanceof AutoShapeImpBase$l6) ? false : this.l6((AutoShapeImpBase$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public AutoShapeImpBase$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(AutoShapeImpBase$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
