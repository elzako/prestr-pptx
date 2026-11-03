package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;

class r6x implements c6u {
   private IGenericList<r6t> n5;
   private final b5v l6;
   private final int k5;
   private final int u3;
   private final int a6;
   private final int u9;

   @Override
   public final b5v n5() {
      return this.l6;
   }

   @Override
   public final int l6() {
      return this.k5;
   }

   @Override
   public final int k5() {
      return this.u3;
   }

   public final int s7() {
      return this.a6;
   }

   public final int x8() {
      return this.u9;
   }

   @Override
   public final boolean u3() {
      return this.l6() == this.s7();
   }

   @Override
   public final boolean a6() {
      return this.k5() == this.x8();
   }

   @Override
   public final int u9() {
      return this.s7() - this.l6() + 1;
   }

   @Override
   public final int h0() {
      return this.x8() - this.k5() + 1;
   }

   @Override
   public final int c8() {
      return this.n5.size();
   }

   @Override
   public final r6t n5(int var1) {
      return this.n5.get_Item(var1);
   }

   @Override
   public final r6t n5(int var1, int var2) {
      return this.n5().n5(this.l6() + var1 - 1, this.k5() + var2 - 1);
   }

   public r6x(b5v var1, int var2, int var3, int var4, int var5) {
      this.l6 = var1;
      this.k5 = com.aspose.slides.ms.System.q1.l6(var2, var4);
      this.u3 = com.aspose.slides.ms.System.q1.l6(var3, var5);
      this.a6 = com.aspose.slides.ms.System.q1.n5(var2, var4);
      this.u9 = com.aspose.slides.ms.System.q1.n5(var3, var5);
      this.n3();
   }

   @Override
   public final c6u l6(int var1) {
      int var2 = this.l6() + var1 - 1;
      return new r6x(this.n5(), var2, this.k5(), var2, this.x8());
   }

   @Override
   public final c6u k5(int var1) {
      int var2 = this.k5() + var1 - 1;
      return new r6x(this.n5(), this.l6(), var2, this.s7(), var2);
   }

   @Override
   public final a1h t2() {
      r6t var1 = this.n5().n5(this.l6(), this.k5());
      if (this.l6() == this.s7() && this.k5() == this.x8()) {
         return var1.t2();
      }

      r6t var2 = this.n5().n5(this.s7(), this.x8());
      return new c2e(var1.t2(), var2.t2(), var2.n5().l6());
   }

   @Override
   public final IGenericEnumerator<r6t> iterator() {
      return this.n5.iterator();
   }

   private void n3() {
      if (this.n5 == null) {
         this.n5 = this.n5().n5(this.l6(), this.k5(), this.s7(), this.x8());
      }
   }
}
