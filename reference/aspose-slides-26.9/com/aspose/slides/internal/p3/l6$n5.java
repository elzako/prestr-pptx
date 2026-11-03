package com.aspose.slides.internal.p3;

public class l6$n5 extends s7 {
   public int n5 = 0;
   public int l6 = 0;
   private int u3;
   private int a6;
   private l6 h0;

   public l6$n5(int var1, int var2, l6 var3) {
      this.u3 = var1;
      this.a6 = var2;
      this.h0 = var3;
   }

   public final int a6() {
      return this.u3;
   }

   public final int u9() {
      return this.a6;
   }

   @Override
   public v4 h0() {
      return this.n5((com.aspose.slides.internal.p3.j8)null);
   }

   public final v4 n5(j8 var1) {
      while (this.size() > this.n5 && !((i1)com.aspose.slides.internal.v3.t2.n5(this)).e2()) {
         com.aspose.slides.internal.v3.t2.l6(this);
      }

      if (this.size() <= this.n5) {
         this.clear();
         return null;
      }

      if (this.u9() == 163 && this.h0.u9()) {
         this.addItem(new o0(0, -1000, false, var1, false));
         this.l6 = 1;
      } else {
         this.addItem(new o0(0, 1000, false, null, false));
         this.addItem(new e5(0, 10000000, 0, null, false));
         this.addItem(new o0(0, -1000, false, var1, false));
         this.l6 = 3;
      }

      return this;
   }

   public final l6$n5 l6(j8 var1) {
      v4 var2 = this.n5(var1);
      if (var2 != null) {
         l6$n5 var3 = new l6$n5(this.u3, this.a6, this.h0);
         var3.addRange(var2);
         var3.l6 = this.l6;
         return var3;
      } else {
         return null;
      }
   }
}
