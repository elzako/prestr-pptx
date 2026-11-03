package com.aspose.slides.internal.r6o;

import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.z3b.k5;

public class n5 {
   public static n3[] n5(int[] var0) {
      if (var0.length != 2) {
         throw new k5("Invalid value of TIFF Tag YCbCrSubsampling.");
      }

      byte var1 = (byte)var0[0];
      byte var2 = (byte)var0[1];
      return new n3[]{
         new n3((byte)1, var1, var2, (byte)0, (byte)0, (byte)0),
         new n3((byte)2, (byte)1, (byte)1, (byte)0, (byte)1, (byte)0),
         new n3((byte)3, (byte)1, (byte)1, (byte)0, (byte)2, (byte)0)
      };
   }
}
