package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import java.util.ArrayList;

public class i1 {
   private boolean s7;
   private boolean x8;
   private int n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private l6 t4;
   private String[] q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private a5 j5;
   private int w1;
   private int r4;
   private int c4;
   private int y2;
   private int y1;
   private int a0;
   private int d2;
   private int d5;
   private int s3;
   private int p8;
   private int f2;
   private int i1;
   private int e5;
   private int b3;
   private int o0;
   private int z7;
   private int v4;
   private int u6;
   private int t1;
   private int a5;
   private int h2;
   private float v0;
   private z1 f0;
   private byte[] a3;
   private short p3;
   private short x9;
   private short y0 = 0;
   private short j9 = 0;
   private d5 z6 = null;
   private c4 e9 = null;
   public long n5;
   public long l6;
   public long k5;
   public long u3;
   public long a6;
   public long u9;
   public long h0;
   public a3 c8;
   public a3 t2;

   public final String n5() {
      return this.z3;
   }

   public final String l6() {
      return this.m1;
   }

   public final String k5() {
      return this.k7;
   }

   public final String u3() {
      return this.m3;
   }

   public final String a6() {
      return this.z8;
   }

   public final String u9() {
      if (this.y1() == null) {
         return null;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(this.y1(), y4.class) ? ((y4)this.y1()).n5() : this.v4();
      }
   }

   public final a5 h0() {
      return this.j5;
   }

   public final void n5(a5 var1) {
      this.j5 = var1;
   }

   public final int c8() {
      return this.w1;
   }

   public final void n5(int var1) {
      this.w1 = var1;
   }

   public final int t2() {
      return this.r4;
   }

   public final void l6(int var1) {
      this.r4 = var1;
   }

   public final int s7() {
      return this.c4;
   }

   public final void k5(int var1) {
      this.c4 = var1;
   }

   public final int x8() {
      return this.y2;
   }

   public final void u3(int var1) {
      this.y2 = var1;
   }

   public final int n3() {
      return this.c4 + this.y2;
   }

   public final int y4() {
      return this.y1;
   }

   public final void a6(int var1) {
      this.y1 = var1;
   }

   public final int e2() {
      return this.a0;
   }

   public final void u9(int var1) {
      this.a0 = var1;
   }

   public final int t9() {
      return this.d2;
   }

   public final void h0(int var1) {
      this.d2 = var1;
   }

   public final int z1() {
      return this.d5;
   }

   public final void c8(int var1) {
      this.d5 = var1;
   }

   public final int t4() {
      return this.s3;
   }

   public final void t2(int var1) {
      this.s3 = var1;
   }

   public final void s7(int var1) {
      this.p8 = var1;
   }

   public final void x8(int var1) {
      this.i1 = var1;
   }

   public final void n3(int var1) {
      this.e5 = var1;
   }

   public final void y4(int var1) {
      this.b3 = var1;
   }

   public final void e2(int var1) {
      this.o0 = var1;
   }

   public final void t9(int var1) {
      this.f2 = var1;
   }

   public final int q0() {
      return this.z7;
   }

   public final void z1(int var1) {
      this.z7 = var1;
   }

   public final int z3() {
      return this.v4;
   }

   public final void t4(int var1) {
      this.v4 = var1;
   }

   public final int m1() {
      return this.u6;
   }

   public final void q0(int var1) {
      this.u6 = var1;
   }

   public final int k7() {
      return this.t1;
   }

   public final void z3(int var1) {
      this.t1 = var1;
   }

   public final short m3() {
      return this.x9;
   }

   public final void n5(short var1) {
      this.x9 = var1;
   }

   public final int z8() {
      return this.a5;
   }

   public final void m1(int var1) {
      this.a5 = var1;
   }

   public final int j5() {
      return this.h2;
   }

   public final void k7(int var1) {
      this.h2 = var1;
   }

   public final float w1() {
      return this.v0;
   }

   public final void n5(float var1) {
      this.v0 = var1;
   }

   public final float n5(String var1, float var2) {
      return this.n5(var1, 0, var1.length(), var2);
   }

