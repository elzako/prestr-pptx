package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.e5.t2$n5;
import com.aspose.slides.internal.p3.e5;
import com.aspose.slides.internal.p3.f2;
import com.aspose.slides.internal.p3.i1;
import com.aspose.slides.internal.p3.j4;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.q0;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.w2;
import com.aspose.slides.internal.p3.y2;
import com.aspose.slides.internal.u6.m1;
import com.aspose.slides.internal.u6.m3;
import com.aspose.slides.internal.u6.y1;
import com.aspose.slides.internal.u6.z1;
import com.aspose.slides.internal.x9.t9;
import com.aspose.slides.ms.System.IDisposable;

public class c8 extends com.aspose.slides.internal.p3.y4 {
   public com.aspose.slides.internal.u6.y4 t2;
   private com.aspose.slides.internal.a0.t2 k7;
   private int m3;
   private int z8;
   private int j5;
   private int w1;
   private int r4;
   private boolean c4;
   private com.aspose.slides.internal.v8.u9 y2;

   public c8(m1 var1, com.aspose.slides.internal.u6.y4 var2) {
      super(var1);
      this.t2 = var2;
      this.c4 = true;
      if (this.y1().w1()) {
         t2$n5 var3 = this.y1().x8();

         while (var3.l6()) {
            com.aspose.slides.internal.e5.t2 var4 = var3.c8();
            t2$n5 var5 = var4.x8();
            if (var5 != null && var5.l6()) {
               this.c4 = false;
            }
         }
      }
   }

   public final m1 y1() {
      return (m1)this.k5;
   }

   public final boolean a0() {
      return this.c4;
   }

   private boolean y0() {
      return this.d2().s0();
   }

   public final z1 d2() {
      return this.y1().e5();
   }

   public final int i1() {
      return this.t4;
   }

   @Override
   public final boolean e2() {
      z1 var1 = this.d2();
      if (var1.o0()) {
         int var2 = this.t2.m1();
         m3 var3 = var1.u9(var2);
         return var3.a5();
      } else {
         return false;
      }
   }

