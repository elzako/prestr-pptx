package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

final class m2a extends y4f {
   private final byte h0;

   public m2a(j5m var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3, byte var4, boolean var5) {
      super(var1, var5);
      this.n5 = 3;
      this.n5(var2.o8());
      this.l6(var3.o8());
      this.h0 = var4;
   }

   public final byte y4() {
      return this.h0;
   }

   public final com.aspose.slides.internal.o9b.t4 e2() {
      if (this.u3() != 3) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"GetPatternImage for ", com.aspose.slides.ms.System.s3.n5(FillType.class, this.u3()), " filling called"})
         );
      } else {
         return PatternFormat.n5(false, this.h0, this.l6().o8(), this.n5().o8());
      }
   }
}
