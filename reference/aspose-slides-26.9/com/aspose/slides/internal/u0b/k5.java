package com.aspose.slides.internal.u0b;

import com.aspose.slides.ms.System.d1;

class k5 {
   private final com.aspose.slides.internal.f4l.a6 n5;
   private final int l6;
   private final int k5;

   public k5(com.aspose.slides.internal.f4l.a6 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final com.aspose.slides.internal.f4l.a6 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.a6 var2;
      com.aspose.slides.internal.f4l.n5 var3;
      int var4;
      int var5;
      if (this.n5 == null) {
         var2 = new com.aspose.slides.internal.f4l.a6();
         var2.a6(var1.m3());
         var2.n5(var1.m3());
         var2.k5(var1.m3());
         var2.l6(var1.m3());
         var2.u3(var1.m3());
         var3 = null;
         var4 = this.l6 - 20;
         var5 = this.k5 - 20;
      } else {
         var2 = this.n5;
         var3 = this.n5.n5();
         var4 = this.l6;
         var5 = this.k5;
      }

      long var6 = var1.x8().getPosition();
      com.aspose.slides.internal.f4l.n5 var8;
      switch (var2.a6()) {
         case 0:
            var8 = new l6(var2, (com.aspose.slides.internal.f4l.u9)var3, var4, var5).n5(var1);
            break;
         case 1:
            var8 = new t4((com.aspose.slides.internal.f4l.m3)var3, var4, var5).n5(var1);
            break;
         default:
            throw new com.aspose.slides.internal.e2o.n5(
               d1.n5(new String[]{"Unknown bitmap data type: ", com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.j3z.n5.class, var2.a6())})
            );
      }

      if (var6 + var4 != var1.x8().getPosition()) {
         throw new com.aspose.slides.internal.e2o.n5("Readed more bytes than the object size.");
      }

      var2.n5(var8);
      return var2;
   }
}
