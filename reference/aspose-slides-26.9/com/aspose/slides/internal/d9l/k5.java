package com.aspose.slides.internal.d9l;

import com.aspose.slides.exceptions.NotSupportedException;

class k5 {
   public static n5 n5(byte var0, byte var1, byte var2, byte var3) {
      switch (var0) {
         case 3:
            return new n5(var0, var1, var2, var3);
         case 4:
            return new l6(var0, var1, var2, var3);
         default:
            throw new NotSupportedException("Only 3D and 4D CLUT are supported");
      }
   }
}
