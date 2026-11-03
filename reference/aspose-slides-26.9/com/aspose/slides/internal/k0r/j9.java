package com.aspose.slides.internal.k0r;

public class j9 {
   public long n5;
   public byte[] l6;
   public byte[] k5;
   public long u3;
   public byte[] a6;

   public j9() {
   }

   public j9(String var1, long var2) {
      this.n5 = 16L;
      this.l6 = com.aspose.slides.ms.System.o0.l6().n5();
      l3 var4 = new l3(var1, this.l6, var2, true);

      c1 var5;
      try {
         var5 = var4.n5(0L);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      byte[] var6 = com.aspose.slides.ms.System.o0.l6().n5();
      this.k5 = var5.l6(var6);
      this.u3 = 20L;
      com.aspose.slides.internal.o8m.h6 var7 = new com.aspose.slides.internal.o8m.h6();

      try {
         this.a6 = var5.l6(var7.l6(var6));
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   final int n5() {
      return 40 + (int)this.u3;
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6((int)this.n5);
      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.l6((int)this.u3);
      var1.n5(this.a6);
   }

   public static j9 n5(com.aspose.slides.internal.z0k.t4 var0, int var1, boolean var2) {
      j9 var3 = new j9();
      var3.n5 = var2 ? com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L : 16L;
      var3.l6 = com.aspose.slides.internal.n8e.y2.l6(var0, 16);
      var3.k5 = com.aspose.slides.internal.n8e.y2.l6(var0, 16);
      var3.u3 = var2 ? com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L : var1 & 4294967295L;
      var3.a6 = com.aspose.slides.internal.n8e.y2.l6(var0, var1);
      return var3;
   }
}
