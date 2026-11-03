package com.aspose.slides.internal.y6;

import com.aspose.slides.internal.k1.e2;
import com.aspose.slides.internal.k1.t9;

public class k5 {
   private com.aspose.slides.internal.o9b.c8[] n5;
   private byte[] l6;

   public k5(com.aspose.slides.internal.o9b.c8[] var1) {
      this.n5 = var1;
      this.l6 = new byte[var1.length];
   }

   public k5(com.aspose.slides.internal.o9b.c8[] var1, byte[] var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public k5(com.aspose.slides.internal.o9b.c8[] var1, byte[] var2, int var3) {
      if (var3 >= var1.length) {
         this.n5 = var1;
         this.l6 = var2;
      } else {
         com.aspose.slides.internal.o9b.c8[] var4 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var3)
         );
         byte[] var5 = new byte[var3];

         for (int var6 = 0; var6 < var3; var6++) {
            var1[var6].n5(var4[var6]);
            var5[var6] = var2[var6];
         }

         this.n5 = var4;
         this.l6 = var5;
      }
   }

   public final byte[] n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8[] l6() {
      return this.n5;
   }

   public final int k5() {
      return this.n5.length;
   }

   public static k5 n5(e2 var0) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.o9b.c8[] var1 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var0.l6())
      );
      byte[] var2 = new byte[var0.l6()];

      for (int var3 = 0; var3 < (var0.l6() & 65535); var3++) {
         t9 var4 = var0.k5()[var3];
         var4.u9().n5(var1[var3]);
         var2[var3] = var4.n5();
      }

      return new k5(var1, var2);
   }

   public static k5 n5(com.aspose.slides.internal.t5.e2 var0) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.o9b.c8[] var1 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var0.l6())
      );
      byte[] var2 = new byte[var0.l6()];

      for (int var3 = 0; var3 < (var0.l6() & 65535); var3++) {
         com.aspose.slides.internal.o9b.c8.n5(var0.u3()[var3].u9()).n5(var1[var3]);
      }

      return new k5(var1);
   }
}
