package com.aspose.slides.internal.g5d;

import com.aspose.slides.internal.u0b.g7;
import com.aspose.slides.ms.System.d1;

public class b3 extends com.aspose.slides.internal.s5r.n5 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "{633C80A4-1843-482B-9EF2-BE2834C5FDD4}",
      "{D3A1DBE1-8EC4-4C17-9F4C-EA97AD1C343D}",
      "{537E597D-251E-48DA-9664-29CA496B70F8}",
      "{DD6A0022-58E4-4A67-9D9B-D48EB881A53D}",
      "{A7CE72A9-0F7F-40D7-B3CC-D0C02D5C3212}",
      "{718F2615-7933-40E3-A511-5F68FE14DD74}",
      "{8B2DD6C3-EB07-4D87-A5F0-7108E26A9C5F}",
      "{99C354EC-2A31-4F3A-8C34-17A803B33A25}",
      "{74D29D05-69A4-4266-9549-3CC52836B632}",
      "{63CBF3EE-C526-402C-8F71-62C540BF5142}",
      "{1077AF00-2848-4441-9489-44AD4C2D7A2C}"
   );

   @Override
   public boolean n5(com.aspose.slides.internal.c4i.e5[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.c4i.a5 var3 = new com.aspose.slides.internal.c4i.a5(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5(new com.aspose.slides.internal.k5w.n5(var4.m3(), var4.k7(), var4.k7(), var4.z8()));
      var3.k5(var4.m3());
      var3.n5(var4.c8(var3.u9()));
      com.aspose.slides.internal.f4l.z7 var5 = null;
      com.aspose.slides.internal.z0k.n5 var6 = new com.aspose.slides.internal.z0k.n5(new com.aspose.slides.internal.z0k.e2(var3.h0()));

      try {
         switch (n5.n5(var3.u3().toString())) {
            case 0:
               var5 = com.aspose.slides.internal.u0b.u9.n5(var6);
               break;
            case 1:
               var5 = com.aspose.slides.internal.u0b.t2.n5(var6);
               break;
            case 2:
               var5 = com.aspose.slides.internal.u0b.n3.n5(var6);
               break;
            case 3:
               var5 = com.aspose.slides.internal.u0b.y4.n5(var6);
               break;
            case 4:
               var5 = com.aspose.slides.internal.u0b.e2.n5(var6);
               break;
            case 5:
               var5 = com.aspose.slides.internal.u0b.t9.n5(var6);
               break;
            case 6:
               var5 = com.aspose.slides.internal.u0b.a0.n5(var6);
               break;
            case 7:
               var5 = com.aspose.slides.internal.u0b.s3.n5(var6);
               break;
            case 8:
               var5 = com.aspose.slides.internal.u0b.x9.n5(var6);
               break;
            case 9:
               var5 = com.aspose.slides.internal.u0b.o5.n5(var6);
               break;
            case 10:
               var5 = g7.n5(var6);
               break;
            default:
               throw new com.aspose.slides.internal.e2o.n5(d1.n5(new Object[]{"Unknown ObjectGuid: ", var3.u3()}));
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      var3.n5(var5);
      var1[0] = var3;
      return true;
   }
}
