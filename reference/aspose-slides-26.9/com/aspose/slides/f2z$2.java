package com.aspose.slides;

class f2z$2 extends com.aspose.slides.internal.b8.s7 {
   // $VF: synthetic field
   final InterruptionToken n5;
   // $VF: synthetic field
   final f2z l6;

   f2z$2(f2z var1, InterruptionToken var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public String getDelegateId() {
      return System.identityHashCode(this.n5) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
   }

   @Override
   public void n5() {
      this.n5.throwIfInterruptionRequested();
   }
}
