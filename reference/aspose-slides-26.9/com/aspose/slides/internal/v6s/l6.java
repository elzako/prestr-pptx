package com.aspose.slides.internal.v6s;

import com.aspose.slides.internal.r1x.h0;
import com.aspose.slides.internal.r1x.v3;

public final class l6 extends a6 {
   public l6(v3 var1) {
      super(var1);
   }

   @Override
   protected void n5(int[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         h0.n5(var1[var3], var2, var3 * 4);
      }
   }

   @Override
   protected void n5(long[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         h0.n5(var1[var3], var2, var3 * 4);
      }
   }

   @Override
   protected void n5(short[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         h0.n5(var1[var3], var2, var3 * 2);
      }
   }

   @Override
   protected void l6(int[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         h0.l6(var1[var3], var2, var3 * 2);
      }
   }

   @Override
   protected void n5(float[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         h0.n5(var1[var3], var2, var3 * 4);
      }
   }

   @Override
   protected void n5(double[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         h0.n5(var1[var3], var2, var3 * 8);
      }
   }
}
