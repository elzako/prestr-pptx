package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.h2;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.z7;
import com.aspose.slides.ms.System.d1;

public class y2 extends y1 {
   private com.aspose.slides.internal.v4.z3 t2;
   private com.aspose.slides.internal.v0.u3 s7 = null;
   private List<com.aspose.slides.internal.r4.u9> x8 = null;
   private y4 t4 = null;
   private int q0 = 0;

   public y2(com.aspose.slides.internal.v4.z3 var1) {
      super(var1);
      this.t2 = var1;
   }

   @Override
   public void t4() {
      com.aspose.slides.internal.v0.h0 var1 = this.t2.n_().c_();
      com.aspose.slides.internal.v0.s7[] var2 = this.t2.z6().n5(var1);
      this.s7 = var1.n5(var2[0], this.t2.z6().n5.l6(this), var2[0].a6());
      this.n5(this.t2.j9());
   }

   @Override
   public com.aspose.slides.internal.d2.c8 l6(t1 var1) {
      return this.k5(var1);
   }

   @Override
   protected com.aspose.slides.internal.v8.u9 u9(int var1) {
      return this.k5(var1);
   }

   private com.aspose.slides.internal.v8.u9 k5(int var1) {
      int var2 = 0;
      if (this.y4 != null) {
         var2 = this.y4.a6(false, this);
      }

      this.u3(var1 - var2);
      int var3 = this.t2.o0().u3(this).c8().l6(this) - var2;
      int var4 = this.t2.o0().l6(this).c8().l6(this) - var2;
      int var5 = this.t2.o0().k5(this).c8().l6(this) - var2;
      return com.aspose.slides.internal.v8.u9.n5(var4, var3, var5);
   }

