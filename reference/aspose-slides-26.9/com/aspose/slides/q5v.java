package com.aspose.slides;

class q5v {
   static m0l n5(t2s var0) {
      if (var0.s7().h0() == null) {
         return null;
      }

      m0l var1 = null;
      String var2 = var0.s7().h0().l6();
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(com.aspose.slides.internal.l7h.j5.z3().u3(var2));
      com.aspose.slides.ms.System.Xml.p5 var4 = new com.aspose.slides.ms.System.Xml.p5(var3);
      var4.n5((com.aspose.slides.ms.System.Xml.o8)null);
      if (com.aspose.slides.ms.System.d1.t2(var2, "clrMapOvr")) {
         e6k var5 = e6k.n5(var4);
         var1 = new m0l(false);
         a1g.n5(var1, var5);
      } else {
         w0o var7 = w0o.n5(var4);
         var1 = new m0l();
         a1g.n5(var1, var7);
      }

      return var1;
   }

   public static void n5(y2q var0) {
      m0l var1 = var0.m1().k5();
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.n8e.u4 var3 = new com.aspose.slides.internal.n8e.u4(var2, com.aspose.slides.internal.l7h.j5.z3());
      var3.l6(4);
      var3.n5(1);
      var3.l6(true);
      w0o var4 = new w0o();
      a1g.l6(var1, var4);
      var4.n5(null, var3, "a:clrMap");
      var3.n5();
      var3.u9();
      var3.a6();
      String var5 = com.aspose.slides.internal.l7h.j5.z3().l6(var2.toArray());
      com.aspose.slides.internal.k0r.f6z var6 = new com.aspose.slides.internal.k0r.f6z();
      var6.n5(var5);
      var0.u3().n5(var6);
   }
}
