package com.aspose.slides;

import java.io.OutputStream;

class Presentation$5 extends com.aspose.slides.internal.l6o.n5 {
   // $VF: synthetic field
   final int[] n5;
   // $VF: synthetic field
   final int l6;
   // $VF: synthetic field
   final ISaveOptions k5;
   // $VF: synthetic field
   final Presentation u3;

   Presentation$5(Presentation var1, OutputStream var2, int[] var3, int var4, ISaveOptions var5) {
      super(var2);
      this.u3 = var1;
      this.n5 = var3;
      this.l6 = var4;
      this.k5 = var5;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.u3.n5(var1, this.n5, this.l6, this.k5);
   }
}
