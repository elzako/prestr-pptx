package com.aspose.slides;

import java.io.OutputStream;

class c9 extends OutputFile {
   private byte[] n5;

   public c9() {
   }

   public c9(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public void write(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new c9$1(this, stream));
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.n5 != null && this.n5.length > 0) {
         var1.write(this.n5, 0, this.n5.length);
      }
   }
}
