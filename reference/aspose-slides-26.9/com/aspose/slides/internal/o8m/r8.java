package com.aspose.slides.internal.o8m;

public class r8 extends a7 {
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

   public r8() {
      this.n5 = new byte[8];
      this.t4 = new com.aspose.slides.ms.System.i6[80];

      for (int var1 = 0; var1 < 80; var1++) {
         this.t4[var1] = new com.aspose.slides.ms.System.i6("0");
      }

      this.l6(false);
   }

   private void l6(boolean var1) {
      this.t2 = new com.aspose.slides.ms.System.i6("0xcbbb9d5dc1059ed8L");
      this.s7 = new com.aspose.slides.ms.System.i6("0x629a292a367cd507L");
      this.x8 = new com.aspose.slides.ms.System.i6("0x9159015a3070dd17L");
      this.n3 = new com.aspose.slides.ms.System.i6("0x152fecd8f70e5939L");
      this.y4 = new com.aspose.slides.ms.System.i6("0x67332667ffc00b31L");
      this.e2 = new com.aspose.slides.ms.System.i6("0x8eb44a8768581511L");
      this.t9 = new com.aspose.slides.ms.System.i6("0xdb0c2e0d64f98fa7L");
      this.z1 = new com.aspose.slides.ms.System.i6("0x47b5481dbefa4fa4L");
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
      byte[] var3 = new byte[48];
      this.n5(this.t2, var3, 0);
      this.n5(this.s7, var3, 8);
      this.n5(this.x8, var3, 16);
      this.n5(this.n3, var3, 24);
      this.n5(this.y4, var3, 32);
      this.n5(this.e2, var3, 40);
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
      com.aspose.slides.ms.System.i6[] var1 = this.t4;
      com.aspose.slides.ms.System.i6[] var2 = k8.u3;
      this.u9();

      for (int var3 = 16; var3 <= 79; var3++) {
         com.aspose.slides.ms.System.i6 var4 = var1[var3 - 15];
         var4 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.k5(
               com.aspose.slides.ms.System.i6.k5(
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var4, 1), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var4, 63), this.u9)
                  ),
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var4, 8), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var4, 56), this.u9)
                  )
               ),
               com.aspose.slides.ms.System.i6.n5(var4, 7)
            ),
            this.u9
         );
         com.aspose.slides.ms.System.i6 var5 = var1[var3 - 2];
         var5 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.k5(
               com.aspose.slides.ms.System.i6.k5(
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var5, 19), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var5, 45), this.u9)
                  ),
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var5, 61), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var5, 3), this.u9)
                  )
               ),
               com.aspose.slides.ms.System.i6.n5(var5, 6)
            ),
            this.u9
         );
         var1[var3] = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.u3(var5, var1[var3 - 7]), com.aspose.slides.ms.System.i6.u3(var4, var1[var3 - 16])),
            this.u9
         );
      }

      com.aspose.slides.ms.System.i6 var17 = this.t2;
      com.aspose.slides.ms.System.i6 var19 = this.s7;
      com.aspose.slides.ms.System.i6 var6 = this.x8;
      com.aspose.slides.ms.System.i6 var7 = this.n3;
      com.aspose.slides.ms.System.i6 var8 = this.y4;
      com.aspose.slides.ms.System.i6 var9 = this.e2;
      com.aspose.slides.ms.System.i6 var10 = this.t9;
      com.aspose.slides.ms.System.i6 var11 = this.z1;

      for (int var14 = 0; var14 <= 79; var14++) {
         com.aspose.slides.ms.System.i6 var12 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.k5(
               com.aspose.slides.ms.System.i6.k5(
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var8, 14), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var8, 50), this.u9)
                  ),
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var8, 18), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var8, 46), this.u9)
                  )
               ),
               com.aspose.slides.ms.System.i6.l6(
                  com.aspose.slides.ms.System.i6.n5(var8, 41), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var8, 23), this.u9)
               )
            ),
            this.u9
         );
         var12 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(
               var12,
               com.aspose.slides.ms.System.i6.u3(
                  com.aspose.slides.ms.System.i6.u3(
                     var11,
                     com.aspose.slides.ms.System.i6.k5(
                        com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.n5(var8, this.u9), com.aspose.slides.ms.System.i6.n5(var9, this.u9)),
                        com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.k5(var8, this.u9), var10)
                     )
                  ),
                  com.aspose.slides.ms.System.i6.u3(
                     com.aspose.slides.ms.System.i6.n5(var2[var14], this.u9), com.aspose.slides.ms.System.i6.n5(var1[var14], this.u9)
                  )
               )
            ),
            this.u9
         );
         com.aspose.slides.ms.System.i6 var13 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.k5(
               com.aspose.slides.ms.System.i6.k5(
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var17, 28), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var17, 36), this.u9)
                  ),
                  com.aspose.slides.ms.System.i6.l6(
                     com.aspose.slides.ms.System.i6.n5(var17, 34), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var17, 30), this.u9)
                  )
               ),
               com.aspose.slides.ms.System.i6.l6(
                  com.aspose.slides.ms.System.i6.n5(var17, 39), com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.l6(var17, 25), this.u9)
               )
            ),
            this.u9
         );
         var13 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(
               var13,
               com.aspose.slides.ms.System.i6.k5(
                  com.aspose.slides.ms.System.i6.k5(
                     com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.n5(var17, this.u9), com.aspose.slides.ms.System.i6.n5(var19, this.u9)),
                     com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.n5(var17, this.u9), com.aspose.slides.ms.System.i6.n5(var6, this.u9))
                  ),
                  com.aspose.slides.ms.System.i6.n5(com.aspose.slides.ms.System.i6.n5(var19, this.u9), com.aspose.slides.ms.System.i6.n5(var6, this.u9))
               )
            ),
            this.u9
         );
         var11 = var10;
         var10 = var9;
         var9 = var8;
         var8 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var7, this.u9), com.aspose.slides.ms.System.i6.n5(var12, this.u9)), this.u9
         );
         var7 = var6;
         var6 = var19;
         var19 = var17;
         var17 = com.aspose.slides.ms.System.i6.n5(
            com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var12, this.u9), com.aspose.slides.ms.System.i6.n5(var13, this.u9)), this.u9
         );
      }

      this.t2 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var17, this.u9), com.aspose.slides.ms.System.i6.n5(this.t2, this.u9)), this.u9
      );
      this.s7 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var19, this.u9), com.aspose.slides.ms.System.i6.n5(this.s7, this.u9)), this.u9
      );
      this.x8 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var6, this.u9), com.aspose.slides.ms.System.i6.n5(this.x8, this.u9)), this.u9
      );
      this.n3 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var7, this.u9), com.aspose.slides.ms.System.i6.n5(this.n3, this.u9)), this.u9
      );
      this.y4 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var8, this.u9), com.aspose.slides.ms.System.i6.n5(this.y4, this.u9)), this.u9
      );
      this.e2 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var9, this.u9), com.aspose.slides.ms.System.i6.n5(this.e2, this.u9)), this.u9
      );
      this.t9 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var10, this.u9), com.aspose.slides.ms.System.i6.n5(this.t9, this.u9)), this.u9
      );
      this.z1 = com.aspose.slides.ms.System.i6.n5(
         com.aspose.slides.ms.System.i6.u3(com.aspose.slides.ms.System.i6.n5(var11, this.u9), com.aspose.slides.ms.System.i6.n5(this.z1, this.u9)), this.u9
      );
      this.q0 = 0;

      for (int var15 = 0; var15 != var1.length; var15++) {
         var1[var15] = new com.aspose.slides.ms.System.i6("0");
      }
   }
}