   public final float n5(String var1, int var2, int var3, float var4) {
      int var5 = var2 + var3;
      if (var5 > var1.length()) {
         var5 = var1.length();
      }

      int var6 = 0;

      for (int var7 = var2; var7 < var5; var7++) {
         var6 += this.n5(var1.charAt(var7));
      }

      return this.n5((float)var6, (float)var4);
   }

   public final float n5(char var1, float var2) {
      return this.n5((float)this.n5(var1), (float)var2);
   }

   public final float n5(int var1, float var2) {
      return this.n5((float)this.z8(var1), (float)var2);
   }

   private int n5(char var1) {
      u6 var2 = this.j5.l6(var1);
      return var2.k5();
   }

   private int z8(int var1) {
      u6 var2 = this.j5.l6(var1);
      return var2.k5();
   }

   public final float n5(float var1, float var2) {
      float var3 = this.t2() / var2;
      return var1 / var3;
   }

   public final void n5(z7 var1) {
      this.z3 = var1.l6(1);
      this.m1 = var1.k5(1);
      this.k7 = var1.n5(2);
      this.m3 = var1.n5(4);
      if (this.z3 == null) {
         this.z3 = this.m3;
      }

      if (this.m1 == null) {
         this.m1 = var1.k5(4);
      }

      this.z8 = var1.l6(6);
      this.q0 = var1.u3(1);
   }

   public final boolean n5(String var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      var3.add(var1);
      if (var1.lastIndexOf("-") != -1) {
         var3.add(var1.substring(0, var1.lastIndexOf("-")));
      }

      var3.add(var1.replace(" ", ""));
      if (var1.lastIndexOf("-") != -1) {
         var3.add(var1.substring(0, var1.lastIndexOf("-")).replace(" ", ""));
      }

      int var4 = !var2 && this.q0.length >= 2 ? 1 : 0;

      for (Object recoveredElement$var6$6516 : var3) {
         String var6 = (String)recoveredElement$var6$6516;
         for (int var7 = var4; var7 < this.q0.length; var7++) {
            if (com.aspose.slides.internal.n2d.t4.l6(this.q0[var7], var6)) {
               return true;
            }

            if (this.q0[var7].lastIndexOf("-") != -1 && com.aspose.slides.internal.n2d.t4.l6(this.q0[var7].substring(0, this.q0[var7].lastIndexOf("-")), var6)) {
               return true;
            }
         }

         if (com.aspose.slides.internal.n2d.t4.l6(this.z8, var6)) {
            return true;
         }
      }

      return false;
   }

   public final l6 r4() {
      return this.t4;
   }

   public final void n5(l6 var1) {
      this.t4 = var1;
   }

   public final void n5(boolean var1) {
      this.z1 = var1;
   }

   public final boolean c4() {
      return this.e2;
   }

   public final void l6(boolean var1) {
      this.e2 = var1;
   }

   public final boolean y2() {
      return this.t9;
   }

   public final void k5(boolean var1) {
      this.t9 = var1;
   }

   public final z1 y1() {
      return this.f0;
   }

   public final void n5(z1 var1) {
      this.f0 = var1;
   }

   public final boolean a0() {
      return this.t4.k5();
   }

   public final byte[] d2() {
      return this.a3;
   }

   public final void n5(byte[] var1) {
      this.a3 = var1;
   }

   public final void l6(short var1) {
      this.p3 = var1;
   }

   public final d5 d5() {
      return this.z6;
   }

   public final void n5(d5 var1) {
      this.z6 = var1;
   }

   public final c4 s3() {
      return this.e9;
   }

   public final void n5(c4 var1) {
      this.e9 = var1;
   }

   public final boolean p8() {
      return this.s7;
   }

   public final void u3(boolean var1) {
      this.s7 = var1;
   }

   public final boolean f2() {
      return this.x8;
   }

   public final void a6(boolean var1) {
      this.x8 = var1;
   }

   public final int i1() {
      return this.n3;
   }

   public final void m3(int var1) {
      this.n3 = var1;
   }

   public final boolean e5() {
      return this.y4;
   }

