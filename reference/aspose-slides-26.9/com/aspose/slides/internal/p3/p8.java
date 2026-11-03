package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class p8 extends f2 {
   private com.aspose.slides.internal.v8.u9 n5;
   private int l6;
   private List<j5> k5;
   private List<z3> u3;
   private List<List<com.aspose.slides.internal.r4.u9>> a6 = null;
   private List<List<com.aspose.slides.internal.r4.u9>> u9 = null;

   public p8(int var1, com.aspose.slides.internal.v8.u9 var2, int var3, j8 var4, boolean var5) {
      super(var1, var4, var5);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = new List<>();
      this.u3 = new List<>();
   }

   public p8(int var1, List<j5> var2, List<z3> var3, j8 var4, boolean var5) {
      super(var1, var4, var5);
      this.n5 = com.aspose.slides.internal.v8.u9.n5;
      this.l6 = 0;
      this.k5 = new List<>(var2);
      this.u3 = new List<>(var3);
   }

   public final List<j5> a6() {
      return this.k5;
   }

   public final List<z3> u9() {
      return this.u3;
   }

   public final boolean h0() {
      return this.k5.size() > 0;
   }

   public final boolean t2() {
      return this.u3.size() > 0;
   }

   public final void n5(List<com.aspose.slides.internal.r4.u9> var1) {
      if (this.a6 == null) {
         this.a6 = new List<>();
      }

      this.a6.addItem(var1);
   }

   public final List<List<com.aspose.slides.internal.r4.u9>> s7() {
      return this.a6;
   }

   public final void l6(List<com.aspose.slides.internal.r4.u9> var1) {
      if (this.u9 == null) {
         this.u9 = new List<>();
      }

      this.u9.addItem(var1);
   }

   public final List<List<com.aspose.slides.internal.r4.u9>> x8() {
      return this.u9;
   }

   public final com.aspose.slides.internal.v8.u9 n3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.v8.u9 var1) {
      this.n5 = var1;
   }

   public final int y4() {
      return this.l6;
   }
}
