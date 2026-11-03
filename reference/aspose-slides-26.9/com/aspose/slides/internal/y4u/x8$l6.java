package com.aspose.slides.internal.y4u;

class x8$l6<T extends s7> extends x8$k5 {
   private Class<T> n5;
   private final com.aspose.slides.internal.r1x.v4 l6;
   private final int k5;

   public x8$l6(Class<T> var1, com.aspose.slides.internal.r1x.v4 var2, int var3) {
      super((com.aspose.slides.internal.y4u.n3) null);
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.r1x.v4 var1, com.aspose.slides.internal.r1x.v4 var2) {
      return var2.t4() == this.l6.t4() && var2.q0() == this.l6.q0() && this.k5 == var1.q0();
   }

   @Override
   public s7 n5() {
      return com.aspose.slides.internal.v6g.k5.l6(this.n5);
   }
}
