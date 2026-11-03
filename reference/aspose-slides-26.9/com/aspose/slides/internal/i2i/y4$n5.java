package com.aspose.slides.internal.i2i;

import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.w5;

public class y4$n5 {
   private byte[] n5;
   private j5 l6 = new j5();
   private u9 k5;

   y4$n5(com.aspose.slides.internal.x8w.l6 var1) {
      this.n5 = var1.n5(0).u3();
      w5.n5(this.n5);
      this.l6 = com.aspose.slides.internal.x8w.k5.k5(var1.n5(1));
      this.k5 = new u9(var1.n5(2));
   }

   public byte[] n5() {
      return (byte[])this.n5.clone();
   }

   public j5 l6() {
      return this.l6;
   }

   public u9 k5() {
      return this.k5;
   }
}
