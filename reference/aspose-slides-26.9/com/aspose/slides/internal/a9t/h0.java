package com.aspose.slides.internal.a9t;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.x8;
import com.aspose.slides.ms.System.y4;

public class h0 extends k5 {
   private int l6;
   private byte[] k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private u9 c8;
   private byte[] t2;
   private byte[] s7;
   static final String n5 = d1.n5(new String[]{
      "Use of this API is highly discouraged, ",
      "it selects legacy-mode LM/NTLM authentication, which sends ",
      "your password in very weak encryption over the wire even if ",
      "the server supports the more secure NTLMv2 / NTLMv2 Session. ",
      "You need to use the new `Type3Message (Type2Message)' constructor ",
      "to use the more secure NTLMv2 / NTLMv2 Session authentication modes. ",
      "These require the Type 2 message from the server to compute the response."
   });

   @Deprecated
   public h0() {
      super(3);
      if (u3() != 0) {
         throw new InvalidOperationException(d1.n5(new String[]{"Refusing to use legacy-mode LM/NTLM authentication ", "unless explicitly enabled using DefaultAuthLevel."}));
      }

      this.a6 = p8.u9();
      this.u3 = p8.l6();
      this.u9 = p8.h0();
      this.l6 = 0;
      this.n5(33281);
   }

   public h0(u9 var1) {
      super(3);
      this.c8 = var1;
      this.l6 = u3();
      this.k5 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5(var1.u3()).deepClone(), byte[].class);
      this.a6 = var1.a6();
      this.u3 = p8.l6();
      this.u9 = p8.h0();
      this.n5(33280);
      if ((var1.n5() & 1) != 0) {
         this.n5(this.n5() | 1);
      } else {
         this.n5(this.n5() | 2);
      }

