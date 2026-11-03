package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class t2 {
   public static double[] n5(double[] var0) {
      return (double[])var0.clone();
   }

   public static byte[] n5(Byte[] var0) {
      byte[] var1 = new byte[var0.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0[var2];
      }

      return var1;
   }

   public static byte[] n5(List<Byte> var0) {
      byte[] var1 = new byte[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Byte)var0.get_Item(var2);
      }

      return var1;
   }

   public static int[] l6(List<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Integer)var0.get_Item(var2);
      }

      return var1;
   }
}
