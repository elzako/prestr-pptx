package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.h2;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;

public class n3 extends y1 {
   private com.aspose.slides.internal.v8.u9 t2;
   private int s7;
   private com.aspose.slides.internal.v0.u3 x8;
   private com.aspose.slides.internal.h2.t2 t4 = null;

   public n3(com.aspose.slides.internal.v4.t2 var1) {
      super(var1);
   }

   @Override
   public void t4() {
      com.aspose.slides.internal.v4.t2 var1 = (com.aspose.slides.internal.v4.t2)this.k5;
      this.x8 = com.aspose.slides.internal.v0.t2.n5(var1, this);
      com.aspose.slides.internal.v8.c8 var2 = com.aspose.slides.internal.v8.c8.n5(var1.h2());
      this.t2 = var2.u3();
      this.s7 = var1.b3().l6(this.x8);
      this.t4 = var1.i1();
      this.n5(this.t4);
      com.aspose.slides.internal.d2.t9 var3 = this.n5(var1);
      var3.n3(this.x8.a6());
      this.n5(var3);
   }

   private com.aspose.slides.internal.d2.t9 n5(com.aspose.slides.internal.v4.t2 var1) {
      com.aspose.slides.internal.d2.t9 var2 = new com.aspose.slides.internal.d2.t9();
      char var3 = var1.o0();
      int var4 = this.x8.l6(var3);
      byte var5 = 0;
      int var6 = var1.d2();
      if (com.aspose.slides.internal.v3.l6.h0(var3)) {
         if (!com.aspose.slides.internal.v3.l6.k5(var3)) {
            var2.n5(var3, var4, com.aspose.slides.internal.v3.l6.u9(var3), var5, var6);
         }
      } else {
         int[] var7 = var6 >= 0 ? new int[]{var6} : null;
         var2.n5(com.aspose.slides.ms.System.t9.q0(var3), var4, null, var7, (int[][])null, var5);
      }

      p6.n5(var2, var1.y1());
      p6.n5(var2, var1.v0());
      p6.n5(var2, var1.f0());
      return var2;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.n3 = this.l6(var1);
      com.aspose.slides.internal.p3.d5 var3 = new com.aspose.slides.internal.p3.d5();
      if (this.n3 == null) {
         this.k5(true);
         return null;
      }

      com.aspose.slides.internal.v4.t2 var4 = (com.aspose.slides.internal.v4.t2)this.k5;
      com.aspose.slides.internal.v8.u9 var5 = com.aspose.slides.internal.v8.u9.n5(this.n3.l6());
      this.n3.k5(this.x8.a6() - this.x8.u9());
      p6.n5(this.n3, this.x8);
      this.n3.n5(7, var4.z7().o8());
      this.e2 = new k5(this.x8, this.x8.t2(), var4.v4(), var4.u6(), var4.t1(), var4.a5(), var1.j5());
      this.u3(var3);
      this.z1 = new y1$n5((short)0, var5, false, this.e2);
      if (this.t2.h0()) {
         var3.addItem(new c4(this.z1.l6.l6(), this.z1.u3, this.n5(new h2(this, 0)), false));
      } else {
         var3.addItem(new c4(this.z1.l6.l6(), this.z1.u3, this.n5(new h2(this, 0)), false));
         var3.addItem(new o0(0, 1000, false, new h2(this, -1), true));
         var3.addItem(new com.aspose.slides.internal.p3.e5(0, 0, 0, new h2(this, -1), true));
         var3.addItem(new c4(0, null, this.n5(new h2(this, -1)), true));
      }

      this.k5(var3);
      List var6 = new List();
      var6.addItem(var3);
      this.k5(true);
      return var6;
   }

   @Override
   public String a6(j8 var1) {
      return ((com.aspose.slides.internal.d2.t9)this.n3).a0();
   }

   @Override
   public void n5(j8 var1, q0 var2) {
      if (var2.n5() == 1) {
         this.z1.k5 = true;
         this.t9 = true;
      }

      var2.n5(1);
   }

   @Override
   public boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      this.k5(false);
      return this.t9;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      if (this.m3()) {
         return null;
      }

      List var3 = new List();
      this.u3(var3);
      if (!this.t2.h0() && this.z1.n5 != 0) {
         var3.addItem(new c4(this.z1.l6.l6() - this.z1.n5 * this.t2.l6(), this.z1.u3, this.n5(new h2(this, 0)), false));
         var3.addItem(new o0(0, 1000, false, new h2(this, -1), true));
         var3.addItem(new com.aspose.slides.internal.p3.e5(this.t2.a6(this.z1.n5), new h2(this, -1), true));
         var3.addItem(new c4(0, null, this.n5(new h2(this, -1)), true));
         if (this.z1.k5) {
            var3.addItem(new o0(this.s7, 50, true, new h2(this, -1), false));
         }
      } else {
         var3.addItem(new c4(this.z1.l6.l6(), this.z1.u3, this.n5(new h2(this, 0)), false));
         if (this.z1.k5) {
            var3.addItem(new o0(this.s7, 50, true, new h2(this, -1), false));
         }
      }

      this.k5(var3);
      this.k5(true);
      return var3;
   }
}
