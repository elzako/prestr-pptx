package com.aspose.slides.internal.i8;

public class v4 extends e5 {
   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.p3 var2 = new com.aspose.slides.internal.i0.p3();
      com.aspose.slides.internal.i0.i1 var3 = new com.aspose.slides.internal.i0.i1();
      var3.n5(var1.m3());
      var2.n5(var3);
      var2.n5(var1.c4());
      short var4 = var1.k7();
      var2.n5(var4);
      var2.l6(var1.k7());
      com.aspose.slides.internal.i0.u3[] var5 = null;
      if (com.aspose.slides.internal.n7.k5.n5(var4, 11)) {
         var5 = com.aspose.slides.internal.b4.k5.k5(var2.n5(), var1);
      } else if (com.aspose.slides.internal.n7.k5.n5(var4, 14)) {
         var5 = com.aspose.slides.internal.b4.k5.l6(var2.n5(), var1);
      } else {
         var5 = com.aspose.slides.internal.b4.k5.u3(var2.n5(), var1);
      }

      var2.n5(var5);
      com.aspose.slides.internal.i0.u3[] var6;
      if (com.aspose.slides.internal.n7.k5.n5(var4, 11)) {
         var6 = new com.aspose.slides.internal.i0.z6[(int)var2.n5()];

         for (int var7 = 0; var7 < ((Object[])var6).length; var7++) {
            com.aspose.slides.internal.i0.z6 var8 = new com.aspose.slides.internal.i0.z6();
            var8.n5(var1.z1() & 255);
            ((Object[])var6)[var7] = var8;
         }
      } else {
         var6 = new com.aspose.slides.internal.i0.j9[(int)var2.n5()];

         for (int var10 = 0; var10 < ((Object[])var6).length; var10++) {
            com.aspose.slides.internal.i0.j9 var12 = new com.aspose.slides.internal.i0.j9();
            var12.n5(var1.z1() & 255);
            ((Object[])var6)[var10] = var12;
         }
      }

      var2.l6(var6);
      int var11 = 4 - (int)var1.x8().getPosition() & 3;
      if (var11 > 0) {
         var2.n5(var1.c8(var11));
      }

      return var2;
   }
}
