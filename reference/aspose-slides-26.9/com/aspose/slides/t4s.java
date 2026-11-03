package com.aspose.slides;

class t4s extends v8r {
   static void k5(v5s var0) {
      a9x var1 = var0.a6();
      com.aspose.slides.internal.k0r.q5 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.k5(), com.aspose.slides.internal.k0r.q5.class);
      PictureFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), PictureFrame.class);
      if (var3 == null) {
         var3 = var0.h0().q0();
         var1.n5(var3);
      }

      l6(var0);
      if (var3.getPlaceholder() != null
         && (var3.getPlaceholder().getType() == 4 || var3.getPlaceholder().getType() == 5 || var3.getPlaceholder().getType() == 6)) {
         var3.removePlaceholder();
      }

      var3.e2().l6(5);
      var3.getPictureFormat().setPictureFillMode(1);
      m3e.n5(var3.getFillFormat(), var1);
      IShapeFrame var4 = var3.getFrame();
      r9a.n5(var3.getLineFormat(), s1f.l6(var3.e2().x8()), var4.getFlipH() == 1 ^ var4.getFlipV() == 1, var1);
      f7k.n5(var3.getEffectFormat(), var1);
      s4q.n5((PictureFillFormat)var3.getPictureFormat(), 4294967295L, var1);
   }
}
