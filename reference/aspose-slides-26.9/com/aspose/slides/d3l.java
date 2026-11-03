package com.aspose.slides;

class d3l extends v8r {
   static void n5(v5s var0) {
      a9x var1 = var0.a6();
      com.aspose.slides.internal.k0r.q5 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.k5(), com.aspose.slides.internal.k0r.q5.class);
      Connector var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), Connector.class);
      if (var3 == null) {
         var3 = var0.h0().t4();
         var1.n5(var3);
      }

      l6(var0);
      int var4 = s1f.n5(var2.u3().t2());
      var3.e2().l6(var4);
      m3e.n5(var3.getFillFormat(), var1);
      IShapeFrame var5 = var3.getFrame();
      r9a.n5(var3.getLineFormat(), (byte)2, var5.getFlipH() == 1 ^ var5.getFlipV() == 1, var1);
      f7k.n5(var3.getEffectFormat(), var1);
      if (var3.e2().l6() != null) {
         for (int var6 = 0; var6 < var3.e2().l6().length; var6++) {
            com.aspose.slides.internal.k0r.z5 var7 = var2.a6() != null
               ? com.aspose.slides.internal.v6g.k5.n5(var2.a6().l6().n5(var6 + 327), com.aspose.slides.internal.k0r.z5.class)
               : null;
            y2 var8 = var3.e2().l6()[var6];
            if (var7 != null) {
               var3.e2().l6()[var6] = new y2(
                  var8 != null ? var8.k5() : com.aspose.slides.ms.System.d1.n5(new String[]{"adj", com.aspose.slides.ms.System.a3.l6(var6)}),
                  com.aspose.slides.internal.v6g.k5.u3((int)var7.j5() / 21600.0 * 100000.0, 14)
               );
            } else if (var8 == null) {
               var3.e2().l6()[var6] = new y2(com.aspose.slides.ms.System.d1.n5(new String[]{"adj", com.aspose.slides.ms.System.a3.l6(var6)}), 0L);
            }
         }
      }
   }
}
