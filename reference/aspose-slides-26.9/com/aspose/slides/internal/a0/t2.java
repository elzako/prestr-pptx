package com.aspose.slides.internal.a0;

import com.aspose.slides.internal.o9b.p8;

public class t2 extends s7 {
   private int n3 = 0;
   protected boolean c8 = true;
   private boolean y4 = false;
   private int e2 = 0;
   private int t9 = 0;
   private com.aspose.slides.internal.f2.k5 z1;
   private int t4 = 0;

   @Override
   public void l6(t2 var1) {
      this.n5(var1, true);
   }

   public final void n5(t2 var1, boolean var2) {
      if (var2 && this.c8 && var1.k7()) {
         this.l6 = this.l6 + var1.a6();
      } else if (this.c8 && var1.m1() == 4) {
         this.l6 = this.l6 + var1.a6();
      }

      this.n5(var1);
   }

   public final void n5(k7 var1) {
      this.l6 = this.l6 + var1.a6();
      this.n5((l6)var1);
   }

   public final void t2(int var1) {
      this.n3 = var1;
   }

   public final int m1() {
      return this.n3;
   }

   public final boolean k7() {
      return this.m1() == 0 || this.m1() == 1;
   }

   public final int m3() {
      Object var1 = this.a6(27);
      return var1 != null ? com.aspose.slides.internal.v6g.k5.u3(var1, int.class) : 0;
   }

   public final boolean z8() {
      return this.y4;
   }

   public final void l6(boolean var1) {
      this.y4 = var1;
   }

   public final int j5() {
      return this.e2;
   }

   public final void s7(int var1) {
      this.e2 = var1;
   }

   public final com.aspose.slides.internal.f2.k5 w1() {
      return this.z1;
   }

   public final void n5(com.aspose.slides.internal.f2.k5 var1) {
      this.z1 = var1;
   }

   public final int r4() {
      return this.t4;
   }

   public final void x8(int var1) {
      this.t4 = var1;
   }

   @Override
   public p8 n5(boolean var1) {
      return this.n5(this.x8, var1);
   }
}
