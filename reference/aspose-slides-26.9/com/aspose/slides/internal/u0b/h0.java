package com.aspose.slides.internal.u0b;

class h0 {
   public static com.aspose.slides.internal.f4l.n3 n5(com.aspose.slides.internal.z0k.n5 var0) {
      com.aspose.slides.internal.f4l.n3 var1 = new com.aspose.slides.internal.f4l.n3();
      var1.n5(var0.m3());
      long var2 = var0.x8().getPosition();
      var1.n5(v4.n5(var0));
      int var4 = (int)(var0.x8().getPosition() - var2);
      if (var4 > var1.l6()) {
         throw new com.aspose.slides.internal.e2o.n5("Stream position is out of object bounds.");
      } else {
         return var1;
      }
   }
}
