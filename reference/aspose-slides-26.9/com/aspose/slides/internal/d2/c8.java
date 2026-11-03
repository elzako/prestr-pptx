package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a0.k7;

public class c8 extends com.aspose.slides.internal.a0.l6 {
   protected int c8 = 0;
   public int t2 = 0;
   private int x8 = 0;
   protected c8$n5 s7 = null;

   public c8() {
      this.c8 = 0;
      this.u3(-1);
   }

   protected c8(int var1, int var2) {
      this.c8 = var1;
      this.u3(var2);
   }

   public final void n5(int var1, int var2, int var3) {
      this.s7 = new c8$n5(var1, var2, var3);
   }

   public final void y4(int var1) {
      if (this.s7 != null) {
         this.s7.u3 = var1;
      }
   }

   public final void e2(int var1) {
      this.n5 += var1;
   }

   public final void t9(int var1) {
      this.c8 = var1;
   }

   public final int w1() {
      return this.c8;
   }

   @Override
   public void n5(com.aspose.slides.internal.a0.l6 var1) {
      super.n5(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, c8.class)) {
         ((c8)var1).l6(this);
      }
   }

   public final boolean r4() {
      return this.h0(10);
   }

   public final boolean c4() {
      return this.h0(11);
   }

   public final boolean y2() {
      return this.h0(12);
   }

   public boolean n5(double var1, int var3, int var4) {
      if (this.s7 != null) {
         this.l6(this.l6() + this.s7.n5(var1));
      }

      return false;
   }

   public final void z1(int var1) {
      this.e2(var1);
      this.t4(var1);
   }

   protected final void t4(int var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t4(), c8.class)) {
         ((c8)this.t4()).z1(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.t4(), k7.class)) {
         ((k7)this.t4()).s7(var1);
      } else if (this.t4() == null) {
         this.x8 += var1;
      }
   }

   public int z8() {
      return this.w1();
   }

   public int j5() {
      return this.e_();
   }

   public List<com.aspose.slides.internal.d5.a6> l6(List<com.aspose.slides.internal.d5.a6> var1) {
      var1.addItem(new com.aspose.slides.internal.d5.a6(this, new int[]{this.h0()}));
      return var1;
   }

   public final boolean n5(c8 var1) {
      return var1 == this || this.l6(var1);
   }

   public final boolean l6(c8 var1) {
      com.aspose.slides.internal.a0.l6 var2 = this.t4();

      while (var2 != null) {
         if (var2 == var1) {
            return true;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, c8.class)) {
            var2 = ((c8)var2).t4();
         } else {
            var2 = null;
         }
      }

      return false;
   }
}
