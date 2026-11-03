package com.aspose.slides.internal.s7k;

import com.aspose.slides.exceptions.NotSupportedException;

class c8 {
   public static u9 n5(byte var0, byte var1, byte var2, byte var3) {
      switch (var0) {
         case 3:
            return new u9(var0, var1, var2, var3);
         case 4:
            return new h0(var0, var1, var2, var3);
         default:
            throw new NotSupportedException("Only 3D and 4D CLUT are supported");
      }
   }
}
