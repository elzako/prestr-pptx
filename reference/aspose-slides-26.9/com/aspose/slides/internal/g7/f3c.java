package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.ms.System.IDisposable;

public class f3c implements IDisposable {
   private com.aspose.slides.internal.z0k.t4 n5;
   private z4 l6;

   public f3c(z4 var1) {
      this.n5 = var1.l6();
      this.l6 = var1;
   }

   public final long n5() {
      return this.n5.getPosition();
   }

   public final long l6() {
      return this.n5.getLength();
   }

   public final void n5(long var1) {
      this.n5.seek(var1, 0);
   }

   public final byte k5() {
      int var1 = this.n5.readByte();
      if (var1 == -1) {
         throw new EndOfStreamException();
      } else {
         return (byte)var1;
      }
   }

   public final byte[] n5(int var1) {
      byte[] var2 = new byte[var1];
      this.n5(var1, var2, 0);
      return var2;
   }

   public final void n5(int var1, byte[] var2, int var3) {
      int var4 = this.n5.read(var2, var3, var1);
      if (var4 == -1) {
         throw new EndOfStreamException();
      }
   }

   public final String l6(int var1) {
      byte[] var2 = new byte[var1];
      int var3 = this.n5.read(var2, 0, var1);
      if (var3 != 0 && var3 >= var1) {
         return com.aspose.slides.internal.l7h.j5.e2().l6(var2);
      } else {
         throw new EndOfStreamException();
      }
   }

   public final String n5(int var1, String var2) {
      return this.n5(var1, var2, false);
   }

   public final String n5(int var1, String var2, boolean var3) {
      byte[] var4 = new byte[var1];
      if (var1 != 0) {
         int var5 = this.n5.read(var4, 0, var1);
         if (!var3 && (var5 == 0 || var5 < var1)) {
            throw new EndOfStreamException();
         }
      }

      if ("big5".equals(var2)) {
         byte[] var11 = new byte[var1];
         int var6 = 0;

         for (byte var10 : var4) {
            if ((var10 & 255) != 0) {
               var11[var6++] = var10;
            }
         }

         return z8.n5(var2).l6(var11, 0, var6);
      } else {
         return z8.n5(var2).l6(var4);
      }
   }

   public final com.aspose.slides.ms.System.j5 n5(boolean var1) {
      long var2 = this.s7();
      com.aspose.slides.ms.System.j5 var4 = new com.aspose.slides.ms.System.j5(1904, 1, 1);

      try {
         var4.a6(var2).u3(var4);
      } catch (ArgumentOutOfRangeException var6) {
         if (!var1) {
            throw var6;
         }
      }

      return var4;
   }

   public final float u3() {
      float var1 = 0.0F;
      var1 = this.t2();
      return var1 + (this.n3() & 65535) / 65536;
   }

   public final int a6() {
      return this.n3();
   }

   public final short u9() {
      return this.t2();
   }

   public final byte h0() {
      byte var1 = this.x8();
      return (byte)((var1 & 255) < 127 ? var1 & 0xFF : (var1 & 255) - 256);
   }

   public final double c8() {
      short var1 = this.t2();
      return (var1 >> 14) + (var1 & 16383) / 16384.0;
   }

   public final short t2() {
      int var1 = this.n3();
      return (short)var1;
   }

   public final long s7() {
      byte[] var1 = new byte[8];
      int var2 = this.n5.read(var1, 0, 8);
      if (var2 != 0 && var2 >= 8) {
         return ((long)(var1[0] & 0xFF) << 56)
            + ((long)(var1[1] & 0xFF) << 48)
            + ((long)(var1[2] & 0xFF) << 40)
            + ((long)(var1[3] & 0xFF) << 32)
            + ((long)(var1[4] & 0xFF) << 24)
            + ((long)(var1[5] & 0xFF) << 16)
            + ((long)(var1[6] & 0xFF) << 8)
            + ((long)(var1[7] & 0xFF) << 0);
      } else {
         throw new EndOfStreamException();
      }
   }

   public final byte x8() {
      int var1 = this.n5.readByte();
      if (var1 < 0) {
         throw new EndOfStreamException();
      } else {
         return (byte)var1;
      }
   }

   public final int n3() {
      byte[] var1 = new byte[2];
      int var2 = this.n5.read(var1, 0, 2);
      if (var2 != 0 && var2 >= 2) {
         return ((var1[0] & 0xFF) << 8) + (var1[1] & 0xFF) & 65535;
      } else {
         throw new EndOfStreamException();
      }
   }

   public final long y4() {
      byte[] var1 = new byte[4];
      int var2 = this.n5.read(var1, 0, 4);
      if (var2 != 0 && var2 >= 4) {
         return ((var1[0] & 255) << 24) + ((var1[1] & 255) << 16) + ((var1[2] & 255) << 8) + ((var1[3] & 255) << 0) & 4294967295L;
      } else {
         throw new EndOfStreamException();
      }
   }

   @Override
   public final void dispose() {
      if (this.l6.u3()) {
         this.n5.close();
      }
   }
}
