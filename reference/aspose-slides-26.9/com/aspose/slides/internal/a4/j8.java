package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class j8 extends e5 {
   public j8() {
      this.l6((short)16416);
   }

   public j8(b3 var1) {
      super(var1);
   }

   public final short k5() {
      return (short)(this.G_() & 4095);
   }

   @Override
   public int u9() {
      return 0;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, TextContrast: {1}",new Object[]{ super.toString(), this.k5()});
   }
}
