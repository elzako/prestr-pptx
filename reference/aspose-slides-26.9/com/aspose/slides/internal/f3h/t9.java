package com.aspose.slides.internal.f3h;

import com.aspose.slides.ms.System.d1;

final class t9 {
   private int c8;
   u3 n5;
   int l6;
   long k5;
   long u3;
   int a6;
   private boolean t2 = true;
   int u9;
   y4 h0;
   private static byte[] s7 = new byte[]{0, 0, -1, -1};

   boolean n5() {
      return this.t2;
   }

   public t9() {
   }

   public t9(boolean var1) {
      this.t2 = var1;
   }

   int l6() {
      this.n5.u3 = this.n5.c8 = 0L;
      this.n5.t2 = null;
      this.c8 = this.n5() ? 0 : 7;
      this.h0.n5();
      return 0;
   }

   int k5() {
      if (this.h0 != null) {
         this.h0.l6();
      }

      this.h0 = null;
      return 0;
   }

   int n5(u3 var1, int var2) {
      this.n5 = var1;
      this.n5.t2 = null;
      this.h0 = null;
      if (var2 >= 8 && var2 <= 15) {
         this.u9 = var2;
         this.h0 = new y4(var1, this.n5() ? this : null, 1 << var2);
         this.l6();
         return 0;
      } else {
         this.k5();
         throw new a6("Bad window size.");
      }
   }

   int n5(int var1) {
      if (this.n5.n5 == null) {
         throw new a6("InputBuffer is null. ");
      }

      byte var2 = 0;
      int var3 = -5;

      while (true) {
         switch (this.c8) {
            case 0:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               if (((this.l6 = this.n5.n5[this.n5.l6++] & 255) & 15) != 8) {
                  this.c8 = 13;
                  this.n5.t2 = d1.n5("unknown compression method (0x{0:X2})", new Object[]{this.l6});
                  this.a6 = 5;
               } else if ((this.l6 >> 4) + 8 > this.u9) {
                  this.c8 = 13;
                  this.n5.t2 = d1.n5("invalid window size ({0})", new Object[]{(this.l6 >> 4) + 8});
                  this.a6 = 5;
               } else {
                  this.c8 = 1;
               }
               break;
            case 1:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               int var4 = this.n5.n5[this.n5.l6++] & 255 & 0xFF;
               if (((this.l6 << 8) + var4) % 31 != 0) {
                  this.c8 = 13;
                  this.n5.t2 = "incorrect header check";
                  this.a6 = 5;
               } else {
                  this.c8 = (var4 & 32) == 0 ? 7 : 2;
               }
               break;
            case 2:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.n5.n5[this.n5.l6++] & 255) << 24 & 4278190080L;
               this.c8 = 3;
               break;
            case 3:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.u3 & 4294967295L) + ((this.n5.n5[this.n5.l6++] & 255) << 16 & 0xFF0000 & 4294967295L);
               this.c8 = 4;
               break;
            case 4:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.u3 & 4294967295L) + ((this.n5.n5[this.n5.l6++] & 255) << 8 & 0xFF00 & 4294967295L);
               this.c8 = 5;
               break;
            case 5:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.u3 & 4294967295L) + (this.n5.n5[this.n5.l6++] & 0xFF & 0xFF & 4294967295L);
               this.n5.n3 = this.u3;
               this.c8 = 6;
               return 2;
            case 6:
               this.c8 = 13;
               this.n5.t2 = "need dictionary";
               this.a6 = 0;
               return -2;
            case 7:
               var3 = this.h0.n5(var3);
               if (var3 == -3) {
                  this.c8 = 13;
                  this.a6 = 0;
               } else {
                  if (var3 == 0) {
                     var3 = var2;
                  }

                  if (var3 != 1) {
                     return var3;
                  }

                  var3 = var2;
                  this.k5 = this.h0.n5();
                  if (!this.n5()) {
                     this.c8 = 12;
                     return 1;
                  }

                  this.c8 = 8;
               }
               break;
            case 8:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.n5.n5[this.n5.l6++] & 255) << 24 & 4278190080L;
               this.c8 = 9;
               break;
            case 9:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.u3 & 4294967295L) + ((this.n5.n5[this.n5.l6++] & 255) << 16 & 0xFF0000 & 4294967295L);
               this.c8 = 10;
               break;
            case 10:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.u3 & 4294967295L) + ((this.n5.n5[this.n5.l6++] & 255) << 8 & 0xFF00 & 4294967295L);
               this.c8 = 11;
               break;
            case 11:
               if (this.n5.k5 == 0) {
                  return var3;
               }

               var3 = var2;
               this.n5.k5--;
               this.n5.u3++;
               this.u3 = (this.u3 & 4294967295L) + (this.n5.n5[this.n5.l6++] & 0xFF & 0xFF & 4294967295L);
               if (this.k5 == this.u3) {
                  this.c8 = 12;
                  return 1;
               }

               this.c8 = 13;
               this.n5.t2 = "incorrect data check";
               this.a6 = 5;
               break;
            case 12:
               return 1;
            case 13:
               throw new a6(d1.n5("Bad state ({0})", new Object[]{this.n5.t2}));
            default:
               throw new a6("Stream error.");
         }
      }
   }
}
