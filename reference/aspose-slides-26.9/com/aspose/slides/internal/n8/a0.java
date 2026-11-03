package com.aspose.slides.internal.n8;

import com.aspose.slides.ms.System.d1;

public class a0 extends com.aspose.slides.internal.o8.l6 {
   @Override
   public void l6(com.aspose.slides.internal.a4.b3 var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.a4.p8 var3 = (com.aspose.slides.internal.a4.p8)var1;
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var2);
      Object var5 = null;
      if (var3.k5()) {
         var4.l6(var3.t2());
         var4.n5(var3.x8());
      } else {
         int var6 = var3.H_();
         int var7 = var6;
         long var8 = var2.getPosition();
         switch (var3.u3()) {
            case 0:
               throw new com.aspose.slides.internal.p5.n5("The object is not a valid object.");
            case 1:
               new com.aspose.slides.internal.t0.c8(var7).n5(var3.s7(), var4);
               break;
            case 2:
               new com.aspose.slides.internal.t0.i1(var7).n5(var3.s7(), var4);
               break;
            case 3:
               new com.aspose.slides.internal.t0.s3().n5(var3.s7(), var4);
               break;
            case 4:
               new com.aspose.slides.internal.t0.t1().n5(var3.s7(), var4);
               break;
            case 5:
               new com.aspose.slides.internal.t0.j5((com.aspose.slides.internal.i0.o0)var5, var6, var7).n5(var3.s7(), var4);
               break;
            case 6:
               new com.aspose.slides.internal.t0.k7().n5(var3.s7(), var4);
               break;
            case 7:
               new com.aspose.slides.internal.t0.v0().n5(var3.s7(), var4);
               break;
            case 8:
               new com.aspose.slides.internal.t0.z8().n5(var3.s7(), var4);
               break;
            case 9:
               new com.aspose.slides.internal.t0.z1().n5(var3.s7(), var4);
               break;
            default:
               throw new com.aspose.slides.internal.p5.n5("Unknown object type: " + (var3.u3() & 0xFF));
         }

         int var10 = (int)(var2.getPosition() - var8);
         if (var10 > var6) {
            throw new com.aspose.slides.internal.p5.n5("Stream position is out of object bounds.");
         }

         if (var6 - var10 > 4) {
            com.aspose.slides.internal.f8y.n5.u3(d1.n5(new String[]{"Unparsed data remains in the stream. Count=", com.aspose.slides.ms.System.a3.l6(var6 - var10)}));
         }
      }
   }
}
