package com.aspose.slides.internal.v6s;

import com.aspose.slides.internal.b8u.m3;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.internal.u2w.t2;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public class a6 implements m3 {
   private final v3 n5;

   public a6(v3 var1) {
      this.n5 = var1;
   }

   @Override
   public final Object n5() {
      return this.n5.n5();
   }

   public final long l6() {
      return this.n5.l6();
   }

   public final void n5(long var1) {
      this.n5.n5(var1);
   }

   public v3 k5() {
      return this.n5;
   }

   public final void n5(byte[] var1, int var2, int var3) {
      this.n5.l6(var1, var2, var3);
   }

   public final void n5(byte[] var1) {
      this.n5.n5(var1);
   }

   public final void n5(double[] var1) {
      byte[] var2 = new byte[var1.length * com.aspose.slides.internal.e0w.n5.u9()[12]];
      this.n5(var1, var2);
      this.n5.n5(var2);
   }

   public final void n5(float[] var1) {
      byte[] var2 = new byte[var1.length * 4];
      this.n5(var1, var2);
      this.n5.n5(var2);
   }

   public final void n5(c8[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         c8 var3 = var1[var2];
         byte[] var4 = new byte[4];
         byte[] var5 = new byte[4];
         if (var3 != null) {
            this.n5(new long[]{var3.l6()}, var4);
            this.n5(new long[]{var3.n5()}, var5);
         }

         this.n5.n5(var4);
         this.n5.n5(var5);
      }
   }

   public final void n5(t2[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         t2 var3 = var1[var2];
         byte[] var4 = new byte[4];
         byte[] var5 = new byte[4];
         if (var3 != null) {
            this.n5(new int[]{var3.l6()}, var4);
            this.n5(new int[]{var3.n5()}, var5);
         }

         this.n5.n5(var4);
         this.n5.n5(var5);
      }
   }

   public final void l6(byte[] var1) {
      byte[] var2 = new byte[var1.length];
      y4.n5(var1, 0, var2, 0, var2.length);
      this.n5.n5(var2);
   }

   public final void n5(int[] var1) {
      byte[] var2 = new byte[var1.length * com.aspose.slides.internal.e0w.n5.u9()[9]];
      this.n5(var1, var2);
      this.n5.n5(var2);
   }

   public final void n5(short var1) {
      short[] var2 = new short[]{var1};
      this.n5(var2);
   }

   public final void n5(short[] var1) {
      byte[] var2 = new byte[var1.length * com.aspose.slides.internal.e0w.n5.u9()[8]];
      this.n5(var1, var2);
      this.n5.n5(var2);
   }

   public final void n5(int var1) {
      int[] var2 = new int[]{var1};
      this.n5(var2);
   }

   public final void l6(long var1) {
      long[] var3 = new long[]{var1};
      this.n5(var3);
   }

   public final void n5(long[] var1) {
      byte[] var2 = new byte[var1.length * com.aspose.slides.internal.e0w.n5.u9()[4]];
      this.n5(var1, var2);
      this.n5.n5(var2);
   }

   public final void l6(int var1) {
      int[] var2 = new int[]{var1};
      this.l6(var2);
   }

   public final void l6(int[] var1) {
      byte[] var2 = new byte[var1.length * com.aspose.slides.internal.e0w.n5.u9()[3]];
      this.l6(var1, var2);
      this.n5.n5(var2);
   }

   protected void n5(int[] var1, byte[] var2) {
      y4.n5(var1, 0, var2, 0, var1.length * 4);
   }

   protected void n5(long[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         byte[] var4 = x8.n5(var1[var3]);
         var2[4 * var3 + 0] = var4[0];
         var2[4 * var3 + 1] = var4[1];
         var2[4 * var3 + 2] = var4[2];
         var2[4 * var3 + 3] = var4[3];
      }
   }

   protected void n5(short[] var1, byte[] var2) {
      y4.n5(var1, 0, var2, 0, var1.length * 2);
   }

   protected void l6(int[] var1, byte[] var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         byte[] var4 = x8.n5(var1[var3]);
         var2[var3 * 2 + 0] = var4[0];
         var2[var3 * 2 + 1] = var4[1];
      }
   }

   protected void n5(float[] var1, byte[] var2) {
      y4.n5(var1, 0, var2, 0, var1.length * 4);
   }

   protected void n5(double[] var1, byte[] var2) {
      y4.n5(var1, 0, var2, 0, var1.length * 8);
   }
}
