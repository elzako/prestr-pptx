package com.aspose.slides.internal.y0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a0.t2;
import com.aspose.slides.internal.h2.f2;
import com.aspose.slides.internal.p3.c4;
import com.aspose.slides.internal.p3.f0;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.q0;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v3;
import com.aspose.slides.internal.p3.w2;
import com.aspose.slides.internal.p3.y2;
import com.aspose.slides.internal.p3.y4;
import com.aspose.slides.internal.r4.u3;
import com.aspose.slides.internal.v4.m1;
import com.aspose.slides.internal.v8.u9;

public class n5 extends y4 implements c4 {
   private t2 t2;
   private boolean k7;
   private boolean m3;
   private boolean z8;
   private boolean j5;
   private u9 w1;
   private u9 r4;

   public n5(m1 var1) {
      super(var1);
   }

   protected final m1 y1() {
      return (m1)this.k5;
   }

   @Override
   public void t4() {
      this.q0 = this.y1().e5().h0.l6(this);
      this.z3 = this.y1().e5().c8.l6(this);
   }

   private void a0() {
      this.k7 = false;
      this.m3 = false;
      this.z8 = false;
      this.j5 = false;
      this.w1 = null;
      this.r4 = null;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.a0();
      List var3 = super.n5(var1, var2);
      int var4 = this.y1().a5().u3();
      if (var4 != 0) {
         com.aspose.slides.internal.p3.q0.n5(var3, var4);
      }

      int var5 = this.y1().h2().u3();
      if (var5 != 0) {
         com.aspose.slides.internal.p3.q0.l6(var3, var5);
      }

      return var3;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      if (var2.a0() > 0) {
         this.n5(0.0, com.aspose.slides.internal.v8.u9.n5(var2.a0()));
      }

      this.c4();
      t1 var3 = new t1(0);
      y2 var4 = null;
      y2 var5 = null;
      j8 var6 = null;
      j8 var7 = null;
      List var8 = new List();

      while (var1.l6()) {
         j8 var9 = (j8)var1.k5();
         if (var9.a6() >= 0) {
            if (var6 == null) {
               var6 = var9;
            }

            var7 = var9;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var9, f0.class) && var9.k5() != null && var9.k5().u3() != this) {
            var8.addItem(var9.k5());
            var5 = var9.k5().u3();
            if (var4 == null) {
               var4 = var5;
            }
         }
      }

      this.n5(true, this.l6(var6), this.k5(var7));
      w2 var10 = new w2(new u3(var8));

      y2 var11;
      while ((var11 = var10.u9()) != null) {
         var3.n5(var2.m3());
         var3.n5(32, var11 == var4);
         var3.n5(128, var11 == var5);
         var3.n5(var2.q0());
         var11.n5(var10, var3);
      }

      this.n5(false, this.l6(var6), this.k5(var7));
      p6.n5(this.t2, this.y1().b3(), this);
      p6.n5(this.t2, var2.m3(), this.w1, this.r4);
      this.d5();
      this.t2 = null;
      this.a0();
      this.u3(var7);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.t2 == null) {
         this.t2 = new t2();
         this.u3.n5(this.t2);
         p6.n5(this.t2, this.y1().y1());
         p6.n5(this.t2, this.y1().b3(), this.k7, this.m3, false, false, this);
         p6.l6(this.t2, this.y1().b3(), this.z8, this.j5, false, false, this);
         p6.n5(this.t2, this.y1().b3(), this.y1().e5(), this);
         p6.n5(this.t2, this.y1().t1(), this.y1().u6());
         int var2 = this.t4 - this.p3();
         this.t2.l6(var2);
         this.n5(this.t2);
      }

      return this.t2;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.t2 != null) {
         this.t2.l6((t2)var1);
      }
   }

   @Override
   public f2 s3() {
      return this.y1().v4();
   }

   @Override
   public f2 p8() {
      return this.y1().z7();
   }

   @Override
   public f2 f2() {
      return this.y1().o0();
   }

   @Override
   public final void n5(v3 var1, u9 var2) {
      if (v3.n5 == var1) {
         this.w1 = var2;
      } else {
         this.r4 = var2;
      }
   }

   @Override
   public final void l6(v3 var1, u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.k7 = true;
         } else {
            this.m3 = true;
         }
      }
   }

   @Override
   public final void k5(v3 var1, u9 var2) {
      if (var2 == null) {
         if (v3.n5 == var1) {
            this.z8 = true;
         } else {
            this.j5 = true;
         }
      }
   }
}
