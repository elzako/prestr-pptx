package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.o8m.i1;
import com.aspose.slides.ms.System.e5;

public class n5 extends r4 implements i1 {
   private byte[] n5;
   private byte[] l6 = new byte[256];
   private byte n3;
   private byte y4;
   private boolean e2 = false;

   @Override
   protected void finalize() throws Throwable {
      this.n5(true);
      super.finalize();
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.e2) {
         this.n3 = 0;
         this.y4 = 0;
         if (this.n5 != null) {
            com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.n5.length);
            this.n5 = null;
         }

         com.aspose.slides.ms.System.u3.n5(this.l6, 0, this.l6.length);
         this.l6 = null;
         e5.n5(this);
         this.e2 = true;
      }
   }

   @Override
   public byte[] u3() {
      if (this.u9 == null) {
         this.n5();
      }

      return (byte[])this.u9.clone();
   }

   @Override
   public void k5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Key");
      }

      this.u9 = this.n5 = (byte[])var1.clone();
      this.n5(this.n5);
   }

   @Override
   public boolean as_() {
      return false;
   }

   @Override
   public i1 n5(byte[] var1, byte[] var2) {
      this.k5(var1);
      return this;
   }

   @Override
   public i1 l6(byte[] var1, byte[] var2) {
      this.k5(var1);
      return this.t9();
   }

   @Override
   public void l6() {
      this.u3(new byte[0]);
   }

   @Override
   public void n5() {
      this.u9 = t4.n5(this.a6 >> 3);
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public int at_() {
      return 1;
   }

   @Override
   public int au_() {
      return 1;
   }

   private void n5(byte[] var1) {
      byte var2 = 0;
      byte var3 = 0;

      for (int var4 = 0; var4 < 256; var4++) {
         this.l6[var4] = com.aspose.slides.internal.v6g.k5.n5((Object)(var4), 9);
      }

      this.n3 = 0;
      this.y4 = 0;

      for (int var6 = 0; var6 < 256; var6++) {
         var3 = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[com.aspose.slides.internal.v6g.k5.u3(var2, 6)], 6)
               + com.aspose.slides.internal.v6g.k5.u3(this.l6[var6], 6)
               + com.aspose.slides.internal.v6g.k5.u3(var3, 6)),
            9
         );
         byte var5 = this.l6[var6];
         this.l6[var6] = this.l6[com.aspose.slides.internal.v6g.k5.u3(var3, 6)];
         this.l6[com.aspose.slides.internal.v6g.k5.u3(var3, 6)] = var5;
         var2 = com.aspose.slides.internal.v6g.k5.n5((Object)((com.aspose.slides.internal.v6g.k5.u3(var2, 6) + 1) % var1.length), 9);
      }
   }

   private void l6(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("inputOffset", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("inputCount", "< 0");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("inputBuffer", "Overflow");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      this.l6(var1, var2, var3);
      if (var4 == null) {
         throw new ArgumentNullException("outputBuffer");
      } else if (var5 < 0) {
         throw new ArgumentOutOfRangeException("outputOffset", "< 0");
      } else if (var5 > var4.length - var3) {
         throw new ArgumentException("outputBuffer", "Overflow");
      } else {
         return this.l6(var1, var2, var3, var4, var5);
      }
   }

   private int l6(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      for (int var6 = 0; var6 < var3; var6++) {
         this.n3 = com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(this.n3, 6) + 1), 9);
         this.y4 = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(this.l6[com.aspose.slides.internal.v6g.k5.u3(this.n3, 6)], 6)
               + com.aspose.slides.internal.v6g.k5.u3(this.y4, 6)),
            9
         );
         byte var7 = this.l6[com.aspose.slides.internal.v6g.k5.u3(this.n3, 6)];
         this.l6[com.aspose.slides.internal.v6g.k5.u3(this.n3, 6)] = this.l6[com.aspose.slides.internal.v6g.k5.u3(this.y4, 6)];
         this.l6[com.aspose.slides.internal.v6g.k5.u3(this.y4, 6)] = var7;
         byte var8 = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(this.l6[com.aspose.slides.internal.v6g.k5.u3(this.n3, 6)], 6)
               + com.aspose.slides.internal.v6g.k5.u3(this.l6[com.aspose.slides.internal.v6g.k5.u3(this.y4, 6)], 6)),
            9
         );
         var4[var5 + var6] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + var6], 6)
               ^ com.aspose.slides.internal.v6g.k5.u3(this.l6[com.aspose.slides.internal.v6g.k5.u3(var8, 6)], 6)),
            9
         );
      }

      return var3;
   }

   @Override
   public byte[] n5(byte[] var1, int var2, int var3) {
      this.l6(var1, var2, var3);
      byte[] var4 = new byte[var3];
      this.l6(var1, var2, var3, var4, 0);
      return var4;
   }
}
