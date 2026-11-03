package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class z3 extends m1 {
   private int n5;
   private int l6;
   private int k5;
   private com.aspose.slides.internal.i0.g7 u3;
   private String a6;
   private byte[] u9 = new byte[0];

   public z3() {
      this.l6((short)16412);
   }

   public z3(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(15);
   }

   public final byte u3() {
      return this.m3();
   }

   public final int c8() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final int t2() {
      return this.l6;
   }

   public final void u3(int var1) {
      this.l6 = var1;
   }

   public final int s7() {
      return this.k5;
   }

   public final void a6(int var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.i0.g7 x8() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.i0.g7 var1) {
      this.u3 = var1;
   }

   public final String n3() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final byte[] y4() {
      return this.u9;
   }

   public final void n5(byte[] var1) {
      this.u9 = var1;
   }

   protected final boolean n5(z3 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && com.aspose.slides.ms.System.j8.n5(this.u3, var1.u3)
         && d1.a6(this.a6, var1.a6)
         && com.aspose.slides.internal.y6.c8.n5(this.u9, var1.u9);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
      var1 = var1 * 397 ^ (this.a6 != null ? this.a6.hashCode() : 0);
      return var1 * 397 ^ (this.u9 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u9)).hashCode() : 0);
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, BrushId: {1}, FormatId: {2}, Length: {3}, LayoutRect: {4}, StringData: {5}, AlignmentPadding: {6}",
         super.toString(),
         this.n5,
         this.l6,
         this.k5,
         this.u3,
         this.a6,
         this.u9.length
      );
   }

   @Override
   public int u9() {
      return 12 + this.u3.u9() + this.s7() * 2 + this.y4().length;
   }
}
