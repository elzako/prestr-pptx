package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class p7 {
   private byte[] n5;
   private byte[] l6;
   private byte[] k5;

   public p7(u1 var1) {
      this.n5 = l2.n5(var1.l6);
      this.l6 = l2.n5(var1.k5);
      this.k5 = l2.n5(var1.u3);
   }

   public final byte[] n5() {
      l9 var1 = new l9(this.n5);
      a1k[] var2 = this.n5(var1);
      return this.l6(var2);
   }

   private a1k[] n5(l9 var1) {
      e7 var2 = null;
      k1 var3 = null;
      l8 var4 = null;
      j8o var5 = null;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      a1k[] var11 = new a1k[var1.l6];
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;

      for (k5w var18 : var1.u9) {
         int var19 = (int)var18.u3;
         byte[] var20 = new byte[var19];
         com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), (int)var18.k5, com.aspose.slides.ms.System.u3.n5((Object)(var20)), 0, var20.length);
         if ("head".equals(var18.n5)) {
            var3 = new k1(var20);
            var11[var10] = var3;
         } else if ("loca".equals(var18.n5)) {
            var9 = var10;
         } else if ("cvt ".equals(var18.n5)) {
            var11[var10] = new a1k(var18.n5, h5.n5(var20));
         } else if ("maxp".equals(var18.n5)) {
            var2 = new e7(var20);
            var11[var10] = var2;
         } else if ("hdmx".equals(var18.n5)) {
            var6 = var10;
            var13 = true;
         } else if ("hhea".equals(var18.n5)) {
            var4 = new l8(var20);
            var11[var10] = var4;
         } else if ("hmtx".equals(var18.n5)) {
            var7 = var10;
            var14 = true;
         } else if ("glyf".equals(var18.n5)) {
            var12 = true;
            var8 = var10;
         } else if ("VDMX".equals(var18.n5)) {
            var11[var10] = new a1k(var18.n5, d0c.n5(var20));
         } else if ("OS/2".equals(var18.n5)) {
            var5 = new j8o(var20);
            var11[var10] = var5;
         }

         if (var11[var10] == null) {
            var11[var10] = new a1k(var18.n5, var20);
         }

         var10++;
      }

      if (var14) {
         var11[var7] = new s8(var4.h0 & 65535, var11[var7].t9);
      }

      if (var13) {
         var11[var6] = new a1k("hdmx", o4.n5((s8)var11[var7], var11[var6].t9, var2.l6, var3.u3));
      }

      var3.n5(var13);
      if (var12) {
         v9 var21 = new v9(var11[var8].t9, this.l6, this.k5);
         v9$l6 var22 = var21.n5(var2.l6 & 65535, (s8)var11[var7]);
         var11[var9] = new a1k("loca", var22.k5);
         var11[var8] = new a1k("glyf", var22.n5);
         var3.a6((short)(var22.l6 ? 1 : 0));
         var3.k5(var22.u3);
         var3.u3(var22.a6);
         var3.n5(var22.u9);
         var3.l6(var22.h0);
         var2.l6(var22.t2);
         var2.n5(var22.c8);
         var4.n5(var22.n3);
         var4.k5(var22.s7);
         var4.u3(var22.x8);
         var4.a6(var22.y4);
         if (var4.n5() > var22.a6) {
            var4.n5(var22.a6);
         }

         if (var4.l6() < var22.h0) {
            var4.l6(var22.h0);
         }
      }

      if (var5.l6() > 0) {
         var5.n5(var3.l6());
      }

      return n5(var11);
   }

   private static a1k[] n5(a1k[] var0) {
      String[] var1 = new String[]{
         "head", "hhea", "maxp", "OS/2", "hmtx", "LTSH", "VDMX", "hdmx", "cmap", "fpgm", "prep", "cvt ", "loca", "glyf", "kern", "name", "post", "gasp"
      };
      a1k[] var2 = new a1k[var0.length];
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];

         for (int var6 = 0; var6 < var0.length; var6++) {
            if (com.aspose.slides.ms.System.d1.a6(var0[var6].e2.n5, var5)) {
               var2[var3] = var0[var6];
               var3++;
               break;
            }
         }
      }

      for (int var8 = 0; var8 < var0.length; var8++) {
         String var9 = var0[var8].e2.n5;
         boolean var10 = false;

         for (int var7 = 0; var7 < var3; var7++) {
            if (com.aspose.slides.ms.System.d1.a6(var9, var2[var7].e2.n5)) {
               var10 = true;
               break;
            }
         }

         if (!var10) {
            var2[var3] = var0[var8];
            var3++;
         }
      }

      return var2;
   }

   private byte[] l6(a1k[] var1) {
      boolean var2 = false;
      int var3 = 12 + 16 * var1.length;

      for (a1k var7 : var1) {
         var3 += (int)(((var7.e2.u3 & 4294967295L) + 4L & 4294967295L) - 1L & 4294967295L & -4L & 4294967295L);
      }

      byte[] var22 = new byte[var3];
      int var23 = 12 + 16 * var1.length;
      t4 var24 = new t4(var22);

      for (a1k var10 : var1) {
         if ("CFF ".equals(var10.e2.n5)) {
            var2 = true;
         }

         var10.e2.k5 = var23 & 4294967295L;
         var24.n5(var23);
         com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var10.t9)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var22)), var23, var10.t9.length);
         var10.e2.l6 = n5(var24, (int)var10.e2.u3);
         var23 += (int)(((var10.e2.u3 & 4294967295L) + 4L & 4294967295L) - 1L & 4294967295L & -4L & 4294967295L);
      }

      int var26 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.q1.q0(var1.length) / com.aspose.slides.ms.System.q1.q0(2.0), 14);
      int var27 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.q1.a6(2.0, var26 & 65535), 14);
      q0 var28 = new q0(var22);
      int var29 = var2 ? 1330926671 : 65536;
      var28.l6(var29);
      var28.k5(var1.length & 65535);
      var28.k5((var27 & 65535) * 16 & 65535);
      var28.k5(var26);
      var28.k5((var1.length - (var27 & 65535)) * 16 & 65535);
      k1 var11 = null;
      SortedList var12 = new SortedList();

      for (a1k var16 : var1) {
         var12.addItem(k4o.n5(var16.e2.n5), var16);
      }

      IGenericEnumerator var30 = var12.getKeys().iterator();

      try {
         while (var30.hasNext()) {
            long var17 = com.aspose.slides.internal.v6g.k5.u3(var30.next(), long.class);
            a1k var31 = (a1k)var12.get_Item(var17);
            var28.n5(k4o.n5(var31.e2.n5));
            var28.n5(var31.e2.l6);
            var28.n5(var31.e2.k5);
            var28.n5(var31.e2.u3);
            if ("head".equals(var31.e2.n5)) {
               var11 = (k1)var31;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }

      var28.n5((int)((var11.e2.k5 & 4294967295L) + 8L));
      var24.n5(0);
      long var32 = 2981146554L;
      var28.n5(2981146554L - (n5(var24, var24.l6()) & 4294967295L) & 4294967295L);
      return var22;
   }

   private static long n5(t4 var0, int var1) {
      long var2 = 0L;

      for (int var4 = 0; var4 < var1; var4 += 4) {
         var2 = (var2 & 4294967295L) + (var0.u3() & 4294967295L) & 4294967295L;
      }

      return var2;
   }
}
