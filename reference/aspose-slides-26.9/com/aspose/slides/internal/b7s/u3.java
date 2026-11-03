package com.aspose.slides.internal.b7s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.j3;

@j3
public class u3 {
   public byte n5;
   private byte[] l6;
   private int[] k5 = new int[256];
   private int[] u3 = new int[256];
   private int[] a6;
   private byte[] u9;
   private byte[] h0 = new byte[256];
   private int c8;
   private int[] t2 = new int[256];
   private int[] s7 = new int[256];
   private int[] x8;
   private short[] n3;
   private boolean y4;
   private int[] e2;

   public u3() {
      this.l6 = new byte[17];
   }

   public u3(byte var1, byte var2, byte[] var3, byte[] var4) {
      this.n5(var2);
      this.l6(var1);
      this.l6 = var3;
      this.h0 = var4;
      this.y4();
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final byte n5() {
      return (byte)(this.n5 & 0xFF & 15);
   }

   public final void n5(byte var1) {
      this.n5 = (byte)(this.n5 & 0xFF & 240 | var1 & 0xFF);
   }

   public final int[] l6() {
      return this.k5;
   }

   public final int[] k5() {
      return this.u3;
   }

   public final int[] u3() {
      return this.a6;
   }

   public final byte[] a6() {
      return this.h0;
   }

   public final int[] u9() {
      return this.t2;
   }

   public final int[] h0() {
      return this.s7;
   }

   public final int[] c8() {
      return this.x8;
   }

   public final boolean t2() {
      return this.y4;
   }

   public final byte s7() {
      return (byte)((this.n5 & 255) >> 4);
   }

   public final void l6(byte var1) {
      this.n5 = (byte)(this.n5 & 0xFF | (var1 & 255) << 4);
   }

   public final int[] x8() {
      return this.e2;
   }

   public final u3 n3() {
      return (u3)com.aspose.slides.internal.r1x.t4.n5(this);
   }

   public final void y4() {
      this.z1();
      this.e2();
      this.t4();
      this.q0();
      this.t9();
   }

   public static u3[] n5(h2 var0) {
      List var1 = new List();
      int var2 = 0;
      int var3 = 2;
      int[] var4 = new int[]{0};
      var0.n5(var4);
      var2 = var4[0];

      while (var3 < var2) {
         u3 var5 = new u3();
         int var6 = 0;
         int[] var7 = new int[]{0};
         var0.l6(var7);
         var6 = var7[0];
         var5.n5 = (byte)var6;
         var3++;
         int var8 = 0;

         for (int var9 = 1; var9 <= 16; var9++) {
            int var10 = 0;
            int[] var11 = new int[]{0};
            var0.l6(var11);
            var10 = var11[0];
            var5.l6[var9] = (byte)var10;
            var8 += var5.l6[var9] & 255;
         }

         var3 += 16;

         for (int var16 = 0; var16 < var8; var16++) {
            int var18 = 0;
            int[] var20 = new int[]{0};
            var0.l6(var20);
            var18 = var20[0];
            var5.h0[var16] = (byte)var18;
         }

         var3 += var8;
         var5.y4();
         var1.addItem(var5);
      }

      return (u3[])var1.toArray(new u3[0]);
   }

   public static void n5(y0 var0, u3[] var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         var0.n5((byte)-1);
         var0.n5((byte)-60);

         for (u3 var6 : var1) {
            var2.writeByte(var6.n5);
            int var7 = 0;

            for (int var8 = 1; var8 <= 16; var8++) {
               var2.writeByte(var6.l6[var8]);
               var7 += var6.l6[var8] & 255;
            }

            for (int var12 = 0; var12 < var7; var12++) {
               var2.writeByte(var6.h0[var12]);
            }

            var6.y4 = true;
         }

         var0.n5((int)(var2.getLength() + 2L));
         var0.n5(var2.toArray());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void e2() {
      this.a6 = new int[257];
      int var1 = 0;
      int var2 = this.u9[0] & 255;
      int var3 = 0;
      byte[] var4 = this.u9;
      int[] var5 = this.u3();

      while ((var4[var3] & 255) != 0) {
         while ((var4[var3] & 255) == var2) {
            var5[var3++] = var1++;
         }

         var1 <<= 1;
         var2++;
      }
   }

   private void t9() {
      com.aspose.slides.ms.System.u3.n5(this.u9(), 0, this.u9().length);
      int var1 = 0;
      int[] var2 = this.a6;
      int[] var3 = this.t2;
      int[] var4 = this.s7;
      byte[] var5 = this.h0;

      for (int var6 = 1; var6 <= 8; var6++) {
         for (int var7 = 1; var7 <= (this.l6[var6] & 255); var1++) {
            int var8 = var2[var1] << 8 - var6;

            for (int var9 = 1 << 8 - var6; var9 > 0; var9--) {
               var3[var8] = (short)var6;
               var4[var8] = var5[var1] & 255;
               var8++;
            }

            var7++;
         }
      }
   }

   private void z1() {
      byte[] var1 = new byte[257];
      int var2 = 0;

      for (byte var3 = 1; (var3 & 255) <= 16; var3++) {
         for (int var4 = 1; var4 <= (this.l6[var3 & 0xFF] & 255); var4++) {
            var1[var2++] = var3;
         }
      }

      var1[var2] = 0;
      this.c8 = var2;
      this.u9 = var1;
   }

   private void t4() {
      this.n3 = new short[18];
      int[] var1 = new int[18];
      int[] var2 = new int[18];
      int[] var3 = this.a6;
      byte[] var4 = this.l6;
      int var5 = 0;

      for (int var6 = 1; var6 <= 16; var6++) {
         if ((var4[var6] & 255) != 0) {
            var2[var6] = var5 - var3[var5];
            var5 += var4[var6] & 255;
            var1[var6] = var3[var5 - 1];
         } else {
            var1[var6] = -1;
         }
      }

      var1[17] = Integer.MAX_VALUE;
      this.x8 = var1;
      this.e2 = var2;
   }

   private void q0() {
      this.k5 = new int[257];
      this.u3 = new int[257];

      for (int var1 = 0; var1 < this.c8; var1++) {
         int var2 = this.h0[var1] & 255;
         this.k5[var2] = this.a6[var1];
         this.u3[var2] = this.u9[var1] & 255;
      }
   }
}
