package com.aspose.slides.internal.n8e;

public class y5 implements j9 {
   private int n5;
   private byte[] l6;

   public y5(short var1) {
      this.n5 = 2;
      this.l6 = new byte[4];
      y2.n5(this.l6, var1);
   }

   public y5(int var1) {
      this.n5 = 3;
      this.l6 = new byte[4];
      y2.u9(this.l6, var1);
   }

   public y5(float var1) {
      this.n5 = 4;
      this.l6 = com.aspose.slides.ms.System.x8.n5(var1);
   }

   public y5(double var1) {
      this.n5 = 5;
      this.l6 = com.aspose.slides.ms.System.x8.n5(var1);
   }

   public y5(com.aspose.slides.ms.System.j5 var1) {
      com.aspose.slides.ms.System.j5 var2 = com.aspose.slides.ms.System.j5.l6(0L).m3();
      this.n5 = 64;
      this.l6 = new byte[8];
      com.aspose.slides.ms.System.j5 var3 = var1.m3();
      if (com.aspose.slides.ms.System.j5.k5(var1, var2)) {
         var2.u3(var3);
      }

      y2.n5(this.l6, var3.t4());
   }

   public y5(boolean var1) {
      this.n5 = 11;
      this.l6 = new byte[4];
      y2.u9(this.l6, var1 ? 65535 : 0);
   }

   public y5(String var1) {
      this(var1, true);
   }

   public y5(String var1, boolean var2) {
      int var3 = var1.length() + 1;
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var5 = new com.aspose.slides.internal.z0k.l6(var4);
      var5.n5(var3 & 4294967295L);
      if (var3 % 2 == 1) {
         var3++;
      }

      byte[] var6;
      if (var2) {
         this.n5 = 31;
         var6 = new byte[var3 * 2];
         byte[] var7 = com.aspose.slides.internal.n2d.x8.n5(1200).u3(var1);
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var7), com.aspose.slides.ms.System.u3.n5(var6), var7.length);
      } else {
         this.n5 = 30;
         var6 = new byte[var3];
         byte[] var8 = com.aspose.slides.internal.n2d.x8.n5(1251).u3(var1);
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var8), com.aspose.slides.ms.System.u3.n5(var6), var8.length);
      }

      var5.n5(var6);
      var5.l6();
      this.l6 = var4.toArray();
   }

   public y5(int var1, byte[] var2) {
      this.n5 = var1;
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var3);

         try {
            var4.n5(var2);
            this.n5(var3, var4);
            this.l6 = var3.toArray();
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public y5(int var1, byte[] var2, int var3, int var4) {
      this.n5 = var1;
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var6 = new com.aspose.slides.internal.z0k.l6(var5);

         try {
            var6.n5(var2, var3, var4);
            this.n5(var5, var6);
            this.l6 = var5.toArray();
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   public y5(byte[] var1) {
      this.n5 = y2.l6(var1, 0);
      this.l6 = y2.k5(var1, 4, var1.length - 4);
   }

   public y5(byte[] var1, int var2, int var3) {
      this.n5 = y2.l6(var1, var2);
      this.l6 = y2.k5(var1, var2 + 4, var3 - 4);
   }

   public y5(h0 var1) {
      this.n5 = 65;
      byte[] var2 = var1.l6();
      this.l6 = y2.k5(var2, 0, var2.length);
   }

   @Override
   public final byte[] l6() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);

         try {
            var2.n5(this.n5 & 65535);
            var2.n5(0);
            var2.n5(this.l6);
            this.n5(var1, var2);
            var2.l6();
            return var1.toArray();
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.e2 var1, com.aspose.slides.internal.z0k.l6 var2) {
      int var3 = (int)var1.getLength() % 4;
      if (var3 > 0) {
         byte[] var4 = new byte[var3];
         var2.n5(var4);
      }
   }

   public final boolean n5(short[] var1) {
      if (this.n5 == 2) {
         var1[0] = y2.n5(this.l6, 0);
         return true;
      } else {
         var1[0] = 0;
         return false;
      }
   }

   public final boolean n5(int[] var1) {
      if (this.n5 == 3) {
         var1[0] = y2.k5(this.l6, 0);
         return true;
      } else {
         var1[0] = 0;
         return false;
      }
   }

   public final boolean n5(boolean[] var1) {
      if (this.n5 == 11) {
         if (this.l6.length == 2) {
            var1[0] = y2.l6(this.l6, 0) != 0;
         } else {
            var1[0] = y2.u3(this.l6, 0) != 0L;
         }

         return true;
      } else {
         var1[0] = false;
         return false;
      }
   }

   public final boolean n5(float[] var1) {
      if (this.n5 == 4) {
         var1[0] = com.aspose.slides.ms.System.x8.c8(this.l6, 0);
         return true;
      } else {
         var1[0] = 0.0F;
         return false;
      }
   }

   public final boolean n5(double[] var1) {
      if (this.n5 == 5) {
         var1[0] = com.aspose.slides.ms.System.x8.t2(this.l6, 0);
         return true;
      } else {
         var1[0] = 0.0;
         return false;
      }
   }

   public final boolean n5(com.aspose.slides.ms.System.j5[] var1) {
      com.aspose.slides.ms.System.j5.l6(0L).u3(var1[0]);
      if (this.n5 != 64) {
         return false;
      }

      long var2 = 0L;
      long[] var4 = new long[]{0L};
      boolean var5 = !this.n5(var4);
      var2 = var4[0];
      if (var5) {
         return false;
      }

      try {
         com.aspose.slides.ms.System.j5.l6(var2).u3(var1[0]);
         return true;
      } catch (RuntimeException var7) {
         v4.n5(var7);
         return false;
      }
   }

   public final boolean n5(long[] var1) {
      if (this.n5 == 64) {
         long var2 = y2.u3(this.l6, 0);
         long var4 = y2.u3(this.l6, 4);
         var1[0] = var4 << 32 | var2 & 4294967295L;
         return true;
      } else {
         var1[0] = 0L;
         return false;
      }
   }

   public final boolean n5(String[] var1, int var2) {
      if (this.n5 == 30 || this.n5 == 31) {
         if (this.n5 == 31) {
            var2 = 1200;
         }

         try {
            String var3 = com.aspose.slides.internal.n2d.x8.n5(var2).l6(this.l6, 4, this.l6.length - 4);
            int var4 = var3.length();
            int var5 = com.aspose.slides.ms.System.d1.u3(var3, '\u0000');
            var1[0] = var5 < 0 ? var3 : com.aspose.slides.ms.System.d1.n5(var3, var5, var4 - var5);
            return true;
         } catch (RuntimeException var6) {
            v4.n5(var6);
         }
      }

      var1[0] = com.aspose.slides.ms.System.d1.n5;
      return false;
   }

   final boolean n5(byte[][] var1) {
      if (!this.n5()) {
         byte[] var2 = new byte[this.l6.length];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), com.aspose.slides.ms.System.u3.n5((Object)(var2)), var2.length);
         var1[0] = var2;
         return true;
      } else {
         var1[0] = null;
         return false;
      }
   }

   final boolean n5(h0[] var1) {
      if (this.n5 == 65) {
         var1[0] = new h0(this.l6);
         return true;
      } else {
         var1[0] = null;
         return false;
      }
   }

   public final boolean n5() {
      return this.n5 == 30 || this.n5 == 31 || this.n5 == 2 || this.n5 == 3 || this.n5 == 64 || this.n5 == 11 || this.n5 == 4 || this.n5 == 5;
   }
}
