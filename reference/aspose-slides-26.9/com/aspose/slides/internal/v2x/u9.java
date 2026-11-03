package com.aspose.slides.internal.v2x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.z0k.t4;

public class u9 extends com.aspose.slides.internal.e2l.n5 {
   private byte n5;
   private byte[] l6;

   public u9() {
   }

   public u9(byte var1, byte[] var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var1.writeByte((byte)33);
      var1.writeByte(this.n5);
      if (this.l6 != null) {
         com.aspose.slides.internal.e2l.a6.n5(this.l6, var1);
      } else {
         var1.writeByte((byte)0);
      }
   }
}
