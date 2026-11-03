package com.aspose.slides.internal.u0b;

class q0 {
   public static com.aspose.slides.internal.f4l.j5 n5(com.aspose.slides.internal.z0k.n5 var0) {
      com.aspose.slides.internal.f4l.j5 var1 = new com.aspose.slides.internal.f4l.j5();
      var1.n5(var0.m3());
      long var2 = var0.x8().getPosition();
      var1.n5(m3.n5(var0));
      int var4 = (int)(var0.x8().getPosition() - var2);
      if (var1.l6() != var4) {
         throw new com.aspose.slides.internal.e2o.n5("Readed more bytes than the object size.");
      } else {
         return var1;
      }
   }
}
