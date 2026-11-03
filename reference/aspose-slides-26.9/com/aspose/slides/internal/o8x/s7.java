package com.aspose.slides.internal.o8x;

import com.aspose.slides.internal.l7h.a5;

public final class s7 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private c8[] a6;
   private c8[] u9;
   private c8[] h0;
   private com.aspose.slides.internal.x6s.l6 c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private s7 y4;
   private n3 e2;

   public s7(n3 var1) {
      this.e2 = var1;
   }

   public s7(String var1, String var2, String var3, String var4, c8[] var5, c8[] var6, c8[] var7, com.aspose.slides.internal.x6s.l6 var8, int var9, int var10) {
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public final void n5(
      String var1, String var2, String var3, String var4, c8[] var5, c8[] var6, c8[] var7, com.aspose.slides.internal.x6s.l6 var8, int var9, int var10
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = var7;
      this.c8 = var8;
      this.t2 = var9;
      this.s7 = var10;
      this.y4 = null;
      this.e2 = null;
      this.x8 = 0;
      this.n3 = 0;

      for (int var11 = 0; var11 < this.n5.length(); var11++) {
         this.n3 = this.n3 + (this.n3 << 7 ^ this.n5.charAt(var11));
      }
   }

   public final n3 n5() {
      return this.e2;
   }

   public final String l6() {
      return this.n5;
   }

   public final String k5() {
      return this.l6;
   }

   public final String u3() {
      return this.k5;
   }

   public final String a6() {
      return this.u3;
   }

   public final c8[] u9() {
      return this.u9;
   }

   public final c8[] h0() {
      return this.h0;
   }

   public final c8[] c8() {
      return this.a6;
   }

   public final com.aspose.slides.internal.x6s.l6 t2() {
      return this.c8;
   }

   public final int s7() {
      return this.t2;
   }

   public final int x8() {
      return this.s7;
   }

   public final int n3() {
      return this.n3;
   }

   public final s7 y4() {
      return this.y4;
   }

   public final void n5(s7 var1) {
      this.y4 = var1;
   }

   @Override
   public int hashCode() {
      if (this.x8 == 0) {
         int var1 = this.n3;
         if (this.u9 != null) {
            var1 += var1 << 7 ^ this.u9[0].x8().n5();
         }

         if (this.a6 != null) {
            var1 += var1 << 7 ^ this.a6[0].x8().n5();
         }

         if (this.h0 != null) {
            var1 += var1 << 7 ^ this.h0[0].x8().n5();
         }

         this.x8 = var1 == 0 ? 1 : var1;
      }

      return this.x8;
   }

   @Override
   public boolean equals(Object other) {
      s7 var2 = com.aspose.slides.internal.v6g.k5.n5(other, s7.class);
      return this.hashCode() == var2.hashCode()
         && this.n5 == var2.n5
         && this.u9 == var2.u9
         && this.l6 == var2.l6
         && this.a6 == var2.a6
         && this.h0 == var2.h0
         && this.k5 == var2.k5
         && this.u3 == var2.u3
         && this.t2 == var2.t2
         && this.s7 == var2.s7;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("hash=");
      var1.k5(this.hashCode());
      var1.n5(", ");
      if (this.n5.length() != 0) {
         var1.n5('{');
         var1.n5(this.l6);
         var1.n5('}');
         if (this.k5.length() != 0) {
            var1.n5(this.k5);
            var1.n5(':');
         }

         var1.n5(this.n5);
         var1.n5(", ");
      }

      if (this.a6 != null) {
         var1.n5("parent=");
         var1.k5(this.a6[0].x8().n5());
         var1.n5(", ");
      }

      if (this.u9 != null) {
         var1.n5("sibling=");
         var1.k5(this.u9[0].x8().n5());
         var1.n5(", ");
      }

      if (this.h0 != null) {
         var1.n5("similar=");
         var1.k5(this.h0[0].x8().n5());
         var1.n5(", ");
      }

      var1.n5("lineNum=");
      var1.k5(this.t2);
      var1.n5(", ");
      var1.n5("linePos=");
      var1.k5(this.s7);
      return var1.toString();
   }
}
