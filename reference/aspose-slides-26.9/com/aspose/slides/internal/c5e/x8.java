package com.aspose.slides.internal.c5e;

import com.aspose.slides.internal.f7v.e5;
import com.aspose.slides.internal.f7v.o0;
import com.aspose.slides.internal.f7v.w2;
import com.aspose.slides.internal.f7v.x9;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.zip.CRC32;
import java.util.zip.InflaterInputStream;

public class x8 {
   public final l6 n5;
   protected final String l6;
   private com.aspose.slides.internal.f7v.k5 t9 = com.aspose.slides.internal.f7v.k5.u3;
   private boolean z1 = true;
   private long t4 = 209715200L;
   private int q0 = 5242880;
   private int z3 = 2097152;
   private String[] m1 = new String[]{"fdAT"};
   private HashSet<String> k7;
   protected final w2 k5;
   protected final com.aspose.slides.internal.f7v.u9 u3;
   protected k5 a6;
   protected byte[] u9 = null;
   protected byte[] h0 = null;
   protected byte[] c8 = null;
   private final boolean m3;
   private final u9 z8;
   private boolean j5 = true;
   private boolean w1 = false;
   protected int t2 = -1;
   protected int s7 = -1;
   private long r4 = 0L;
   private int c4;
   protected final InputStream x8;
   protected InflaterInputStream n3;
   protected t2 y4;
   protected CRC32 e2;

   public x8(InputStream var1, String var2) {
      this.l6 = var2 == null ? "" : var2;
      this.x8 = var1;
      this.u3 = new com.aspose.slides.internal.f7v.u9(null);
      this.k5 = new w2(this.u3);
      byte[] var3 = new byte[8];
      com.aspose.slides.internal.c5e.h0.n5(var1, var3, 0, var3.length);
      this.r4 += var3.length;
      if (!Arrays.equals(var3, com.aspose.slides.internal.c5e.h0.n5())) {
         throw new z1("Bad PNG signature");
      }

      this.t2 = 0;
      int var4 = com.aspose.slides.internal.c5e.h0.l6(var1);
      this.r4 += 4L;
      if (var4 != 13) {
         throw new z1("IDHR chunk len != 13 ?? " + var4);
      }

      byte[] var5 = new byte[4];
      com.aspose.slides.internal.c5e.h0.n5(var1, var5, 0, 4);
      if (!Arrays.equals(var5, com.aspose.slides.internal.f7v.n5.n5)) {
         throw new z1("IHDR not found as first chunk??? [" + com.aspose.slides.internal.f7v.n5.n5(var5) + "]");
      }

      this.r4 += 4L;
      o0 var6 = (o0)this.n5(var5, var4, false);
      boolean var7 = (var6.a6() & 4) != 0;
      boolean var8 = (var6.a6() & 1) != 0;
      boolean var9 = var6.a6() == 0 || var6.a6() == 4;
      this.n5 = new l6(var6.l6(), var6.k5(), var6.u3(), var7, var9, var8);
      this.c8 = new byte[this.n5.x8 + 1];
      this.u9 = new byte[this.n5.x8 + 1];
      this.h0 = new byte[this.u9.length];
      this.m3 = var6.c8() == 1;
      this.z8 = this.m3 ? new u9(this.n5) : null;
      if (var6.h0() != 0 || var6.u9() != 0 || (var6.c8() & 65534) != 0) {
         throw new z1("compression method o filter method or interlaced unrecognized ");
      }

      if (var6.a6() < 0 || var6.a6() > 6 || var6.a6() == 1 || var6.a6() == 5) {
         throw new z1("Invalid colormodel " + var6.a6());
      }

      if (var6.u3() != 1 && var6.u3() != 2 && var6.u3() != 4 && var6.u3() != 8 && var6.u3() != 16) {
         throw new z1("Invalid bit depth " + var6.u3());
      }
   }

   private boolean h0() {
      return this.t2 < 1;
   }

