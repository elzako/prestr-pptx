package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class n4i {
   private com.aspose.slides.internal.c8m.j8 n5;
   private o8 l6;
   private g6c k5;
   private long u3 = 1L;
   private final Dictionary<IShape, Long> a6;
   private com.aspose.slides.internal.c8m.j8 u9;
   private Dictionary<ISlideComponent, Integer> h0;
   private List<String> c8 = new List<>();

   n4i(IBaseSlide var1, g6c var2, com.aspose.slides.internal.c8m.j8 var3) {
      this.k5 = var2;
      this.n5 = var3;
      this.l6 = ((BaseSlide)var1).k5();
      this.a6 = new Dictionary<>();
      this.h0 = new Dictionary<>();
   }

   public final g6c n5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.c8m.j8 l6() {
      return this.n5;
   }

   public final com.aspose.slides.internal.c8m.a2 k5() {
      return this.n5.e2();
   }

   final long u3() {
      return this.u3++;
   }

   final void n5(IShape var1, long var2) {
      this.a6.addItem(var1, var2);
      if ((this.u3 & 4294967295L) <= (var2 & 4294967295L)) {
         this.u3 = (var2 & 4294967295L) + 1L & 4294967295L;
      }
   }

   final Dictionary<IShape, Long> a6() {
      return this.a6;
   }

   final Dictionary<ISlideComponent, Integer> u9() {
      return this.h0;
   }

   final int n5(ISlideComponent var1) {
      int var2 = this.n5().t4();
      this.h0.addItem(var1, var2);
      return var2;
   }

   final com.aspose.slides.internal.c8m.j8 h0() {
      return this.u9;
   }

   final void n5(com.aspose.slides.internal.c8m.j8 var1) {
      this.u9 = var1;
   }

   final List<String> c8() {
      return this.c8;
   }
}
