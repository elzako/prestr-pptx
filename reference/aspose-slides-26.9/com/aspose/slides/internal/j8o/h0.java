package com.aspose.slides.internal.j8o;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.v0;
import com.aspose.slides.internal.b7s.z1;

public class h0 extends k5 {
   private final long[][] u9 = new long[4][];
   private int h0;
   private int c8;
   private int[] t2;
   private byte s7;
   private int x8;
   private boolean n3;
   private int[] y4 = new int[5];

   public h0(z1 var1, v0 var2) {
      super(var1, var2);
   }

   @Override
   public com.aspose.slides.internal.b7s.u3[] n5() {
      List var1 = new List();
      this.c8();
      boolean[] var2 = new boolean[4];
      p3 var3 = this.u9().l6();
      boolean var4 = (var3.u3 & 255) == 0;

      for (int var5 = 0; var5 < var3.l6.length; var5++) {
         n3 var6 = this.u9().a6().l6()[var3.l6[var5]];
         com.aspose.slides.internal.b7s.u3 var7 = null;
         byte var8 = var6.n5();
         if (!var2[var8 & 0xFF]) {
            if (var4) {
               if (var3.n5() != 0) {
                  continue;
               }

               var8 = var6.l6();
               if (var2[var8 & 0xFF]) {
                  continue;
               }

               var7 = com.aspose.slides.internal.j8o.k5.n5(this.u9[var8 & 0xFF]);
               var7.l6((byte)0);
               var7.n5(var8);
            } else {
               var7 = com.aspose.slides.internal.j8o.k5.n5(this.u9[var8 & 0xFF]);
               var7.l6((byte)1);
               var7.n5(var8);
            }

            var1.addItem(var7);
            var2[var8 & 0xFF] = true;
         }
      }

      this.n3 = false;
      return (com.aspose.slides.internal.b7s.u3[])var1.toArray(new com.aspose.slides.internal.b7s.u3[0]);
   }

