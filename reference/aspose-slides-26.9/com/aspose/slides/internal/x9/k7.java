package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.internal.p3.i9;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v4;
import com.aspose.slides.internal.p3.w2;

public class k7 extends w1 {
   private com.aspose.slides.internal.h2.y4 z1 = null;
   private com.aspose.slides.internal.h2.t2 t4 = null;
   private boolean q0 = false;
   private com.aspose.slides.internal.p3.y2 z3 = null;
   private com.aspose.slides.internal.v0.u3 m1;
   protected com.aspose.slides.internal.f2.k5 t2;
   protected int s7 = 12;
   protected com.aspose.slides.internal.f2.k5 x8;
   protected int n3;
   protected f0 y4;
   private int k7 = 161;
   private k5 m3 = null;

   public k7(com.aspose.slides.internal.v4.t4 var1) {
      super(var1);
   }

   @Override
   public void t4() {
      com.aspose.slides.internal.v4.t4 var1 = (com.aspose.slides.internal.v4.t4)this.k5;
      int var2 = 0;
      com.aspose.slides.internal.v0.h0 var3 = var1.n_().c_();
      com.aspose.slides.internal.h2.s7 var4 = var1.z6();
      com.aspose.slides.internal.v0.s7[] var5 = var4.n5(var3);
      this.m1 = var3.n5(var5[0], var4.n5.l6(this), var4.l6());
      this.y4 = var1.o5();
      this.t4 = var1.j9();
      this.z1 = var1.y0();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v4.t9.class)) {
         this.t2 = ((com.aspose.slides.internal.v4.t9)var1).v0();
         this.s7 = ((com.aspose.slides.internal.v4.t9)var1).f0();
         this.x8 = ((com.aspose.slides.internal.v4.t9)var1).a3();
         this.n3 = ((com.aspose.slides.internal.v4.t9)var1).p3();
         this.k7 = ((com.aspose.slides.internal.v4.t9)var1).h2();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v4.z3.class)) {
         this.t2 = ((com.aspose.slides.internal.v4.z3)var1).u6();
         this.s7 = ((com.aspose.slides.internal.v4.z3)var1).t1();
         this.x8 = ((com.aspose.slides.internal.v4.z3)var1).a5();
         this.n3 = ((com.aspose.slides.internal.v4.z3)var1).h2();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v4.a6.class)) {
         this.t2 = ((com.aspose.slides.internal.v4.a6)var1).b3();
         this.s7 = ((com.aspose.slides.internal.v4.a6)var1).o0();
         this.x8 = ((com.aspose.slides.internal.v4.a6)var1).z7();
         this.n3 = ((com.aspose.slides.internal.v4.a6)var1).v4();
         this.k7 = ((com.aspose.slides.internal.v4.a6)var1).e5();
      }

      if (this.t4 != null) {
         var2 = this.t4.n5(0, false, this);
         var2 += this.t4.n5(0, false);
         var2 += this.t4.n5(1, false, this);
         var2 += this.t4.n5(1, false);
      }

      this.e2 = com.aspose.slides.internal.v8.u9.n5(var2);
   }

   public final int a0() {
      return this.k7;
   }

   @Override
   protected boolean a6(boolean var1) {
      return this.t4 != null && (this.t4.n5(2, var1, this) > 0 || this.t4.n5(2, var1) > 0) || this.z1 != null && this.z1.k5.l6(this) > 0;
   }

   @Override
   protected boolean u9(boolean var1) {
      return this.t4 != null && (this.t4.n5(3, var1, this) > 0 || this.t4.n5(3, var1) > 0) || this.z1 != null && this.z1.u3.l6(this) > 0;
   }

   @Override
   protected f0 d2() {
      return this.z1 != null ? this.z1.a6 : null;
   }

   @Override
   protected f0 d5() {
      return this.z1 != null ? this.z1.u9 : null;
   }

   protected com.aspose.slides.internal.d2.c8 u3(boolean var1) {
      com.aspose.slides.internal.d2.c8 var2;
      if (var1) {
         var2 = this.y1();
         var2.t9(0);
         com.aspose.slides.internal.v4.t9 var3 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.v4.t9.class);
         if (var3 != null) {
            a5 var4 = var3.v4();
            p6.n5(var2, var4);
            if (var4 != null && var4.a6() != 95) {
               p6.n5(var2, this.m1);
            }

            p6.n5(var2, var3.n5(this));
            p6.l6(var2, var3.l6(this));
            p6.l6(var2, var3.u6());
            p6.k5(var2, var3.t1());
         }
      } else {
         var2 = new com.aspose.slides.internal.d2.t2();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.t9.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.a6.class)) {
         p6.n5(var2, this.k5.y1());
         com.aspose.slides.internal.v4.t9 var5 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.v4.t9.class);
         if (var5 != null) {
            p6.k5(var2, var5.x9());
            com.aspose.slides.internal.f2.k5 var6 = var5.a5();
            if (var6.k5()) {
               var2.l6(com.aspose.slides.internal.v6g.k5.u3(var6.n5(), 14));
            }
         }
      }

      return var2;
   }

   public final com.aspose.slides.internal.f2.k5 s3() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.t9.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.v4.a6.class)) {
         com.aspose.slides.internal.v4.t9 var1 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.v4.t9.class);
         if (var1 != null) {
            return var1.a5();
         }
      }

      return null;
   }

   protected com.aspose.slides.internal.d2.s7 y1() {
      return new com.aspose.slides.internal.d2.s7();
   }

   @Override
   protected void n5(boolean var1, boolean var2) {
      if (this.t4 != null) {
         p6.n5(this.i1(), this.t4, var1, var2, this);
         p6.n5(this.i1(), this.t4, this);
      }

      if (this.z1 != null) {
         int var3 = 0;
         int var4 = 0;
         if (!var1) {
            var3 = this.z1.k5.l6(this);
         }

         if (!var2) {
            var4 = this.z1.u3.l6(this);
         }

         p6.n5(this.i1(), this.t4, var3, var4, this);
      }
   }

   public final boolean p8() {
      return this.u3(this.h0());
   }

   private boolean u3(com.aspose.slides.internal.p3.y2 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.p3.r4.class)) {
         return ((com.aspose.slides.internal.p3.r4)var1).v4();
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1, k7.class) ? ((k7)var1).p8() : this.u3(var1.h0());
      }
   }

   private d2 a6(com.aspose.slides.internal.p3.y2 var1) {
      if (var1 == null) {
         return null;
      }

      d2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, d2.class);
      return var2 != null ? var2 : this.a6(var1.h0());
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = new List();
      v4 var4 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.t1.r4.class)) {
         this.m3 = new k5(this.m1, this.y4.u3(this).c8().l6(this), var1.y1());
      } else {
         this.m3 = new k5(this.m1, this.y4.u3(this).c8().l6(this), this.t2, this.s7, this.x8, this.n3, var1.j5());
      }

      this.t9 = new t1(var1);
      this.t9.n5(this.m3);
      if (var1.n5() && this.d2() != null) {
         var1.n3().n5(new com.aspose.slides.internal.v8.c8(this.d2(), this));
      }

      boolean var5 = false;
      if (this.t4 != null) {
         this.t9.u3(var1.w1() + this.t4.n5(true, this) + this.t4.n5(true));
         this.t9.a6(var1.r4() + this.t4.l6(true, this) + this.t4.l6(true));
      }

      com.aspose.slides.internal.p3.y2 var6;
      while ((var6 = this.q0()) != null) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var6, j5.class) && this.t4 != null) {
            this.t9
               .l6(
                  this.t9.z3()
                     - this.t4.n5(this.z3 != null, this)
                     - this.t4.n5(this.z3 != null)
                     - this.t4.l6(this.z3(), this)
                     - this.t4.l6(this.z3())
                     - this.z1.k5.l6(this)
                     - this.z1.u3.l6(this)
               );
         }

         m1 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, m1.class);
         if (var7 != null) {
            d2 var8 = this.a6(this.h0());
            if (var8 != null && this.z3()) {
               e5 var9 = com.aspose.slides.internal.v6g.k5.n5(this.m1(), e5.class);
               this.k7();
               if (var9 != null) {
                  var7.k5(var8.y1());
                  var7.u3(true);
                  var7.u3(var8.a0());
               }
            }
         }

         List var10;
         if (com.aspose.slides.internal.v6g.k5.l6(var6, m1.class)) {
            int var16 = this.t9.z3();
            this.t9.l6(var1.z3());
            var10 = var6.n5(this.t9, var2);
            this.t9.l6(var16);
         } else {
            var10 = var6.n5(this.t9, var2);
         }

         com.aspose.slides.internal.v8.u9 var17 = var1.f2();
         if (var17 != null) {
            var17 = var17.u9(this.t9.f2().n5()).h0(this.t9.f2().k5());
         } else {
            var17 = this.t9.f2();
         }

         var1.l6(var17);
         if (var3.size() == 0 && this.t9.x8()) {
            this.t9.c8();
         }

         if (var10 != null && var10.size() != 0) {
            if (com.aspose.slides.internal.v6g.k5.l6(var6, j5.class)) {
               var1.h0();
               com.aspose.slides.internal.r4.u3 var19 = new com.aspose.slides.internal.r4.u3(var10);

               while (var19.l6()) {
                  v4 var11 = ((com.aspose.slides.internal.r4.u9)var19.k5()).l6();
                  var11.n5(this);
               }

               byte var21 = 0;
               if (var4 != null && var4.k5(((com.aspose.slides.internal.r4.u9)var10.get_Item(0)).l6())) {
                  var21 = 1;
               }

               if (!var5 && var10.size() != 0) {
                  this.k5((List<com.aspose.slides.internal.r4.u9>)var10.get_Item(0));
                  var5 = true;
               }

               com.aspose.slides.internal.r4.u3 var12 = new com.aspose.slides.internal.r4.u3(var10, var21);

               while (var12.l6()) {
                  var3.addItem(var12.k5());
               }
            } else {
               com.aspose.slides.internal.p3.s7 var20 = new com.aspose.slides.internal.p3.s7(var10);
               var20.n5(this);
               boolean var22 = false;
               if (var4 != null) {
                  if (!var4.n5(var20)) {
                     var4.h0();
                  } else {
                     com.aspose.slides.internal.p3.z1 var23 = new com.aspose.slides.internal.p3.z1(new j8(this), 0, var1);
                     boolean var13 = this.p8() || var1.s7() || this.t9.x8();
                     var22 = var4.l6(var20, var13, var23);
                  }
               }

               if (!var22) {
                  if (!var5) {
                     this.k5(var20);
                     var5 = true;
                  }

                  var3.addItem(var20);
               }

               var1.n5(this.t9.a6());
               this.t9.t2();
            }

            var4 = (v4)com.aspose.slides.internal.v3.t2.n5(var3);
            this.z3 = var6;
         }
      }

      if (var4 != null) {
         this.u3(var4);
      }

      this.k5(true);
      if (var3.size() == 0 && this.k5.r4()) {
         com.aspose.slides.internal.p3.d5 var14 = new com.aspose.slides.internal.p3.d5();
         var14.addItem(new c4(0, this.m3, this.n5(this.f2()), true));
         var3.addItem(var14);
      }

      if (var3.size() == 0 && (this.t4 != null || this.z1 != null)) {
         com.aspose.slides.internal.p3.d5 var15 = new com.aspose.slides.internal.p3.d5();
         this.k5(var15);
         this.u3(var15);
         if (var15.size() > 0) {
            var3.addItem(var15);
         }
      }

      return var3.size() == 0 ? null : var3;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.c4();
      this.n5(new t1(var2));
      List var3 = new List();
      com.aspose.slides.internal.p3.y2 var4 = null;
      j8 var5 = null;

      while (var1.l6()) {
         j8 var6 = (j8)var1.k5();
         if (var6 != null && var6.k5() != null) {
            if (this.l6(var6)) {
               this.q0 = false;
            }

            var3.addItem(var6.k5());
            var4 = var6.k5().u3();
            var5 = var6;
         }
      }

      if (this.a6(this.q0)) {
         this.e5().n5(new i9(false));
         this.e5().n5(256, true);
      } else {
         this.e5().n5(256, false);
      }

      if (this.d2() != null) {
         var2.n3().n5(new com.aspose.slides.internal.v8.c8(this.d2(), this));
      }

      this.n5(true, !this.q0, var5 == null || this.k5(var5));
      com.aspose.slides.internal.d2.c8 var7 = this.u3(var4 == null || com.aspose.slides.internal.v6g.k5.l6(var4, j5.class));
      var7.k5(this.m3.u3());
      if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.d2.s7.class)) {
         var7.t9(this.m3.h0());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.d2.t2.class) && this.t4 != null) {
         var7.t9(this.t4.k5(false, this) + this.t4.k5(false) + this.z1.k5.l6(this));
      }

      this.k5(var7);
      w2 var8 = new w2(new com.aspose.slides.internal.r4.u3(var3));
      com.aspose.slides.internal.p3.y2 var9 = null;

      com.aspose.slides.internal.p3.y2 var10;
      while ((var10 = var8.u9()) != null) {
         this.e5().n5(128, var2.k5() && var10 == var4);
         var10.n5(var8, this.e5());
         this.e5().n5(this.e5().e2());
         this.e5().n5(256, true);
         var9 = var10;
      }

      boolean var11 = this.e5().k5() && var9 == this.z3;
      if (this.u9(var11)) {
         this.n5(this.i1(), this.e5().e2().n5(false), this.e5().m3());
         var2.l6(new i9(false));
      } else {
         var2.l6(this.e5().e2());
      }

      if (var2.e2() != null && this.d5() != null) {
         var2.e2().n5(new com.aspose.slides.internal.v8.c8(this.d5(), this));
      }

      if (var5 == null) {
         this.n5(this.q0, false);
      } else {
         this.n5(this.q0, !this.k5(var5));
      }

      this.u3.l6(this.i1());
      this.n5(false, !this.q0, var5 == null || this.k5(var5));
      var2.n5(128, var11);
      this.q0 = true;
      this.u3(var5);
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      com.aspose.slides.internal.a0.l6 var2 = this.i1();
      if (this.e5().y4()) {
         this.n5(var2, this.e5().n3().n5(false), this.e5().m3());
      }

      var2.n5(var1);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      List var4 = new List();
      this.k5(var4);
      var4.addRange(super.n5(var1, var2, var3));
      this.u3(var4);
      return var4;
   }

   protected final void k5(List<com.aspose.slides.internal.r4.u9> var1) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.p3.s7.class)) {
         int var2 = 0;
         if (this.t4 != null) {
            var2 += this.t4.n5(false) + this.t4.n5(false, this);
         }

         if (this.z1 != null) {
            var2 += this.z1.k5.l6(this);
         }

         if (var2 > 0) {
            var1.insertItem(0, new c4(var2, this.m3, this.f2(), true));
         }
      }
   }

   protected final void u3(List<com.aspose.slides.internal.r4.u9> var1) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.p3.s7.class)) {
         int var2 = 0;
         if (this.t4 != null) {
            var2 += this.t4.l6(false) + this.t4.l6(false, this);
         }

         if (this.z1 != null) {
            var2 += this.z1.u3.l6(this);
         }

         if (var2 > 0) {
            var1.addItem(new c4(var2, this.m3, this.f2(), true));
         }
      }
   }

   protected final j8 f2() {
      return new com.aspose.slides.internal.p3.f0(this, null);
   }
}
