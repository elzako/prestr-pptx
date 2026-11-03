package com.aspose.slides;

final class v3z {
   private int n5;
   private y2q l6;
   private com.aspose.slides.internal.k0r.o6t k5;

   v3z(int var1, y2q var2) {
      this.l6 = var2;
      this.n5 = var1;
      this.k5 = new com.aspose.slides.internal.k0r.o6t();
      this.k5.n5(this.n5, false);
      if (this.k5.u3().size() > 0) {
         this.k5.u3().get_Item(0).l6().n5(new com.aspose.slides.ms.System.o5<>((byte)0));
      }
   }

   final void n5() {
      for (int var1 = 4; var1 > 0; var1--) {
         if (this.k5.u3().get_Item(var1) != null && this.k5.u3().get_Item(var1 - 1) != null) {
            this.k5.u3().get_Item(var1).l6(this.k5.u3().get_Item(var1 - 1));
         }
      }
   }

   final com.aspose.slides.internal.k0r.o6t l6() {
      return this.k5;
   }
}
