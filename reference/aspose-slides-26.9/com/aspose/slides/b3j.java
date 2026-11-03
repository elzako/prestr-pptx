package com.aspose.slides;

class b3j {
   private com.aspose.slides.internal.k0r.z1 n5 = null;

   public final boolean n5() {
      return this.n5 != null;
   }

   public final void n5(String var1) {
      this.n5 = new com.aspose.slides.internal.k0r.z1(var1, (short)3);
   }

   public final void l6() {
      this.n5 = null;
   }

   public final boolean l6(String var1) {
      return !com.aspose.slides.ms.System.d1.n5(var1) && this.n5 != null ? com.aspose.slides.ms.System.d1.a6(this.n5.l6(), var1) : false;
   }

   public final void n5(com.aspose.slides.internal.k0r.p2 var1) {
      if (var1.z3() != null) {
         this.n5 = new com.aspose.slides.internal.k0r.z1(var1.z3().l6(), var1.z3().y2());
      }
   }

   public final void n5(b3j$n5 var1) {
      if (this.n5 != null) {
         var1.n5(this.n5);
      }
   }
}