   @Override
   public void n5(short[][] var1) {
      switch (this.x8) {
         case 0:
            this.u3(var1);
            break;
         case 1:
            this.k5(var1);
            break;
         case 2:
            this.u9(var1);
            break;
         case 3:
            this.a6(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public void l6() {
      this.c8();
      this.h0();
   }

   @Override
   public void l6(short[][] var1) {
      this.n3 = true;
      this.n5(var1);
   }

   @Override
   public void k5() {
      this.y4 = new int[5];
      boolean var1 = (this.u9().l6().u3 & 255) == 0;
      p3 var2 = this.u9().l6();

      for (int var3 = 0; var3 < var2.l6.length; var3++) {
         int var4 = var2.l6[var3];
         n3 var5 = this.u9().a6().l6()[var4];
         byte var6 = var1 ? var5.l6() : var5.n5();
         if (!var1) {
            this.s7 = var6;
            if (this.t2 == null) {
               this.t2 = new int[1000];
            }
         }

         if (this.u9[var6 & 0xFF] == null) {
            this.u9[var6 & 0xFF] = new long[257];
         }

         com.aspose.slides.ms.System.u3.n5(this.u9[var6 & 0xFF], 0, 257);
      }

      if (var2.n5() == 0) {
         this.x8 = var1 ? 0 : 1;
      } else {
         this.x8 = var1 ? 2 : 3;
      }
   }

   @Override
   public void u3() {
      this.n3 = true;
      boolean var1 = (this.u9().l6().u3 & 255) == 0;
      p3 var2 = this.u9().l6();

      for (int var3 = 0; var3 < var2.l6.length; var3++) {
         int var4 = var2.l6[var3];
         n3 var5 = this.u9().a6().l6()[var4];
         byte var6 = var1 ? var5.l6() : var5.n5();
         this.s7 = var6;
         if (this.u9[var6 & 0xFF] == null) {
            this.u9[var6 & 0xFF] = new long[257];
         }

         com.aspose.slides.ms.System.u3.n5(this.u9[var6 & 0xFF], 0, this.u9[var6 & 0xFF].length);
      }

      if (var2.n5() == 0) {
         this.x8 = var1 ? 0 : 1;
      } else {
         this.x8 = var1 ? 2 : 3;
         if (!var1) {
            this.t2 = new int[1000];
         }
      }

      this.n5(true);
   }

   public final void k5(short[][] var1) {
      int var2 = 0;
      int var3 = this.u9().u9().t4() & 255;

      for (int var4 = this.u9().l6().u3 & 255; var4 <= (this.u9().l6().k5 & 255); var4++) {
         int var5 = var1[0][com.aspose.slides.internal.n5p.u9.n5()[var4]];
         if (var5 == 0) {
            var2++;
         } else {
            int var6;
            if (var5 < 0) {
               int var8 = -var5;
               var5 = var8 >> this.u9().l6().l6();
               var6 = ~var5;
            } else {
               var5 >>= this.u9().l6().l6();
               var6 = var5;
            }

            if (var5 == 0) {
               var2++;
            } else {
               if (this.c8 > 0) {
                  this.c8();
               }

               while (var2 > 15) {
                  this.n5(false, this.s7, 240);
                  var2 -= 16;
               }

               int var7 = 1;

               while ((var5 >>= 1) != 0) {
                  var7++;
               }

               if (var3 == 8) {
                  if (var7 > l6) {
                     throw new Exception("Bad DCT coef");
                  }
               } else {
                  if (var3 != 12) {
                     throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                  }

                  if (var7 > u3) {
                     throw new Exception("Bad DCT coef");
                  }
               }

               this.n5(false, this.s7, (var2 << 4) + var7);
               this.n5(var6, var7);
               var2 = 0;
            }
         }
      }

      if (var2 > 0) {
         this.c8++;
         if (this.c8 == 32767) {
            this.c8();
         }
      }
   }

   public final void u3(short[][] var1) {
      for (int var2 = 0; var2 < this.u9().n5(); var2++) {
         int var3 = var1[var2][0] >> this.u9().l6().l6();
         int var4 = var3 - this.y4[this.u9().l6().k5()[var2]];
         this.y4[this.u9().l6().k5()[var2]] = var3;
         var3 = var4;
         if (var4 < 0) {
            var4 = -var4;
            var3--;
         }

         int var5 = 0;

         while (var4 != 0) {
            var5++;
            var4 >>= 1;
         }

         int var6 = this.u9().u9().t4() & 255;
         if (var6 == 8) {
            if (var5 > n5) {
               throw new Exception("Bad DCT coef");
            }
         } else {
            if (var6 != 12) {
               throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
            }

            if (var5 > k5) {
               throw new Exception("Bad DCT coef");
            }
         }

         int var7 = this.u9().l6().k5()[var2];
         this.n5(true, this.u9().a6().l6()[var7].l6(), var5);
         if (var5 != 0) {
            this.n5(var3, var5);
         }
      }
   }

   public final void a6(short[][] var1) {
      int var2 = 0;
      int[] var3 = new int[64];
      p3 var4 = this.u9().l6();

      for (int var5 = var4.u3 & 255; var5 <= (var4.k5 & 255); var5++) {
         int var6 = var1[0][com.aspose.slides.internal.n5p.u9.n5()[var5]];
         if (var6 < 0) {
            var6 = -var6;
         }

         var6 >>= var4.l6();
         var3[var5] = var6;
         if (var6 == 1) {
            var2 = var5;
         }
      }

      int var10 = 0;
      int var12 = 0;
      int var7 = this.h0;

      for (int var8 = var4.u3 & 255; var8 <= (var4.k5 & 255); var8++) {
         int var9 = var3[var8];
         if (var9 == 0) {
            var10++;
         } else {
            while (var10 > 15 && var8 <= var2) {
               this.c8();
               this.n5(false, this.s7, 240);
               var10 -= 16;
               this.l6(var7, var12);
               var7 = 0;
               var12 = 0;
            }

            if (var9 > 1) {
               this.t2[var7 + var12] = (char)(var9 & 1);
               var12++;
            } else {
               this.c8();
               this.n5(false, this.s7, (var10 << 4) + 1);
               var9 = var1[0][com.aspose.slides.internal.n5p.u9.n5()[var8]] < 0 ? 0 : 1;
               this.n5(var9, 1);
               this.l6(var7, var12);
               var7 = 0;
               var12 = 0;
               var10 = 0;
            }
         }
      }

      if (var10 > 0 || var12 > 0) {
         this.c8++;
         this.h0 += var12;
         if (this.c8 == 32767 || this.h0 > 937) {
            this.c8();
         }
      }
   }

   public final void u9(short[][] var1) {
      for (int var2 = 0; var2 < this.u9().n5(); var2++) {
         short var3 = var1[var2][0];
         this.n5(var3 >> this.u9().l6().l6(), 1);
      }
   }

   private void n5(int var1, int var2) {
      if (!this.n3) {
         this.a6.n5(var1, var2);
      }
   }

   private void l6(int var1, int var2) {
      if (!this.n3) {
         for (int var3 = 0; var3 < var2; var3++) {
            this.n5(this.t2[var1 + var3], 1);
         }
      }
   }

   private void h0() {
      if (!this.n3) {
         this.a6.l6();
      }
   }

   private void c8() {
      if (this.c8 > 0) {
         int var1 = this.c8;
         int var2 = 0;

         while ((var1 >>= 1) != 0) {
            var2++;
         }

         if (var2 > 14) {
            throw new Exception("Huff missing code");
         }

         this.n5(false, this.s7, var2 << 4);
         if (var2 != 0) {
            this.n5(this.c8, var2);
         }

         this.c8 = 0;
         this.l6(0, this.h0);
         this.h0 = 0;
      }
   }

   private void n5(boolean var1, byte var2, int var3) {
      if (this.n3) {
         this.u9[var2 & 0xFF][var3]++;
      } else {
         if (!var1) {
            var2 = (byte)(16 + (var2 & 255));
         }

         this.n5(this.u9().k5().get_Item(var2).l6()[var3], this.u9().k5().get_Item(var2).k5()[var3]);
      }
   }
}
