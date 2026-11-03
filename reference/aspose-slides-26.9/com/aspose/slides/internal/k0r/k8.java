package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentException;

public class k8 extends b5 {
   private final int n5;

   public k8(int var1, int var2, byte var3) {
      super(var1, var3, true);
      this.n5 = var2;
      if (var1 != 5 && var1 != 6) {
         throw new ArgumentException("Path type can be Escape (0x5) or ClientEscape (0x6).", "type");
      }
   }

   public final int n5() {
      return this.n5;
   }

   @Override
   public int l6() {
      int var1 = com.aspose.slides.internal.n8e.v4.n5((this.u3() & 7) << 13);
      var1 = (var1 & 65535 | (this.n5() & 31) << 8 & 65535) & 65535;
      return (var1 & 65535 | this.k5() & 0xFF & 0xFF & 65535) & 65535;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "EsPathEscapeInfoStructure: Type: {0}, Segments: {1}, Escape: {2}.",
         com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(u8.class), this.u3()),
         this.k5(),
         com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(y5.class), this.n5())
      );
   }
}
