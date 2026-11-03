package com.aspose.slides;

class t6r extends x3 {
   private final SlideShowTransition n5;
   private String l6;
   private com.aspose.slides.internal.k4y.x8 k5;

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.k4y.x8 l6() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.k4y.x8 var1) {
      this.k5 = var1;
   }

   public final void k5() {
      this.k5 = null;
   }

   public t6r(SlideShowTransition var1) {
      this.n5 = var1;
   }

   final boolean n5(t6r var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.k5 == null ^ var1.k5 == null
            ? false
            : com.aspose.slides.ms.System.d1.a6(this.l6, var1.l6)
               && (this.k5 == null || com.aspose.slides.ms.System.u3.n5((Object)(this.k5.n5())).equals(com.aspose.slides.ms.System.u3.n5((Object)(var1.k5.n5()))));
      }
   }
}
