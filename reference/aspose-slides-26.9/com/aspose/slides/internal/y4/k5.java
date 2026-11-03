package com.aspose.slides.internal.y4;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class k5 extends n5 {
   public com.aspose.slides.internal.k5.u3 n5;
   public com.aspose.slides.internal.k5.u3 l6;

   public k5(com.aspose.slides.internal.k5.u3 var1, com.aspose.slides.internal.k5.u3 var2) {
      super((short)29);
      this.n5 = var1;
      this.l6 = var2;
   }

   public static k5 n5(com.aspose.slides.internal.k5.u3 var0, com.aspose.slides.internal.k5.u3 var1) {
      return new k5(var0, var1);
   }

   @Override
   public String u9() {
      a5 var1 = new a5();
      var1.n5(this.n5.u9());
      if (this.l6 != null) {
         var1.n5(d1.n5(new String[]{" ", this.l6.u9()}));
      }

      return var1.toString();
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public com.aspose.slides.internal.k5.c8 c8() {
      return new com.aspose.slides.internal.k5.c8(this.n5, this.l6);
   }
}
