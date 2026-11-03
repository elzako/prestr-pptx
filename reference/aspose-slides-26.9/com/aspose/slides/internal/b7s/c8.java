package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.d1;

public class c8 {
   private final com.aspose.slides.internal.z0k.e2 n5 = new com.aspose.slides.internal.z0k.e2();

   public final com.aspose.slides.internal.z0k.e2 n5() {
      return this.n5;
   }

   public static void n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.z0k.t4 var1) {
      var0.seek(0L, 0);
      long var2 = com.aspose.slides.internal.n5p.h0.n5((int)var0.getLength(), 65515);

      for (int var4 = 1; var4 <= var2; var4++) {
         var1.writeByte((byte)-1);
         var1.writeByte((byte)-30);
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

         try {
            byte[] var6 = new byte[65515];
            int var7 = var0.read(var6, 0, var6.length);
            byte[] var8 = new byte[]{73, 67, 67, 95, 80, 82, 79, 70, 73, 76, 69, 0};
            var5.write(var8, 0, var8.length);
            var5.writeByte((byte)var4);
            var5.writeByte((byte)var2);
            var5.write(var6, 0, var7);
            int var9 = (int)var5.getLength() + 2;
            var1.writeByte((byte)(var9 >> 8 & 0xFF));
            var1.writeByte((byte)(var9 & 0xFF));
            var1.write(var5.toArray(), 0, (int)var5.getLength());
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      }
   }

   public final void n5(h2 var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      var1.n5(var3);
      var2 = var3[0];
      var2 -= 2;
      int var4 = var2;
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      while (var4 > 0) {
         byte[] var6 = new byte[var2];
         if (!var1.u3()) {
            throw new com.aspose.slides.internal.z3b.k5("Cannot parse file.", new com.aspose.slides.internal.z3b.a6("Not enough data in stream."));
         }

         int var7 = var1.n5(var6, 0, var4);
         var5.write(var6, 0, var7);
         var4 -= var7;
      }

      var5.seek(0L, 0);
      byte[] var10 = new byte[12];
      var5.read(var10, 0, var10.length);
      String var11 = com.aspose.slides.internal.l7h.j5.e2().l6(var10, 0, var10.length);
      if (d1.l6(var11, "ICC_PROFILE")) {
         var5.readByte();
         var5.readByte();
         this.n5.write(var5.getBuffer(), (int)var5.getPosition(), (int)(var5.getLength() - var5.getPosition()));
      }
   }
}
