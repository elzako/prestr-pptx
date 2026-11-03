package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class x8 extends y4 implements c4 {
   private com.aspose.slides.internal.a0.t2 k7;
   protected com.aspose.slides.internal.r4.h0<y2> t2;
   private int m3 = 12000;
   private com.aspose.slides.internal.f2.k5 z8;
   private int j5 = 2000;
   private boolean w1;
   private boolean r4;
   private boolean c4;
   private boolean y2;
   private com.aspose.slides.internal.v8.u9 y1;
   private com.aspose.slides.internal.v8.u9 a0;

   public x8(com.aspose.slides.internal.v4.h0 var1) {
      super(var1);
      this.t2 = new x8$n5(this);
   }

   @Override
   public void t4() {
      super.t4();
      com.aspose.slides.internal.v4.h0 var1 = this.a0();
      com.aspose.slides.internal.v0.h0 var2 = var1.n_().c_();
      com.aspose.slides.internal.v0.s7[] var3 = var1.z7().n5(var2);
      com.aspose.slides.internal.v0.u3 var4 = var2.n5(var3[0], this.a0().z7().n5.l6(this), var1.z7().l6());
      this.m3 = var4.a6();
      this.j5 = -var4.u9();
      this.z8 = var1.y0().u3(this).c8();
      this.q0 = var1.e5().h0.l6(this);
      this.z3 = var1.e5().c8.l6(this);
      this.n3 = var1.e5().a6.z1().u3(this).c8().l6(this);
      this.y4 = var1.e5().u9.z1().u3(this).c8().l6(this);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      return this.n5(var1, var2, null, null, null);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, Stack<y2> var3, j8 var4, y2 var5) {
      this.d2();
      return super.n5(var1, var2, var3, var4, var5);
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(y2 var1, t1 var2, t1 var3, int var4, Stack<y2> var5, j8 var6, y2 var7) {
      var3.n5(var2);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.x9.d2.class)) {
         if (this.a0().j8().u3() != 0) {
            var3.l6(this.a0().j8().u3());
         } else {
            var3.l6(this.c8());
         }
      }

      if (var1 == this.a6.get_Item(0)) {
         var3.n5(16);
      }

      if (var5 == null) {
         return var1.n5(var3, var4);
      }

      com.aspose.slides.internal.x9.d2 var8 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.x9.d2.class);
      return var8 != null ? var8.n5(var3, var4, (h2)var6) : var1.n5(var3, var4, var5, var6, var7);
   }

   private void d2() {
      this.w1 = false;
      this.r4 = false;
      this.c4 = false;
      this.y2 = false;
      this.y1 = null;
      this.a0 = null;
   }

   @Override
   public boolean l6(int var1) {
      k7 var2 = null;
      com.aspose.slides.internal.j9.c8 var3 = null;
      List var4 = null;

      while (this.t2.l6()) {
         y2 var5 = this.t2.k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.x9.j5.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.x9.t9.class)) {
            com.aspose.slides.internal.x9.d2 var9 = this.u3(var5);
            this.k5(var9);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.x9.t9.class)) {
            com.aspose.slides.internal.x9.t9 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.x9.t9.class);
            if (var2 == null) {
               var2 = new k7(this);
            }

            if (var3 == null) {
               var3 = var2.u3();
            }

            if (var3 != null && !com.aspose.slides.internal.x9.z1.l6().k5()) {
               if (var4 == null) {
                  var4 = new List();
               }

               int var11 = com.aspose.slides.internal.x9.z1.l6().n5(var3, var6.y4());
               if (var11 == -1) {
                  com.aspose.slides.internal.x9.z1.l6().n5(var3, var6);
               } else if (com.aspose.slides.internal.x9.z1.l6().n5(var3, var11)) {
                  var6.n5(this);
                  y2 var8 = var6.q0();
                  this.k5(var8);
               }
            } else {
               List var7 = var2.c8();
               if (var7 != null) {
                  var7.addItem(var6);
               } else {
                  var7 = var2.n5(true);
                  var6.n5(this);
                  if (var7 != null) {
                     var7.addItem(var6);
                  }
               }
            }
         } else {
            this.k5(var5);
         }

         if (var1 < this.a6.size()) {
            return true;
         }
      }

      return false;
   }

   private com.aspose.slides.internal.x9.d2 u3(y2 var1) {
      com.aspose.slides.internal.x9.d2 var2 = new com.aspose.slides.internal.x9.d2(this.a0(), this.z8, this.m3, this.j5);
      List var3 = new List();
      var3.addItem(var1);

      while (this.t2.l6()) {
         y2 var4 = this.t2.k5();
         if (!com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.x9.j5.class)) {
            this.t2.a6();
            break;
         }

         var3.addItem(var4);
      }

      var2.a_(var3);
      return var2;
   }

   @Override
   public com.aspose.slides.internal.h2.f2 s3() {
      return this.a0().f0();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 p8() {
      return this.a0().v0();
   }

   @Override
   public com.aspose.slides.internal.h2.f2 f2() {
      return this.a0().h2();
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      if (var2.a0() > 0) {
         this.n5(0.0, com.aspose.slides.internal.v8.u9.n5(var2.a0()));
      }

      y2 var3 = null;
      t1 var4 = new t1(0);
      var4.n5(var2.m3());
      if (var2.d2() > 0) {
         var4.c8(var2.d2());
      }

      List var5 = new List();
      j8 var6 = null;
      j8 var7 = null;

      while (var1.l6()) {
         j8 var8 = (j8)var1.k5();
         if (var8.a6() >= 0) {
            if (var6 == null) {
               var6 = var8;
            }

            var7 = var8;
         }

         j8 var9 = var8;
         if (com.aspose.slides.internal.v6g.k5.l6(var8, f0.class)) {
            var9 = var8.k5();
         }

         if (var9 != null && (var9.u3() != this || com.aspose.slides.internal.v6g.k5.l6(var9, y4$l6.class))) {
            var5.addItem(var9);
            var3 = var9.u3();
         }
      }

      this.c4();
      this.n5(true, this.l6(var6), this.k5(var7));
      w2 var10 = new w2(new com.aspose.slides.internal.r4.u3(var5));

      y2 var11;
      while ((var11 = var10.u9()) != null) {
         var4.n5(128, var2.k5() && var11 == var3);
         var4.n5(var2.q0());
         var11.n5(var10, var4);
      }

      this.n5(false, this.l6(var6), this.k5(var7));
      p6.n5(this.k7, var2.m3(), this.y1, this.a0);
      this.d5();
      this.k7 = null;
      this.d2();
      this.u3(var7);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.k7 == null) {
         this.k7 = new com.aspose.slides.internal.a0.t2();
         this.k7.l6(super.c8());
         this.k7.u3(this.a0().d2());
         p6.n5(this.k7, this.a0().t1(), this.a0().u6());
         this.u3.n5(this.k7);
         p6.n5(this.k7, this.a0().v3());
         p6.n5(this.k7, this.a0().y1());
         p6.n5(this.k7, this.a0().o0(), this);
         p6.k5(this.k7, this.a0().p6());
         p6.n5(this.k7, this.a0().b3(), this.w1, this.r4, false, false, this);
         p6.l6(this.k7, this.a0().b3(), this.c4, this.y2, false, false, this);
         p6.n5(this.k7, this.a0().b3(), this.q0, this.z3, this);
         this.n5(this.k7);
      }

      return this.k7;
   }

   public final int y1() {
      if (this.k7 == null) {
         return 0;
      }

      List var1 = this.k7.c4();
      return var1 == null ? 0 : this.k7.c4().size();
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.k7 != null) {
         com.aspose.slides.internal.a0.k7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.a0.k7.class);
         if (var2 != null) {
            this.k7.n5(var2);
         } else {
            this.k7.l6((com.aspose.slides.internal.a0.t2)var1);
         }
      }
   }

   @Override
   protected void d5() {
      if (this.k7 != null) {
         p6.n5(this.k7, this.a0().b3(), this);
         super.d5();
      }
   }

   public final com.aspose.slides.internal.v4.h0 a0() {
      return (com.aspose.slides.internal.v4.h0)this.k5;
   }

   @Override
   public int c8() {
      return this.k7 != null ? this.k7.l6() : super.c8();
   }

   @Override
   public int t2() {
      return this.k7 != null ? this.k7.e_() : -1;
   }

   @Override
   public boolean x8() {
      return true;
   }

   @Override
   public final void n5(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (v3.n5 == var1) {
         this.y1 = var2;
      } else {
         this.a0 = var2;
      }
   }

   @Override
   public final void l6(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.w1 = true;
         } else {
            this.r4 = true;
         }
      }
   }

   @Override
   public final void k5(v3 var1, com.aspose.slides.internal.v8.u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.c4 = true;
         } else {
            this.y2 = true;
         }
      }
   }

   @Override
   public boolean z1() {
      return true;
   }
}
