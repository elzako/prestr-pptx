package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.r1x.p6;
import com.aspose.slides.internal.r1x.v3;

public class t9 {
   private final com.aspose.slides.internal.b8u.k5 n5;
   private final boolean l6;
   private v3 k5;
   private long u3;
   private byte[] a6 = new byte[4];
   private k5 u9;
   private boolean h0;
   private boolean c8 = true;

   public t9(com.aspose.slides.internal.b8u.k5 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final p6 n5(byte[] var1, int var2, int var3) {
      com.aspose.slides.internal.r1x.u9 var4 = this.n5.u9().n5();
      if (var4.k5 != 0) {
         p6 var5 = new p6();
         var5.n5 = false;
         var5.k5 = var4.u3;
         return var5;
      }

      this.k5 = new v3(new com.aspose.slides.internal.z0k.e2(var4.n5, 0, var4.l6), true);

      try {
         this.u9 = new k5(this.k5);
         this.u9.l6();
         return this.l6 ? this.l6(var1, var2, var3) : this.k5(var1, var2, var3);
      } finally {
         if (this.k5 != null) {
            this.k5.dispose();
         }
      }
   }

   private p6 l6(byte[] var1, int var2, int var3) {
      this.u3 = 1L;
      int var4 = this.k5.n5(this.a6, 0, 2);
      if (var4 != 2) {
         throw new EndOfStreamException("Can't read the header bytes.");
      }

      int var5 = this.a6[0] & 255;
      int var6 = (byte)(var5 & 15);
      byte var7 = (byte)((var5 & 240) >> 4);
      int var8 = this.a6[1] & 255;
      byte var9 = (byte)((var8 & 16) >> 4);
      int var10 = (var5 << 8 | var8) % 31;
      if (var10 != 0) {
         throw new com.aspose.slides.internal.r1q.n5("Check bits for CMF and FLG error");
      }

      this.h0 = (var9 & 255) > 0;
      if (this.h0 && !this.c8) {
         throw new NotSupportedException("Preset dictionary not supported.");
      }

      p6 var11 = new p6();
      switch (var6 & 0xFF) {
         case 8:
            if ((var7 & 255) > 7) {
               throw new com.aspose.slides.internal.r1q.n5("Window size value must be less than or equal to 7.");
            } else {
               int var12 = this.u9.n5(var1, var2, var3 - var2);
               if (this.u9.n5()) {
                  this.u3 = com.aspose.slides.internal.g3j.n5.n5(this.u3, var1, var2, var12);
                  var11.l6 = var12 - var2;
                  var4 = this.k5.n5(this.a6, 0, 4);
                  if (var4 != 4) {
                     throw new EndOfStreamException("Can't read the Adler-32 checksum bytes.");
                  }

                  boolean var13 = (this.u3 & 4294967295L & 255L & 4294967295L) == (this.a6[3] & 0xFF)
                     && ((this.u3 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L) == (this.a6[2] & 0xFF)
                     && ((this.u3 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L) == (this.a6[1] & 0xFF)
                     && ((this.u3 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L) == (this.a6[0] & 0xFF);
                  if (!var13) {
                     throw new com.aspose.slides.internal.r1q.n5("Incorrect checksum.");
                  }

                  var11.n5 = true;
               } else {
                  var11.n5 = false;
               }

               return var11;
            }
         case 15:
            throw new NotSupportedException("CM (Compression method) = 15 is reserved.");
         default:
            throw new com.aspose.slides.internal.r1q.n5("Unknown compression method.");
      }
   }

   private p6 k5(byte[] var1, int var2, int var3) {
      p6 var4 = new p6();
      var4.l6 = this.u9.n5(var1, var2, var3 - var2);
      var4.n5 = true;
      return var4;
   }
}
