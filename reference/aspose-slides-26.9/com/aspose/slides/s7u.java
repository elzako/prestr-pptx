package com.aspose.slides;

class s7u extends x3 implements com.aspose.slides.ms.System.a5<s7u> {
   private IPortionFormat n5 = null;

   public s7u() {
   }

   final boolean n5() {
      return null == this.n5;
   }

   public final IPortionFormat l6() {
      return this.n5;
   }

   public final void n5(IPortionFormat var1) {
      this.n5 = var1;
   }

   public final boolean n5(s7u var1) {
      if (var1 == null) {
         return false;
      } else if (this.l6() == null && var1.l6() == null) {
         return true;
      } else {
         return this.l6() != null && var1.l6() != null ? this.l6().equals(var1.l6()) : false;
      }
   }
}
