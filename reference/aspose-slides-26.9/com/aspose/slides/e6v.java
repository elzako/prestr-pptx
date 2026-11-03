package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class e6v extends o2k {
   final void n5(ChartDataWorksheet var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "worksheet".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.n6o var2 = new com.aspose.slides.internal.k4y.n6o(this.s7());
            com.aspose.slides.internal.c8m.a2 var3 = this.n5().k7();
            s5g.n5(var1.l6(), var2, this.n5());
            if (var2.b3() != null) {
               for (com.aspose.slides.internal.k4y.g9m var7 : var2.b3().l6()) {
                  t3d var8 = new t3d(var3.n5(var7.n5()).l6(), this.n5());
                  var8.n5(var1);
               }
            }

            this.n5(var1, var2.d2());
            u6f var9 = var1.a6();
            var9.n5(var2.n3());
            var9.n5(var2.y2());
            var9.l6(var2.r4());
            var9.n5(var2.u9());
            var9.n5(var2.q0());
            var9.n5(var2.i1());
            var9.n5(var2.c4());
            var9.n5(var2.t9());
            var9.n5(var2.e2());
            var9.n5(var2.z3());
            var9.n5(var2.k5());
            var9.n5(var2.d2());
            var9.n5(var2.j5());
            var9.n5(var2.m1());
            var9.n5(var2.y1());
            var9.n5(var2.d5());
            var9.l6(var2.s3());
            var9.n5(var2.z1());
            var9.n5(var2.f2());
            var9.n5(var2.m3());
            var9.n5(var2.z8());
            var9.n5(var2.t4());
            var9.n5(var2.p8());
            var9.n5(var2.k7());
            var9.n5(var2.s7());
            var9.n5(var2.w1());
            var9.n5(var2.x8());
            var9.n5(var2.c8());
            var9.n5(var2.a6());
            var9.n5(var2.l6());
            var9.n5(var2.t2());
            var9.n5(var2.u3());
            var9.n5(var2.a0());
            var9.n5(var2.y4());
            var9.n5(var2.e5());
            var9.n5(var2.o0());
         }
      }

      this.n3();
   }

   private void n5(ChartDataWorksheet var1, com.aspose.slides.internal.k4y.b5s var2) {
      if (var2 != null) {
         com.aspose.slides.internal.c8m.r7 var3 = this.n5().k7().n5(var2.n5());
         if (var3 != null) {
            c8m var4 = new c8m(var3.l6(), this.n5());
            var4.n5(var1);
         }
      }
   }

   private boolean n5(l4a var1) {
      for (int var2 = var1.l6(); var2 <= var1.k5(); var2++) {
         if (var2 != var1.l6()) {
            ChartDataCell var3 = var1.n5().l6().l6(var1.u3(), var2);
            if (var3.n5() != 3) {
               return false;
            }
         }
      }

      return true;
   }

   final void l6(ChartDataWorksheet var1) {
      this.y4();
      com.aspose.slides.internal.k4y.n6o var2 = new com.aspose.slides.internal.k4y.n6o();
      u6f var3 = var1.a6();
      if (var1.l6().c8() > 0) {
         com.aspose.slides.internal.k4y.z4d var4 = var2.n5();
         IGenericEnumerator var5 = var1.n5().iterator();

         try {
            while (var5.hasNext()) {
               l4a var6 = (l4a)var5.next();
               if (this.n5(var6)) {
                  com.aspose.slides.internal.c8m.j8 var7 = this.l6()
                     .n5()
                     .n5("/xl/tables/table{0}.xml", new e6v$1(this), new com.aspose.slides.internal.c8m.x5());
                  t3d var8 = new t3d(var7, this.l6());
                  var8.n5(var6);
                  com.aspose.slides.internal.c8m.r7 var9 = this.t9().e2().l6(var7);
                  com.aspose.slides.internal.k4y.g9m var10 = var4.n5();
                  var10.n5(var9.a6());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      SortedList var59 = new SortedList();
      IGenericEnumerator var60 = var1.l6().n5.getValues().iterator();

      try {
         while (var60.hasNext()) {
            SortedList var61 = (SortedList)var60.next();
            IGenericEnumerator var63 = var61.getValues().iterator();

            try {
               while (var63.hasNext()) {
                  SortedList var67 = (SortedList)var63.next();
                  IGenericEnumerator var71 = var67.getValues().iterator();

                  try {
                     while (var71.hasNext()) {
                        ChartDataCell var75 = (ChartDataCell)var71.next();
                        if (!var59.containsKey(var75.getRow() + 1)) {
                           var59.addItem(var75.getRow() + 1, new SortedList());
                        }

                        ((SortedList)var59.get_Item(var75.getRow() + 1)).addItem(var75.getColumn(), var75);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var71, IDisposable.class)) {
                        var71.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var63, IDisposable.class)) {
                  var63.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var60, IDisposable.class)) {
            var60.dispose();
         }
      }

      IGenericEnumerator var62 = var59.getKeys().iterator();

      try {
         while (var62.hasNext()) {
            int var64 = com.aspose.slides.internal.v6g.k5.u3(var62.next(), int.class);
            com.aspose.slides.internal.k4y.f1j var68 = var2.h0().n5();
            var68.n5(var64 & 4294967295L);
            if (((SortedList)var59.get_Item(var64)).size() > 0 && ((ChartDataCell)((SortedList)var59.get_Item(var64)).getValues().get_Item(0)).isHidden()) {
               var68.n5(true);
            }

            IGenericEnumerator var72 = ((SortedList)var59.get_Item(var64)).getValues().iterator();

            try {
               while (var72.hasNext()) {
                  ChartDataCell var76 = (ChartDataCell)var72.next();
                  com.aspose.slides.internal.k4y.u1v var11 = var68.n5();
                  x7i.n5(var76, var11, this.l6());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var72, IDisposable.class)) {
                  var72.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var62, IDisposable.class)) {
            var62.dispose();
         }
      }

      var2.n5(var3.s7());
      var2.n5(var3.r4());
      var2.l6(var3.j5());
      if (var3.a6() != null) {
         for (com.aspose.slides.internal.k4y.w0j var77 : var3.a6()) {
            var2.n5(var77);
         }
      }

      if (var3.z1() != null) {
         for (com.aspose.slides.internal.k4y.b6w var78 : var3.z1()) {
            var2.n5(var78);
         }
      }

      var2.n5(var3.p8());
      var2.n5(var3.w1());
      var2.n5(var3.y4());
      var2.n5(var3.n3());
      var2.n5(var3.t4());
      var2.n5(var3.l6());
      var2.n5(var3.y1());
      var2.n5(var3.m3());
      var2.n5(var3.q0());
      var2.n5(var3.c4());
      var2.n5(var3.a0());
      var2.l6(var3.d2());
      var2.n5(var3.e2());
      var2.n5(var3.s3());
      var2.n5(var3.m1());
      var2.n5(var3.k7());
      var2.n5(var3.t9());
      var2.n5(var3.d5());
      var2.n5(var3.z3());
      var2.n5(var3.c8());
      var2.n5(var3.z8());
      var2.n5(var3.t2());
      var2.n5(var3.u9());
      var2.n5(var3.u3());
      var2.n5(var3.n5());
      var2.n5(var3.h0());
      var2.n5(var3.k5());
      var2.n5(var3.y2());
      var2.n5(var3.x8());
      var2.n5(var3.f2());
      var2.n5(var3.i1());
      var2.n5(null, this.x8(), "worksheet");
      this.e2();
   }

   public e6v(com.aspose.slides.internal.c8m.j8 var1, o9g var2) {
      super(var1, var2);
   }

   public e6v(com.aspose.slides.internal.c8m.j8 var1, n2x var2, ChartDataWorksheet var3) {
      super(var1, var2);
      d3o.n5(var1, var3.u3().h0().z3(), var3.a6().e5());
   }
}