   private com.aspose.slides.internal.d2.c8 k5(t1 var1) {
      com.aspose.slides.internal.d2.c8 var2 = null;
      int var3 = this.t2.d2();
      if (this.t2.z7() == 123) {
         if (this.t2.e5() != 95) {
            com.aspose.slides.internal.d2.n3 var4 = new com.aspose.slides.internal.d2.n3();
            var4.t2(this.t2.e5());
            var4.s7(this.t2.b3().l6(this));
            var2 = var4;
         } else {
            var2 = new com.aspose.slides.internal.d2.y4();
            if (var3 >= 0) {
               var2.u3(var3);
            }
         }

         var2.k5(this.t2.b3().l6(this));
         var2.n5(7, this.t2.e9().o8());
         if (var3 >= 0) {
            var2.u3(var3);
         }
      } else if (this.t2.z7() == 134) {
         var2 = new com.aspose.slides.internal.d2.y4();
         var2.k5(this.t2.b3().l6(this));
         if (var3 >= 0) {
            var2.u3(var3);
         }
      } else if (this.t2.z7() == 35) {
         com.aspose.slides.internal.d2.t9 var11 = new com.aspose.slides.internal.d2.t9();
         char var5 = '.';
         int var6 = this.s7.l6(var5);
         int[] var7 = var3 < 0 ? null : new int[]{var3};
         var11.n5(d1.n5(new Object[]{d1.n5, var5}), var6, null, var7, (int[][])null, 0);
         var11.l6(var6);
         var11.k5(var6);
         var11.n3(var6);
         p6.n5(var11, this.s7);
         var11.n5(7, this.t2.e9().o8());
         com.aspose.slides.internal.d2.y4 var8 = null;
         int var9 = this.t2.v4().l6(this);
         if (var9 > var6) {
            var8 = new com.aspose.slides.internal.d2.y4();
            var8.l6(var9 - var6);
            if (var3 >= 0) {
               var8.u3(var3);
            }

            var6 = var9;
         }

         com.aspose.slides.internal.d2.a6 var10 = new com.aspose.slides.internal.d2.a6();
         var10.t2(var6);
         var10.n5(var11);
         if (var8 != null) {
            var10.n5(var8);
         }

         var10.k5(var11.e_());
         var2 = var10;
      } else if (this.t2.z7() == 158) {
         if (this.t2.x8() == null) {
            m3 var13 = z8.n5(this.y4().q_().m1());
            var13.n5(this, this.y4().m_());
            return null;
         }

         this.u9 = null;
         com.aspose.slides.internal.d2.a6 var12 = new com.aspose.slides.internal.d2.a6();
         this.t4 = new y4(var12, this);
         this.k5(this.t4);
         k7 var14 = new k7(this.t2);
         this.t4.k5(var14);
         var14.t4();
         t1 var15 = new t1(0);
         var15.n5(var1.j5());
         this.x8 = this.t4.n5(var15, 0);
         int var16 = this.t4.q0();
         if (var16 != 0) {
            com.aspose.slides.internal.d2.y4 var17 = null;
            if (this.t2.v4().l6(this) > var16) {
               var17 = new com.aspose.slides.internal.d2.y4();
               var17.l6(this.t2.v4().l6(this) - var16);
               if (var3 >= 0) {
                  var17.u3(var3);
               }

               var16 = this.t2.v4().l6(this);
            }

            var12.t2(var16);
            if (var17 != null) {
               var12.n5(var17);
            }

            var2 = var12;
         } else {
            var2 = new com.aspose.slides.internal.d2.y4();
            var2.k5(this.t2.b3().l6(this));
            var2.u3(this.t2.d5());
         }
      }

      p6.n5(var2, this.t2.y1());
      return var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      if (this.t2.z7() != 158) {
         super.n5(var1, var2);
      } else {
         this.c4();
         this.l6(this.n3, var2);
         if (this.y4 != null) {
            p6.n5(this.n3, this.y4, false, false, this);
            p6.n5(this.n3, this.y4, this);
         }

         z7 var3 = new z7<>(this.x8, 0, this.x8.size());
         this.t4.n5(var3, var2);
         this.u3.l6(this.n3);

         while (var1.l6()) {
            var1.k5();
         }
      }
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.n3 = this.l6(var1);
      com.aspose.slides.internal.p3.d5 var3 = new com.aspose.slides.internal.p3.d5();
      if (this.n3 == null) {
         this.k5(true);
         return null;
      }

      this.e2 = new k5(this.n3.e_(), this.t2.u6(), this.t2.t1(), this.t2.a5(), this.t2.h2(), var1.j5());
      com.aspose.slides.internal.v8.u9 var4 = this.u9(var1.z3());
      if (this.t2.z7() == 158 && com.aspose.slides.internal.v6g.k5.l6(this.n3, com.aspose.slides.internal.d2.a6.class)) {
         int var5 = ((com.aspose.slides.internal.d2.a6)this.n3).m1();
         if (var4.l6() < var5 && var5 <= var4.k5()) {
            var4 = com.aspose.slides.internal.v8.u9.n5(var4.n5(), var5, var4.k5());
         }
      }

      this.z1 = new y1$n5((short)0, var4, false, var1.j5());
      this.n3.n5(var4.a6(), var4.u3(), 0);
      this.u3(var3);
      com.aspose.slides.internal.v8.u9 var9 = com.aspose.slides.internal.v8.u9.n5;
      int var6 = this.z1.l6.l6();
      com.aspose.slides.internal.e5.t9 var7 = this.h0().y4();
      if (var2 == 70 || var2 == 0) {
         var6 = 0;
         var9 = this.z1.l6;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.v4.t9.class)
         && com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.v4.t9.class).v4().a6() == 207
         && com.aspose.slides.internal.v6g.k5.l6(this.t2.o0().u3(this), com.aspose.slides.internal.h2.t1.class)
         && var1.z3() == 0) {
         var6 = 0;
         var9 = com.aspose.slides.internal.v8.u9.n5(116250);
      }

      var3.addItem(new c4(var6, this.e2, new h2(this, -1), true));
      var3.addItem(new o0(0, 1000, false, new h2(this, -1), true));
      if (var2 != 70 && var2 != 0) {
         var3.addItem(new com.aspose.slides.internal.p3.e5(var9.l6(), 0, 0, new h2(this, 0), false));
      } else {
         var3.addItem(new com.aspose.slides.internal.p3.e5(var9, new h2(this, 0), false));
      }

      var3.addItem(new c4(0, this.e2, new h2(this, -1), true));
      this.k5(var3);
      this.k5(true);
      List var8 = new List();
      var8.addItem(var3);
      return var8;
   }

   @Override
   public void n5(j8 var1, q0 var2) {
      super.n5(var1, var2);
   }

   @Override
   public boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      this.k5(false);
      return false;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      if (this.m3()) {
         return null;
      }

      List var3 = new List();
      this.u3(var3);
      var3.addItem(new c4(0, this.z1.u3, new h2(this, -1), true));
      var3.addItem(new o0(0, 1000, false, new h2(this, -1), true));
      if (var2 != 70 && var2 != 0) {
         var3.addItem(new com.aspose.slides.internal.p3.e5(this.z1.l6.l6(), 0, 0, new h2(this, 0), false));
      } else {
         var3.addItem(new com.aspose.slides.internal.p3.e5(this.z1.l6, new h2(this, 0), false));
      }

      var3.addItem(new c4(0, this.z1.u3, new h2(this, -1), true));
      this.k5(var3);
      this.k5(true);
      return var3;
   }

   @Override
   public int n5(int var1, com.aspose.slides.internal.e5.t9 var2) {
      return this.h0().n5(var1, this.h0().y4());
   }

   @Override
   public int c8() {
      return this.q0;
   }

   private void u3(int var1) {
      this.q0 = var1;
   }

   @Override
   public void t9() {
      this.a6.clear();
      super.t9();
   }
}
