package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentNullException;

public class u0 {
   private q4 n5;
   private byte[] l6 = new byte[]{0, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70};

   public u0() {
      this.n5(new q4());
   }

   public u0(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var1);

      try {
         this.n5(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final q4 n5() {
      return this.n5;
   }

   public final void n5(q4 var1) {
      this.n5 = var1;
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.x1.x8 var2 = new com.aspose.slides.internal.x1.x8(var1);
      com.aspose.slides.internal.x1.u9 var3 = (com.aspose.slides.internal.x1.u9)var2.n5().u3("\u0001Ole");
      if (var3 != null) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3.n5());

         try {
            com.aspose.slides.internal.z0k.n5 var5 = new com.aspose.slides.internal.z0k.n5(var4);

            try {
               this.n5 = new q4(var5);
            } catch (d8 var15) {
               com.aspose.slides.internal.n8e.v4.n5(var15);
               this.n5 = null;
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }
   }

   public final void l6(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.x1.x8 var2 = new com.aspose.slides.internal.x1.x8();
      if (this.n5() != null) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var3);

            try {
               this.n5().n5(var4);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }

            var3.flush();
            com.aspose.slides.internal.x1.u9 var5 = new com.aspose.slides.internal.x1.u9("\u0001Ole");
            var5.n5(var3.toArray());
            var5.l6(com.aspose.slides.ms.System.o0.n5.n5());
            var2.n5().a6(var5);
            var2.n5().l6(this.l6);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }

      var2.l6(var1);
   }
}
