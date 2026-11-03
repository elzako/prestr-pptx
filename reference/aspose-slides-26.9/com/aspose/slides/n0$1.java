package com.aspose.slides;

final class n0$1 extends com.aspose.slides.internal.b8.s7 {
   // $VF: synthetic field
   final t2s n5;

   n0$1(t2s var1) {
      this.n5 = var1;
   }

   @Override
   public String getDelegateId() {
      return System.identityHashCode(this.n5.a6().e2()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
   }

   @Override
   public void n5() {
      this.n5.a6().e2().throwIfInterruptionRequested();
   }
}
