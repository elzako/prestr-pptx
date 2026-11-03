package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;

public class z8 extends y4 {
   private com.aspose.slides.internal.a0.s7[] t2 = new com.aspose.slides.internal.a0.s7[6];
   private List<com.aspose.slides.internal.x9.t9> k7 = new List<>();

   public z8(e9 var1, com.aspose.slides.internal.t1.a6 var2) {
      super(var2);
      this.n5(var1);
      com.aspose.slides.internal.x9.z1.l6().n5(this);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      return this.n5(var1, var2, null, null);
   }

   public final List<com.aspose.slides.internal.x9.t9> y1() {
      return this.k7;
   }

   public final List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, j8 var3, y2 var4) {
      List var5 = new List();
      boolean var6 = var3 != null;
      boolean var7 = var6;
      Stack var8 = new Stack();
      y2 var9;
      if (var6) {
         var9 = var3.u3();
         if (var9 == null) {
            throw new InvalidOperationException("Cannot find layout manager to restart from");
         }

         if (var4 != null && var4.h0() == this) {
            var9 = var4;
         } else {
            while (var9.h0() != this) {
               var8.push(var9);
               var9 = var9.h0();
            }

            var7 = false;
         }

         this.l6(var9);
      } else {
         var9 = this.q0();
      }

      for (; var9 != null; var9 = this.q0()) {
         if (var6 && !var7) {
            if (this.n5(var5, var9, var1, var2, var8, var3, var4) != null) {
               return var5;
            }

            var7 = true;
         } else {
            if (var7) {
               var9.t9();
            }

            if (this.n5(var5, var9, var1, var2, null, null, null) != null) {
               return var5;
            }
         }
      }

      j4.n5(var5);
      this.k5(true);
      return var5;
   }

   private List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, y2 var2, t1 var3, int var4, Stack<y2> var5, j8 var6, y2 var7) {
      if (n5(var2, var3)) {
         j4.n5(var1);
         return var1;
      }

      t1 var8 = this.n5(var3);
      List var9 = this.n5(var2, var3, var8, var4, var5, var6, var7);
      if (var1.size() == 0) {
         var3.l6(var8.u9());
      }

      if (var1.size() != 0 && !com.aspose.slides.internal.p3.q0.k5(var9)) {
         this.n5(var1, var3, var8);
      }

      var3.n5(var8.a6());
      var1.addRange(var9);
      if (com.aspose.slides.internal.p3.q0.l6(var1)) {
         if (var2.m3() && !this.z3()) {
            this.k5(true);
         }

         j4.n5(var1);
         return var1;
      } else {
         return null;
      }
   }

   private static boolean n5(y2 var0, t1 var1) {
      int var2 = 95;
      int var3 = 48;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, x8.class)) {
         var2 = ((x8)var0).a0().j9();
         var3 = ((x8)var0).a0().n1();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, t2.class)) {
         var2 = ((t2)var0).i1().x9();
         var3 = ((t2)var0).i1().y0();
      }

      int var4 = var1.y2();
      if (var4 != var2) {
         if (var2 == 5) {
            var1.x8(var3);
         }

         var1.u9(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected t1 n5(t1 var1) {
      t1 var2 = new t1(0);
      var2.n5(var1.q0());
      var2.l6(var1.z3());
      var2.n5(this.j5().n5().u6());
      return var2;
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(y2 var1, t1 var2, t1 var3, int var4, Stack<y2> var5, j8 var6, y2 var7) {
      List var8;
      if (var5 == null) {
         var8 = var1.n5(var3, var4);
      } else {
         var8 = var1.n5(var3, var4, var5, var6, var7);
      }

      List var9 = var8;
      var8 = new List();
      this.n5(var9, var8);
      return var8;
   }

   @Override
   public int n5(int var1, i1 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2.k7(), f0.class)) {
         f0 var3 = (f0)var2.k7();
         var2.n5(var3.k5());
         int var4 = ((r4)var2.m3()).n5(var1, var2);
         var2.n5(var3);
         return var4;
      } else {
         return 0;
      }
   }

   @Override
   public void n5(e5 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1.k7(), f0.class)) {
         f0 var2 = (f0)var1.k7();
         var1.n5(var2.k5());
         ((r4)var1.m3()).n5(var1);
         var1.n5(var2);
      }
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
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1);
      List var4 = new List();
      List var5 = new List();
      i1 var6 = null;
      i1 var7 = null;
      int var8 = 0;

      while (var3.l6()) {
         i1 var9 = (i1)var3.k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var9.k7(), f0.class)) {
            var9.n5(var9.k7().k5());
         } else {
            var3.n5();
         }
      }

      for (com.aspose.slides.internal.r4.u3 var13 = new com.aspose.slides.internal.r4.u3(var1); var13.l6(); var6 = var7) {
         var7 = (i1)var13.k5();
         if (var6 != null && var6.m3() != var7.m3()) {
            r4 var10 = (r4)var6.m3();
            r4 var11 = (r4)var7.m3();
            var4.addRange(var10.n5(var1.getRange(var8, var13.h0()), var2));
            var8 = var13.h0();
            if (var10.t1() || var11.u6()) {
               var4.addItem(new o0(0, 1000, false, new j8(this), false));
            } else if (!com.aspose.slides.internal.v3.t2.<i1>n5(var4).x_()) {
               var4.addItem(new o0(0, 0, false, new j8(this), false));
            }
         }
      }

      if (var7 != null) {
         r4 var14 = (r4)var7.m3();
         var4.addRange(var14.n5(var1.getRange(var8, var1.size()), var2));
      }

      com.aspose.slides.internal.r4.u3 var15 = new com.aspose.slides.internal.r4.u3(var4);

      while (var15.l6()) {
         i1 var12 = (i1)var15.k5();
         if (var12.m3() != this) {
            var12.n5(new f0(this, var12.k7()));
         }

         var5.addItem(var12);
      }

      return var5;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      com.aspose.slides.internal.p3.h0.n5(this, var1, var2);
      this.d5();
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      this.n5(var1);
      this.n5(var1, this.t2[var1.n5()]);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      com.aspose.slides.internal.a0.s7 var2 = null;
      int var3 = var1.n5();
      if (var3 == 0) {
         var2 = this.w1().n3();
      } else if (var3 == 3) {
         var2 = this.w1().s7().w1();
      } else if (var3 == 4) {
         var2 = this.w1().s7().r4();
      } else {
         if (var3 != 5) {
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5("(internal error) Invalid ", "area class (", com.aspose.slides.ms.System.a3.l6(var3), ") requested.")
            );
         }

         var2 = this.w1().s7().m1();
      }

      this.t2[var3] = var2;
      this.n5(var2);
      return var2;
   }

   @Override
   public int c8() {
      return this.w1().x8().k7();
   }

   @Override
   public int t2() {
      return this.w1().s7().e_();
   }

   @Override
   public boolean z1() {
      return true;
   }
}