   @Override
   public int p3() {
      int[] var1 = this.t2.k7();
      this.q0 = var1[0];
      this.z3 = var1[1];
      if (this.y0()) {
         int var2 = this.d2().v8().u_().t2().c8().l6(this);
         this.q0 += var2 / 2;
         this.z3 += var2 / 2;
      } else {
         this.q0 /= 2;
         this.z3 /= 2;
      }

      this.q0 = this.q0 + this.y1().x9().n5(false, this);
      this.z3 = this.z3 + this.y1().x9().l6(false, this);
      return this.q0 + this.z3;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = com.aspose.slides.internal.x9.z1.l6().n5(this);
      if (var3 != null) {
         List$Enumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               t9 var5 = (t9)var4.next();
               if (var5.d2() != null) {
                  var5.d2().f5();
               } else {
                  var5.u3(true);
                  var5.t9();
                  if (var5.s7 != null) {
                     var5.s7.t9();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      com.aspose.slides.internal.v8.u9 var14 = var1.q0();
      this.t4 = var1.z3();
      this.j5 = this.t4;
      if (this.j5 != 0) {
         this.j5 = this.j5 - this.p3();
      }

      List var6 = new List();
      List var7 = new List();
      y2 var8 = null;

      y2 var9;
      while ((var9 = this.q0()) != null) {
         t1 var10 = new t1(0);
         var10.n5(var1.q0().l6(var14));
         var10.l6(this.j5);
         List var15 = var9.n5(var10, var2);
         int var11 = var10.z3() + this.p3();
         this.y2 = var10.f2().l6(this.p3());
         if (this.i1() < var11 && this.e2()) {
            this.t4 = var11;
            this.j5 = this.i1() - this.p3();
         }

         if (var10.s7()) {
         }

         if (var6.size() == 0 && var10.x8()) {
            this.t2.n5(var10.u9());
            var10.c8();
         }

         if (var8 != null && !com.aspose.slides.internal.p3.q0.l6(var6)) {
            this.n5(var6, var1, var10);
         }

         com.aspose.slides.internal.v3.t2.n5(var6, var15);
         if (var15.size() != 0) {
            if (var10.s7()) {
               var1.n5(var10.a6());
               var10.h0();
            }

            var8 = var9;
         }
      }

      this.t2.l6(var1.a6());
      new List();
      if (var6.size() != 0) {
         this.n5(var6, var7);
      } else {
         var7.addItem(new f2(0, this.n5(new j8(this)), true));
      }

      j4.n5(var7);
      if (((i1)var7.get_Item(0)).c8()) {
         this.t2.h0(((o0)var7.get_Item(0)).t2());
         var7.removeAt(0);
      }

      i1 var16 = (i1)com.aspose.slides.internal.v3.t2.n5(var7);
      if (var16.c8()) {
         o0 var17 = (o0)var16;
         this.t2.c8(var17.t2());
         var17.l6(0);
      }

      this.k5(true);
      return var7;
   }

   public final void u9(int var1) {
      this.z8 = var1;
   }

   public final void h0(int var1) {
      this.m3 = var1;
   }

   public final void c8(int var1) {
      this.r4 = var1;
   }

   public final void t2(int var1) {
      this.w1 = var1;
   }

   public final <T> void n5(w2<T> var1, t1 var2, int[] var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, h0 var10, int var11) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      this.c4();
      int var12 = this.t2.n5(var4, var6);
      int var13 = this.t2.l6(var5, var7);
      com.aspose.slides.internal.h2.t2 var14 = this.t2.u9().x9();
      int var15 = this.w1 - var12 - var13;
      int var16 = var15;
      var16 -= var14.k5(var6 == 2, this);
      var16 -= var14.u3(var7 == 2, this);
      this.n5(var10, var11, var12, var15);
      if (this.y0()) {
         if (!this.c4 || this.y1().o0()) {
            if (var12 > 0) {
               int var17 = this.y1().e5().v8().s7().c8().u3() / 2;
               l6(this.k7, var17);
            }

            p6.n5(this.k7, this.y1().x9(), var12 == 0, var13 == 0, false, false, this);
         }
      } else {
         boolean var30 = this.t2.m1() == 0;
         boolean var18 = this.t2.m1() + this.y1().z7() == this.d2().v4();
         if (!this.t2.m3()) {
            l6(this.k7, -var12);
            boolean[] var19 = new boolean[]{var8, var9, var30, var18};
            p6.n5(this.k7, this.t2.n5(var6), this.t2.l6(var7), this.t2.x8(), this.t2.n3(), var19);
         } else {
            l6(this.k7, var12);
            com.aspose.slides.internal.a0.t2[][] var33 = new com.aspose.slides.internal.a0.t2[this.y1().v4()][];

            for (int var20 = 0; var20 < this.y1().v4(); var20++) {
               var33[var20] = new com.aspose.slides.internal.a0.t2[this.y1().z7()];
            }

            com.aspose.slides.internal.u6.c8[] var34 = this.t2.q0().get_Item(var4);

            for (int var21 = 0; var21 < this.y1().z7(); var21++) {
               com.aspose.slides.internal.u6.c8 var22 = var34[var21];
               com.aspose.slides.internal.h2.t2$n5 var23 = var22.n5(var6);
               int var24 = var23.u3() / 2;
               if (var24 > 0) {
                  n5(var33, var4, var21, 17, var23, var8);
                  l6(var33[var4][var21], -var24);
                  u3(var33[var4][var21], -var24);
               }
            }

            var34 = this.t2.q0().get_Item(var5);

            for (int var36 = 0; var36 < this.y1().z7(); var36++) {
               com.aspose.slides.internal.u6.c8 var39 = var34[var36];
               com.aspose.slides.internal.h2.t2$n5 var43 = var39.l6(var7);
               int var47 = var43.u3() / 2;
               if (var47 > 0) {
                  n5(var33, var5, var36, 18, var43, var9);
                  u3(var33[var5][var36], -var47);
               }
            }

            for (int var37 = var4; var37 <= var5; var37++) {
               var34 = this.t2.q0().get_Item(var37);
               com.aspose.slides.internal.h2.t2$n5 var40 = var34[0].x8();
               int var44 = var40.u3() / 2;
               if (var44 > 0) {
                  n5(var33, var37, 0, 15, var40, var30);
                  n5(var33[var37][0], var44);
                  k5(var33[var37][0], -var44);
               }

               var40 = var34[var34.length - 1].n3();
               var44 = var40.u3() / 2;
               if (var44 > 0) {
                  n5(var33, var37, var34.length - 1, 16, var40, var18);
                  k5(var33[var37][var34.length - 1], -var44);
               }
            }

            int var38 = this.z8;

            for (int var42 = var4; var42 <= var5; var42++) {
               int var46 = var3[var42 - var4];
               int var48 = this.m3;

               for (int var25 = 0; var25 < var34.length; var25++) {
                  int var26 = this.d2().u9(this.t2.m1() + var25).i1().l6(this.h0());
                  if (var33[var42][var25] != null) {
                     com.aspose.slides.internal.a0.t2 var27 = var33[var42][var25];
                     l6(var27, var38);
                     n5(var27, var48);
                     k5(var27, var26);
                     u3(var27, var46);
                     this.u3.l6(var27);
                  }

                  var48 += var26;
               }

               var38 += var46;
            }
         }
      }

      p6.k5(this.k7, this.y1().h2());
      p6.l6(this.k7, var14, var6 == 2, var7 == 2, false, false, this);
      if (this.r4 < var16) {
         if (this.y1().t1() == 23) {
            com.aspose.slides.internal.a0.t2 var31 = new com.aspose.slides.internal.a0.t2();
            var31.k5((var16 - this.r4) / 2);
            this.k7.l6(var31);
         } else if (this.y1().t1() == 3) {
            com.aspose.slides.internal.a0.t2 var32 = new com.aspose.slides.internal.a0.t2();
            var32.k5(var16 - this.r4);
            this.k7.l6(var32);
         }
      }

      com.aspose.slides.internal.p3.h0.n5(this, var1, var2);
      this.k7.k5(var16);
      if (!this.y0() || !this.c4 || this.y1().o0()) {
         p6.n5(this.k7, this.y1().x9(), this);
      }

      this.d5();
      this.k7 = null;
      this.y2();
   }

   private void n5(h0 var1, int var2, int var3, int var4) {
      m3 var5 = this.d2().u9(this.t2.m1());
      if (var5.x9().a6()) {
         com.aspose.slides.internal.a0.t2 var6 = this.n5(var4, var3);
         ((y4)this.u3).n5(var5, var6, -this.q0);
      }

      com.aspose.slides.internal.u6.y2 var9 = this.t2.y4();
      if (var9.x9().a6()) {
         var1.n5(this.n5(var4, var3));
      }

      y1 var7 = this.t2.h0();
      if (var7 != null && var7.x9().a6()) {
         com.aspose.slides.internal.a0.t2 var8 = this.n5(var4, var3);
         ((y4)this.u3).n5(var8);
         p6.n5(var8, var7.x9(), this.u3, -this.m3 - this.q0, -var3, this.u3.c8(), var2);
      }
   }

   private static void n5(com.aspose.slides.internal.a0.t2[][] var0, int var1, int var2, int var3, com.aspose.slides.internal.h2.t2$n5 var4, boolean var5) {
      if (var0[var1][var2] == null) {
         var0[var1][var2] = new com.aspose.slides.internal.a0.t2();
         var0[var1][var2].n5(31, true);
         var0[var1][var2].t2(2);
      }

      var0[var1][var2].n5(var3, new com.aspose.slides.internal.v8.n5(var4.n5(), var4.u3(), var4.l6().o8(), var5 ? 2 : 1, var4.n5));
   }

   private static void n5(com.aspose.slides.internal.a0.t2 var0, int var1) {
      var0.n5(var0.y1() + var1, false, false);
   }

   private static void l6(com.aspose.slides.internal.a0.t2 var0, int var1) {
      var0.l6(var0.d5() + var1, false, false);
   }

   private static void k5(com.aspose.slides.internal.a0.t2 var0, int var1) {
      var0.l6(var0.l6() + var1);
   }

   private static void u3(com.aspose.slides.internal.a0.t2 var0, int var1) {
      var0.k5(var0.e_() + var1);
   }

   private com.aspose.slides.internal.a0.t2 n5(int var1, int var2) {
      com.aspose.slides.internal.h2.t2 var3 = this.y1().x9();
      int var4 = var3.n5(false, this);
      int var5 = var3.l6(false, this);
      com.aspose.slides.internal.a0.t2 var6 = new com.aspose.slides.internal.a0.t2();
      p6.n5(var6, this.d2().y1());
      var6.t2(2);
      var6.l6(this.j5 + var4 + var5);
      var6.k5(var1);
      var6.n5(this.m3 + this.q0 - var4, false, false);
      var6.l6(this.z8 + var2, false, false);
      return var6;
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.k7 == null) {
         this.k7 = new com.aspose.slides.internal.a0.t2();
         this.k7.n5(31, true);
         p6.n5(this.k7, this.y1().y1());
         this.k7.t2(2);
         this.k7.n5(this.m3 + this.q0, false, false);
         this.k7.l6(this.z8, false, false);
         z1 var2 = this.d2();
         if (var2.o0()) {
            int var3 = this.t2.z3();
            int var4 = this.t2.m1();
            m3 var5 = var2.u9(var4);
            int var6 = var5.c8;
            if (var5.t2.containsKey(var3)) {
               var6 = var5.t2.get_Item(var3);
            }

            this.k7.l6(var6 - this.p3());
         } else {
            this.k7.l6(this.j5);
         }

         this.u3.n5(this.k7);
         this.n5(this.k7);
      }

      return this.k7;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.k7 != null) {
         this.k7.l6((com.aspose.slides.internal.a0.t2)var1);
      }
   }

   @Override
   public int n5(int var1, i1 var2) {
      return 0;
   }

   @Override
   public void n5(e5 var1) {
   }

   @Override
   public s3 a5() {
      return s3.n5;
   }

   @Override
   public s3 v0() {
      return s3.n5;
   }

   @Override
   public s3 h2() {
      return s3.n5;
   }

   @Override
   public int c8() {
      return this.j5;
   }

   @Override
   public int t2() {
      return this.k7 != null ? this.k7.e_() : -1;
   }

   @Override
   public boolean s7() {
      return true;
   }

   @Override
   public boolean x8() {
      return true;
   }

   public final com.aspose.slides.internal.v8.u9 x9() {
      return this.y2;
   }
}
