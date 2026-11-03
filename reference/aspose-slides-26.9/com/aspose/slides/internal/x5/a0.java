package com.aspose.slides.internal.x5;

import com.aspose.slides.internal.i8.j8;

public class a0 extends com.aspose.slides.internal.b4.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.a4.b3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.a4.p8 var3 = new com.aspose.slides.internal.a4.p8(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      byte[] var5 = null;
      if (var3.k5()) {
         var3.k5(var4.m3());
         byte[] var11 = var4.c8(var3.H_() - 4);
         var3.n5(var11);
         if (var3.z1().k5().containsKey(var3.c8() & 255)) {
            byte[] var12 = var3.z1().k5().get_Item(var3.c8() & 255);
            int var13 = var12.length;
            var5 = new byte[var12.length + var11.length];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var12)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, var12.length);
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var11)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), var13, var11.length);
            if (var5.length < var3.t2()) {
               var3.z1().k5().set_Item(var3.c8() & 255, var5);
               var1[0] = var3;
               return true;
            } else if (var5.length == var3.t2()) {
               var3.n5(this.n5(var3.u3(), var5));
               var3.z1().k5().removeItemByKey(var3.c8() & 255);
               var1[0] = var3;
               return true;
            } else {
               throw new com.aspose.slides.internal.p5.n5("Object reading error. Was read more bytes than the object size.");
            }
         } else if (var11.length < var3.t2()) {
            var3.z1().k5().addItem(var3.c8() & 255, var11);
            var1[0] = var3;
            return true;
         } else if (var11.length == var3.t2()) {
            var3.n5(this.n5(var3.u3(), var11));
            var1[0] = var3;
            return true;
         } else {
            throw new com.aspose.slides.internal.p5.n5("Object reading error. Was read more bytes than the object size.");
         }
      } else {
         byte[] var6 = var4.c8(var3.H_());
         if (var3.z1().k5().containsKey(var3.c8() & 255)) {
            byte[] var7 = var3.z1().k5().get_Item(var3.c8() & 255);
            int var8 = var7.length;
            var5 = new byte[var8 + var3.H_()];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, var7.length);
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), var8, var6.length);
            var3.z1().k5().removeItemByKey(var3.c8() & 255);
         } else {
            var5 = var6;
         }

         var3.n5(this.n5(var3.u3(), var5));
         var1[0] = var3;
         return true;
      }
   }

   private com.aspose.slides.internal.i0.f2 n5(byte var1, byte[] var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(new com.aspose.slides.internal.z0k.e2(var2));
      com.aspose.slides.internal.i0.f2 var4;
      switch (var1) {
         case 0:
            throw new com.aspose.slides.internal.p5.n5("The object is not a valid object.");
         case 1:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.s7(var2.length).n5(var3);
            break;
         case 2:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.a5(var2.length).n5(var3);
            break;
         case 3:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.v4().n5(var3);
            break;
         case 4:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.j9().n5(var3);
            break;
         case 5:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.d2().n5(var3);
            break;
         case 6:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.c4().n5(var3);
            break;
         case 7:
            var4 = (com.aspose.slides.internal.i0.f2)new j8().n5(var3);
            break;
         case 8:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.a0().n5(var3);
            break;
         case 9:
            var4 = (com.aspose.slides.internal.i0.f2)new com.aspose.slides.internal.i8.m3().n5(var3);
            break;
         default:
            throw new com.aspose.slides.internal.p5.n5("Unknown object type: " + (var1 & 0xFF));
      }

      return var4;
   }
}
