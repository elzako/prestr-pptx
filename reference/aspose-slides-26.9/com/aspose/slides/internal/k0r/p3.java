package com.aspose.slides.internal.k0r;

class p3 {
   public long n5;
   public long l6;
   public byte[] k5;
   public long u3;
   public a3[] a6;

   int n5() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.a6.length; var2++) {
         var1 += this.a6[var2].n5();
      }

      return 8 + this.k5.length + 4 + var1;
   }

   byte[] n5(l3 var1) {
      byte[] var2 = new byte[this.n5()];
      byte[] var3 = new byte[8];
      com.aspose.slides.internal.n8e.y2.l6(var3, 0, (int)(this.n5 & 4294967295L));
      com.aspose.slides.internal.n8e.y2.l6(var3, 4, (int)(this.l6 & 4294967295L));
      c1 var4 = var1.n5(0L);
      byte[] var5 = var4.l6(var3);
      System.arraycopy(var5, 0, var2, 0, var5.length);
      System.arraycopy(this.k5, 0, var2, 8, this.k5.length);
      var3 = new byte[(int)(this.l6 & 4294967295L)];
      com.aspose.slides.internal.n8e.y2.l6(var3, 0, (int)(this.u3 & 4294967295L));
      int var7 = 0;
      int var9 = 4;

      while (var7 < this.a6.length) {
         this.a6[var7].n5(var9, var3);
         var9 += this.a6[var7].n5();
         var7++;
      }

      var4 = var1.n5(0L);
      var5 = var4.l6(var3);
      System.arraycopy(var5, 0, var2, 8 + this.k5.length, var5.length);
      return var2;
   }

   public static p3 n5(com.aspose.slides.internal.z0k.t4 var0, l3 var1) {
      p3 var2 = new p3();
      c1 var3 = var1.n5(0L);
      byte[] var4 = com.aspose.slides.internal.n8e.y2.l6(var0, 8);
      byte[] var5 = var3.n5(var4);
      var2.n5 = com.aspose.slides.ms.System.x8.l6(var5, 0);
      var2.l6 = com.aspose.slides.ms.System.x8.l6(var5, 4);
      long var6 = (var2.n5 & 4294967295L) - 8L;
      var2.k5 = com.aspose.slides.internal.n8e.y2.l6(var0, (int)(var6 & 4294967295L));
      c1 var8 = var1.n5(0L);
      byte[] var9 = com.aspose.slides.internal.n8e.y2.l6(var0, (int)(var2.l6 & 4294967295L));
      var5 = var8.n5(var9);
      com.aspose.slides.internal.z0k.e2 var18 = new com.aspose.slides.internal.z0k.e2(var5);

      try {
         var2.u3 = com.aspose.slides.internal.n8e.y2.l6(var18);
         var2.a6 = new a3[(int)(var2.u3 & 4294967295L)];
         long var10 = 8L;

         for (int var12 = 0; var12 != (var2.u3 & 4294967295L); var12++) {
            a3 var13 = a3.n5(var18);
            var10 = (var10 & 4294967295L) + (var13.l6 & 4294967295L);
            var2.a6[var12] = var13;
         }
      } finally {
         if (var18 != null) {
            var18.dispose();
         }
      }

      return var2;
   }

   public byte[] n5(l3 var1, long var2) {
      a3 var4 = this.a6[(int)var2];
      byte[] var5 = new byte[(int)(var4.l6 & 4294967295L)];
      System.arraycopy(this.k5, (int)(var4.n5 & 4294967295L) - 8, var5, 0, (int)(var4.l6 & 4294967295L));
      c1 var6 = var1.n5(var2);
      return var6.n5(var5);
   }
}
