package com.aspose.slides.internal.v6s;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.r1x.j4;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.internal.u2w.t2;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p3;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public class u3 {
   private v3 n5;
   private byte[] l6;
   private int k5;
   private final long u3;
   private boolean a6 = true;

   public u3(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "The start index should be positive number.");
      }

      if (var2 >= var1.length && var3 > 0) {
         throw new ArgumentOutOfRangeException("startIndex", "The start index should be less than the byte array data length.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("dataLength", "The data length should be positive number.");
      }

      if (var2 + var3 > var1.length) {
         throw new ArgumentOutOfRangeException("dataLength", "The data length is out of byte array bounds.");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   public u3(v3 var1) {
      this.n5 = var1;
      this.u3 = var1.u3();
   }

   public final long n5() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final long n5(byte[] var1, int var2, long var3, long var5) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      }

      long var7 = com.aspose.slides.ms.System.u3.n5((Object)(var1)).u9();
      if (var5 + var2 > var7) {
         throw new ArgumentOutOfRangeException("count", "The number of bytes to retrieve exceeds the array bounds.");
      }

      if (var3 < 0L) {
         throw new ArgumentOutOfRangeException("position", "Incorrect position specified. Must be positive number.");
      }

      long var9 = var3 + this.k5;
      long var11 = var3 + var5;
      long var13 = q1.n5(0L, var5 - q1.n5(0L, var11 - this.u3));
      if (this.l6 != null) {
         synchronized (this.l6) {
            System.arraycopy(this.l6, (int)var9, var1, var2, (int)var13);
         }
      } else {
         synchronized (this.n5.n5()) {
            long var17 = this.n5.l6();
            this.n5.n5(var3, 0);
            if (this.n5.n5(var1, var2, (int)var13) != var13) {
               throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Cannot read ", p3.l6(var13), " bytes from stream."}));
            }

            this.n5.n5(var17);
         }
      }

      return var13;
   }

   public final byte[] n5(long var1, long var3) {
      byte[] var5 = new byte[(int)var3];
      this.n5(var5, 0, var1, var3);
      return var5;
   }

   public final double[] l6(long var1, long var3) {
      double[] var5 = null;
      long var6 = var3 * 8L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x8=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            var5 = this.n5(var8);
         }
      }

      return var5;
   }

   public final float[] k5(long var1, long var3) {
      float[] var5 = null;
      long var6 = var3 * 4L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x4=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            var5 = this.l6(var8);
         }
      }

      return var5;
   }

   public final c8[] u3(long var1, long var3) {
      c8[] var5 = null;
      long var6 = var3 * 8L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x8=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            long[] var9 = this.a6(var8);
            var5 = new c8[(int)var3];

            for (int var10 = 0; var10 < var3; var10++) {
               var5[var10] = new c8(var9[var10 * 2], var9[var10 * 2 + 1]);
            }
         }
      }

      return var5;
   }

   public final t2[] a6(long var1, long var3) {
      t2[] var5 = null;
      long var6 = var3 * 8L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x8=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            int[] var9 = this.k5(var8);
            var5 = new t2[(int)var3];

            for (int var10 = 0; var10 < var3; var10++) {
               var5[var10] = new t2(var9[var10 * 2], var9[var10 * 2 + 1]);
            }
         }
      }

      return var5;
   }

   public final byte[] u9(long var1, long var3) {
      byte[] var5 = null;
      byte[] var6 = this.n5(var1, var3);
      if (var6 != null) {
         var5 = new byte[(int)var3];
         if (var3 <= 2147483647L) {
            y4.n5(var6, 0, var5, 0, (int)var3);
         } else {
            y4.n5(var6, 0, var5, 0, Integer.MAX_VALUE);
            long var7 = var3 - 2147483647L;
            long var9 = 2147483647L;

            for (long var11 = 0L; (var11 & 4294967295L) < var7; var11++) {
               var5[(int)var9] = var6[(int)var9];
               var9++;
            }
         }
      }

      return var5;
   }

   public final int[] h0(long var1, long var3) {
      int[] var5 = null;
      long var6 = var3 * 4L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x4=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            var5 = this.k5(var8);
         }
      }

      return var5;
   }

   public final short[] c8(long var1, long var3) {
      short[] var5 = null;
      long var6 = var3 * 2L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x2=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            var5 = this.u3(var8);
         }
      }

      return var5;
   }

   public final long n5(long var1) {
      long[] var3 = this.t2(var1, 1L);
      long var4 = 0L;
      if (var3 != null && var3.length == 1) {
         var4 = var3[0];
      }

      return var4;
   }

   public final long[] t2(long var1, long var3) {
      long[] var5 = null;
      long var6 = var3 * 4L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x4=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            var5 = this.a6(var8);
         }
      }

      return var5;
   }

   public final int l6(long var1) {
      int[] var3 = this.s7(var1, 1L);
      int var4 = 0;
      if (var3 != null && var3.length == 1) {
         var4 = var3[0];
      }

      return var4;
   }

   public final int[] s7(long var1, long var3) {
      int[] var5 = null;
      long var6 = var3 * 2L;
      if (var6 < 0L) {
         if (this.a6) {
            throw new ArgumentOutOfRangeException("count", d1.n5(new String[]{"Total bytes count is negative. ", p3.l6(var3), "x2=", p3.l6(var6)}));
         }
      } else {
         byte[] var8 = this.n5(var1, var6);
         if (var8 != null) {
            var5 = this.u9(var8);
         }
      }

      return var5;
   }

   public final v3 k5(long var1) {
      t4 var3 = this.n5 == null ? null : this.n5.k5();
      synchronized (j4.n5(var3)) {
         v3 var7;
         if (this.l6 != null) {
            int var5 = (int)(this.u3 - var1);
            e2 var6 = new e2(this.l6, this.k5 + (int)var1, var5);
            var7 = new v3(var6, true);
         } else {
            this.n5.n5(var1, 0);
            t4 var10 = this.n5.k5();
            var7 = new v3(var10);
         }

         return var7;
      }
   }

   protected double[] n5(byte[] var1) {
      double[] var2 = new double[var1.length / 8];
      y4.n5(var1, 0, var2, 0, var1.length);
      return var2;
   }

   protected float[] l6(byte[] var1) {
      float[] var2 = new float[var1.length / 4];
      y4.n5(var1, 0, var2, 0, var1.length);
      return var2;
   }

   protected int[] k5(byte[] var1) {
      int[] var2 = new int[var1.length / 4];
      y4.n5(var1, 0, var2, 0, var1.length);
      return var2;
   }

   protected short[] u3(byte[] var1) {
      short[] var2 = new short[var1.length / 2];
      y4.n5(var1, 0, var2, 0, var1.length);
      return var2;
   }

   protected long[] a6(byte[] var1) {
      long[] var2 = new long[var1.length / 4];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = x8.l6(var1, var3 * 4);
      }

      return var2;
   }

   protected int[] u9(byte[] var1) {
      int[] var2 = new int[var1.length / 2];

      for (int var3 = 0; var3 < var1.length / 2; var3++) {
         var2[var3] = x8.n5(var1, var3 * 2);
      }

      return var2;
   }
}
