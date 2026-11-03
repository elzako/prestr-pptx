package com.aspose.slides.internal.v2x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.t4;

public class l6 extends com.aspose.slides.internal.e2l.n5 {
   private String n5 = " ";

   public l6() {
   }

   public l6(String var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var1.writeByte((byte)33);
      var1.writeByte((byte)-2);
      byte[] var2 = j5.e2().u3(this.n5);
      com.aspose.slides.internal.e2l.a6.n5(var2, var1);
   }
}
