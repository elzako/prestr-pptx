package com.aspose.slides.internal.l6o;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import java.io.OutputStream;

public abstract class n5 {
   private OutputStream n5;

   public n5(OutputStream var1) {
      this.n5 = var1;
   }

   public abstract void n5(t4 var1);

   public void n5() {
      e2 var1 = new e2();

      try {
         this.n5(var1);
         l6.n5(var1, this.n5);
      } finally {
         var1.close();
         this.n5 = null;
      }
   }
}
