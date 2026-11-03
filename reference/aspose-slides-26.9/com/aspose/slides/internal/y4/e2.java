package com.aspose.slides.internal.y4;

import com.aspose.slides.internal.k5.v4;
import com.aspose.slides.ms.System.d1;

public class e2 extends n5 {
   public com.aspose.slides.internal.k5.u3 n5;
   public com.aspose.slides.internal.k5.u3 l6;
   public com.aspose.slides.internal.k5.u3 k5;
   public com.aspose.slides.internal.k5.u3 u3;

   public e2(
      com.aspose.slides.internal.k5.u3 var1,
      com.aspose.slides.internal.k5.u3 var2,
      com.aspose.slides.internal.k5.u3 var3,
      com.aspose.slides.internal.k5.u3 var4
   ) {
      super((short)24);
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public String u9() {
      return d1.n5(new Object[]{"rect(", this.n5.u9(), ", ", this.l6.u9(), ", ", this.k5.u9(), ", ", this.u3.u9(), ')'});
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public v4 u3() {
      return new v4(this.n5, this.l6, this.k5, this.u3);
   }
}
