package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p3.f0;
import com.aspose.slides.internal.p3.j3;
import com.aspose.slides.internal.p3.j4$l6;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v0;
import com.aspose.slides.internal.p3.w2;
import com.aspose.slides.ms.System.IDisposable;

public class m1 extends y1 {
   private com.aspose.slides.internal.d2.x8 t2;
   private com.aspose.slides.internal.d2.c8 s7;
   private com.aspose.slides.internal.a0.t2 x8;
   private com.aspose.slides.internal.h2.t2 t4 = null;
   private com.aspose.slides.internal.f2.k5 q0;
   private int z3 = 12;
   private com.aspose.slides.internal.f2.k5 m1;
   private int k7;
   private com.aspose.slides.internal.h2.y4 m3 = null;
   private com.aspose.slides.internal.f2.k5 z8;
   private com.aspose.slides.internal.f2.k5 j5;
   private boolean w1;
   private boolean r4;
   private int c4;
   private int y2;
   private int y1;
   private boolean a0 = false;
   private com.aspose.slides.internal.p3.y2 d2 = null;
   private int d5;
   private int s3;

   public final boolean y1() {
      return this.a0;
   }

   public final void u3(boolean var1) {
      this.a0 = var1;
   }

   public final void k5(int var1) {
      this.d5 = var1;
   }

   public final void u3(int var1) {
      this.s3 = var1;
   }

   public m1(com.aspose.slides.internal.v4.z1 var1) {
      super(var1);
   }

   @Override
   public void t4() {
      com.aspose.slides.internal.v4.z1 var1 = (com.aspose.slides.internal.v4.z1)this.k5;
      this.t4 = var1.z7();
      this.q0 = var1.i1();
      this.z3 = var1.e5();
      this.m1 = var1.b3();
      this.k7 = var1.t1();
      this.m3 = var1.v4();
      boolean var2 = var1.v0() % 180 != 0;
      if (var2) {
         this.z8 = var1.a5().u3(this).c8();
         this.j5 = var1.o0().u3(this).c8();
      } else {
         this.z8 = var1.o0().u3(this).c8();
         this.j5 = var1.a5().u3(this).c8();
      }
   }

   protected final void a6(int var1) {
      this.c4 = var1;
   }

   @Override
   protected final void k5(List<com.aspose.slides.internal.r4.u9> var1) {
      int var2 = 0;
      if (this.t4 != null) {
         var2 += this.t4.l6(false) + this.t4.l6(false, this);
      }

      if (this.m3 != null) {
         var2 += this.m3.u3.l6(this);
      }

      if (var2 > 0) {
         var1.addItem(new c4(var2, this.e2, new f0(this, null), true));
      }
   }

   @Override
   protected final void u3(List<com.aspose.slides.internal.r4.u9> var1) {
      int var2 = 0;
      if (this.t4 != null) {
         var2 += this.t4.n5(false) + this.t4.n5(false, this);
      }

      if (this.m3 != null) {
         var2 += this.m3.k5.l6(this);
      }

      if (var2 > 0) {
         var1.insertItem(0, new c4(var2, this.e2, new f0(this, null), true));
      }
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      com.aspose.slides.internal.v4.z1 var3 = (com.aspose.slides.internal.v4.z1)this.k5;
      boolean var4 = var3.v0() % 180 != 0;
      this.w1 = false;
      var1.q0().l6();
      this.y1 = var1.z3();
      int var5;
      if (this.z8.a6() != 9 && (this.z8.k5() || this.l6() > 0)) {
         var5 = this.z8.l6(this);
         var5 += this.t4.u9(false, this);
      } else {
         var5 = 0;
         this.w1 = true;
      }

      if (this.j5.a6() == 9) {
         this.a6(this.y1);
         this.r4 = true;
      }

      if (!this.w1) {
         this.y2 = var5 - this.t4.u9(false, this);
      } else {
         this.y2 = var5;
      }

      this.d5();
      List var6 = new List();
      com.aspose.slides.internal.p3.d5 var7 = new com.aspose.slides.internal.p3.d5();
      this.u3(var7);
      com.aspose.slides.internal.v8.u9 var8 = com.aspose.slides.internal.v8.u9.n5(this.r4 ? this.y1 : this.j5.l6(this));
      m1$n5 var9 = new m1$n5(this, var8, var1);
      var9.n5(this.z8.l6(this), this.w1);
      if (!var9.t2()) {
         if (this.w1) {
            int var10 = var9.y4();
            if (var4) {
               this.a6(var10);
            } else {
               this.y2 = var10;
            }

            this.d5();
         }

         j3 var12 = new j3(this, var9);
         var7.addItem(new c4(var8.l6(), this.n5(var1), this.n5(var12), false));
      }

      this.k5(var7);
      var6.addItem(var7);
      this.k5(true);
      return var6;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      this.x8.l6((com.aspose.slides.internal.a0.t2)var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      List var3 = new List();
      com.aspose.slides.internal.p3.y2 var4 = null;
      j8 var5 = null;
      j3 var6 = null;

      while (var1.l6()) {
         j8 var7 = (j8)var1.k5();
         j8 var8 = var7;
         if (com.aspose.slides.internal.v6g.k5.l6(var7, f0.class)) {
            var8 = var7.k5();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var7, j3.class)) {
            if (var6 != null) {
               throw new Exception("Only one SubBreakerPosition allowed");
            }

            var6 = (j3)var7;
         } else if (var8 != null && !com.aspose.slides.internal.v6g.k5.l6(var8, j4$l6.class)) {
            var3.addItem(var8);
            var4 = var8.u3();
            var5 = var8;
         }
      }

      this.c4();
      this.n5(true, true, var5 == null || this.k5(var5));
      com.aspose.slides.internal.p3.y2 var11 = null;
      if (var6 == null) {
         w2 var9 = new w2(new com.aspose.slides.internal.r4.u3(var3));

         com.aspose.slides.internal.p3.y2 var10;
         while ((var10 = var9.u9()) != null) {
            var2.n5(128, var2.k5() && var10 == var4);
            var10.n5(var9, var2);
            var2.n5(var2.e2());
            var2.n5(256, true);
            var11 = var10;
         }

         if (this.t2 != null) {
            this.t2.k5(this.s7);
            this.h0().l6(this.t2);
         }
      } else {
         ((com.aspose.slides.internal.p3.k5)var6.n5()).n3();
      }

      this.n5(false, true, var5 == null || this.k5(var5));
      boolean var12 = var2.k5() && var11 == this.d2;
      var2.n5(128, var12);
   }

