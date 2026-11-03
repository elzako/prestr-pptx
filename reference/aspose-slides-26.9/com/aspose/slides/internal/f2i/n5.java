package com.aspose.slides.internal.f2i;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.a3p.h0;
import com.aspose.slides.internal.a3p.l6;
import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.internal.h6t.u3;
import com.aspose.slides.internal.i4w.n3;
import com.aspose.slides.internal.i4w.u9;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.r1x.e9;
import com.aspose.slides.internal.r1x.r4;
import com.aspose.slides.internal.t6q.s7;
import com.aspose.slides.internal.u2w.a6;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.w2a.t4;
import com.aspose.slides.internal.w2a.t9;
import com.aspose.slides.internal.w2a.x8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.y8;
import com.aspose.slides.ms.System.z3;

public class n5 extends r4 {
   private final Dictionary<Integer, a6> l6 = new Dictionary<>();
   private final List<a6> k5 = new List<>();
   private final Dictionary<Integer, long[]> u3 = new Dictionary<>();
   private int a6 = 18761;
   private boolean u9;
   private boolean h0 = false;
   private c8 c8 = com.aspose.slides.internal.o9b.c8.w4().o8();
   private int t2 = 104857600;
   private int s7 = 1;
   private boolean x8 = false;

   public n5(int var1, int var2) {
      this.a6(0);
      switch (var1) {
         case 1:
            this.k5(5);
            break;
         case 2:
            this.k5(5);
            this.a6(2);
            this.l6(new int[]{8, 8, 8});
            break;
         case 3:
            this.k5(5);
            this.a6(2);
            this.l6(new int[]{8, 8, 8, 8});
            this.u3(2);
            break;
         case 4:
            this.k5(5);
            this.a6(5);
            this.l6(new int[]{8, 8, 8, 8});
            break;
         case 5:
            this.k5(3);
            break;
         case 6:
            this.k5(4);
            break;
         case 7:
            this.k5(8);
            break;
         case 8:
            this.k5(8);
            this.a6(2);
            this.l6(new int[]{8, 8, 8});
            break;
         case 9:
            this.a6(2);
            this.l6(new int[]{8, 8, 8, 8});
            this.u3(2);
            break;
         case 10:
            this.k5(2);
            break;
         case 11:
            this.k5(7);
            this.a6(2);
            this.l6(new int[]{8, 8, 8});
            break;
         case 12:
            this.k5(7);
            this.a6(6);
            this.l6(new int[]{8, 8, 8});
         case 13:
         default:
            break;
         case 14:
            this.a6(2);
            this.l6(new int[]{8, 8, 8});
            break;
         case 15:
            this.a6(2);
            this.l6(new int[]{8, 8, 8, 8});
            this.u3(2);
      }

      this.a6 = var2;
   }

   public n5(int var1) {
      this(var1, 18761);
   }

   public n5(n5 var1) {
      super(var1);
      if (var1 == null) {
         throw new ArgumentNullException("options");
      }

      if (var1.k5 != null) {
         this.l6(var1.k5.toArray(new a6[0]));
      }

      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.y4();
      var1.c8.n5(this.c8);
      this.t2 = var1.t2;
      this.s7 = var1.s7;
      if (var1.l6() != null) {
         this.n5(var1.l6());
      }

      if (var1.u3() != null) {
         this.n5(var1.u3());
      }

      if (var1.u9() != null) {
         this.n5(var1.u9());
      }

      if (var1.h0() != null) {
         this.n5(var1.h0());
      }

      this.n5 = var1.n5;
   }

   public n5(a6[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("tags");
      }

      this.l6(var1);
   }

   public final int x8() {
      return this.s7;
   }

   public final int n3() {
      return this.t2;
   }

   public final boolean y4() {
      return this.h0;
   }

   public final c8 e2() {
      return this.c8;
   }

   @Override
   public s7 n5() {
      return this.n5;
   }

   @Override
   public void n5(s7 var1) {
      this.n5 = var1;
   }

