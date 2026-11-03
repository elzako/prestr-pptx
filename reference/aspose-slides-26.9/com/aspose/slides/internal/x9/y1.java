package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.h2;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.ms.System.d1;

public abstract class y1 extends com.aspose.slides.internal.p3.u3 implements j5 {
   protected com.aspose.slides.internal.d2.c8 n3 = null;
   protected com.aspose.slides.internal.h2.t2 y4 = null;
   protected k5 e2 = null;
   protected boolean t9 = false;
   protected y1$n5 z1 = null;

   public y1(com.aspose.slides.internal.e5.t9 var1) {
      super(var1);
   }

   public y1() {
   }

   public com.aspose.slides.internal.d2.c8 l6(t1 var1) {
      return this.n3;
   }

   public final void n5(com.aspose.slides.internal.d2.c8 var1) {
      this.n3 = var1;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      return null;
   }

   protected final void n5(com.aspose.slides.internal.h2.t2 var1) {
      this.y4 = var1;
   }

   protected com.aspose.slides.internal.v8.u9 u9(int var1) {
      return com.aspose.slides.internal.v8.u9.n5(this.n3.l6());
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.c4();
      com.aspose.slides.internal.d2.c8 var3 = this.a0();
      if (var3.f_() > 0 || var3.a6() > 0) {
         this.n5(var3, var2);
         this.l6(var3, var2);
         if (this.y4 != null) {
            p6.n5(var3, this.y4, false, false, this);
            p6.n5(var3, this.y4, this);
         }

         this.u3.l6(var3);
      }

      while (var1.l6()) {
         var1.k5();
      }
   }

   protected com.aspose.slides.internal.d2.c8 a0() {
      return this.n3;
   }

   protected final void n5(com.aspose.slides.internal.d2.c8 var1, t1 var2) {
      var1.t9(this.e2.h0());
   }

   protected k5 n5(t1 var1) {
      return var1.j5();
   }

   protected final void l6(com.aspose.slides.internal.d2.c8 var1, t1 var2) {
      double var3 = var2.z8();
      int var5 = 0;
      if (var3 < 0.0) {
         var5 += com.aspose.slides.internal.v6g.k5.u3(var3 * this.z1.l6.u3(), 14);
      } else if (var3 > 0.0) {
         var5 += com.aspose.slides.internal.v6g.k5.u3(var3 * this.z1.l6.a6(), 14);
      }

      var1.l6(this.z1.l6.l6() + var5);
      var1.y4(var5);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.n3 = this.l6(var1);
      if (this.n3 == null) {
         this.k5(true);
         return null;
      } else {
         this.e2 = this.n5(var1);
         com.aspose.slides.internal.v8.u9 var3 = this.u9(var1.z3());
         this.z1 = new y1$n5((short)0, var3, false, this.e2);
         com.aspose.slides.internal.p3.d5 var4 = new com.aspose.slides.internal.p3.d5();
         this.u3(var4);
         var4.addItem(new c4(this.z1.l6.l6(), this.e2, this.n5(new h2(this, 0)), false));
         this.k5(var4);
         this.k5(true);
         List var5 = new List();
         var5.addItem(var4);
         return var5;
      }
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1) {
      return var1;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> l6(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return this.n5(var1);
   }

   @Override
   public String a6(j8 var1) {
      return d1.n5;
   }

   @Override
   public void n5(j8 var1, q0 var2) {
   }

   @Override
   public boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      this.k5(false);
      return false;
   }

   @Override
   public boolean k5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return this.l6(var1);
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      return this.n5(var1, var2);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      if (this.m3()) {
         return null;
      }

      List var3 = new List();
      this.u3(var3);
      var3.addItem(new c4(this.z1.l6.l6(), this.z1.u3, this.n5(new h2(this, 0)), true));
      this.k5(var3);
      this.k5(true);
      return var3;
   }

   protected void u3(List<com.aspose.slides.internal.r4.u9> var1) {
      if (this.y4 != null) {
         int var2 = this.y4.n5(false) + this.y4.n5(false, this);
         if (var2 > 0) {
            var1.addItem(new o0(0, 1000, false, new h2(this, -1), true));
            var1.addItem(new com.aspose.slides.internal.p3.e5(var2, 0, 0, new h2(this, -1), true));
         }
      }
   }

   protected void k5(List<com.aspose.slides.internal.r4.u9> var1) {
      if (this.y4 != null) {
         int var2 = this.y4.l6(false) + this.y4.l6(false, this);
         if (var2 > 0) {
            var1.addItem(new o0(0, 1000, false, new h2(this, -1), true));
            var1.addItem(new com.aspose.slides.internal.p3.e5(var2, 0, 0, new h2(this, -1), true));
         }
      }
   }
}