   private void c8() {
      if (this.t2 < 5) {
         try {
            this.n3.close();
         } catch (Exception var2) {
         }

         this.n5();
      }

      this.t2();
   }

   private void t2() {
      if (this.t2 < 6) {
         try {
            this.n3.close();
         } catch (Exception var3) {
         }

         this.t2 = 6;
      }

      if (this.z1) {
         try {
            this.x8.close();
         } catch (Exception var2) {
            throw new z1("error closing input stream!", var2);
         }
      }
   }

   private void k5(int var1) {
      byte var2 = this.c8[0];
      n5 var3 = com.aspose.slides.internal.c5e.n5.n5(var2);
      if (var3 == null) {
         var3 = com.aspose.slides.internal.c5e.n5.n5;
      }

      switch (var3) {
         case FILTER_NONE:
            this.a6(var1);
            break;
         case FILTER_SUB:
            this.h0(var1);
            break;
         case FILTER_UP:
            this.c8(var1);
            break;
         case FILTER_AVERAGE:
            this.u3(var1);
            break;
         case FILTER_PAETH:
            this.u9(var1);
            break;
         default:
            throw new z1("Filter type " + var2 + " not implemented");
      }

      if (this.e2 != null) {
         this.e2.update(this.u9, 1, this.u9.length - 1);
      }
   }

   private void u3(int var1) {
      int var2 = 1 - this.n5.s7;

      for (int var3 = 1; var3 <= var1; var2++) {
         int var4 = var2 > 0 ? this.u9[var2] & 0xFF : 0;
         this.u9[var3] = (byte)(this.c8[var3] + (var4 + (this.h0[var3] & 255)) / 2);
         var3++;
      }
   }

   private void a6(int var1) {
      for (int var2 = 1; var2 <= var1; var2++) {
         this.u9[var2] = this.c8[var2];
      }
   }

   private void u9(int var1) {
      int var2 = 1 - this.n5.s7;

      for (int var3 = 1; var3 <= var1; var2++) {
         int var4 = var2 > 0 ? this.u9[var2] & 0xFF : 0;
         int var5 = var2 > 0 ? this.h0[var2] & 0xFF : 0;
         this.u9[var3] = (byte)(this.c8[var3] + com.aspose.slides.internal.c5e.h0.n5(var4, this.h0[var3] & 255, var5));
         var3++;
      }
   }

   private void h0(int var1) {
      for (int var2 = 1; var2 <= this.n5.s7; var2++) {
         this.u9[var2] = this.c8[var2];
      }

      int var3 = 1;

      for (int var4 = this.n5.s7 + 1; var4 <= var1; var3++) {
         this.u9[var4] = (byte)(this.c8[var4] + this.u9[var3]);
         var4++;
      }
   }

   private void c8(int var1) {
      for (int var2 = 1; var2 <= var1; var2++) {
         this.u9[var2] = (byte)(this.c8[var2] + this.h0[var2]);
      }
   }

   private final void s7() {
      if (this.h0()) {
         int var1 = 0;
         boolean var2 = false;
         byte[] var3 = new byte[4];
         this.t2 = 1;

         while (!var2) {
            var1 = com.aspose.slides.internal.c5e.h0.l6(this.x8);
            this.r4 += 4L;
            if (var1 < 0) {
               break;
            }

            com.aspose.slides.internal.c5e.h0.n5(this.x8, var3, 0, 4);
            this.r4 += 4L;
            if (Arrays.equals(var3, com.aspose.slides.internal.f7v.n5.k5)) {
               var2 = true;
               this.t2 = 4;
               this.u3.n5(new e5(this.n5, var1, this.r4 - 8L), this.t2);
               break;
            }

            if (Arrays.equals(var3, com.aspose.slides.internal.f7v.n5.u3)) {
               throw new z1("END chunk found before image data (IDAT) at offset=" + this.r4);
            }

            if (Arrays.equals(var3, com.aspose.slides.internal.f7v.n5.l6)) {
               this.t2 = 2;
            }

            this.n5(var3, var1, false);
            if (Arrays.equals(var3, com.aspose.slides.internal.f7v.n5.l6)) {
               this.t2 = 3;
            }
         }

         int var4 = var2 ? var1 : -1;
         if (var4 < 0) {
            throw new z1("first idat chunk not found!");
         }

         this.y4 = new t2(this.x8, var4, this.r4);
         this.n3 = new InflaterInputStream(this.y4);
         if (!this.j5) {
            this.y4.u9();
         }
      }
   }

