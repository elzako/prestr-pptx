package com.aspose.slides.internal.v6s;

import com.aspose.slides.internal.r1x.h0;
import com.aspose.slides.internal.r1x.v3;

public final class n5 extends u3 {
   public n5(byte[] var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public n5(v3 var1) {
      super(var1);
   }

   @Override
   protected double[] n5(byte[] var1) {
      double[] var2 = new double[var1.length / 8];

      for (int var3 = 0; var3 < var1.length / 8; var3++) {
         var2[var3] = h0.k5(var1, var3 * 8);
      }

      return var2;
   }

   @Override
   protected float[] l6(byte[] var1) {
      float[] var2 = new float[var1.length / 4];

      for (int var3 = 0; var3 < var1.length / 4; var3++) {
         var2[var3] = h0.l6(var1, var3 * 4);
      }

      return var2;
   }

   @Override
   protected int[] k5(byte[] var1) {
      int[] var2 = new int[var1.length / 4];

      for (int var3 = 0; var3 < var1.length / 4; var3++) {
         var2[var3] = h0.n5(var1, var3 * 4);
      }

      return var2;
   }

   @Override
   protected short[] u3(byte[] var1) {
      short[] var2 = new short[var1.length / 2];

      for (int var3 = 0; var3 < var1.length / 2; var3++) {
         var2[var3] = h0.u3(var1, var3 * 2);
      }

      return var2;
   }

   @Override
   protected long[] a6(byte[] var1) {
      long[] var2 = new long[var1.length / 4];

      for (int var3 = 0; var3 < var1.length / 4; var3++) {
         var2[var3] = h0.n5(var1, var3 * 4) & 4294967295L;
      }

      return var2;
   }

   @Override
   protected int[] u9(byte[] var1) {
      int[] var2 = new int[var1.length / 2];

      for (int var3 = 0; var3 < var1.length / 2; var3++) {
         var2[var3] = h0.u3(var1, var3 * 2) & '\uffff';
      }

      return var2;
   }
}
