package com.aspose.slides.internal.k0r;

class a3 {
   public long n5;
   public long l6;
   public int k5;
   public byte u3;
   public byte a6;
   public long u9;
   public String h0;

   int n5() {
      return 16 + this.h0.length() * 2 + 2;
   }

   void n5(int var1, byte[] var2) {
      com.aspose.slides.internal.n8e.y2.l6(var2, var1 + 0, (int)(this.n5 & 4294967295L));
      com.aspose.slides.internal.n8e.y2.l6(var2, var1 + 4, (int)(this.l6 & 4294967295L));
      com.aspose.slides.internal.n8e.y2.n5(var2, var1 + 8, (short)(this.k5 & 65535));
      var2[var1 + 10] = this.u3;
      var2[var1 + 11] = this.a6;
      com.aspose.slides.internal.l7h.t1 var3 = new com.aspose.slides.internal.l7h.t1();
      byte[] var4 = var3.l6(com.aspose.slides.ms.System.d1.c8(this.h0));
      System.arraycopy(var4, 0, var2, var1 + 16, var4.length);
      com.aspose.slides.internal.n8e.y2.n5(var2, var1 + 16 + var4.length, (short)0);
   }

   public static a3 n5(com.aspose.slides.internal.z0k.t4 var0) {
      a3 var1 = new a3();
      var1.n5 = com.aspose.slides.internal.n8e.y2.l6(var0);
      var1.l6 = com.aspose.slides.internal.n8e.y2.l6(var0);
      var1.k5 = com.aspose.slides.internal.n8e.y2.n5(var0);
      var1.u3 = (byte)var0.readByte();
      var1.a6 = (byte)var0.readByte();
      var1.u9 = com.aspose.slides.internal.n8e.y2.l6(var0);
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      char[] var3 = var2.k5(com.aspose.slides.internal.n8e.y2.l6(var0, (var1.u3 & 255) * 2 + 2), 0, (var1.u3 & 255) * 2 + 2);
      var1.h0 = com.aspose.slides.ms.System.d1.n5(var3, 0, var1.u3 & 255);
      return var1;
   }
}
