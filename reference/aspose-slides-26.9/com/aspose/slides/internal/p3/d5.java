package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class d5 extends v4 {
   private boolean n5 = false;

   @Override
   public boolean c8() {
      return true;
   }

   @Override
   public boolean n5(v4 var1) {
      return var1.c8() && !this.n5;
   }

   @Override
   public boolean l6(v4 var1) {
      if (!this.n5(var1)) {
         return false;
      }

      v0 var2 = this.s7();
      v0 var3 = var1.n5(0);
      if (var3.e2() && !((i1)var3).t9() && var2.e2() && ((i1)var2).z1() != 0) {
         this.a6();
      }

      this.addRange(var1);
      return true;
   }

   @Override
   public boolean n5(v4 var1, boolean var2, z1 var3) {
      return this.l6(var1);
   }

   @Override
   public v4 h0() {
      if (!this.n5) {
         this.addItem(new o0(0, -1000, false, null, false));
         this.n5 = true;
      }

      return this;
   }

   public final void a6() {
      f2 var1 = (f2)this.s7();
      if (!var1.t9() || this.size() >= 4 && this.n5(this.size() - 2).x_() && this.n5(this.size() - 3).y_() && this.n5(this.size() - 4).e2()) {
         this.x8();
         List var2 = new List();
         if (!var1.t9()) {
            var2.addItem(var1);
         } else {
            var2.addItem(var1);
            var2.insertItem(0, (e5)this.x8());
            var2.insertItem(0, (o0)this.x8());
            var2.insertItem(0, (f2)this.x8());
         }

         this.addRange(((com.aspose.slides.internal.x9.j5)var1.m3()).n5(var2));
         com.aspose.slides.internal.x9.c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.x9.c4.class);
         if (var3 != null && var3.x8()) {
            com.aspose.slides.internal.x9.c4 var4 = (com.aspose.slides.internal.x9.c4)this.s7();
            var4.n5(var3.s7());
            var4.n5(var3.h0());
         }
      }
   }
}
