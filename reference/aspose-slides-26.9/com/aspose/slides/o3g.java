package com.aspose.slides;

class o3g {
   public static void n5(IPictureFrame var0, com.aspose.slides.internal.k4y.z1 var1, i1x var2) {
      if (var1 != null) {
         c8h var3 = ((PictureFrame)var0).a6();
         n5v.n5(var0, var1.k5(), var2.n5());
         k8n.n5((PictureFillFormat)var0.getPictureFormat(), var1.l6(), var2.n5());
         com.aspose.slides.internal.k4y.t4 var4 = var1.n5();
         z6a.n5(var0, var4.k5(), var2);
         z6a.n5(var0, var4.n5(), var2);
         h1o.n5(var0, var1.u3());
         com.aspose.slides.internal.k4y.s1o var5 = var4.l6();
         if (var5 != null) {
            z8u.n5(var0.getPictureFrameLock(), var5.k5());
            var3.l6(var5.u3());
            n5(var0, var1);
         }

         ((PictureFrame)var0).y4();
      }
   }

   private static void n5(IPictureFrame var0, com.aspose.slides.internal.k4y.z1 var1) {
      c8h var2 = ((PictureFrame)var0).a6();
      com.aspose.slides.internal.k4y.s1o var3 = var1.n5().l6();
      var2.l6(var3.l6());
   }

   public static void n5(IPictureFrame var0, com.aspose.slides.internal.k4y.z1 var1, g6c var2) {
      c8h var3 = ((PictureFrame)var0).a6();
      n5v.n5(var0, var1.k5(), var2);
      k8n.n5((PictureFillFormat)var0.getPictureFormat(), var1.l6(), var2);
      h1o.n5(var0.getShapeStyle(), new o3g$1(var1));
      com.aspose.slides.internal.k4y.t4 var4 = var1.n5();
      z6a.n5(var0, var4.k5(), var2);
      z6a.n5(var0, var4.n5(), var2);
      com.aspose.slides.internal.k4y.s1o var5 = var4.l6();
      z8u.n5(var0.getPictureFrameLock(), new o3g$2(var5));
      var5.n5(var3.x8());
      l6(var0, var1);
   }

   private static void l6(IPictureFrame var0, com.aspose.slides.internal.k4y.z1 var1) {
      c8h var2 = ((PictureFrame)var0).a6();
      com.aspose.slides.internal.k4y.s1o var3 = var1.n5().l6();
      var3.n5(var2.k5());
   }
}
