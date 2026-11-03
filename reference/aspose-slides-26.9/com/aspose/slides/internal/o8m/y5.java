package com.aspose.slides.internal.o8m;

public class y5 extends r1 {
   private byte[] n5;
   private int a6;
   private com.aspose.slides.ms.System.i6 u9 = com.aspose.slides.ms.System.i6.n5;
   private com.aspose.slides.ms.System.i6 h0 = new com.aspose.slides.ms.System.i6("0");
   private com.aspose.slides.ms.System.i6 c8 = new com.aspose.slides.ms.System.i6("0");
   private com.aspose.slides.ms.System.i6 t2;
   private com.aspose.slides.ms.System.i6 s7;
   private com.aspose.slides.ms.System.i6 x8;
   private com.aspose.slides.ms.System.i6 n3;
   private com.aspose.slides.ms.System.i6 y4;
   private com.aspose.slides.ms.System.i6 e2;
   private com.aspose.slides.ms.System.i6 t9;
   private com.aspose.slides.ms.System.i6 z1;
   private com.aspose.slides.ms.System.i6[] t4;
   private int q0;

   public y5() {
      this.n5 = new byte[8];
      this.t4 = new com.aspose.slides.ms.System.i6[80];

      for (int var1 = 0; var1 < 80; var1++) {
         this.t4[var1] = new com.aspose.slides.ms.System.i6("0");
      }

      this.l6(false);
   }

   private void l6(boolean var1) {
      this.t2 = new com.aspose.slides.ms.System.i6("0x6a09e667f3bcc908L");
      this.s7 = new com.aspose.slides.ms.System.i6("0xbb67ae8584caa73bL");
      this.x8 = new com.aspose.slides.ms.System.i6("0x3c6ef372fe94f82bL");
      this.n3 = new com.aspose.slides.ms.System.i6("0xa54ff53a5f1d36f1L");
      this.y4 = new com.aspose.slides.ms.System.i6("0x510e527fade682d1L");
      this.e2 = new com.aspose.slides.ms.System.i6("0x9b05688c2b3e6c1fL");
      this.t9 = new com.aspose.slides.ms.System.i6("0x1f83d9abfb41bd6bL");
      this.z1 = new com.aspose.slides.ms.System.i6("0x5be0cd19137e2179L");
      if (var1) {
         this.h0 = new com.aspose.slides.ms.System.i6("0");
         this.c8 = new com.aspose.slides.ms.System.i6("0");
         this.a6 = 0;

         for (int var2 = 0; var2 < this.n5.length; var2++) {
            this.n5[var2] = 0;
         }

         this.q0 = 0;

         for (int var3 = 0; var3 != this.t4.length; var3++) {
            this.t4[var3] = new com.aspose.slides.ms.System.i6("0");
         }
      }
   }

   @Override
   public void t2() {
      this.l6(true);
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      while (this.a6 != 0 && var3 > 0) {
         this.n5(var1[var2]);
         var2++;
         var3--;
      }

      while (var3 > this.n5.length) {
         this.n5(var1, var2);
         var2 += this.n5.length;
         var3 -= this.n5.length;
         this.h0 = com.aspose.slides.ms.System.i6.u3(this.h0, new com.aspose.slides.ms.System.i6(String.valueOf(this.n5.length)));
      }

      while (var3 > 0) {
         this.n5(var1[var2]);
         var2++;
         var3--;
      }
   }

   @Override
   protected byte[] c8() {
      this.u9();
      com.aspose.slides.ms.System.i6 var1 = com.aspose.slides.ms.System.i6.l6(this.h0, 3);
      com.aspose.slides.ms.System.i6 var2 = this.c8;
      this.n5((byte)-128);

      while (this.a6 != 0) {
         this.n5((byte)0);
      }

      this.n5(var1, var2);
      this.h0();
      byte[] var3 = new byte[64];
      this.n5(this.t2, var3, 0);
      this.n5(this.s7, var3, 8);
      this.n5(this.x8, var3, 16);
      this.n5(this.n3, var3, 24);
      this.n5(this.y4, var3, 32);
      this.n5(this.e2, var3, 40);
      this.n5(this.t9, var3, 48);
      this.n5(this.z1, var3, 56);
      this.t2();
      return var3;
   }