   void n5() {
      this.t2 = 5;
      if (!this.y4.a6()) {
         this.y4.n5();
      }

      int var1 = this.y4.l6();
      byte[] var2 = this.y4.k5();
      boolean var3 = var1 < 0;
      boolean var4 = true;
      boolean var5 = false;

      while (!var3) {
         var5 = false;
         if (!var4) {
            var1 = com.aspose.slides.internal.c5e.h0.l6(this.x8);
            this.r4 += 4L;
            if (var1 < 0) {
               throw new z1("bad chuck len " + var1);
            }

            com.aspose.slides.internal.c5e.h0.n5(this.x8, var2, 0, 4);
            this.r4 += 4L;
         }

         var4 = false;
         if (Arrays.equals(var2, com.aspose.slides.internal.f7v.n5.k5)) {
            var5 = true;
         } else if (Arrays.equals(var2, com.aspose.slides.internal.f7v.n5.u3)) {
            this.t2 = 6;
            var3 = true;
         }

         this.n5(var2, var1, var5);
      }

      if (!var3) {
         throw new z1("end chunk not found - offset=" + this.r4);
      }
   }

   private com.aspose.slides.internal.f7v.s7 n5(byte[] var1, int var2, boolean var3) {
      if (var2 < 0) {
         throw new z1("invalid chunk lenght: " + var2);
      }

      if (this.k7 == null && this.t2 > 0) {
         this.k7 = new HashSet<>(Arrays.asList(this.m1));
      }

      String var4 = com.aspose.slides.internal.f7v.n5.n5(var1);
      boolean var5 = com.aspose.slides.internal.f7v.n5.l6(var4);
      com.aspose.slides.internal.f7v.s7 var6 = null;
      boolean var7 = var3;
      if (this.t4 > 0L && var2 + this.r4 > this.t4) {
         throw new z1("Maximum total bytes to read exceeeded: " + this.t4 + " offset:" + this.r4 + " clen=" + var2);
      }

      if (this.t2 > 0 && !var5) {
         var7 = var7
            || this.z3 > 0 && var2 >= this.z3
            || this.k7.contains(var4)
            || this.q0 > 0 && var2 > this.q0 - this.c4
            || !com.aspose.slides.internal.f7v.n5.n5(var4, this.t9);
      }

      if (var7) {
         com.aspose.slides.internal.c5e.h0.n5(this.x8, var2);
         com.aspose.slides.internal.c5e.h0.l6(this.x8);
         var6 = new x9(var4, this.n5, var2);
      } else {
         com.aspose.slides.internal.f7v.a6 var8 = new com.aspose.slides.internal.f7v.a6(var2, var1, true);
         var8.n5(this.x8, this.j5 || var5);
         var6 = com.aspose.slides.internal.f7v.s7.n5(var8, this.n5);
         if (!var6.l6) {
            this.c4 = this.c4 + var8.n5;
         }
      }

      var6.n5(this.r4 - 8L);
      this.u3.n5(var6, this.t2);
      this.r4 += var2 + 4L;
      return var6;
   }

   public w2 l6() {
      if (this.h0()) {
         this.s7();
      }

      return this.k5;
   }

   public k5 n5(int var1) {
      if (this.a6 == null) {
         this.a6 = new k5(this.n5, k5$n5.n5, this.w1);
      }

      if (this.a6.n5() == var1) {
         return this.a6;
      }

      this.n5(this.a6.l6, var1);
      this.a6.n5(com.aspose.slides.internal.c5e.n5.n5(this.c8[0]));
      this.a6.n5(var1);
      return this.a6;
   }

