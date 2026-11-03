package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.ms.System.IDisposable;

class a5 implements IDisposable {
   private com.aspose.slides.internal.z0k.t4 n5;
   private z4 l6;
   private long k5;

   public a5(z4 var1, long var2) {
      this.n5 = var1.l6();
      this.l6 = var1;
      this.k5 = var2;
      this.n5(0L);
   }

   public final com.aspose.slides.internal.z0k.t4 n5() {
      return this.n5;
   }

   public final long l6() {
      return this.n5.getPosition();
   }

   public final void n5(long var1) {
      this.n5.seek(var1 + this.k5, 0);
   }

   public final byte k5() {
      int var1 = this.n5.readByte();
      if (var1 == -1) {
         throw new EndOfStreamException();
      } else {
         return (byte)var1;
      }
   }

   public final int u3() {
      byte[] var1 = new byte[2];
      int var2 = this.n5.read(var1, 0, 2);
      if (var2 != 0 && var2 >= 2) {
         return com.aspose.slides.internal.v6g.k5.k5(
            (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var1[1], 6), 9
         );
      } else {
         throw new EndOfStreamException();
      }
   }

   public final int a6() {
      byte[] var1 = new byte[2];
      int var2 = this.n5.read(var1, 0, 2);
      if (var2 != 0 && var2 >= 2) {
         return com.aspose.slides.internal.v6g.k5.k5(
            (com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var1[1], 6), 9
         );
      } else {
         throw new EndOfStreamException();
      }
   }

   public final byte u9() {
      int var1 = this.n5.readByte();
      if (var1 == -1) {
         throw new EndOfStreamException();
      } else {
         return (byte)var1;
      }
   }

   public final int n5(int var1) {
      int var2 = 0;
      int var3 = var1;

      while (var3-- > 0) {
         var2 <<= 8;
         var2 |= com.aspose.slides.internal.v6g.k5.u3(this.k5(), 6);
      }

      return var2;
   }

   public final byte[] l6(int var1) {
      byte[] var2 = new byte[var1];
      int var3 = this.n5().read(var2, 0, var1);
      if (var3 != var1) {
         byte[] var4 = new byte[var3];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), com.aspose.slides.ms.System.u3.n5((Object)(var4)), var3);
         return var4;
      } else {
         return var2;
      }
   }

   @Override
   public final void dispose() {
      if (this.l6.u3()) {
         this.n5.close();
      }
   }
}
