package com.aspose.slides.internal.e1;

public class c4 extends n3 {
   private boolean n5;

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public static c4 n5(com.aspose.slides.internal.o9b.w1[] var0, boolean var1) {
      c4 var2 = new c4();
      var2.n5(var1);
      var2.l6(var0);
      return var2;
   }

   public static c4 n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      c4 var2 = new c4();
      var2.l6(var0.u3(), var1.u3());
      return var2;
   }

   public static c4 n5(com.aspose.slides.internal.o9b.y1 var0) {
      c4 var1 = new c4();
      var1.n5(true);
      var1.l6(var0.y4());
      return var1;
   }

   public static c4 n5(com.aspose.slides.internal.o9b.w1[] var0) {
      c4 var1 = new c4();
      var1.n5(false);
      var1.k5(var0);
      return var1;
   }

   public final void l6(com.aspose.slides.internal.o9b.w1[] var1) {
      y2 var2 = new y2(var1);
      this.n5(var2);
   }

   public final void l6(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      y2 var3 = new y2();
      var3.n5().addItem(var1.u3());
      var3.n5().addItem(var2.u3());
      this.n5(var3);
   }

   public final void l6(com.aspose.slides.internal.o9b.y1 var1) {
      y2 var2 = new y2();
      var2.n5().addItem(new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.t2()));
      var2.n5().addItem(new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.t2()));
      var2.n5().addItem(new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.l6()));
      var2.n5().addItem(new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.l6()));
      this.n5(var2);
   }

   public final void k5(com.aspose.slides.internal.o9b.w1[] var1) {
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2 - 3; var3 += 3) {
         this.n5(new a6(var1[var3].u3(), var1[var3 + 1].u3(), var1[var3 + 2].u3(), var1[var3 + 3].u3()));
      }
   }

   public final void n5(n5 var1) {
      u3[] var2 = var1.l6();

      for (u3 var6 : var2) {
         a6 var7 = new a6(var6.u9());
         this.n5(var7);
      }
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      for (int var2 = 0; var2 < this.t2(); var2++) {
         i1 var3 = (i1)this.n5(var2);
         var3.n5(var1);
      }
   }

   public final c4 l6() {
      c4 var1 = new c4();
      var1.n5 = this.n5;

      for (int var2 = 0; var2 < this.t2(); var2++) {
         f2 var3 = (f2)this.n5(var2);
         var1.n5(var3.l6());
      }

      return var1;
   }
}