   public final int[] t9() {
      int[] var1 = this.e2(530);
      if (var1 == null) {
         var1 = new int[]{2, 2};
      }

      int[] var2 = var1;
      if (var2.length != 2) {
         throw new u3("Invalid field length. YCbCrSubsampling field must consist of two values.");
      }

      if (((var2[0] & 65535) == 1 || (var2[0] & 65535) == 2 || (var2[0] & 65535) == 4)
         && ((var2[1] & 65535) == 1 || (var2[1] & 65535) == 2 || (var2[1] & 65535) == 4)) {
         if ((var2[1] & 65535) > (var2[0] & 65535)) {
            throw new u3(d1.n5("YCbCrSubsampleVert={0} shall always be less than or equal to YCbCrSubsampleHoriz={1}",new Object[]{ var2[1], var2[0]}));
         } else {
            return var2;
         }
      } else {
         throw new u3(d1.n5("Invalid YCbCrSubsampling value [{0},{1}]",new Object[]{ var2[0], var2[1]}));
      }
   }

   public final void n5(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5(530, var1);
   }

   public final com.aspose.slides.internal.u2w.c8[] z1() {
      byte var1 = 3;
      if (this.y2() == 6) {
         com.aspose.slides.internal.u2w.c8[] var2 = this.z1(529);
         if (var2 != null) {
            int var3 = var2.length;
            if (var3 != 3) {
               throw new u3("Invalid count of rational coefficient values. Must be equal to 3.");
            } else {
               return var2;
            }
         } else {
            return new com.aspose.slides.internal.u2w.c8[]{
               new com.aspose.slides.internal.u2w.c8(299L, 1000L),
               new com.aspose.slides.internal.u2w.c8(587L, 1000L),
               new com.aspose.slides.internal.u2w.c8(114L, 1000L)
            };
         }
      } else {
         return null;
      }
   }

   public final boolean t4() {
      if (this.n5(324) && this.n5(325) && this.n5(322) && this.n5(323)) {
         a6 var1 = this.s7(322);
         int[] var2 = com.aspose.slides.internal.v6g.k5.n5(var1.h0(), int[].class);
         if (var2 != null && var2.length != 0) {
            var1 = this.s7(323);
            var2 = com.aspose.slides.internal.v6g.k5.n5(var1.h0(), int[].class);
            return var2 != null && var2.length != 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean n5(int var1) {
      synchronized (this.l6) {
         return this.l6.containsKey(var1);
      }
   }

   public final int q0() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final byte[] z3() {
      return this.m1().toArray();
   }

   public e2 m1() {
      e2 var1 = null;
      byte[] var2 = this.y4(34675);
      if (var2 != null) {
         var1 = new e2(var2);
      }

      return var1;
   }

   public final int[] k7() {
      int[] var1 = this.e2(258);
      if (var1 == null) {
         var1 = new int[]{1};
      } else if (var1.length < (this.s3() & 65535) && (this.y2() == 2 || this.y2() == 6)) {
         int var2 = this.s3() & 65535;
         int[] var3 = new int[var2];
         com.aspose.slides.ms.System.u3.n5(var1, var3, var1.length);
         a6 var4 = this.s7(338);
         int var5 = 0;
         if (com.aspose.slides.internal.v6g.k5.l6(var4, y4.class)) {
            y4 var6 = com.aspose.slides.internal.v6g.k5.n5(var4, y4.class);
            if (var6.y4() != null) {
               var5 = var6.y4().length;
            }
         }

         for (int var7 = var5; var7 > 0; var7--) {
            var3[var3.length - var7] = 8;
         }

         var1 = var3;
      }

      return var1;
   }

   public final void l6(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.length == 0) {
         throw new ArgumentOutOfRangeException("value", "At least single array value must be specified.");
      }

      this.n5(258, var1);
      this.n5(277, null, var1.length & 65535);
   }

   public final int m3() {
      return this.n5(259, 1) & 65535;
   }

   public final void k5(int var1) {
      this.n5(259, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w2a.a6.class), var1 & 65535);
   }

   public final int[] z8() {
      return this.e2(320);
   }

   public final void k5(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if ((this.s3() & 65535) != 1) {
         throw new u3("The color map may be defined for samples per pixel equal to 1 only.");
      }

      int var2 = this.t1();
      if (var2 == 0) {
         throw new u3("The bits per sample are not defined.");
      }

      int var3 = com.aspose.slides.internal.v6g.k5.u3(3.0 * q1.a6(2.0, var2), 14);
      if (var1.length != var3) {
         throw new ArgumentOutOfRangeException("value", "The array length must correspond to the followign formula: 3 * (2**BitsPerSample).");
      }

      this.n5(320, var1);
   }

   @Override
   public com.aspose.slides.internal.b8u.a6 k5() {
      return this.v0();
   }

   @Override
   public void n5(com.aspose.slides.internal.b8u.a6 var1) {
      if (var1 != null && var1.n5() != 0) {
         int[] var2 = var1.l6();
         int var3 = var1.n5();
         int var4 = this.t1();
         if (var4 == 0) {
            throw new u3("The bits per sample are not defined. Please specify the BitsPerSample first.");
         }

         int var5 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(2.0, var4), 14);
         int[] var6 = new int[3 * var5];
         var3 = q1.l6(var3, var5);

         for (int var7 = 0; var7 < var3; var7++) {
            int var8 = var2[var7];
            int var9 = var8 >> 16 & 0xFF;
            int var10 = var8 >> 8 & 0xFF;
            int var11 = var8 & 0xFF;
            var6[var7] = (byte)var9 & 255;
            var6[var7 + var5] = (byte)var10 & 255;
            var6[var7 + var5 * 2] = (byte)var11 & 255;
         }

         this.k5(var6);
         this.u9 = var1.u3();
      } else {
         this.t2(320);
      }
   }