   public k5 l6(int var1) {
      if (this.a6 == null) {
         this.a6 = new k5(this.n5, k5$n5.l6, this.w1);
      }

      if (this.a6.n5() == var1) {
         return this.a6;
      }

      this.n5(this.a6.k5, var1);
      this.a6.n5(com.aspose.slides.internal.c5e.n5.n5(this.c8[0]));
      this.a6.n5(var1);
      return this.a6;
   }

   public final int[] n5(int[] var1, int var2) {
      if (var1 == null) {
         var1 = new int[this.w1 ? this.n5.n3 : this.n5.y4];
      }

      if (!this.m3) {
         if (var2 <= this.s7) {
            throw new z1("rows must be read in increasing order: " + var2);
         }

         int var3 = 0;

         while (this.s7 < var2) {
            var3 = this.t2(this.s7 + 1);
         }

         this.l6(var1, var3);
      } else {
         if (this.z8.h0() == null) {
            this.z8.n5(this.k5().s7);
         }

         System.arraycopy(this.z8.h0()[var2], 0, var1, 0, this.w1 ? this.n5.n3 : this.n5.y4);
      }

      return var1;
   }

   public final byte[] n5(byte[] var1, int var2) {
      if (var1 == null) {
         var1 = new byte[this.w1 ? this.n5.n3 : this.n5.y4];
      }

      if (!this.m3) {
         if (var2 <= this.s7) {
            throw new z1("rows must be read in increasing order: " + var2);
         }

         int var3 = 0;

         while (this.s7 < var2) {
            var3 = this.t2(this.s7 + 1);
         }

         this.l6(var1, var3);
      } else {
         if (this.z8.c8() == null) {
            this.z8.n5(this.u3().x8);
         }

         System.arraycopy(this.z8.c8()[var2], 0, var1, 0, this.w1 ? this.n5.n3 : this.n5.y4);
      }

      return var1;
   }

   private void l6(int[] var1, int var2) {
      if (this.n5.k5 <= 8) {
         int var3 = 0;
         int var4 = 1;

         while (var3 < var2) {
            var1[var3] = this.u9[var4++] & 255;
            var3++;
         }
      } else {
         int var5 = 0;

         for (int var6 = 1; var6 <= var2; var5++) {
            var1[var5] = ((this.u9[var6++] & 255) << 8) + (this.u9[var6++] & 255);
         }
      }

      if (this.n5.c8 && this.w1) {
         com.aspose.slides.internal.c5e.k5.n5(this.n5, var1, var1, false);
      }
   }

   private void l6(byte[] var1, int var2) {
      if (this.n5.k5 <= 8) {
         System.arraycopy(this.u9, 1, var1, 0, var2);
      } else {
         int var3 = 0;

         for (int var4 = 1; var4 < var2; var4 += 2) {
            var1[var3] = this.u9[var4];
            var3++;
         }
      }

      if (this.n5.c8 && this.w1) {
         com.aspose.slides.internal.c5e.k5.n5(this.n5, var1, var1, false);
      }
   }

   public a6 n5(int var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = (this.n5.l6 - var1) / var3;
      }