   private void n5(byte var1) {
      this.n5[this.a6++] = var1;
      if (this.a6 == this.n5.length) {
         this.n5(this.n5, 0);
         this.a6 = 0;
      }

      this.h0 = com.aspose.slides.ms.System.i6.k5(this.h0);
   }

   private void n5(byte[] var1, int var2) {
      this.t4[this.q0++] = com.aspose.slides.ms.System.i6.l6(
         com.aspose.slides.ms.System.i6.l6(
            com.aspose.slides.ms.System.i6.l6(
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2] & 255)), 56), this.u9
               ),
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 1] & 255)), 48), this.u9
               )
            ),
            com.aspose.slides.ms.System.i6.l6(
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 2] & 255)), 40), this.u9
               ),
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 3] & 255)), 32), this.u9
               )
            )
         ),
         com.aspose.slides.ms.System.i6.l6(
            com.aspose.slides.ms.System.i6.l6(
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 4] & 255)), 24), this.u9
               ),
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 5] & 255)), 16), this.u9
               )
            ),
            com.aspose.slides.ms.System.i6.l6(
               com.aspose.slides.ms.System.i6.n5(
                  com.aspose.slides.ms.System.i6.l6(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 6] & 255)), 8), this.u9
               ),
               com.aspose.slides.ms.System.i6.n5(new com.aspose.slides.ms.System.i6(String.valueOf(var1[var2 + 7] & 255)), this.u9)
            )
         )
      );
      if (this.q0 == 16) {
         this.h0();
      }
   }

   private void n5(com.aspose.slides.ms.System.i6 var1, byte[] var2, int var3) {
      var2[var3] = com.aspose.slides.ms.System.i6.n5(var1, 56).byteValue();
      var2[var3 + 1] = com.aspose.slides.ms.System.i6.n5(var1, 48).byteValue();
      var2[var3 + 2] = com.aspose.slides.ms.System.i6.n5(var1, 40).byteValue();
      var2[var3 + 3] = com.aspose.slides.ms.System.i6.n5(var1, 32).byteValue();
      var2[var3 + 4] = com.aspose.slides.ms.System.i6.n5(var1, 24).byteValue();
      var2[var3 + 5] = com.aspose.slides.ms.System.i6.n5(var1, 16).byteValue();
      var2[var3 + 6] = com.aspose.slides.ms.System.i6.n5(var1, 8).byteValue();
      var2[var3 + 7] = var1.byteValue();
   }

   private void u9() {
      if (com.aspose.slides.ms.System.i6.s7(this.h0, new com.aspose.slides.ms.System.i6("0x1fffffffffffffffL"))) {
         this.c8 = com.aspose.slides.ms.System.i6.u3(this.c8, com.aspose.slides.ms.System.i6.n5(this.h0, 61));
         this.h0 = com.aspose.slides.ms.System.i6.n5(this.h0, new com.aspose.slides.ms.System.i6("0x1fffffffffffffffL"));
      }
   }

   private void n5(com.aspose.slides.ms.System.i6 var1, com.aspose.slides.ms.System.i6 var2) {
      if (this.q0 > 14) {
         this.h0();
      }

      this.t4[14] = var2;
      this.t4[15] = var1;
   }

   private void h0() {
      this.u9();

      for (int var1 = 16; var1 <= 79; var1++) {
         this.t4[var1] = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(
               com.aspose.slides.ms.System.i6.u3(this.u3(this.t4[var1 - 2]), this.t4[var1 - 7]),
               com.aspose.slides.ms.System.i6.u3(this.k5(this.t4[var1 - 15]), this.t4[var1 - 16])
            ),
            this.u9
         );
      }

      com.aspose.slides.ms.System.i6 var12 = this.t2;
      com.aspose.slides.ms.System.i6 var2 = this.s7;
      com.aspose.slides.ms.System.i6 var3 = this.x8;
      com.aspose.slides.ms.System.i6 var4 = this.n3;
      com.aspose.slides.ms.System.i6 var5 = this.y4;
      com.aspose.slides.ms.System.i6 var6 = this.e2;
      com.aspose.slides.ms.System.i6 var7 = this.t9;
      com.aspose.slides.ms.System.i6 var8 = this.z1;

      for (int var9 = 0; var9 <= 79; var9++) {
         com.aspose.slides.ms.System.i6 var10 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(
               com.aspose.slides.ms.System.i6.u3(
                  com.aspose.slides.ms.System.i6.u3(var8, this.l6(var5)), com.aspose.slides.ms.System.i6.u3(this.n5(var5, var6, var7), k8.u3[var9])
               ),
               this.t4[var9]
            ),
            this.u9
         );
         com.aspose.slides.ms.System.i6 var11 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(this.n5(var12), this.l6(var12, var2, var3)), this.u9
         );
         var8 = var7;
         var7 = var6;
         var6 = var5;
         var5 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(var4, var10), this.u9);
         var4 = var3;
         var3 = var2;
         var2 = var12;
         var12 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(var10, var11), this.u9);
      }

      this.t2 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.t2, var12), this.u9);
      this.s7 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.s7, var2), this.u9);
      this.x8 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.x8, var3), this.u9);
      this.n3 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.n3, var4), this.u9);
      this.y4 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.y4, var5), this.u9);
      this.e2 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.e2, var6), this.u9);
      this.t9 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.t9, var7), this.u9);
      this.z1 = com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.u3(this.z1, var8), this.u9);
      this.q0 = 0;

      for (int var13 = 0; var13 != this.t4.length; var13++) {
         this.t4[var13] = new com.aspose.slides.ms.System.i6("0");
      }
   }

   private com.aspose.slides.ms.System.i6 n5(com.aspose.slides.ms.System.i6 var1, int var2) {
      return com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.l6(com.aspose.slides.ms.System.i6.n5(var1, var2), com.aspose.slides.ms.System.i6.l6(var1, 64 - var2)), this.u9
      );
   }

   private com.aspose.slides.ms.System.i6 n5(com.aspose.slides.ms.System.i6 var1, com.aspose.slides.ms.System.i6 var2, com.aspose.slides.ms.System.i6 var3) {
      return com.aspose.slides.ms.System.i6.k5(
         com.aspose.slides.ms.System.i6.n5(var1, var2), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.k5(var1, this.u9), var3)
      );
   }

   private com.aspose.slides.ms.System.i6 l6(com.aspose.slides.ms.System.i6 var1, com.aspose.slides.ms.System.i6 var2, com.aspose.slides.ms.System.i6 var3) {
      return com.aspose.slides.ms.System.i6.k5(
         com.aspose.slides.ms.System.i6.k5(com.aspose.slides.ms.System.i6.n5(var1, var2), com.aspose.slides.ms.System.i6.n5(var1, var3)),
         com.aspose.slides.ms.System.i6.n5(var2, var3)
      );
   }

   private com.aspose.slides.ms.System.i6 n5(com.aspose.slides.ms.System.i6 var1) {
      return com.aspose.slides.ms.System.i6.k5(com.aspose.slides.ms.System.i6.k5(this.n5(var1, 28), this.n5(var1, 34)), this.n5(var1, 39));
   }

   private com.aspose.slides.ms.System.i6 l6(com.aspose.slides.ms.System.i6 var1) {
      return com.aspose.slides.ms.System.i6.k5(com.aspose.slides.ms.System.i6.k5(this.n5(var1, 14), this.n5(var1, 18)), this.n5(var1, 41));
   }

   private com.aspose.slides.ms.System.i6 k5(com.aspose.slides.ms.System.i6 var1) {
      return com.aspose.slides.ms.System.i6.k5(
         com.aspose.slides.ms.System.i6.k5(this.n5(var1, 1), this.n5(var1, 8)), com.aspose.slides.ms.System.i6.n5(var1, 7)
      );
   }

   private com.aspose.slides.ms.System.i6 u3(com.aspose.slides.ms.System.i6 var1) {
      return com.aspose.slides.ms.System.i6.k5(
         com.aspose.slides.ms.System.i6.k5(this.n5(var1, 19), this.n5(var1, 61)), com.aspose.slides.ms.System.i6.n5(var1, 6)
      );
   }
}
