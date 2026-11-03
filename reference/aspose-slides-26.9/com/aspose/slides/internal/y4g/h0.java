package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

abstract class h0 {
   private static com.aspose.slides.internal.r5t.k5 k5 = new com.aspose.slides.internal.r5t.k5(true);
   protected com.aspose.slides.internal.z0k.t4 n5;
   protected v8 l6;

   public v8 n5() {
      return this.l6;
   }

   public h0(com.aspose.slides.internal.z0k.t4 var1, v8 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.l6.n5(this);
   }

   protected abstract void n5(h2 var1);

   protected void l6() {
      v8 var1 = this.n5();
      var1.l6(0L);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, z6.class)) {
         var1.u9(true);
      } else {
         var1.a6(false);
      }
   }

   public com.aspose.slides.internal.n4m.n5 n5(byte var1) {
      throw new NotSupportedException();
   }

   public com.aspose.slides.ms.System.z7 n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.ms.System.h0 var2, Object var3) {
      if (this.l6.t9()) {
         throw new n5((byte)80, "The session is finished and it's no longer valid.");
      }

      k5.n5();
      byte[] var4 = new byte[1];
      h0$n5 var5 = new h0$n5(var2, var3, var4, var1);
      var1.beginRead(var5.u9(), 0, var5.u9().length, new c8(this), var5);
      return var5;
   }

   private void u3(com.aspose.slides.ms.System.z7 var1) {
      h0$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), h0$n5.class);
      com.aspose.slides.internal.z0k.t4 var3 = var2.u3();

      try {
         int var4 = var2.u3().endRead(var1);
         if (var4 == 0) {
            var2.n5(com.aspose.slides.internal.v6g.k5.k5(null, byte[].class));
            return;
         }

         int var5 = com.aspose.slides.internal.v6g.k5.u3(var2.u9()[0], 6);
         this.l6.n5((byte)1);
         byte var6 = (byte)var5;
         byte[] var7 = this.n5(var5, var3);
         if (var7 == null) {
            var2.n5(com.aspose.slides.internal.v6g.k5.k5(null, byte[].class));
            return;
         }

         if ((var6 != 21 || var7.length != 2) && this.n5().f2() != null && this.n5().f2().n5() != null) {
            var7 = this.u3(var6, var7);
         }

         switch (var6) {
            case -128:
               this.l6.q0().n5(var7);
               break;
            case 20:
               this.l6();
               break;
            case 21:
               this.l6(com.aspose.slides.internal.v6g.k5.n5((Object)(var7[0]), (int)(6)), com.aspose.slides.internal.v6g.k5.n5((Object)(var7[1]), (int)(6)));
               if (var3.canSeek()) {
                  var3.setLength(0L);
               }

               var7 = null;
               break;
            case 22:
               h2 var8 = new h2(var7);

               while (!var8.n5()) {
                  this.n5(var8);
               }
            case 23:
               break;
            default:
               throw new n5((byte)10, "Unknown record received from server.");
         }

         var2.n5(var7);
      } catch (Exception var9) {
         var2.n5(var9);
      }
   }

   public byte[] n5(com.aspose.slides.ms.System.z7 var1) {
      h0$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0$n5.class);
      if (null == var2) {
         throw new ArgumentException("Either the provided async result is null or was not created by this RecordProtocol.");
      }

      if (!var2.k5()) {
         var2.l6().a6();
      }

      if (var2.c8()) {
         throw var2.h0();
      }

      byte[] var3 = var2.a6();
      k5.l6();
      return var3;
   }

   public byte[] n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.l6.t9()) {
         throw new n5((byte)80, "The session is finished and it's no longer valid.");
      }

      k5.n5();
      byte[] var2 = new byte[1];
      int var3 = var1.read(var2, 0, var2.length);
      if (var3 == 0) {
         return null;
      }

      int var4 = com.aspose.slides.internal.v6g.k5.u3(var2[0], 6);
      this.l6.n5((byte)1);
      byte var5 = (byte)var4;
      byte[] var6 = this.n5(var4, var1);
      if (var6 == null) {
         return null;
      }

      if ((var5 != 21 || var6.length != 2) && this.n5().f2() != null && this.n5().f2().n5() != null) {
         var6 = this.u3(var5, var6);
      }

      switch (var5) {
         case -128:
            this.l6.q0().n5(var6);
            break;
         case 20:
            this.l6();
            break;
         case 21:
            this.l6(com.aspose.slides.internal.v6g.k5.n5((Object)(var6[0]), 6), com.aspose.slides.internal.v6g.k5.n5((Object)(var6[1]), 6));
            if (var1.canSeek()) {
               var1.setLength(0L);
            }

            var6 = null;
            break;
         case 22:
            h2 var7 = new h2(var6);

            while (!var7.n5()) {
               this.n5(var7);
            }
         case 23:
            break;
         default:
            throw new n5((byte)10, "Unknown record received from server.");
      }

      k5.l6();
      return var6;
   }

   private byte[] n5(int var1, com.aspose.slides.internal.z0k.t4 var2) {
      switch (var1) {
         case 128:
            return this.k5(var2);
         default:
            if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(w2.class), com.aspose.slides.internal.v6g.k5.n5((byte)var1))) {
               throw new n5((byte)50);
            } else {
               return this.u3(var2);
            }
      }
   }

   private byte[] k5(com.aspose.slides.internal.z0k.t4 var1) {
      int var2 = var1.readByte();
      if (var1.canSeek() && var2 + 1 > var1.getLength()) {
         return null;
      }

      byte[] var3 = new byte[var2];
      var1.read(var3, 0, var2);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var3[0], 6);
      if (var4 != 1) {
         throw new n5((byte)50);
      }

      int var5 = com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var3[2], 6);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(var3[3], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var3[4], 6);
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var3[5], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var3[6], 6);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var3[7], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var3[8], 6);
      int var9 = var8 > 32 ? 32 : var8;
      byte[] var10 = new byte[var6];
      com.aspose.slides.ms.System.y4.n5(var3, 9, var10, 0, var6);
      byte[] var11 = new byte[var7];
      com.aspose.slides.ms.System.y4.n5(var3, 9 + var6, var11, 0, var7);
      byte[] var12 = new byte[var8];
      com.aspose.slides.ms.System.y4.n5(var3, 9 + var6 + var7, var12, 0, var8);
      if (var8 >= 16 && var6 != 0 && var6 % 3 == 0) {
         if (var11.length > 0) {
            this.l6.n5(var11);
         }

         this.n5().k5(com.aspose.slides.internal.v6g.k5.l6(var5, 9));
         this.n5(this.n5().u9(), var10);
         this.l6.l6(new byte[32]);
         com.aspose.slides.ms.System.y4.n5(var12, var12.length - var9, this.l6.k7(), 32 - var9, var9);
         this.l6.n5((byte)1);
         this.l6.l6(true);
         return var3;
      } else {
         throw new n5((byte)50);
      }
   }

   private byte[] u3(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = new byte[4];
      if (var1.read(var2, 0, 4) != 4) {
         throw new n5("buffer underrun");
      }

      short var3 = com.aspose.slides.internal.v6g.k5.l6(
         com.aspose.slides.internal.v6g.k5.u3(var2[0], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var2[1], 6), 9
      );
      short var4 = com.aspose.slides.internal.v6g.k5.l6(
         com.aspose.slides.internal.v6g.k5.u3(var2[2], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var2[3], 6), 9
      );
      if (var1.canSeek() && var4 + 5 > var1.getLength()) {
         return null;
      }

      int var5 = 0;
      byte[] var6 = new byte[var4];

      while (var5 != var4) {
         int var7 = var1.read(var6, var5, var6.length - var5);
         if (0 == var7) {
            throw new n5((byte)0, "Received 0 bytes from stream. It must be closed.");
         }

         var5 += var7;
      }

      if (var3 != this.l6.c8() && this.l6.a6()) {
         throw new n5((byte)70, "Invalid protocol version on message received");
      } else {
         return var6;
      }
   }

   private void l6(byte var1, byte var2) {
      switch (var1) {
         case 1:
         default:
            switch (var2) {
               case 0:
                  this.l6.k5(true);
               default:
                  return;
            }
         case 2:
            throw new n5(var1, var2);
      }
   }

   public void l6(byte var1) {
      this.n5(new l6(var1));
   }

   public void n5(byte var1, byte var2) {
      this.n5(new l6(var1, var2));
   }

   public void n5(l6 var1) {
      byte var2;
      byte var3;
      boolean var4;
      if (var1 == null) {
         var2 = 2;
         var3 = 80;
         var4 = true;
      } else {
         var2 = var1.n5();
         var3 = var1.l6();
         var4 = var1.u3();
      }

      this.n5((byte)21, new byte[]{var2, var3});
      if (var4) {
         this.l6.u3(true);
      }
   }

   public void l6(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = this.l6((byte)20, new byte[]{1});
      var1.write(var2, 0, var2.length);
      v8 var3 = this.l6;
      var3.n5(0L);
      if (com.aspose.slides.internal.v6g.k5.l6(var3, z6.class)) {
         var3.a6(true);
      } else {
         var3.u9(false);
      }
   }

   public com.aspose.slides.ms.System.z7 n5(com.aspose.slides.ms.System.h0 var1, Object var2) {
      return this.n5((byte)20, new byte[]{1}, var1, var2);
   }

   public void l6(com.aspose.slides.ms.System.z7 var1) {
      this.k5(var1);
      v8 var2 = this.l6;
      var2.n5(0L);
      if (com.aspose.slides.internal.v6g.k5.l6(var2, z6.class)) {
         var2.a6(true);
      } else {
         var2.u9(false);
      }
   }

   public com.aspose.slides.ms.System.z7 n5(byte var1, com.aspose.slides.ms.System.h0 var2, Object var3) {
      com.aspose.slides.internal.n4m.n5 var4 = this.n5(var1);
      var4.e2();
      h0$l6 var5 = new h0$l6(var2, var3, var4);
      this.n5(var4.y4(), var4.t9(), new t2(this), var5);
      return var5;
   }

   private void a6(com.aspose.slides.ms.System.z7 var1) {
      h0$l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), h0$l6.class);

      try {
         this.k5(var1);
         var2.u3().c8();
         var2.u3().a6();
         var2.h0();
      } catch (Exception var4) {
         var2.n5(var4);
      }
   }

   public com.aspose.slides.ms.System.z7 n5(byte var1, byte[] var2, com.aspose.slides.ms.System.h0 var3, Object var4) {
      if (this.l6.z1()) {
         throw new n5((byte)80, "The session is finished and it's no longer valid.");
      }

      byte[] var5 = this.l6(var1, var2);
      return this.n5.beginWrite(var5, 0, var5.length, var3, var4);
   }

   public void k5(com.aspose.slides.ms.System.z7 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, h0$l6.class)) {
         h0$l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0$l6.class);
         if (!var2.k5()) {
            var2.l6().a6();
         }

         if (var2.u9()) {
            throw var2.a6();
         }
      } else {
         this.n5.endWrite(var1);
      }
   }

   public void n5(byte var1, byte[] var2) {
      com.aspose.slides.ms.System.z7 var3 = this.n5(var1, var2, null, null);
      this.k5(var3);
   }

   public byte[] l6(byte var1, byte[] var2) {
      return this.n5(var1, var2, 0, var2.length);
   }

   public byte[] n5(byte var1, byte[] var2, int var3, int var4) {
      if (this.l6.z1()) {
         throw new n5((byte)80, "The session is finished and it's no longer valid.");
      }

      h2 var5 = new h2();
      int var6 = var3;

      while (var6 < var3 + var4) {
         short var7 = 0;
         if (var4 + var3 - var6 > 16384) {
            var7 = 16384;
         } else {
            var7 = com.aspose.slides.internal.v6g.k5.l6(var4 + var3 - var6, 9);
         }

         byte[] var8 = new byte[var7];
         com.aspose.slides.ms.System.y4.n5(var2, var6, var8, 0, var7);
         if (this.n5().i1() != null && this.n5().i1().n5() != null) {
            var8 = this.k5(var1, var8);
         }

         var5.n5(var1);
         var5.n5(this.l6.c8());
         var5.n5(com.aspose.slides.internal.v6g.k5.l6(var8.length, 9));
         var5.n5(var8);
         var6 += var7;
      }

      return var5.u9();
   }

   public byte[] k5(byte var1) {
      com.aspose.slides.internal.n4m.n5 var2 = this.n5(var1);
      var2.e2();
      byte[] var3 = this.l6(var2.y4(), var2.t9());
      var2.c8();
      var2.a6();
      return var3;
   }

   private byte[] k5(byte var1, byte[] var2) {
      byte[] var3 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), z6.class)) {
         var3 = this.l6.i1().n5().l6(var1, var2);
      } else {
         var3 = this.l6.i1().n5().n5(var1, var2);
      }

      byte[] var4 = this.l6.i1().n5().n5(var2, var3);
      this.l6.n5(this.l6.z3() + 1L);
      return var4;
   }

   private byte[] u3(byte var1, byte[] var2) {
      byte[] var3 = null;
      byte[] var4 = null;

      try {
         byte[][] var5 = new byte[][]{(byte[])var3};
         byte[][] var6 = new byte[][]{var4};
         this.l6.f2().n5().n5(var2, var5, var6);
         var3 = var5[0];
         var4 = var6[0];
      } catch (RuntimeException var7) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.l6, x8.class)) {
            this.n5().a0().l6((byte)21);
         }

         throw var7;
      }

      byte[] var10 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5(), z6.class)) {
         var10 = this.l6.f2().n5().n5(var1, (byte[])var3);
      } else {
         var10 = this.l6.f2().n5().l6(var1, (byte[])var3);
      }

      if (!this.n5(var10, var4)) {
         throw new n5((byte)20, "Bad record MAC");
      }

      this.l6.l6(this.l6.m1() + 1L);
      return (byte[])var3;
   }

   private boolean n5(byte[] var1, byte[] var2) {
      if (var1 == null) {
         return var2 == null;
      }

      if (var2 == null) {
         return false;
      }

      if (var1.length != var2.length) {
         return false;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1[var3], 6) != com.aspose.slides.internal.v6g.k5.u3(var2[var3], 6)) {
            return false;
         }
      }

      return true;
   }

   private void n5(int var1, byte[] var2) {
      h2 var3 = new h2(var2);
      String var4 = var1 == 48 ? "SSL_" : "TLS_";

      while (var3.getPosition() < var3.getLength()) {
         byte var5 = var3.l6();
         if (com.aspose.slides.internal.v6g.k5.u3(var5, 6) == 0) {
            short var9 = var3.k5();
            int var10 = this.n5().t4().l6(var9);
            if (var10 != -1) {
               this.n5().p8().n5(this.n5().t4().get_Item(var10));
               break;
            }
         } else {
            byte[] var6 = new byte[2];
            var3.read(var6, 0, var6.length);
            int var7 = (com.aspose.slides.internal.v6g.k5.u3(var5, 6) & 0xFF) << 16
               | (com.aspose.slides.internal.v6g.k5.u3(var6[0], 6) & 0xFF) << 8
               | com.aspose.slides.internal.v6g.k5.u3(var6[1], 6) & 0xFF;
            x9 var8 = this.n5(var4, var7);
            if (var8 != null) {
               this.n5().p8().n5(var8);
               break;
            }
         }
      }

      if (this.n5().p8() == null) {
         throw new n5((byte)71, "Insuficient Security");
      }
   }

   private x9 n5(String var1, int var2) {
      try {
         switch (var2) {
            case 65664:
               return this.n5().t4().n5(d1.n5(new String[]{var1, "RSA_WITH_RC4_128_MD5"}));
            case 131200:
               return this.n5().t4().n5(d1.n5(new String[]{var1, "RSA_EXPORT_WITH_RC4_40_MD5"}));
            case 196736:
               return this.n5().t4().n5(d1.n5(new String[]{var1, "RSA_EXPORT_WITH_RC2_CBC_40_MD5"}));
            case 262272:
               return this.n5().t4().n5(d1.n5(new String[]{var1, "RSA_EXPORT_WITH_RC2_CBC_40_MD5"}));
            case 327808:
               return null;
            case 393280:
               return null;
            case 458944:
               return null;
            default:
               return null;
         }
      } catch (RuntimeException var4) {
         return null;
      }
   }

   // $VF: synthetic method
   static void n5(h0 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.u3(var1);
   }

   // $VF: synthetic method
   static void l6(h0 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.a6(var1);
   }
}
