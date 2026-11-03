package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public class u0a extends i2 {
   private k9m n5;
   private l2p l6;
   private d7u k5;
   private n2 u3;
   private i2 a6;
   private Object u9 = new Object();
   private boolean h0;
   private String c8;
   private String t2;
   private String s7;
   private int x8;
   private p0 n3;
   private p0 y4;
   private Object e2 = new Object();
   private Object t9 = new Object();
   private List<String> z1 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "arab", "name", "maxp", "head", "glyf", "loca", "cmap", "hhea", "hmtx", "post", "kern", "cff", "cvt", "fpgm", "prep", "os/2", "gdef", "gpos", "gsub"
   );

   public u0a() {
      this.n5 = new k9m(this);
      this.k5 = d7u.n5();
      this.k5.n5(new n1g(this.k5, this));
      this.k5.k5().u9((short)1);
      this.k5.n5(new q8g(this.k5, this));
      this.k5.n5(new e6a(this.k5, this));
      this.k5.n5(new h6l(this.k5, this));
      this.k5.n5(new y5s(this.k5, this));
      this.k5.n5(new q4d(this.k5, this));
      this.k5.u3().n5.l6(new u0a$1(this));
      this.k5.n5(new u7c(this.k5, this));
      this.k5.n5(new v7u(this.k5, this));
      this.k5.n5(new c9t(this.k5, this));
      this.k5.n5(new d2n(this.k5, this));
   }

   private void n5(Object var1, com.aspose.slides.ms.System.f2 var2) {
      q4d$n5 var3 = (q4d$n5)var2;
      switch (var3.n5) {
         case 1:
            this.t2 = this.l6().u3().l6(1);
            break;
         case 2:
            this.s7 = this.l6().u3().l6(2);
            this.x8 = h0(this.s7);
         case 3:
         case 5:
         default:
            break;
         case 4:
            this.c8 = this.l6().u3().l6(4);
            this.n3 = this.l6().u3().n5(4);
            break;
         case 6:
            this.y4 = this.l6().u3().n5(6);
      }
   }

   public u0a(n2 var1, d7u var2) {
      this.n5 = new k9m(this);
      this.k5 = var2;
      this.u3 = var1;
      this.x8 = 0;
   }

   public final boolean n5() {
      return this.l6().u3() == null && this.l6().t9() != null && this.l6().t9().k5().size() == 441 && this.l6().t9().n5().length == 36963
         || this.u3() != null
            && (
               com.aspose.slides.ms.System.d1.c8(this.u3(), "MingLi") > -1
                  || com.aspose.slides.ms.System.d1.c8(this.u3(), "DFKai") > -1
                  || com.aspose.slides.ms.System.d1.c8(this.u3(), "+___") > -1
                     && (this.l6().t4().t4()[0] & 255) == 68
                     && (this.l6().t4().t4()[1] & 255) == 89
                     && (this.l6().t4().t4()[2] & 255) == 78
                     && (this.l6().t4().t4()[3] & 255) == 65
            );
   }

   public final void n5(g9t var1) {
      this.l6().h0().y1().n5(var1);
   }

   public d7u l6() {
      return this.k5;
   }

   public i2 k5() {
      this.y4();
      return this.a6;
   }

   @Override
   public int a6() {
      return 0;
   }

   public String u3() {
      return this.t2;
   }

   public void n5(String var1) {
      this.t2 = var1;
      if (this.l6().u3() != null) {
         this.l6().u3().n5(1, this.t2);
      }
   }

   public String h0() {
      return this.s7;
   }

   public void l6(String var1) {
      this.s7 = var1;
      this.x8 = h0(this.s7);
      if (this.l6().u3() != null) {
         this.l6().u3().n5(2, this.s7);
      }
   }

   public int c8() {
      return this.x8;
   }

   @Override
   public String u9() {
      return this.c8;
   }

   public void u3(String var1) {
      this.c8 = var1;
      if (this.l6().u3() != null && this.c8 != null) {
         this.l6().u3().n5(4, this.c8);
      }
   }

   public p0 z1() {
      if (this.n3 == null) {
         synchronized (this.e2) {
            if (this.n3 == null) {
               this.n3 = new p0(this.u9());
            }
         }
      }

      return this.n3;
   }

   public void n5(p0 var1) {
      this.n3 = var1;
   }

   public p0 t4() {
      if (this.y4 == null) {
         synchronized (this.t9) {
            if (this.y4 == null) {
               this.y4 = new p0(this.u9());
            }
         }
      }

      return this.y4;
   }

   public void l6(p0 var1) {
      this.y4 = var1;
   }

   public int q0() {
      return this.l6().a6() == null ? 0 : this.l6().a6().n5() & 65535;
   }

   @Override
   public t7 t2() {
      if (this.l6 == null) {
         this.l6 = new l2p(this.l6());
      }

      return this.l6;
   }

   @Override
   public v7 s7() {
      return this.n5;
   }

   @Override
   public n2 x8() {
      return this.u3;
   }

   public static i2 n5(i2 var0, x7 var1) {
      u0a var2 = new u0a();
      u0a var3 = com.aspose.slides.internal.v6g.k5.n5(var0, u0a.class);
      if (var3 != null) {
         if (var1.n5()) {
            var2.n5(var3.l6().k5().y1());
            byte[] var4 = null;
            long var5 = 0L;
            long var7 = 0L;
            if (var3.l6().e2() != null) {
               var2.l6().n5(new p4l(var2.l6(), var2));
               byte[][] var9 = new byte[][]{var4};
               long[] var10 = new long[]{0L};
               long[] var11 = new long[]{0L};
               var3.l6().e2().n5(var9, var10, var11);
               var4 = var9[0];
               var5 = var10[0];
               var7 = var11[0];
               var2.l6().e2().n5 = var4;
            }

            if (var3.l6().z1() != null) {
               var2.l6().n5(new x2y(var2.l6(), var2));
               byte[][] var15 = new byte[][]{var4};
               long[] var17 = new long[]{var5};
               long[] var19 = new long[]{var7};
               var3.l6().z1().n5(var15, var17, var19);
               var4 = var15[0];
               var5 = var17[0];
               var7 = var19[0];
               var2.l6().z1().n5 = var4;
            }

            if (var3.l6().t9() != null) {
               var2.l6().n5(new n5u(var2.l6(), var2));
               byte[][] var16 = new byte[][]{var4};
               long[] var18 = new long[]{var5};
               long[] var20 = new long[]{var7};
               var3.l6().t9().n5(var16, var18, var20);
               var4 = var16[0];
               var5 = var18[0];
               var7 = var20[0];
               var2.l6().t9().n5 = var4;
            }
         }

         if (var3.l6().a6() != null) {
            var2.l6().a6().u3(var3.l6().a6().u3());
            var2.l6().a6().a6(var3.l6().a6().a6());
            var2.l6().a6().h0(var3.l6().a6().h0());
            var2.l6().a6().l6(var3.l6().a6().l6());
            var2.l6().a6().u9(var3.l6().a6().u9());
            var2.l6().a6().k5(var3.l6().a6().k5());
         }

         if (var3.l6().k5() != null) {
            var2.l6().k5().n5(var3.l6().k5().n5());
            var2.l6().k5().l6(var3.l6().k5().h0());
            var2.l6().k5().n5(var3.l6().k5().k5());
            var2.l6().k5().l6(var3.l6().k5().u3());
            var2.l6().k5().k5(var3.l6().k5().a6());
            var2.l6().k5().u3(var3.l6().k5().u9());
            var2.l6().k5().a6(var3.l6().k5().t2());
         }

         if (var3.l6().t4() != null) {
            var2.l6().t4().n5(var3.l6().t4());
            var2.l6().t4().k5(8);
         }

         if (var3.l6().u3() != null) {
            n5(var2, var3, 1);
            n5(var2, var3, 2);
            n5(var2, var3, 3);
            n5(var2, var3, 4);
            n5(var2, var3, 5);
            n5(var2, var3, 6);
         }
      }

      return var2;
   }

   private static void n5(u0a var0, u0a var1, int var2) {
      String var3 = var1.l6().u3().l6(var2);
      if (var3 != null) {
         var0.l6().u3().n5(var2, var3);
      }
   }

   @Override
   public d3 n3() {
      return new h3r(this);
   }

   public final int n5(k6 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, q1.class)) {
         q1 var2 = (q1)var1;

         for (Object recoveredElement$var4$8321 : var2.l6()) {
            u5 var4 = (u5)recoveredElement$var4$8321;
            this.n5(var4.n5());
         }
      }

      if (!this.l6().h0().n5(var1)) {
         if (this.l6().h0() != null) {
            int var9 = this.l6().a6().n5();
            Object var10 = null;
            boolean var12 = false;
            byte[][] var5 = new byte[][]{(byte[])var10};
            boolean[] var6 = new boolean[]{false};
            this.l6().h0().n5(var1, var5, var6);
            var10 = var5[0];
            var12 = var6[0];
            if (this.l6().u9().n5().n5() == 0) {
               this.l6().u9().n5().l6(0);
            }

            if (var12) {
               long var7 = this.l6().u9().n5().n5(this.l6().u9().n5().n5() - 1);
               this.l6().u9().n5().n5((var7 & 4294967295L) + ((Object[])var10).length & 4294967295L & 4294967295L);
               this.l6().t2().n5((this.l6().t2().n5() & 65535) + 1 & 65535);
               this.l6().s7().n5().n5(new e6a$n5(com.aspose.slides.internal.v6g.k5.k5(var1.t2(), 14), com.aspose.slides.internal.v6g.k5.l6(var1.h0(), 14)));
               this.l6().a6().n5(this.l6().a6().n5() + 1);
               this.l6().h0().n5 = false;
            }

            return var9;
         } else {
            return 0;
         }
      } else {
         return this.l6().h0().l6(var1);
      }
   }

   public final int l6(k6 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, q1.class)) {
         q1 var2 = (q1)var1;

         for (Object recoveredElement$var4$9768 : var2.l6()) {
            u5 var4 = (u5)recoveredElement$var4$9768;
            this.l6(var4.n5());
            if (var1.t2() < var4.n5().t2()) {
               var1.k5(var4.n5().t2());
            }

            if (var1.h0() < var4.n5().h0()) {
               var1.n5(var4.n5().h0());
            }
         }
      }

      if (var1.u3().k5() != null) {
         return this.l6(var1.u3().l6()) & 65535;
      }

      if (this.l6().h0() != null) {
         int var10 = this.l6().a6().n5();
         Object var11 = null;
         boolean var13 = false;
         byte[][] var5 = new byte[][]{(byte[])var11};
         boolean[] var6 = new boolean[]{false};
         this.l6().h0().n5(var1, var5, var6);
         var11 = var5[0];
         var13 = var6[0];
         if (this.l6().u9().n5().n5() == 0) {
            this.l6().u9().n5().l6(0);
         }

         if (var13) {
            long var7 = this.l6().u9().n5().n5(this.l6().u9().n5().n5() - 1);
            this.l6().u9().n5().n5((var7 & 4294967295L) + ((Object[])var11).length & 4294967295L & 4294967295L);
            this.l6().u9().n5(true);

            for (int var9 = 0; var9 < this.l6().s7().l6().length; var9++) {
               this.l6().s7().n5().n5(new e6a$n5(0, (short)0));
            }

            this.l6().s7().n5().n5(new e6a$n5(com.aspose.slides.internal.v6g.k5.k5(var1.t2(), 14), com.aspose.slides.internal.v6g.k5.l6(var1.h0(), 14)));
            this.l6().t2().n5(this.l6().s7().n5().n5() & 65535);
            this.l6().t2().n5(true);
            this.l6().s7().n5(new short[0]);
            this.l6().s7().n5(true);
            this.l6().a6().n5(this.l6().a6().n5() + 1);
            this.l6().a6().n5(true);
            this.l6().h0().l6.addItem(var10);
            this.l6().h0().n5 = true;
         }

         return var10;
      } else {
         return 0;
      }
   }

   @Override
   public k6 n5(r9 var1) {
      k6 var2 = null;
      k2 var3;
      if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class)) != null) {
         var2 = this.n5(var3.n5());
      } else {
         k3 var4;
         if ((var4 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class)) != null) {
            var2 = this.a6(var4.n5());
         }
      }

      return var2;
   }

   public final k6 a6(String var1) {
      k6 var2 = null;
      if (this.k5() != null) {
         var2 = ((v0)this.k5()).n5(var1);
      } else if (this.l6().x8() != null) {
         int var3 = this.l6().x8().n5(var1);
         var2 = this.n5(var3);
      }

      return var2;
   }

   public final k6 n5(int var1) {
      k6 var2 = null;
      if (this.k5() != null) {
         var2 = ((v0)this.k5()).n5(var1);
      } else {
         var2 = this.l6().h0().n5(var1);
      }

      return var2;
   }

   public void n5(r9 var1, n0 var2) {
      k2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      if (var3 != null) {
         this.n5(var3.n5(), var2);
      } else {
         k3 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class);
         if (var4 != null) {
            this.n5(var4.n5(), var2);
         }
      }
   }

   public final void n5(String var1, n0 var2) {
      if (this.k5() != null) {
         throw new NotImplementedException("TTF fonts support with CFF inside is not implemented");
      }

      if (this.l6().x8() != null) {
         int var3 = this.l6().x8().n5(var1);
         this.n5(var3, var2);
      }
   }

   public final void n5(int var1, n0 var2) {
      if (this.k5() != null) {
         throw new NotImplementedException("TTF fonts support with CFF inside is not implemented");
      }

      this.l6().h0().n5(var1, var2);
   }

   @Override
   public r9[] k5(String var1) {
      if (this.k5.m1() != null && this.k5.z3() != null) {
         String var2 = j3b.n5(this, 1, var1);
         if (var2 == null) {
            return super.k5(var1);
         }

         g2x var3 = this.n5(var1, var2);
         n5(this, 1, var3, var2);
         List var4 = new List();
         List$Enumerator var5 = var3.n5().iterator();

         try {
            while (var5.hasNext()) {
               s2b var6 = (s2b)var5.next();
               var4.addItem(var6.n5());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         return (r9[])var4.toArray(new r9[0]);
      } else {
         return super.k5(var1);
      }
   }

   public final byte[] u9(String var1) {
      d3[] var2 = new d3[]{this.n3()};
      r9[] var3 = this.k5(var1);
      com.aspose.slides.ms.System.u3.n5(var3, new u0a$2(this, var2));
      u0a var4 = com.aspose.slides.internal.v6g.k5.n5(var2[0], u0a.class);
      if (var4 == null) {
         throw new InvalidOperationException("Failed to create a font subset");
      }

      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      try {
         var4.n5(var5);
         return var5.toArray();
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private void y4() {
      if (!this.h0) {
         synchronized (this.u9) {
            if (!this.h0) {
               if (this.l6().y4() != null && this.l6().y4().n5() != null) {
                  this.a6 = n5(2, this.l6().y4().n5());
               }

               this.h0 = true;
            }
         }
      }
   }

   private static int h0(String var0) {
      byte var1 = 0;
      if (var0 != null) {
         String var2 = com.aspose.slides.ms.System.d1.u9(var0);
         if (com.aspose.slides.ms.System.d1.c8(var2, "italic") != -1) {
            var1 |= 4;
         }

         if (com.aspose.slides.ms.System.d1.c8(var2, "bold") != -1) {
            var1 |= 2;
         }
      }

      if (var1 == 0) {
         var1 = 1;
      }

      return var1;
   }

   public final int l6(r9 var1) {
      k2 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class)) != null) {
         return var2.n5();
      }

      k3 var3;
      return this.l6().x8() != null && (var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class)) != null ? this.l6().x8().n5(var3.n5()) : 0;
   }

   private g2x n5(String var1, String var2) {
      boolean var3 = false;
      m5 var5;
      switch (t4.n5(var2)) {
         case 0:
            z6z var4 = new z6z();
            var5 = var4.n5(var1);
            var3 = true;
            break;
         default:
            p6t var6 = new p6t();
            var5 = var6.n5(var1, 10);
      }

      return new g2x(var5, this, var3);
   }

   private static void n5(u0a var0, int var1, g2x var2, String var3) {
      a2w var4 = var1 == 1 ? var0.l6().z3().n5().n5(var3) : var0.l6().q0().n5().n5(var3);
      if (var4 == null) {
         throw new r7c(com.aspose.slides.ms.System.d1.n5("Can't find \"{0}\" script", new Object[]{var3}));
      }

      try {
         r6a var5 = new r6a(var0);
         r7n var6 = var4.k5();
         if ((var6.k5() & 65535) != 65535) {
            var5.n5(var1).n5(var6.k5() & 65535, var2);
         } else {
            e8 var7 = var5.n5(var1);
            Integer[] var8 = n5(var0, var6.u3());
            Integer[] var9 = var8;
            int var10 = var9.length;

            for (int var11 = 0; var11 < var10; var11++) {
               int var12 = var9[var11];
               var7.n5(var12 & 65535, var2);
            }
         }
      } catch (d9m var13) {
      }
   }

   private static Integer[] n5(u0a var0, Integer[] var1) {
      List var2 = new List();
      h3d var3 = var0.l6().z3().l6();

      for (t6 var7 : v6.n5) {
         Integer[] var8 = var1;
         int var9 = var8.length;

         for (int var10 = 0; var10 < var9; var10++) {
            int var11 = var8[var10];
            u6p var12 = var3.n5(var11 & 65535);
            if (com.aspose.slides.ms.System.d1.a6(var12.l6(), var7.k5)) {
               var2.addItem(var11);
            }
         }
      }

      return (Integer[])var2.toArray(new Integer[0]);
   }

   public final void n5(String var1, g9t var2, long var3, long var5, long var7) {
      this.z1.addItem(var1);
      switch (t4.n5(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(var1)))) {
         case 1:
            this.k5.n5(new q4d(var2, var3, var5, var7));
            this.k5.u3().n5.l6(new u0a$3(this));
            break;
         case 2:
            this.k5.n5(new h6l(var2, var3, var5, var7));
            break;
         case 3:
            this.k5.n5(new n1g(var2, var3, var5, var7));
            break;
         case 4:
            this.k5.n5(new d2n(var2, var3, var5, var7));
            break;
         case 5:
            this.k5.n5(new c9t(var2, var3, var5, var7));
            break;
         case 6:
            this.k5.n5(new v7u(var2, var3, var5, var7));
            break;
         case 7:
            this.k5.n5(new q8g(var2, var3, var5, var7));
            break;
         case 8:
            this.k5.n5(new e6a(var2, var3, var5, var7));
            break;
         case 9:
            this.k5.n5(new u7c(var2, var3, var5, var7));
            break;
         case 10:
            this.k5.n5(new x4a(var2, var3, var5, var7));
            break;
         case 11:
            this.k5.n5(new t4r(var2, var3, var5, var7));
            break;
         case 12:
            this.k5.n5(new p4l(var2, var3, var5, var7));
            break;
         case 13:
            this.k5.n5(new n5u(var2, var3, var5, var7));
            break;
         case 14:
            this.k5.n5(new x2y(var2, var3, var5, var7));
            break;
         case 15:
            this.k5.n5(new y5s(var2, var3, var5, var7));
            break;
         case 16:
            this.k5.n5(new b8c(var2, var3, var5, var7));
            break;
         case 17:
            this.k5.n5(new g1p(var2, var3, var5, var7));
            break;
         case 18:
            this.k5.n5(new n9q(var2, var3, var5, var7));
      }
   }

   public final void n5(Dictionary<Integer, String> var1) {
      this.k5.n5.removeItem("cmap");
      this.k5.n5(new v7u(this.k5, this));
      Dictionary$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            this.l6().c8().l6(((String)var3.getValue()).charAt(0), (Integer)var3.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void z3() {
      this.k5.n5.removeItem("post");
      this.k5.n5(new u7c(this.k5, this));
   }

   public final void m1() {
      this.k5.n5.removeItem("name");
      this.k5.n5(new q4d(this.k5, this));
   }

   // $VF: synthetic method
   static void n5(u0a var0, Object var1, com.aspose.slides.ms.System.f2 var2) {
      var0.n5(var1, var2);
   }
}
