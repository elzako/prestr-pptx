package com.aspose.slides;

final class r2k$2 extends com.aspose.slides.internal.b8.s7 {
   // $VF: synthetic field
   final InterruptionToken n5;

   r2k$2(InterruptionToken var1) {
      this.n5 = var1;
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
