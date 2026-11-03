package com.aspose.slides;

class t3d extends o2k {
   final void n5(ChartDataWorksheet var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "table".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.x2j var2 = new com.aspose.slides.internal.k4y.x2j(this.s7());
            l4a var3 = new l4a(var1, var2.a6());
            f3w var4 = var3.u9();
            var4.n5(var2.z8());
            var4.k5(var2.u3());
            var4.s7(var2.m3());
            var4.a6(var2.m1());
            var4.a6(var2.e2());
            var4.l6(var2.k5());
            var4.h0(var2.z1());
            var4.u3(var2.z3());
            var4.l6(var2.h0());
            var4.u3(var2.y4());
            var4.n5(var2.n5());
            var4.n5(var2.c8());
            var4.l6(var2.t2());
            var4.n5(var2.l6());
            var4.u3(var2.n3());
            var4.n5(var2.j5());
            var4.c8(var2.t4());
            var4.n5(var2.w1());
            var4.n5(var2.r4());
            var4.n5(var2.u9());
            var4.t2(var2.q0());
            var4.u9(var2.k7());
            var4.k5(var2.s7());
            var4.u9(var2.t9());
            var4.k5(var2.x8());
            var4.n5(var2.c4());
            var1.n5().n5(var3);
         }
      }

      this.n3();
   }

   final void n5(l4a var1) {
      this.y4();
      com.aspose.slides.internal.k4y.x2j var2 = new com.aspose.slides.internal.k4y.x2j();
      f3w var3 = var1.u9();
      com.aspose.slides.internal.k4y.p9l var4 = var2.w1();
      long var5 = 1L;
      int var7 = 0;
      int var8 = var3.j5().l6().length;

      for (int var9 = var1.l6(); var9 <= var1.k5(); var9++) {
         ChartDataCell var10 = var1.n5().l6().l6(var1.u3(), var9);
         String var11 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.r7c.c8.n5(var10.h0(), "(\r\n)|[\n\r]", "_x000a_"), "\t", " ");
         if (com.aspose.slides.ms.System.d1.a6(var11, com.aspose.slides.ms.System.d1.n5)) {
            var11 = " ";
            if (++var7 > 1) {
               var11 = com.aspose.slides.ms.System.d1.n5("Column{0:00}", new Object[]{var7});
            }

            var10.n5(var11);
         }

         com.aspose.slides.internal.k4y.b6o var12 = null;
         if (var9 < var8 && (var3.t2() & 4294967295L) > 0L) {
            com.aspose.slides.internal.k4y.b6o var13 = var3.j5().l6()[var9];
            if (var13.k5() > 1) {
               var12 = var13;
               var4.n5(var12);
            }
         }

         if (var12 == null) {
            var12 = var4.n5();
         }

         var12.n5(var11);
         var12.n5(var5++);
      }

      var4.n5((var5 & 4294967295L) - 1L & 4294967295L);
      var2.u3(var1.h0());
      var2.n5(var3.m3());
      var2.k5(var3.u3());
      var2.s7(var3.k7());
      var2.u9(var3.z3());
      var2.a6(var3.y4());
      var2.l6(var3.k5());
      var2.h0(var3.t9());
      var2.a6(var3.q0());
      var2.l6(var3.u9());
      var2.u3(var3.n3());
      var2.n5(var3.n5());
      var2.n5(var3.h0());
      var2.l6(var3.c8());
      var2.n5(var3.l6());
      var2.u3(var3.x8());
      var2.n5(var3.z8());
      var2.c8(var3.z1());
      var2.n5(var3.w1());
      var2.n5(var3.a6());
      var2.t2(var3.t4());
      var2.h0(var3.m1());
      var2.k5(var3.t2());
      var2.u9(var3.e2());
      var2.k5(var3.s7());
      var2.n5(var3.r4());
      var2.n5(null, this.x8(), "table");
      this.e2();
   }

   public t3d(com.aspose.slides.internal.c8m.j8 var1, o9g var2) {
      super(var1, var2);
   }

   public t3d(com.aspose.slides.internal.c8m.j8 var1, n2x var2) {
      super(var1, var2);
   }
}