      if (var3 >= 1 && var1 >= 0 && var2 * var3 + var1 <= this.n5.l6) {
         a6 var4 = new a6(this.n5, k5$n5.n5, this.w1, var1, var2, var3);
         if (!this.m3) {
            for (int var5 = 0; var5 < this.n5.l6; var5++) {
               int var6 = this.t2(var5);
               int var7 = var4.n5(var5);
               if (var7 >= 0) {
                  this.l6(var4.s7[var7], var6);
               }
            }
         } else {
            int[] var11 = new int[this.w1 ? this.n5.n3 : this.n5.y4];

            for (int var12 = 1; var12 <= 7; var12++) {
               this.z8.l6(var12);

               for (int var13 = 0; var13 < this.z8.u3(); var13++) {
                  int var8 = this.t2(var13);
                  int var9 = this.z8.k5();
                  int var10 = var4.n5(var9);
                  if (var10 >= 0) {
                     this.l6(var11, var8);
                     this.z8.n5(var11, var4.s7[var10], !this.w1);
                  }
               }
            }
         }

         this.a6();
         return var4;
      } else {
         throw new z1("bad args");
      }
   }

   public a6 k5() {
      return this.n5(0, this.n5.l6, 1);
   }

   public a6 l6(int var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = (this.n5.l6 - var1) / var3;
      }

      if (var3 >= 1 && var1 >= 0 && var2 * var3 + var1 <= this.n5.l6) {
         a6 var4 = new a6(this.n5, k5$n5.l6, this.w1, var1, var2, var3);
         if (!this.m3) {
            for (int var5 = 0; var5 < this.n5.l6; var5++) {
               int var6 = this.t2(var5);
               int var7 = var4.n5(var5);
               if (var7 >= 0) {
                  this.l6(var4.x8[var7], var6);
               }
            }
         } else {
            byte[] var11 = new byte[this.w1 ? this.n5.n3 : this.n5.y4];

            for (int var12 = 1; var12 <= 7; var12++) {
               this.z8.l6(var12);

               for (int var13 = 0; var13 < this.z8.u3(); var13++) {
                  int var8 = this.t2(var13);
                  int var9 = this.z8.k5();
                  int var10 = var4.n5(var9);
                  if (var10 >= 0) {
                     this.l6(var11, var8);
                     this.z8.n5(var11, var4.x8[var10], !this.w1);
                  }
               }
            }
         }

         this.a6();
         return var4;
      } else {
         throw new z1("bad args");
      }
   }

   public a6 u3() {
      return this.l6(0, this.n5.l6, 1);
   }

   private int t2(int var1) {
      if (var1 == 0 && this.h0()) {
         this.s7();
      }

      if (var1 == 0 && this.m3) {
         Arrays.fill(this.u9, (byte)0);
      }

      int var2 = this.n5.x8;
      if (this.m3) {
         if (var1 < 0 || var1 > this.z8.u3() || var1 != 0 && var1 != this.z8.l6() + 1) {
            throw new z1("invalid row in interlaced mode: " + var1);
         }

         this.z8.n5(var1);
         var2 = (this.n5.t2 * this.z8.u9() + 7) / 8;
         if (var2 < 1) {
            throw new t9("wtf??");
         }
      } else if (var1 < 0 || var1 >= this.n5.l6 || var1 != this.s7 + 1) {
         throw new z1("invalid row: " + var1);
      }

      this.s7 = var1;
      byte[] var3 = this.u9;
      this.u9 = this.h0;
      this.h0 = var3;
      com.aspose.slides.internal.c5e.h0.n5(this.n3, this.c8, 0, var2 + 1);
      this.r4 = this.y4.u3();
      if (this.r4 < 0L) {
         throw new t9("bad offset ??" + this.r4);
      }

      if (this.t4 > 0L && this.r4 >= this.t4) {
         throw new z1("Reading IDAT: Maximum total bytes to read exceeeded: " + this.t4 + " offset:" + this.r4);
      }

      this.u9[0] = 0;
      this.k5(var2);
      this.u9[0] = this.c8[0];
      if (this.s7 == this.n5.l6 - 1 && !this.m3 || this.m3 && this.z8.n5()) {
         this.c8();
      }

      return var2;
   }

   public void a6() {
      if (this.t2 < 6) {
         this.t2();
      }
   }

   public void n5(boolean var1) {
      this.w1 = var1;
   }

   public void u9() {
      this.j5 = false;
   }

   @Override
   public String toString() {
      return "filename=" + this.l6 + " " + this.n5.toString();
   }
}
