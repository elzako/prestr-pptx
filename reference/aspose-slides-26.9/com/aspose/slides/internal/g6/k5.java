package com.aspose.slides.internal.g6;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.j5;

public class k5 {
   private boolean n5;
   private com.aspose.slides.internal.x6.l6 l6 = com.aspose.slides.internal.x6.l6.n5();

   public k5() {
      this.n5 = false;
   }

   public k5(boolean var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.m9.c8 n5(com.aspose.slides.internal.x6.n5 var1, u3[] var2) {
      var2[0] = new u3();
      j5 var3 = new j5(new e2());
      var3.n5(true);
      this.l6.n5(var1, var3);
      byte[] var4 = ((e2)var3.n5()).toArray();
      com.aspose.slides.internal.q5.t2 var5 = (com.aspose.slides.internal.q5.t2)var1.l6(com.aspose.slides.internal.x6.k5.h0);
      byte[] var6 = n5(var5.n5(3, 1, 1033, 1));
      byte[] var7 = n5(var5.n5(3, 1, 1033, 2));
      byte[] var8 = n5(var5.n5(3, 1, 1033, 5));
      byte[] var9 = n5(var5.n5(3, 1, 1033, 4));
      if (var6.length == 0) {
         var6 = n5(var5.n5(3, 0, 1033, 1));
         var7 = n5(var5.n5(3, 0, 1033, 2));
         var8 = n5(var5.n5(3, 0, 1033, 5));
         var9 = n5(var5.n5(3, 0, 1033, 4));
      }

      long var10 = 0L;
      if (this.n5) {
         n3 var12 = new n3();
         byte[] var13 = var12.n5(var1);
         if (var13 != null) {
            var10 |= 4L;
            var4 = var13;
         }
      }

      long var14 = n5(var6.length, var7.length, var8.length, var9.length, var4.length);
      com.aspose.slides.internal.m9.c8 var16 = n5((int)var14);
      com.aspose.slides.internal.q5.s7 var17 = (com.aspose.slides.internal.q5.s7)var1.l6(com.aspose.slides.internal.x6.k5.c8);
      int var18 = 0;
      var18 += var16.l6(var18, var14);
      var2[0].n5 = var14 & 4294967295L;
      var18 += var16.l6(var18, var4.length);
      var2[0].l6 = var4.length & 4294967295L;
      var18 += var16.l6(var18, 131074L);
      var2[0].k5 = 131074L;
      var18 += var16.l6(var18, var10);
      var2[0].u3 = var10 & 4294967295L;
      var18 += n5(var18, var17, var16);
      var2[0].a6 = var17.c8();
      var18 += var16.n5(var18, (byte)1);
      var2[0].u9 = 1;
      var18 += var16.n5(var18, (byte)(var17.y4() & 1));
      var2[0].h0 = (byte)(var17.y4() & 1);
      var18 += var16.l6(var18, var17.u9());
      var2[0].c8 = var17.u9() & 4294967295L;
      var18 += var16.a6(var18, (short)var17.h0());
      var2[0].t2 = var17.h0() & 65535;
      var18 += var16.a6(var18, 20556);
      var18 += l6(var18, var17, var16);
      var2[0].s7 = new long[]{var17.t2() & 4294967295L, var17.s7() & 4294967295L, var17.x8() & 4294967295L, var17.n3() & 4294967295L};
      var18 += k5(var18, var17, var16);
      var2[0].x8 = new long[]{var17.e2() & 4294967295L, var17.t9() & 4294967295L};
      com.aspose.slides.internal.q5.u3 var19 = (com.aspose.slides.internal.q5.u3)var1.l6(com.aspose.slides.internal.x6.k5.k5);
      var18 += var16.l6(var18, var19.a6());
      var2[0].n3 = var19.a6() & 4294967295L;
      var18 += n5(var18, var16);
      var18 += l6(var18, var16);
      var2[0].y4 = 0;
      var18 += n5(var18, var6, var16);
      var2[0].e2 = var6.length & 65535;
      var2[0].t9 = var6;
      var18 += l6(var18, var16);
      var2[0].z1 = 0;
      var18 += n5(var18, var7, var16);
      var2[0].t4 = var7.length & 65535;
      var2[0].q0 = var7;
      var18 += l6(var18, var16);
      var2[0].z3 = 0;
      var18 += n5(var18, var8, var16);
      var2[0].m1 = var8.length & 65535;
      var2[0].k7 = var8;
      var18 += l6(var18, var16);
      var2[0].m3 = 0;
      var18 += n5(var18, var9, var16);
      var2[0].z8 = var9.length & 65535;
      var2[0].j5 = var9;
      var18 += l6(var18, var16);
      var2[0].w1 = 0;
      var18 += l6(var18, var16);
      var2[0].r4 = 0;
      var18 += var16.l6(var18, 1346851650L);
      var18 += var16.l6(var18, 0L);
      var18 += l6(var18, var16);
      var18 += l6(var18, var16);
      var18 += var16.l6(var18, 0L);
      var18 += var16.l6(var18, 0L);
      var16.l6(var18, var4, 0, var4.length);
      return var16;
   }

   private static long n5(int var0, int var1, int var2, int var3, int var4) {
      return 100 + var0 * 1 + var1 * 1 + var2 * 1 + var3 * 1 + var4 * 1 + 20;
   }

   private static int n5(int var0, com.aspose.slides.internal.q5.s7 var1, com.aspose.slides.internal.m9.c8 var2) {
      byte[] var3 = var1.c8();
      return var2.l6(var0, var3, 0, var3.length);
   }

   private static int n5(int var0, com.aspose.slides.internal.m9.c8 var1) {
      int var2 = var0;

      for (int var3 = 0; var3 < 4; var3++) {
         var2 += var1.l6(var2, 0L);
      }

      return var2 - var0;
   }

   private static int l6(int var0, com.aspose.slides.internal.q5.s7 var1, com.aspose.slides.internal.m9.c8 var2) {
      int var3 = var0;
      var3 += var2.l6(var3, var1.t2());
      var3 += var2.l6(var3, var1.s7());
      var3 += var2.l6(var3, var1.x8());
      var3 += var2.l6(var3, var1.n3());
      return var3 - var0;
   }

   private static int k5(int var0, com.aspose.slides.internal.q5.s7 var1, com.aspose.slides.internal.m9.c8 var2) {
      int var3 = var0;
      var3 += var2.l6(var3, var1.e2());
      var3 += var2.l6(var3, var1.t9());
      return var3 - var0;
   }

   private static int l6(int var0, com.aspose.slides.internal.m9.c8 var1) {
      return var1.a6(var0, 0);
   }

   private static int n5(int var0, byte[] var1, com.aspose.slides.internal.m9.c8 var2) {
      int var3 = var0;
      var3 += var2.a6(var3, (short)var1.length);
      var3 += var2.l6(var3, var1, 0, var1.length);
      return var3 - var0;
   }

   private static byte[] n5(byte[] var0) {
      if (var0 == null) {
         return new byte[0];
      }

      for (int var1 = 0; var1 < var0.length; var1 += 2) {
         byte var2 = var0[var1];
         var0[var1] = var0[var1 + 1];
         var0[var1 + 1] = var2;
      }

      return var0;
   }

   private static com.aspose.slides.internal.m9.c8 n5(int var0) {
      return com.aspose.slides.internal.m9.c8.n3(var0);
   }
}