      if ((var1.n5() & 524288) != 0) {
         this.n5(this.n5() | 524288);
      }
   }

   @Override
   protected void finalize() throws Throwable {
      if (this.k5 != null) {
         com.aspose.slides.ms.System.u3.n5(this.k5, 0, this.k5.length);
      }

      if (this.t2 != null) {
         com.aspose.slides.ms.System.u3.n5(this.t2, 0, this.t2.length);
      }

      if (this.s7 != null) {
         com.aspose.slides.ms.System.u3.n5(this.s7, 0, this.s7.length);
      }

      super.finalize();
   }

   @Deprecated
   public static int u3() {
      return com.aspose.slides.internal.a9t.u3.n5();
   }

   public void n5(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      if ("".equals(var1)) {
         this.n5(this.n5() & -4097);
      } else {
         this.n5(this.n5() | 4096);
      }

      this.a6 = var1;
   }

   public void l6(String var1) {
      this.h0 = var1;
   }

   public void k5(String var1) {
      this.u9 = var1;
   }

   @Override
   protected void n5(byte[] var1) {
      super.n5(var1);
      this.h0 = null;
      if (var1.length >= 64) {
         this.n5(com.aspose.slides.internal.v6g.k5.u3(x8.l6(var1, 60), 10));
      } else {
         this.n5(33281);
      }

      int var2 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 12), 8);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 16), 8);
      this.t2 = new byte[var2];
      y4.n5(var1, var3, this.t2, 0, var2);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 20), 8);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 24), 8);
      this.s7 = new byte[var4];
      y4.n5(var1, var5, this.s7, 0, var4);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 28), 8);
      int var7 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 32), 8);
      this.a6 = this.n5(var1, var7, var6);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 36), 8);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 40), 8);
      this.u9 = this.n5(var1, var9, var8);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 44), 8);
      int var11 = com.aspose.slides.internal.v6g.k5.u3(x8.n5(var1, 48), 8);
      this.u3 = this.n5(var1, var11, var10);
   }

   private String n5(byte[] var1, int var2, int var3) {
      return (this.n5() & 1) != 0 ? j5.z1().l6(var1, var2, var3) : j5.e2().l6(var1, var2, var3);
   }

   private byte[] u3(String var1) {
      if (var1 == null) {
         return new byte[0];
      } else {
         return (this.n5() & 1) != 0 ? j5.z1().u3(var1) : j5.e2().u3(var1);
      }
   }

   @Override
   public byte[] k5() {
      byte[] var1 = this.u3(this.a6);
      byte[] var2 = this.u3(this.u9);
      byte[] var3 = this.u3(this.u3);
      byte[] var4 = null;
      byte[] var5 = null;
      if (this.c8 == null) {
         if (this.l6 != 0) {
            throw new InvalidOperationException(
               d1.n5(new String[]{"Refusing to use legacy-mode LM/NTLM authentication ", "unless explicitly enabled using DefaultAuthLevel."})
            );
         }

         n5 var6 = new n5(this.h0, this.k5);

         try {
            var4 = var6.n5();
            var5 = var6.l6();
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } else {
         byte[][] var23 = new byte[][]{var4};
         byte[][] var7 = new byte[][]{var5};
         com.aspose.slides.internal.a9t.l6.n5(this.c8, this.l6, this.u9, this.h0, this.a6, var23, var7);
         var4 = var23[0];
         var5 = var7[0];
      }

      int var24 = var4 != null ? var4.length : 0;
      int var25 = var5 != null ? var5.length : 0;
      byte[] var8 = this.l6(64 + var1.length + var2.length + var3.length + var24 + var25);
      short var9 = com.aspose.slides.internal.v6g.k5.l6(64 + var1.length + var2.length + var3.length, 9);
      var8[12] = com.aspose.slides.internal.v6g.k5.n5((Object)(var24), 9);
      var8[13] = com.aspose.slides.internal.v6g.k5.n5((Object)(0), 9);
      var8[14] = com.aspose.slides.internal.v6g.k5.n5((Object)(var24), 9);
      var8[15] = com.aspose.slides.internal.v6g.k5.n5((Object)(0), 9);
      var8[16] = com.aspose.slides.internal.v6g.k5.n5((Object)(var9), 7);
      var8[17] = com.aspose.slides.internal.v6g.k5.n5((Object)(var9 >> 8), 9);
      short var10 = com.aspose.slides.internal.v6g.k5.l6(var9 + var24, 9);
      var8[20] = com.aspose.slides.internal.v6g.k5.n5((Object)(var25), 9);
      var8[21] = com.aspose.slides.internal.v6g.k5.n5((Object)(var25 >> 8), 9);
      var8[22] = com.aspose.slides.internal.v6g.k5.n5((Object)(var25), 9);
      var8[23] = com.aspose.slides.internal.v6g.k5.n5((Object)(var25 >> 8), 9);
      var8[24] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10), 7);
      var8[25] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10 >> 8), 9);
      short var11 = com.aspose.slides.internal.v6g.k5.l6(var1.length, 9);
      byte var12 = 64;
      var8[28] = com.aspose.slides.internal.v6g.k5.n5((Object)(var11), 7);
      var8[29] = com.aspose.slides.internal.v6g.k5.n5((Object)(var11 >> 8), 9);
      var8[30] = var8[28];
      var8[31] = var8[29];
      var8[32] = com.aspose.slides.internal.v6g.k5.n5((Object)(Short.valueOf(var12)), 7);
      var8[33] = com.aspose.slides.internal.v6g.k5.n5((Object)(var12 >> 8), 9);
      short var13 = com.aspose.slides.internal.v6g.k5.l6(var2.length, 9);
      short var14 = com.aspose.slides.internal.v6g.k5.l6(var12 + var11, 9);
      var8[36] = com.aspose.slides.internal.v6g.k5.n5((Object)(var13), 7);
      var8[37] = com.aspose.slides.internal.v6g.k5.n5((Object)(var13 >> 8), 9);
      var8[38] = var8[36];
      var8[39] = var8[37];
      var8[40] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14), 7);
      var8[41] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14 >> 8), 9);
      short var15 = com.aspose.slides.internal.v6g.k5.l6(var3.length, 9);
      short var16 = com.aspose.slides.internal.v6g.k5.l6(var14 + var13, 9);
      var8[44] = com.aspose.slides.internal.v6g.k5.n5((Object)(var15), 7);
      var8[45] = com.aspose.slides.internal.v6g.k5.n5((Object)(var15 >> 8), 9);
      var8[46] = var8[44];
      var8[47] = var8[45];
      var8[48] = com.aspose.slides.internal.v6g.k5.n5((Object)(var16), 7);
      var8[49] = com.aspose.slides.internal.v6g.k5.n5((Object)(var16 >> 8), 9);
      short var17 = com.aspose.slides.internal.v6g.k5.l6(var8.length, 9);
      var8[56] = com.aspose.slides.internal.v6g.k5.n5((Object)(var17), 7);
      var8[57] = com.aspose.slides.internal.v6g.k5.n5((Object)(var17 >> 8), 9);
      int var18 = this.n5();
      var8[60] = com.aspose.slides.internal.v6g.k5.n5((Object)(var18), 9);
      var8[61] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var18, 9), 10) >> 8, 10)), 10
      );
      var8[62] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var18, 9), 10) >> 16, 10)), 10
      );
      var8[63] = com.aspose.slides.internal.v6g.k5.n5(
         (Object)(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var18, 9), 10) >> 24, 10)), 10
      );
      y4.n5(var1, 0, var8, var12, var1.length);
      y4.n5(var2, 0, var8, var14, var2.length);
      y4.n5(var3, 0, var8, var16, var3.length);
      if (var4 != null) {
         y4.n5(var4, 0, var8, var9, var4.length);
         com.aspose.slides.ms.System.u3.n5(var4, 0, var4.length);
      }

      y4.n5(var5, 0, var8, var10, var5.length);
      com.aspose.slides.ms.System.u3.n5(var5, 0, var5.length);
      return var8;
   }
}
