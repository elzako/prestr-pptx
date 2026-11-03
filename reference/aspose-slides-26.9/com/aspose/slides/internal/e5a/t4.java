package com.aspose.slides.internal.e5a;

import com.aspose.slides.ms.System.d1;

public final class t4 {
   public int n5;
   public p8 l6;
   public int k5;
   public long[] u3 = new long[1];
   public long a6;
   public int u9;
   private boolean t2 = true;
   public int h0;
   public t9 c8;
   private static final byte[] s7 = new byte[]{0, 0, -1, -1};

   public final boolean n5() {
      return this.t2;
   }

   public t4() {
   }

   public t4(boolean var1) {
      this.t2 = var1;
   }

   public final int l6() {
      this.l6.c8 = 0L;
      this.l6.u3 = 0L;
      this.l6.t2 = null;
      this.n5 = this.n5() ? 0 : 7;
      this.c8.n5(null);
      return 0;
   }

   public final int k5() {
      if (this.c8 != null) {
         this.c8.n5();
      }

      this.c8 = null;
      return 0;
   }

   public final int n5(p8 var1, int var2) {
      this.l6 = var1;
      this.l6.t2 = null;
      this.c8 = null;
      if (var2 >= 8 && var2 <= 15) {
         this.h0 = var2;
         this.c8 = new t9(var1, this.n5() ? this : null, 1 << var2);
         this.l6();
         return 0;
      } else {
         this.k5();
         throw new f2("Bad window size.");
      }
   }

   public final int n5(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = var1;
      if (this.l6.n5 == null) {
         throw new f2("InputBuffer is null. ");
      }

      var4 = var4 == 4 ? -5 : 0;
      var2 = -5;

      while (true) {
         switch (this.n5) {
            case 0:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               if (((this.k5 = this.l6.n5[this.l6.l6++] & 255) & 15) != 8) {
                  this.n5 = 13;
                  this.l6.t2 = d1.n5("unknown compression method (0x{0:X2})", new Object[]{this.k5});
                  this.u9 = 5;
               } else if ((this.k5 >> 4) + 8 > this.h0) {
                  this.n5 = 13;
                  this.l6.t2 = d1.n5("invalid window size ({0})", new Object[]{(this.k5 >> 4) + 8});
                  this.u9 = 5;
               } else {
                  this.n5 = 1;
               }
               break;
            case 1:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               var3 = this.l6.n5[this.l6.l6++] & 255 & 0xFF;
               if (((this.k5 << 8) + var3) % 31 != 0) {
                  this.n5 = 13;
                  this.l6.t2 = "incorrect header check";
                  this.u9 = 5;
               } else if ((var3 & 32) == 0) {
                  this.n5 = 7;
               } else {
                  this.n5 = 2;
               }
               break;
            case 2:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = (this.l6.n5[this.l6.l6++] & 255 & 0xFF) << 24 & 0xFF000000;
               this.n5 = 3;
               break;
            case 3:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = this.a6 + ((this.l6.n5[this.l6.l6++] & 255 & 0xFF) << 16 & 16711680L);
               this.n5 = 4;
               break;
            case 4:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = this.a6 + ((this.l6.n5[this.l6.l6++] & 255 & 0xFF) << 8 & 65280L);
               this.n5 = 5;
               break;
            case 5:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               this.l6.k5--;
               this.l6.u3++;
               this.a6 = this.a6 + (this.l6.n5[this.l6.l6++] & 0xFF & 255L);
               this.l6.n3 = this.a6;
               this.n5 = 6;
               return 2;
            case 6:
               this.n5 = 13;
               this.l6.t2 = "need dictionary";
               this.u9 = 0;
               return -2;
            case 7:
               var2 = this.c8.n5(var2);
               if (var2 == -3) {
                  this.n5 = 13;
                  this.u9 = 0;
               } else {
                  if (var2 == 0) {
                     var2 = var4;
                  }

                  if (var2 != 1) {
                     return var2;
                  }

                  var2 = var4;
                  this.c8.n5(this.u3);
                  if (!this.n5()) {
                     this.n5 = 12;
                  } else {
                     this.n5 = 8;
                  }
               }
               break;
            case 8:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = (this.l6.n5[this.l6.l6++] & 255 & 0xFF) << 24 & 0xFF000000;
               this.n5 = 9;
               break;
            case 9:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = this.a6 + ((this.l6.n5[this.l6.l6++] & 255 & 0xFF) << 16 & 16711680L);
               this.n5 = 10;
               break;
            case 10:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = this.a6 + ((this.l6.n5[this.l6.l6++] & 255 & 0xFF) << 8 & 65280L);
               this.n5 = 11;
               break;
            case 11:
               if (this.l6.k5 == 0) {
                  return var2;
               }

               var2 = var4;
               this.l6.k5--;
               this.l6.u3++;
               this.a6 = this.a6 + (this.l6.n5[this.l6.l6++] & 0xFF & 255L);
               if (this.a6 != 0L && (int)this.u3[0] != (int)this.a6) {
                  this.n5 = 13;
                  this.l6.t2 = "incorrect data check";
                  this.u9 = 5;
                  break;
               }

               this.n5 = 12;
               break;
            case 12:
               return 1;
            case 13:
               throw new f2(d1.n5("Bad state ({0})", new Object[]{this.l6.t2}));
            default:
               throw new f2("Stream error.");
         }
      }
   }
}