   public final void u9(boolean var1) {
      this.y4 = var1;
   }

   public final double n5(long var1, long var3) {
      Dictionary var5 = null;
      Dictionary[] var6 = new Dictionary[]{var5};
      boolean var7 = this.d5() != null && this.d5().tryGetValue(var1, var6);
      var5 = var6[0];
      if (var7) {
         s3 var8 = null;
         s3[] var9 = new s3[]{var8};
         boolean var10 = var5 != null && var5.tryGetValue(var3, var9);
         var8 = var9[0];
         if (var10) {
            return var8.l6().k5() + var8.k5().n5();
         }
      }

      return 0.0;
   }

   private String v4() {
      byte[] var1 = new byte[16];
      com.aspose.slides.internal.n2d.t4.n5(this.n5().hashCode(), var1, 0);
      com.aspose.slides.internal.n2d.t4.n5(this.c8(), var1, 4);
      com.aspose.slides.ms.System.o0 var2 = new com.aspose.slides.ms.System.o0(var1);
      String var3 = var2.n5("D");
      String var4 = this.e2 ? "otf" : "ttf";
      return d1.n5("{0}.{1}",new Object[]{ var3, var4});
   }

   public final void b3() {
      if (this.d5() == null) {
         com.aspose.slides.internal.z0k.t4 var1 = this.f0.l6();

         try {
            com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);

            try {
               this.n5(this.k5(var2));
               if (this.d5() == null) {
                  this.n5(this.n5(var2));
               }
            } catch (RuntimeException var7) {
               com.aspose.slides.internal.f8y.n5.u3(var7.getMessage());
            }
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      }
   }

   public final void o0() {
      if (this.l6 != 0L && this.s3() == null) {
         com.aspose.slides.internal.z0k.t4 var1 = this.f0.l6();

         try {
            com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);

            try {
               this.n5(this.l6(var2));
            } catch (RuntimeException var7) {
               com.aspose.slides.internal.f8y.n5.u3(var7.getMessage());
            }
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      }
   }

   private d5 k5(com.aspose.slides.internal.n2d.k5 var1) {
      if (this.n5 == 0L) {
         return null;
      }

      long var2 = var1.n5().getPosition();
      d5 var4 = new d5();
      var1.n5().setPosition(this.n5);
      var1.a6();
      int var5 = var1.a6();

      for (int var6 = 0; var6 < (var5 & 65535); var6++) {
         var1.a6();
         var1.a6();
         int var7 = var1.a6();
         int var8 = (var7 & 65535 & 0xFF00) >> 8;
         if (var8 == 0) {
            int var9 = var1.a6();
            var1.a6();
            var1.a6();
            var1.a6();

            for (int var10 = 0; var10 < (var9 & 65535); var10++) {
               int var11 = var1.a6();
               int var12 = var1.a6();
               short var13 = var1.u3();
               p3 var14 = new p3();
               var14.k5(var13);
               s3 var15 = new s3(var12 & 65535, var14, new p3());
               var4.n5(var11 & 65535, var15);
            }
         } else if (var8 == 2) {
         }
      }

      var1.n5().setPosition(var2);
      return var4;
   }