   @Override
   public int c8() {
      return this.j5.a6() == 9 ? this.c4 : this.j5.l6(this);
   }

   @Override
   public int t2() {
      return this.z8.a6() == 9 ? this.y2 : this.z8.l6(this);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (com.aspose.slides.internal.x9.z1.l6().n5()) {
         this.s7 = null;
      }

      if (this.s7 == null) {
         this.t2 = new com.aspose.slides.internal.d2.x8(var1);
         this.t2.n5(32, true);
         this.t2.l6(this.c8());
         this.t2.k5(this.t2());
         p6.n5(this.t2, this.k5.y1());
         p6.n5(this.t2, this.t4, false, false, false, false, this);
         p6.l6(this.t2, this.t4, false, false, false, false, this);
         p6.n5(this.t2, this.t4, this);
         this.t2.l6(this.d2());
         this.t2.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.c8(), this.t2()));
         if (this.q0 != null && this.q0.a6() != 14) {
            this.t2.t9(this.e2.h0());
         }

         this.s7 = new com.aspose.slides.internal.d2.t2();
         this.s7.n5(31, true);
         p6.n5(this.s7, this.k5.y1());
         this.h0().n5(this.s7);
         this.s7.l6(this.y1);
         this.x8 = new com.aspose.slides.internal.a0.t2();
         this.s7.n5(this.x8);
         this.n5(this.t2);
      }

      return this.s7;
   }

   private boolean d2() {
      int var1 = ((com.aspose.slides.internal.v4.z1)this.k5).h2();
      return var1 == 57 || var1 == 42;
   }

   @Override
   protected k5 n5(t1 var1) {
      int var2 = this.y2;
      if (this.t4 != null) {
         var2 += this.t4.u9(false, this);
      }

      int var3 = this.d5 + this.s3;
      if ((this.d5 != 0 || this.s3 != 0) && var2 >= var3) {
         int var4 = (var2 + var3) / 2;
         this.e2 = new k5(var4, this.q0, this.z3, this.m1, this.k7, var1.j5());
         if (this.y1()) {
            var3 *= 2;
         }

         k5 var5 = new k5(this.y1() ? (var4 + var3) / 2 : var4, this.q0, this.z3, this.m1, this.k7, var1.j5());
         var5.n5(var4 - var3);
         return var5;
      } else {
         this.e2 = new k5(var2, this.q0, this.z3, this.m1, this.k7, var1.j5());
         return this.e2;
      }
   }

   @Override
   protected com.aspose.slides.internal.v8.u9 u9(int var1) {
      return com.aspose.slides.internal.v8.u9.n5(this.n3.l6());
   }

   private void n5(List<com.aspose.slides.internal.r4.u9> var1, List<com.aspose.slides.internal.r4.u9> var2) {
      this.n5(var1, var2, false);
   }

   private void n5(List<com.aspose.slides.internal.r4.u9> var1, List<com.aspose.slides.internal.r4.u9> var2, boolean var3) {
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.r4.u9 var5 = (com.aspose.slides.internal.r4.u9)var4.next();
            if (var5.k5()) {
               this.n5(var5.n5(), var2, var3);
            } else if (var5.u3()) {
               this.n5(var5.l6(), var2, var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private void n5(v0 var1, List<com.aspose.slides.internal.r4.u9> var2, boolean var3) {
      if (var3 || var1.m3() != this) {
         var1.n5(this.n5(new f0(this, var1.k7())));
      }

      var2.addItem(var1);
   }

   private void d5() {
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.e5.t9 n5(m1 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.e5.t9 l6(m1 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static void n5(m1 var0, List var1, List var2) {
      var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.e5.t9 k5(m1 var0) {
      return var0.k5;
   }
}
