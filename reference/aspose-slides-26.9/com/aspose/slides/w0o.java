package com.aspose.slides;

final class w0o extends com.aspose.slides.internal.k4y.d0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("clrMap");

   private w0o(com.aspose.slides.ms.System.Xml.c7 var1) {
      super(var1);
   }

   public w0o() {
      super(false);
   }

   public static w0o n5(com.aspose.slides.ms.System.Xml.c7 var0) {
      String var1 = var0.n3();
      if (var0.m1()) {
         return new w0o();
      }

      w0o var2 = null;
      boolean var3 = false;

      while (var3 && !var0.j5() || var0.u9()) {
         if (var0.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var0.n3(), var1)) {
            break;
         }

         var3 = false;
         if (var0.s7() == 1) {
            switch (n5.n5(var0.n3())) {
               case 0:
                  var2 = new w0o(var0);
                  break;
               default:
                  var0.r4();
                  var3 = true;
            }
         }
      }

      return var2 == null ? new w0o() : var2;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      var2.l6("bg1", com.aspose.slides.internal.k4y.a7.n5(this.n5()));
      var2.l6("tx1", com.aspose.slides.internal.k4y.a7.n5(this.l6()));
      var2.l6("bg2", com.aspose.slides.internal.k4y.a7.n5(this.k5()));
      var2.l6("tx2", com.aspose.slides.internal.k4y.a7.n5(this.u3()));
      var2.l6("accent1", com.aspose.slides.internal.k4y.a7.n5(this.a6()));
      var2.l6("accent2", com.aspose.slides.internal.k4y.a7.n5(this.u9()));
      var2.l6("accent3", com.aspose.slides.internal.k4y.a7.n5(this.h0()));
      var2.l6("accent4", com.aspose.slides.internal.k4y.a7.n5(this.c8()));
      var2.l6("accent5", com.aspose.slides.internal.k4y.a7.n5(this.t2()));
      var2.l6("accent6", com.aspose.slides.internal.k4y.a7.n5(this.s7()));
      var2.l6("hlink", com.aspose.slides.internal.k4y.a7.n5(this.x8()));
      var2.l6("folHlink", com.aspose.slides.internal.k4y.a7.n5(this.n3()));
      var2.s7();
   }
}
