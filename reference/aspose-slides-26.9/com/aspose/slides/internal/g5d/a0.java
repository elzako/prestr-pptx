package com.aspose.slides.internal.g5d;

import com.aspose.slides.internal.u0b.s0;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class a0 extends com.aspose.slides.internal.s5r.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.c4i.e5[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.c4i.s3 var3 = new com.aspose.slides.internal.c4i.s3(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      int var6;
      int var13;
      if (var3.u3()) {
         var3.k5(var3.ar_());
         var13 = var3.c8() - 4;
         var3.b_(var4.m3());
         var6 = var3.ar_();
         if (!var3.e2().k5().containsKey(var3.h0() & 255)) {
            var3.e2().k5().set_Item(var3.h0() & 255, new com.aspose.slides.internal.z0k.e2());
         }

         com.aspose.slides.internal.z0k.t4 var7 = var3.e2().k5().get_Item(var3.h0() & 255);
         byte[] var8 = new byte[var13];
         var4.n5(var8, 0, var8.length);
         var7.write(var8, 0, var8.length);
         if (var7.getLength() < var6) {
            var1[0] = var3;
            return true;
         }

         var3.e2().k5().removeItemByKey(var3.h0() & 255);
         var13 = var6;
         var7.seek(0L, 0);
         var4 = new com.aspose.slides.internal.z0k.n5(var7);
      } else {
         var13 = var3.ar_();
         var6 = var13;
      }

      long var9 = var2.getPosition();
      com.aspose.slides.internal.f4l.p8 var11;
      switch (var3.u9()) {
         case 0:
            throw new com.aspose.slides.internal.e2o.n5("The object is not a valid object.");
         case 1:
            var11 = new com.aspose.slides.internal.u0b.s7(var6).n5(var4);
            break;
         case 2:
            var11 = new com.aspose.slides.internal.u0b.a5(var6).n5(var4);
            break;
         case 3:
            var11 = com.aspose.slides.internal.u0b.v4.n5(var4);
            break;
         case 4:
            var11 = com.aspose.slides.internal.u0b.e9.n5(var4);
            break;
         case 5:
            var11 = new com.aspose.slides.internal.u0b.d5(null, var13, var6).n5(var4);
            break;
         case 6:
            var11 = com.aspose.slides.internal.u0b.c4.n5(var4);
            break;
         case 7:
            var11 = s0.n5(var4);
            break;
         case 8:
            var11 = com.aspose.slides.internal.u0b.d2.n5(var4);
            break;
         case 9:
            var11 = com.aspose.slides.internal.u0b.m3.n5(var4);
            break;
         default:
            throw new com.aspose.slides.internal.e2o.n5(d1.n5(new String[]{"Unknown object type: ", com.aspose.slides.ms.System.a3.l6(var3.u9())}));
      }

      var3.n5(var11);
      int var12 = (int)(var2.getPosition() - var9);
      if (var12 > var13) {
         throw new com.aspose.slides.internal.e2o.n5("Stream position is out of object bounds.");
      }

      com.aspose.slides.internal.f8y.n5.l6(
         var13 - var12 > 4,
         d1.n5(new String[]{
            j8.n5(this).s7(),
            " Unparsed data remains in the stream. PartialSize = ",
            com.aspose.slides.ms.System.a3.l6(var13),
            ", ReadedBytes = ",
            com.aspose.slides.ms.System.a3.l6(var12)
         })
      );
      var3.e2().l6().set_Item(com.aspose.slides.internal.v6g.k5.u3(var3.h0(), 6), var11);
      var1[0] = var3;
      return true;
   }
}
