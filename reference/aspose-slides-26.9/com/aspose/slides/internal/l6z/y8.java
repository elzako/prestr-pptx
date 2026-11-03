package com.aspose.slides.internal.l6z;

class y8 {
   y8() {
   }

   y8(com.aspose.slides.internal.x1.u9 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var1.l6());

      try {
         com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);

         try {
            this.n5(var3);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.r4();
      if (com.aspose.slides.internal.v6g.k5.k5(var2, 8) != 25036) {
         throw new d1();
      }

      int var3 = var1.r4();
      byte var4 = var1.z1();
      if (com.aspose.slides.internal.v6g.k5.u3(var4, 6) != 0) {
         throw new d1();
      }

      int var5 = var1.r4();
      byte[] var6 = var1.c8(com.aspose.slides.internal.v6g.k5.u3(var1.x8().getLength() - 7L, 11));
   }

   public void n5(com.aspose.slides.internal.x1.u9 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            var3.n5(com.aspose.slides.internal.v6g.k5.k5(25036, 9));
            var3.n5(com.aspose.slides.internal.v6g.k5.k5(65535, 9));
            var3.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(0), 9));
            var3.n5(com.aspose.slides.internal.v6g.k5.k5(0, 9));
            var1.n5(var2.toArray());
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
