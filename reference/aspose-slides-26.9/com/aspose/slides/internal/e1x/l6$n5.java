package com.aspose.slides.internal.e1x;

class l6$n5 {
   public int n5;
   public int l6;
   public byte[] k5;
   public long u3;
   public com.aspose.slides.internal.v3s.u9 a6;

   public l6$n5(int var1, int var2, f0 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.a6 = new com.aspose.slides.internal.v3s.u3(var1, var2, var3);
   }

   public final void n5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.n2d.u3 var2 = new com.aspose.slides.internal.n2d.u3(var1);
         this.a6.n5(var2);
         var1.flush();
         var1.setPosition(0L);
         this.k5 = var1.toArray();
         this.u3 = this.k5.length & 4294967295L;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
