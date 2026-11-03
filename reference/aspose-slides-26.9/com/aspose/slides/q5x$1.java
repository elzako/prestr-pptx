package com.aspose.slides;

class q5x$1 extends com.aspose.slides.internal.b8.s7 {
   // $VF: synthetic field
   final InterruptionToken n5;
   // $VF: synthetic field
   final q5x l6;

   q5x$1(q5x var1, InterruptionToken var2) {
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