   public final boolean z7() {
      if (this.k5 != 0L) {
         try {
            com.aspose.slides.internal.z0k.t4 var1 = this.f0.l6();

            try {
               com.aspose.slides.internal.n2d.k5 var2 = new com.aspose.slides.internal.n2d.k5(var1);
               var2.n5().seek(this.k5, 0);
               long var3 = var2.a6() & 65535;
               long var5 = var2.a6() & 65535;
               long var7 = var2.a6() & 65535;
               long var9 = var2.a6() & 65535;
               long var11 = var2.a6() & 65535;
               var2.n5().seek(this.k5 + (var9 & 4294967295L), 0);
               int var13 = var2.a6();

               for (int var14 = 0; var14 < (var13 & 65535); var14++) {
                  byte[] var15 = var2.n5(4);
                  var2.a6();
                  String var16 = com.aspose.slides.internal.l7h.j5.e2().l6(var15);
                  if ("liga".equals(var16) || "clig".equals(var16)) {
                     return true;
                  }
               }
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         } catch (RuntimeException var22) {
            return false;
         }
      }

      return false;
   }

   public final d5 n5(com.aspose.slides.internal.n2d.k5 var1) {
      if (this.l6 == 0L) {
         return null;
      }

      d5 var2 = new d5();
      var1.n5().setPosition(this.l6);
      var1.u3();
      var1.u3();
      var1.a6();
      var1.a6();
      long var3 = var1.a6() & 65535;
      var1.n5().setPosition(this.l6 + var3);
      long var5 = var1.a6() & 65535;

      for (long var7 = 0L; (var7 & 4294967295L) < (var5 & 4294967295L); var7++) {
         int var9 = var1.a6() & 65535;
         long var10 = var1.n5().getPosition();
         long var12 = this.l6 + var3 + var9;
         var1.n5().setPosition(this.l6 + var3 + var9);
         int var14 = var1.a6();
         int var15 = var1.a6();
         boolean var16 = (var14 & 65535) == 9;
         int var17 = var1.a6();
         long var18 = 0L;

         for (long var20 = 0L; (var20 & 4294967295L) < (var17 & 65535); var20++) {
            var18 = var1.a6() & 65535;
            long var22 = var1.n5().getPosition();
            if (var16) {
               var1.n5().setPosition(this.l6 + var3 + var9 + var18);
               var1.a6();
               var14 = var1.a6();
               var12 = this.l6 + var3 + var9 + var18;
               var18 = var1.k5() & 4294967295L;
            }

            if ((var14 & 65535) == 2) {
               d2 var24 = new d2(var1, var12, var18);
               var24.l6();
               var2.n5(var24.n5());
            }

            var1.n5().setPosition(var22);
         }

         var1.n5().setPosition(var10);
      }

      return var2;
   }

   public final c4 l6(com.aspose.slides.internal.n2d.k5 var1) {
      if (this.l6 == 0L) {
         return null;
      }

      c4 var2 = new c4();
      var1.n5().setPosition(this.l6);
      var1.u3();
      var1.u3();
      var1.a6();
      var1.a6();
      long var3 = var1.a6() & 65535;
      var1.n5().setPosition(this.l6 + var3);
      long var5 = var1.a6() & 65535;

      for (long var7 = 0L; (var7 & 4294967295L) < (var5 & 4294967295L); var7++) {
         int var9 = var1.a6() & 65535;
         long var10 = var1.n5().getPosition();
         long var12 = this.l6 + var3 + var9;
         var1.n5().setPosition(this.l6 + var3 + var9);
         int var14 = var1.a6();
         int var15 = var1.a6();
         boolean var16 = (var14 & 65535) == 9;
         int var17 = var1.a6();
         long var18 = 0L;

         for (long var20 = 0L; (var20 & 4294967295L) < (var17 & 65535); var20++) {
            var18 = var1.a6() & 65535;
            long var22 = var1.n5().getPosition();
            if (var16) {
               var1.n5().setPosition(this.l6 + var3 + var9 + var18);
               var1.a6();
               var14 = var1.a6();
               var12 = this.l6 + var3 + var9 + var18;
               var18 = var1.k5() & 4294967295L;
            }

            if ((var14 & 65535) == 4) {
               y2 var24 = new y2(var1, var12, var18);
               var24.l6();
               var2.n5(var24.n5());
            }

            var1.n5().setPosition(var22);
         }

         var1.n5().setPosition(var10);
      }

      return var2;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(List<Integer> var1, float var2) {
      if (!this.e5()) {
         return null;
      }

      u6 var3 = this.h0().l6((Integer)var1.get_Item(0));
      int var4 = var3.l6();
      int var5 = 0;
      if (var1.size() > 1 && (Integer)var1.get_Item(1) > 127994 && (Integer)var1.get_Item(1) <= 127999) {
         var5 = (Integer)var1.get_Item(1) - 127994;
      }

      return this.u3 != 0L ? this.n5(var4, var5, var2) : null;
   }

   private com.aspose.slides.internal.o9b.l6 n5(int var1, int var2, float var3) {
      com.aspose.slides.internal.z0k.t4 var4 = this.f0.l6();

      try {
         com.aspose.slides.internal.n2d.k5 var5 = new com.aspose.slides.internal.n2d.k5(var4);

         try {
            return this.n5(var5, var1, var2, var3);
         } catch (RuntimeException var10) {
            com.aspose.slides.internal.f8y.n5.u3(var10.getMessage());
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return null;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.n2d.k5 var1, int var2, int var3, float var4) {
      com.aspose.slides.internal.o9b.l6 var5 = null;
      if (!this.e5() || this.u3 == 0L || this.a6 == 0L) {
         return null;
      }

      if (this.h0() == null) {
         return null;
      }

      var1.n5().setPosition(this.u3);
      long var6 = var1.a6() & 65535;
      long var8 = var1.a6() & 65535;
      long var10 = var1.k5() & 4294967295L;
      long var12 = var1.k5() & 4294967295L;
      if ((var6 & 4294967295L) != 1L || var10 != 0L && var12 != 0L) {
         var1.n5().setPosition(this.a6);
         var1.a6();
         var1.a6();
         var1.a6();
         var1.a6();
         long var14 = var1.k5() & 4294967295L;
         var1.n5().setPosition(this.u3 + var10);

         for (long var16 = 0L; (var16 & 4294967295L) < (var8 & 4294967295L); var16++) {
            long var18 = var1.a6() & 65535;
            long var20 = var1.a6() & 65535;
            long var22 = var1.a6() & 65535;
            long var24 = var1.n5().getPosition();
            Dictionary var26 = new Dictionary();
            if ((var18 & 4294967295L) != var2) {
               var1.n5().setPosition(var24);
            } else {
               for (int var27 = 0; var27 < var3; var27++) {
                  var18 = var1.a6() & 65535;
                  var20 = var1.a6() & 65535;
                  var22 = var1.a6() & 65535;
               }

               List var71 = new List();
               var1.n5().setPosition(this.u3 + var12 + ((var20 & 4294967295L) * 4L & 4294967295L));

               for (long var28 = 0L; (var28 & 4294967295L) < (var22 & 4294967295L); var28++) {
                  long var30 = var1.a6() & 65535;
                  long var32 = var1.a6() & 65535;
                  var71.addItem(var30);
                  var26.addItem(var30, var32);
               }

               boolean var34 = this.m3() == 0;
               m3 var35 = new m3(var1, var34);
               Dictionary var36 = var35.n5(this.c8, this.t2, var71, this.t2());
               com.aspose.slides.internal.n2d.z1 var37 = new com.aspose.slides.internal.n2d.z1<>(Long.class, com.aspose.slides.internal.x4g.s7.class);
               List$Enumerator var38 = var71.iterator();

               try {
                  while (var38.hasNext()) {
                     long var39 = com.aspose.slides.internal.v6g.k5.u3(var38.next(), long.class);
                     com.aspose.slides.internal.x4g.s7 var41 = n5((t1)var36.get_Item(var39));
                     var37.addItem(var39, var41);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var38, IDisposable.class)) {
                     var38.dispose();
                  }
               }

               try {
                  int var43 = ((t1)var36.get_Item(var71.get_Item(0))).k5() + ((t1)var36.get_Item(var71.get_Item(0))).n5();
                  if (var43 > 0) {
                     float var44 = (float)q1.l6(q1.n5((double)(var4 * 10.0F / this.n3()), (int)(2)), 0.1F);
                     var5 = new com.aspose.slides.internal.o9b.l6(
                        com.aspose.slides.internal.v6g.k5.u3(var43 * var44, 13), com.aspose.slides.internal.v6g.k5.u3(this.n3() * var44, 13)
                     );
                     com.aspose.slides.internal.o9b.z1 var72 = com.aspose.slides.internal.o9b.z1.n5(var5);

                     try {
                        var72.l6(new com.aspose.slides.internal.x4g.m1());
                        var72.n5(var44 * 0.1F, var44 * 0.1F, 0);
                        var72.l6(0.0F, 20480.0F, 0);
                        IGenericEnumerator var42 = var37.iterator();

                        try {
                           while (var42.hasNext()) {
                              KeyValuePair var45 = (KeyValuePair)var42.next();
                              var1.n5().setPosition(this.a6 + var14 + (((Long)var26.get_Item(var45.getKey()) & 4294967295L) * 4L & 4294967295L));
                              int var46 = var1.u9() & 255;
                              int var47 = var1.u9() & 255;
                              int var48 = var1.u9() & 255;
                              int var49 = var1.u9() & 255;
                              com.aspose.slides.internal.o9b.c8 var50 = com.aspose.slides.internal.o9b.c8.n5(var49, var48, var47, var46).o8();
                              var72.n5(new com.aspose.slides.internal.o9b.i1(var50.o8()), (com.aspose.slides.internal.x4g.s7)var45.getValue());
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
                              var42.dispose();
                           }
                        }
                     } finally {
                        if (var72 != null) {
                           var72.dispose();
                        }
                     }

                     return var5;
                  }

                  var1.n5().setPosition(var24);
               } catch (RuntimeException var67) {
                  return null;
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   private static com.aspose.slides.internal.x4g.s7 n5(t1 var0) {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      var0.n5(var0.a6().n5(0));
      var0.u9().n5(true);
      h2 var2 = var0.u9();

      for (int var3 = 1; var3 <= var0.a6().n5(); var3++) {
         h2 var4 = var3 < var0.a6().n5() && !var2.u3() ? var0.a6().n5(var3) : var0.l6(var0.a6().n5(var3));
         if (!var4.k5() && !var4.a6()) {
            h2 var5 = var3 + 1 < var0.a6().n5() && !var4.u3() ? var0.a6().n5(var3 + 1) : var0.l6(var0.a6().n5(var3 + 1));
            if (var5.k5()) {
               com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(var2.n5(), -var2.l6());
               com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(var4.n5(), -var4.l6());
               com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var5.n5(), -var5.l6());
               com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(l6(var6.l6(), var7.l6()), l6(var6.k5(), var7.k5()));
               com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(l6(var8.l6(), var7.l6()), l6(var8.k5(), var7.k5()));
               var1.n5(var6.u3(), var9.u3(), var10.u3(), var8.u3());
               var2 = var4;
               var4 = var5;
               var3++;
            } else {
               int var14 = com.aspose.slides.internal.n2d.t4.n5((var5.n5() - var4.n5()) / 2.0F);
               int var15 = com.aspose.slides.internal.n2d.t4.n5((var5.l6() - var4.l6()) / 2.0F);
               h2 var16 = new h2(var14, var15, var4.n5() + var14, var4.l6() + var15, true, false);
               com.aspose.slides.internal.o9b.w1 var17 = new com.aspose.slides.internal.o9b.w1(var2.n5(), -var2.l6());
               com.aspose.slides.internal.o9b.w1 var18 = new com.aspose.slides.internal.o9b.w1(var4.n5(), -var4.l6());
               com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var16.n5(), -var16.l6());
               com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(l6(var17.l6(), var18.l6()), l6(var17.k5(), var18.k5()));
               com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1(l6(var11.l6(), var18.l6()), l6(var11.k5(), var18.k5()));
               var1.n5(var17.u3(), var12.u3(), var13.u3(), var11.u3());
               var2 = var4;
               var4 = var16;
            }
         } else {
            var1.l6((float)var2.n5(), (float)(-var2.l6()), (float)var4.n5(), (float)(-var4.l6()));
         }

         if (var2.u3()) {
            var1.n3();
            if (var3 < var0.a6().n5()) {
               var4 = var0.a6().n5(var3);
            }
         }

         var2 = var4;
      }

      if (var0.u9() != null) {
         var1.l6((float)var2.n5(), (float)(-var2.l6()), (float)var0.u9().n5(), (float)(-var0.u9().l6()));
      }

      var1.n3();
      return var1;
   }

   private static float l6(float var0, float var1) {
      return (var0 + 2.0F * var1) / 3.0F;
   }
}
