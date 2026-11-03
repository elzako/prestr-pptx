package com.aspose.slides;

final class z6i {
   private final String n5;
   private int l6;
   private boolean k5 = false;
   private com.aspose.slides.internal.r7c.c8 u3 = null;
   private static final com.aspose.slides.ms.System.p6 a6 = com.aspose.slides.ms.System.p6.l6();

   z6i(String var1, boolean var2, int var3) {
      this.n5 = var1;
      this.k5 = var2;
      if (var2) {
         this.u3 = new com.aspose.slides.internal.r7c.c8(var1, 66);
      }

      this.l6 = var3;
   }

   public final int n5() {
      return this.l6;
   }

   public final boolean n5(String var1) {
      return this.k5 ? this.u3.u3(var1) : a6.n5(var1, this.n5) == 0;
   }
}
