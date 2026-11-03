package com.aspose.slides.internal.k0r;

import com.aspose.slides.internal.DOMResourcesUtils;

public class g1 extends l8 {
   com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private byte[] l6;

   public g1() {
      super(61468, (byte)0);
   }

   @Override
   public byte[] k5() {
      if (this.l6 == null) {
         com.aspose.slides.internal.z0k.t4 var1 = DOMResourcesUtils.getResourceStream("resources", "NotSupported.emf");
         com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

         try {
            byte[] var3 = new byte[4096];

            while (true) {
               int var4 = var1.read(var3, 0, var3.length);
               if (var4 <= 0) {
                  this.l6 = var2.toArray();
                  break;
               }

               var2.write(var3, 0, var4);
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }

      return this.l6;
   }

   @Override
   public int n5() {
      int var1 = 16 + this.c8().length;
      if ((this.w1().k5() & 1) > 0) {
         var1 += 16;
      }

      return var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(l6(var1).k5());
      int var2 = this.w1().a6() - 16;
      if ((this.w1().k5() & 1) > 0) {
         l6(var1).k5(this.n5);
         var2 -= 16;
      }

      this.n5(var1.c8(var2));
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.h0().n5());
      if ((this.w1().k5() & 1) > 0) {
         var1.n5(this.n5.n5());
      }

      var1.n5(this.c8());
   }
}