   public final int j5() {
      return this.n5(338, 0) & 65535;
   }

   public final void u3(int var1) {
      this.n5(338, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w2a.k5.class), var1 & 65535);
   }

   public final boolean w1() {
      char var1 = '\uffff';
      return 65535 != (this.n5(338, 65535) & 65535);
   }

   public final int r4() {
      return this.n5(266, 1) & 65535;
   }

   public final String c4() {
      return this.t4(333);
   }

   public final int y2() {
      return this.n5(262, 0);
   }

   public final void a6(int var1) {
      this.n5(262, com.aspose.slides.internal.v6g.k5.n5(x8.class), var1);
   }

   public final int y1() {
      return this.n5(284, 1) & 65535;
   }

   public final void u9(int var1) {
      this.n5(284, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w2a.y4.class), var1 & 65535);
   }

   public final int a0() {
      return this.n5(296, 2) & 65535;
   }

   public final void h0(int var1) {
      this.n5(296, com.aspose.slides.internal.v6g.k5.n5(t4.class), var1 & 65535);
   }

   public final long d2() {
      return this.l6(278, 4294967295L);
   }

   public final void n5(long var1) {
      this.n5(278, new long[]{var1}, false);
   }

   public final int[] d5() {
      int[] var1 = this.e2(339);
      int[] var2;
      if (var1 == null) {
         var2 = new int[this.s3()];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = 1;
         }
      } else {
         var2 = new int[var1.length];

         for (int var4 = 0; var4 < var1.length; var4++) {
            var2[var4] = var1[var4] & 65535;
         }
      }

      return var2;
   }

   public final void u3(int[] var1) {
      this.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), this.s3() & 65535, "samples per pixel.");
      int[] var2 = new int[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = var1[var3] & 65535;
      }

      this.n5(339, var2);
   }

   public final int s3() {
      return this.n5(277, 1);
   }

   public final long[] p8() {
      return this.n3(279);
   }

   public final void n5(long[] var1) {
      this.n5(279, var1, false);
   }

   public final long[] f2() {
      return this.n3(273);
   }

   public final void l6(long[] var1) {
      this.n5(273, var1, false);
   }

   @Override
   public e9 u3() {
      return super.u3();
   }

   @Override
   public void n5(e9 var1) {
      super.n5(var1);
      if (var1 != null) {
         this.n5(new com.aspose.slides.internal.u2w.c8(com.aspose.slides.internal.v6g.k5.a6(var1.n5(), 14), 1L));
         this.l6(new com.aspose.slides.internal.u2w.c8(com.aspose.slides.internal.v6g.k5.a6(var1.l6(), 14), 1L));
      } else {
         this.n5((com.aspose.slides.internal.u2w.c8)null);
         this.l6((com.aspose.slides.internal.u2w.c8)null);
      }
   }

   public final com.aspose.slides.internal.u2w.c8 i1() {
      return this.t9(282);
   }

   public final void n5(com.aspose.slides.internal.u2w.c8 var1) {
      this.n5(282, null, var1);
   }

   public final com.aspose.slides.internal.u2w.c8 e5() {
      return this.t9(283);
   }

   public final void l6(com.aspose.slides.internal.u2w.c8 var1) {
      this.n5(283, null, var1);
   }

   public final long b3() {
      return this.n5(292, 0L) & 4294967295L;
   }

   public final int o0() {
      return this.n5(317, 1) & 65535;
   }

   public final void c8(int var1) {
      this.n5(317, com.aspose.slides.internal.v6g.k5.n5(t9.class), var1 & 65535);
   }

   public final long z7() {
      return this.l6(257, 0L);
   }

   public final void l6(long var1) {
      this.n5(257, new long[]{var1}, false);
   }

   public final long v4() {
      return this.l6(256, 0L);
   }

   public final void k5(long var1) {
      this.n5(256, new long[]{var1}, false);
   }

   public final a6[] u6() {
      Object var1 = null;
      synchronized (this.k5) {
         return this.k5.toArray(new a6[0]);
      }
   }

   public final void n5(a6[] var1) {
      synchronized (this.k5) {
         synchronized (this.l6) {
            this.k5.clear();
            this.l6.clear();
            if (var1 != null) {
               for (int var4 = 0; var4 < var1.length; var4++) {
                  this.n5(var1[var4]);
               }
            }
         }
      }
   }

   public final int t1() {
      int[] var1 = this.k7();
      int var2 = 0;
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            var2 += var1[var3] & 65535;
         }
      }

      return var2;
   }

   public final boolean t2(int var1) {
      boolean var2 = false;
      synchronized (this.k5) {
         synchronized (this.l6) {
            if (this.l6.containsKey(var1)) {
               a6 var5 = this.l6.get_Item(var1);
               this.l6.removeItemByKey(var1);
               this.k5.removeItem(var5);
               var2 = true;
            }
         }

         return var2;
      }
   }

   public final void a5() {
      this.n5(false);
   }

   public final void n5(a6 var1) {
      this.h2();
      if (var1 == null) {
         throw new ArgumentNullException("tagToAdd");
      }

      synchronized (this.k5) {
         synchronized (this.l6) {
            if (!this.l6.containsKey(var1.k5())) {
               this.k5.addItem(var1);
            }

            this.l6.set_Item(var1.k5(), var1);
         }
      }
   }

   public final a6 s7(int var1) {
      a6 var2 = null;
      synchronized (this.l6) {
         if (this.l6.containsKey(var1)) {
            var2 = this.l6.get_Item(var1);
         }

         return var2;
      }
   }

   public final long[] x8(int var1) {
      synchronized (this.u3) {
         long[] var3 = null;
         if (this.x8 && this.u3.containsKey(var1)) {
            var3 = this.u3.get_Item(var1);
         } else {
            var3 = this.n3(var1);
            this.x8 = true;
            this.u3.set_Item(var1, (long[])var3);
         }

         return (long[])var3;
      }
   }

   private void h2() {
      synchronized (this.u3) {
         this.x8 = false;
         this.u3.clear();
      }
   }

   private com.aspose.slides.internal.b8u.a6 v0() {
      com.aspose.slides.internal.r1x.s7 var1 = null;
      int[] var2 = this.z8();
      if (var2 != null) {
         boolean var3 = false;

         for (int var4 = 0; var4 < var2.length; var4++) {
            if ((var2[var4] & 65535) > 255) {
               var3 = true;
               break;
            }
         }

         int[] var8;
         if (!var3) {
            var8 = var2;
         } else {
            int[] var5 = new int[var2.length];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = (var2[var6] & 65535) >> 8 & 0xFF & 65535;
            }

            var8 = var5;
         }

         int var9 = var8.length / 3;
         if (var9 > 0) {
            int[] var10 = new int[var9];

            for (int var7 = 0; var7 < var10.length; var7++) {
               var10[var7] = 0xFF000000 | ((byte)var8[var7] & 255) << 16 | ((byte)var8[var7 + var9] & 255) << 8 | (byte)var8[var7 + (var9 << 1)] & 255;
            }

            var1 = new com.aspose.slides.internal.r1x.s7(var10, this.u9);
         }
      }

      return var1;
   }

   private void n5(com.aspose.slides.ms.System.u3 var1, int var2, String var3) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1.a6() != var2) {
         throw new ArgumentOutOfRangeException("array", d1.n5(new String[]{"The array length is not valid. Expected length equal to ", var3}));
      }
   }

   private long[] n3(int var1) {
      long[] var2 = null;
      a6 var3 = this.s7(var1);
      if (var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3.h0(), com.aspose.slides.ms.System.u3.class)) {
         com.aspose.slides.ms.System.u3 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.h0(), com.aspose.slides.ms.System.u3.class);
         var2 = new long[var4.a6()];

         for (int var5 = 0; var5 < var4.a6(); var5++) {
            var2[var5] = z3.c8(var4.k5(var5));
         }
      }

      return var2;
   }

   private byte[] y4(int var1) {
      byte[] var2 = null;
      a6 var3 = this.s7(var1);
      if (var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3.h0(), com.aspose.slides.ms.System.u3.class)) {
         com.aspose.slides.ms.System.u3 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.h0(), com.aspose.slides.ms.System.u3.class);
         var2 = new byte[var4.a6()];

         for (int var5 = 0; var5 < var4.a6(); var5++) {
            var2[var5] = z3.k5(var4.k5(var5));
         }
      }

      return var2;
   }

   private void n5(int var1, long[] var2, boolean var3) {
      long var4 = 0L;

      for (int var6 = 0; var6 < var2.length; var6++) {
         if ((var2[var6] & 4294967295L) > (var4 & 4294967295L)) {
            var4 = var2[var6];
         }
      }

      if (var3 && (var4 & 4294967295L) <= 255L) {
         byte[] var10 = new byte[var2.length];

         for (int var12 = 0; var12 < var2.length; var12++) {
            var10[var12] = (byte)var2[var12];
         }

         a6 var13 = this.s7(var1);
         if (var13 != null && var13.u3() != 1) {
            this.t2(var1);
         }

         this.n5(var1, var10);
      } else if ((var4 & 4294967295L) <= 65535L) {
         int[] var8 = new int[var2.length];

         for (int var7 = 0; var7 < var2.length; var7++) {
            var8[var7] = (int)(var2[var7] & 65535L);
         }

         a6 var11 = this.s7(var1);
         if (var11 != null && var11.u3() != 3) {
            this.t2(var1);
         }

         this.n5(var1, var8);
      } else {
         a6 var9 = this.s7(var1);
         if (var9 != null && var9.u3() != 4) {
            this.t2(var1);
         }

         this.n5(var1, var2);
      }
   }

   private void l6(a6[] var1) {
      for (a6 var5 : var1) {
         this.n5(var5.t2());
      }
   }

   private void n5(int var1, byte[] var2) {
      l6 var3 = (l6)this.n5(var1, new com.aspose.slides.internal.i4w.l6());
      var3.n5(var2);
      this.n5(var3);
   }

   private void n5(int var1, int[] var2) {
      y4 var3 = (y4)this.n5(var1, new n3());
      var3.n5(var2);
      this.n5(var3);
   }

   private void n5(int var1, long[] var2) {
      h0 var3 = (h0)this.n5(var1, new u9());
      var3.n5(var2);
      this.n5(var3);
   }

   private void n5(int var1, com.aspose.slides.internal.u2w.c8[] var2) {
      com.aspose.slides.internal.a3p.c8 var3 = (com.aspose.slides.internal.a3p.c8)this.n5(var1, new com.aspose.slides.internal.i4w.h0());
      var3.n5(var2);
      this.n5(var3);
   }

   private void n5(int var1, y8 var2, int var3) {
      if (var2 != null && !d5.isDefined(var2, var3)) {
         throw new ArgumentOutOfRangeException("value", "The value is not defined.");
      }

      this.n5(var1, new int[]{var3});
   }

   private void n5(int var1, y8 var2, com.aspose.slides.internal.u2w.c8 var3) {
      if (var2 != null && !d5.isDefined(var2, var3)) {
         throw new ArgumentOutOfRangeException("value", "The value is not defined.");
      }

      this.n5(var1, new com.aspose.slides.internal.u2w.c8[]{var3});
   }

   private int[] e2(int var1) {
      int[] var2 = null;
      y4 var3 = com.aspose.slides.internal.v6g.k5.n5(this.s7(var1), y4.class);
      if (var3 != null) {
         var2 = var3.y4();
      }

      return var2;
   }

   private int n5(int var1, int var2) {
      int var3 = var2;
      y4 var4 = com.aspose.slides.internal.v6g.k5.n5(this.s7(var1), y4.class);
      if (var4 != null && var4.y4() != null && var4.y4().length > 0) {
         var3 = var4.y4()[0];
      }

      return var3;
   }

   private long n5(int var1, long var2) {
      long var4 = var2;
      h0 var6 = com.aspose.slides.internal.v6g.k5.n5(this.s7(var1), h0.class);
      if (var6 != null && var6.y4() != null && var6.y4().length > 0) {
         var4 = var6.y4()[0];
      }

      return var4;
   }

   private long l6(int var1, long var2) {
      long var4 = var2;
      a6 var6 = this.s7(var1);
      if (var6 != null
         && var6.h0() != null
         && com.aspose.slides.internal.v6g.k5.l6(var6.h0(), com.aspose.slides.ms.System.u3.class)
         && com.aspose.slides.internal.v6g.k5.n5(var6.h0(), com.aspose.slides.ms.System.u3.class).a6() > 0) {
         var4 = z3.c8(com.aspose.slides.internal.v6g.k5.n5(var6.h0(), com.aspose.slides.ms.System.u3.class).k5(0));
      }

      return var4;
   }

   private com.aspose.slides.internal.u2w.c8 t9(int var1) {
      com.aspose.slides.internal.u2w.c8 var2 = null;
      com.aspose.slides.internal.a3p.c8 var3 = com.aspose.slides.internal.v6g.k5.n5(this.s7(var1), com.aspose.slides.internal.a3p.c8.class);
      if (var3 != null && var3.y4() != null && var3.y4().length > 0) {
         var2 = var3.y4()[0];
      }

      return var2;
   }

   private com.aspose.slides.internal.u2w.c8[] z1(int var1) {
      com.aspose.slides.internal.u2w.c8[] var2 = null;
      com.aspose.slides.internal.a3p.c8 var3 = com.aspose.slides.internal.v6g.k5.n5(this.s7(var1), com.aspose.slides.internal.a3p.c8.class);
      if (var3 != null && var3.y4() != null && var3.y4().length > 0) {
         var2 = new com.aspose.slides.internal.u2w.c8[var3.y4().length];
         com.aspose.slides.ms.System.u3.n5(var3.y4(), var2, var3.y4().length);
      }

      return var2;
   }

   private String t4(int var1) {
      String var2 = null;
      com.aspose.slides.internal.a3p.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(this.s7(var1), com.aspose.slides.internal.a3p.n5.class);
      if (var3 != null) {
         var2 = var3.x8();
      }

      return var2;
   }

   private a6 n5(int var1, com.aspose.slides.internal.n9a.n5 var2) {
      a6 var3 = var2.n5(var1 & 65535);
      a6 var4 = null;
      synchronized (this.l6) {
         if (this.l6.containsKey(var1)) {
            var4 = this.l6.get_Item(var1);
            if (var4.u3() != var3.u3()) {
               this.t2(var1);
               var4 = null;
            }
         }
      }

      if (var4 == null) {
         var4 = var3;
      }

      return var4;
   }

   static com.aspose.slides.internal.e4j.l6 n5(n5 var0) {
      if (var0.x8() == 0) {
         return new com.aspose.slides.internal.e4j.n5(var0);
      }

      if (var0.m3() == 7) {
         switch (var0.y2()) {
            case 1:
               return new com.aspose.slides.internal.e4j.k5(var0);
            case 2:
               return new com.aspose.slides.internal.e4j.u3(var0);
            case 6:
               return new com.aspose.slides.internal.e4j.a6(var0);
         }
      }

      return new com.aspose.slides.internal.e4j.u9(var0);
   }

   private boolean n5(boolean var1) {
      com.aspose.slides.internal.e4j.l6 var2 = n5(this);
      return var2.n5(var1);
   }
}
