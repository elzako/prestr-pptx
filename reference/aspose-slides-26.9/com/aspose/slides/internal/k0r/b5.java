package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentException;

public class b5 {
   private final int n5;
   private final byte l6;

   public static b5 n5(int var0) {
      int var1 = (var0 & 65535) >> 13;
      int var2 = (var0 & 65535) >> 8 & 31;
      if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(u8.class), var1)) {
         throw new ArgumentException("Unknown path type.", "data");
      }

      if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(y5.class), var2)) {
         throw new ArgumentException("Unknown path escape", "data");
      }

      int var3 = var1;
      int var4 = var2;
      byte var5 = (byte)(var0 & 65535 & 0xFF);
      return var3 != 5 && var3 != 6 ? new b5(var3, var5) : new k8(var3, var4, var5);
   }

   public b5(int var1, byte var2) {
      if (var1 != 5 && var1 != 6) {
         this.n5 = var1;
         this.l6 = var2;
      } else {
         throw new ArgumentException("Path type can't be Escape (0x5) and ClientEscape (0x6) in MSPATHINFO structure.", "type");
      }
   }

   public final byte k5() {
      return this.l6;
   }

   public final int u3() {
      return this.n5;
   }

   public int l6() {
      int var1 = com.aspose.slides.internal.n8e.v4.n5((this.u3() & 7) << 13);
      return com.aspose.slides.internal.n8e.v4.n5(var1 & 65535 | this.k5() & 0xFF & 0xFF);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "EsPathInfoStructure: Type: {0}, Segments: {1}.",new Object[]{
         com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(u8.class), this.u3()),
         this.k5()
      });
   }

   protected b5(int var1, byte var2, boolean var3) {
      this.n5 = var1;
      this.l6 = var2;
   }
}
