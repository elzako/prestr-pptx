package com.aspose.slides;

class l6z extends x0q {
   public l6z(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public l6z(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }

   final com.aspose.slides.internal.k4y.r3q n5() {
      com.aspose.slides.internal.k4y.r3q var1 = null;
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "downRevStg".equals(this.s7().n3())) {
            var1 = new com.aspose.slides.internal.k4y.r3q(this.s7());
         }
      }

      this.n3();
      return var1;
   }

   final void n5(IShape var1, k1z var2) {
      this.y4();
      com.aspose.slides.internal.k4y.r3q var3 = new com.aspose.slides.internal.k4y.r3q();
      if (var2.r4().n5() != null) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, Table.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, x1k.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var2, w2h.class)) {
            var3.n5(var2.r4().k5());
         } else {
            var3.n5(var2.r4().u3());
         }
      }

      if (var2.r4().l6() != null) {
         var3.l6(var2.r4().a6());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)) {
         var3.l6("");
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)) {
         com.aspose.slides.internal.k4y.e6a var4 = new com.aspose.slides.internal.k4y.e6a();
         var4.n5().n5(0L);
         var4.n5().l6(0L);
         var4.l6().n5(0L);
         var4.l6().l6(0L);
         var4.k5().n5(0L);
         var4.k5().l6(0L);
         var4.u3().n5(0L);
         var4.u3().l6(0L);
         com.aspose.slides.internal.k4y.g7 var5 = new com.aspose.slides.internal.k4y.g7("preciseEffectOffsets", var4);
         var3.n5(var5);
      }

      if (var1 != null) {
         var3.n5((((Shape)var1).v4() & 4294967295L) > 0L ? ((Shape)var1).v4() : var1.getUniqueId());
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)) {
         var3.n5((byte)0);
      }

      var3.l6(1L);
      var3.n5("a", this.x8(), "downRevStg");
      this.e2();
   }
}
