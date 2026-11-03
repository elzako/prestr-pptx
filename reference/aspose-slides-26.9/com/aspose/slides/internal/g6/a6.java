package com.aspose.slides.internal.g6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.ms.System.q1;

public class a6 {
   private final boolean n5;
   private final j5 l6;
   private final j5 k5;
   private final j5 u3;

   public a6(boolean var1) {
      this.n5 = var1;
      this.l6 = new j5(new e2());
      this.l6.n5(true);
      this.k5 = new j5(new e2());
      this.k5.n5(true);
      this.u3 = new j5(new e2());
      this.u3.n5(true);
   }

   public a6() {
      this(true);
   }

   public final void n5(com.aspose.slides.internal.x6.n5 var1) {
      com.aspose.slides.internal.e4.h0 var2 = (com.aspose.slides.internal.e4.h0)var1.l6(com.aspose.slides.internal.x6.k5.y4);
      int var3 = var2.a6();
      com.aspose.slides.internal.e4.u9 var4 = (com.aspose.slides.internal.e4.u9)var1.l6(com.aspose.slides.internal.x6.k5.n3);

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var2.n5(var5);
         int var7 = var2.l6(var5);
         com.aspose.slides.internal.e4.u3 var8 = var4.n5(var6, var7);
         this.n5(var8);
      }
   }

   private void n5(com.aspose.slides.internal.e4.u3 var1) {
      try {
         if (var1 == null || var1.l6() == 0) {
            this.n5(0);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e4.c8.class)) {
            this.n5((com.aspose.slides.internal.e4.c8)var1);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e4.n5.class)) {
            this.n5((com.aspose.slides.internal.e4.n5)var1);
         }
      } catch (IOException var3) {
         throw new Exception("unexpected IOException writing glyph data", var3);
      }
   }

   private void l6(com.aspose.slides.internal.e4.u3 var1) {
      if (this.n5) {
         this.k5(var1);
      } else {
         byte var2 = 0;
         int var3 = var1.a6();
         n5(this.l6, var2);
         n5(this.l6, var3);
         if (var3 > 0) {
            var1.u9().n5(this.u3);
         }
      }
   }

   private void n5(com.aspose.slides.internal.e4.c8 var1) {
      int var2 = var1.h0();
      this.n5(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         n5(this.l6, var1.k5(var3) - (var3 == 0 ? 1 : 0));
      }

      j5 var13 = new j5(new e2());
      var13.n5(true);
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1.k5(var6);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var1.n5(var6, var8);
            int var10 = var1.l6(var6, var8);
            int var11 = var9 - var4;
            int var12 = var10 - var5;
            this.n5(var13, var1.k5(var6, var8), var11, var12);
            var4 = var9;
            var5 = var10;
         }
      }

      byte[] var14 = ((e2)var13.n5()).toArray();
      this.l6.n5().write(var14, 0, var14.length);
      if (var2 > 0) {
         this.l6(var1);
      }
   }

   private void n5(com.aspose.slides.internal.e4.n5 var1) {
      boolean var2 = false;
      this.n5(-1);
      this.n5(var1.c8());
      this.n5(var1.s7());
      this.n5(var1.t2());
      this.n5(var1.x8());

      for (int var3 = 0; var3 < var1.u3(); var3++) {
         int var4 = var1.l6(var3);
         this.n5(var4);
         var2 = (var4 & 256) != 0;
         this.n5(var1.k5(var3));
         if ((var4 & 1) == 0) {
            this.l6.n5().writeByte((byte)var1.u3(var3));
            this.l6.n5().writeByte((byte)var1.a6(var3));
         } else {
            this.n5(var1.u3(var3));
            this.n5(var1.a6(var3));
         }

         if (var1.u9(var3) != 0) {
            try {
               byte[] var5 = var1.h0(var3);
               this.l6.n5().write(var5, 0, var5.length);
            } catch (IOException var6) {
            }
         }
      }

      if (var2) {
         this.l6(var1);
      }
   }

   private void n5(int var1) {
      this.l6.n5().writeByte((byte)(var1 >> 8));
      this.l6.n5().writeByte((byte)(var1 & 0xFF));
   }

   private static void n5(j5 var0, int var1) {
      if (var1 < 0) {
         throw new InvalidOperationException();
      }

      if (var1 < 253) {
         var0.n5().writeByte((byte)var1);
      } else if (var1 < 506) {
         var0.n5().writeByte((byte)-1);
         var0.n5().writeByte((byte)(var1 - 253));
      } else if (var1 < 762) {
         var0.n5().writeByte((byte)-2);
         var0.n5().writeByte((byte)(var1 - 506));
      } else {
         var0.n5().writeByte((byte)-3);
         var0.n5().writeByte((byte)(var1 >> 8));
         var0.n5().writeByte((byte)(var1 & 0xFF));
      }
   }

   private static void l6(j5 var0, int var1) {
      short var2 = 250;
      short var3 = (short)var1;
      if (var3 < 3 * var2 && var3 > 3 * -var2) {
         if (var3 < 0) {
            var0.n5().writeByte((byte)-6);
            var3 = (short)(-var3);
         }

         if (var3 >= var2) {
            var3 -= var2;
            if (var3 >= var2) {
               var3 -= var2;
               var0.n5().writeByte((byte)-2);
            } else {
               var0.n5().writeByte((byte)-1);
            }
         }

         var0.n5().writeByte((byte)var3);
      } else {
         var0.n5().writeByte((byte)-3);
         var0.n5().writeByte((byte)(var3 >> 8));
         var0.n5().writeByte((byte)(var3 & 0xFF));
      }
   }

   private void n5(j5 var1, boolean var2, int var3, int var4) {
      int var5 = q1.n5(var3);
      int var6 = q1.n5(var4);
      int var7 = var2 ? 0 : 128;
      int var8 = var3 < 0 ? 0 : 1;
      int var9 = var4 < 0 ? 0 : 1;
      int var10 = var8 + 2 * var9;
      if (var3 == 0 && var6 < 1280) {
         this.l6.n5().writeByte((byte)(var7 + ((var6 & 3840) >> 7) + var9));
         var1.n5().writeByte((byte)(var6 & 0xFF));
      } else if (var4 == 0 && var5 < 1280) {
         this.l6.n5().writeByte((byte)(var7 + 10 + ((var5 & 3840) >> 7) + var8));
         var1.n5().writeByte((byte)(var5 & 0xFF));
      } else if (var5 < 65 && var6 < 65) {
         this.l6.n5().writeByte((byte)(var7 + 20 + (var5 - 1 & 48) + ((var6 - 1 & 48) >> 2) + var10));
         var1.n5().writeByte((byte)((var5 - 1 & 15) << 4 | var6 - 1 & 15));
      } else if (var5 < 769 && var6 < 769) {
         this.l6.n5().writeByte((byte)(var7 + 84 + 12 * ((var5 - 1 & 768) >> 8) + ((var6 - 1 & 768) >> 6) + var10));
         var1.n5().writeByte((byte)(var5 - 1 & 0xFF));
         var1.n5().writeByte((byte)(var6 - 1 & 0xFF));
      } else if (var5 < 4096 && var6 < 4096) {
         this.l6.n5().writeByte((byte)(var7 + 120 + var10));
         var1.n5().writeByte((byte)(var5 >> 4));
         var1.n5().writeByte((byte)((var5 & 15) << 4 | var6 >> 8));
         var1.n5().writeByte((byte)(var6 & 0xFF));
      } else {
         this.l6.n5().writeByte((byte)(var7 + 124 + var10));
         var1.n5().writeByte((byte)(var5 >> 8));
         var1.n5().writeByte((byte)(var5 & 0xFF));
         var1.n5().writeByte((byte)(var6 >> 8));
         var1.n5().writeByte((byte)(var6 & 0xFF));
      }
   }

   private void k5(com.aspose.slides.internal.e4.u3 var1) {
      int var2 = var1.a6();
      com.aspose.slides.internal.m9.h0 var3 = var1.u9();
      int var4 = 0;
      List var5 = new List();

      while (var4 + 1 < var2) {
         int var6 = var4;
         int var7 = var3.k5(var6++);
         int var8 = 0;
         int var9 = 0;
         if (var7 != 64 && var7 != 65) {
            if (var7 < 176 || var7 >= 192) {
               break;
            }

            var8 = 1 + (var7 & 7);
            var9 = ((var7 & 8) >> 3) + 1;
         } else {
            var8 = var3.k5(var6++);
            var9 = (var7 & 1) + 1;
         }

         if (var4 + var9 * var8 > var2) {
            break;
         }

         for (int var10 = 0; var10 < var8; var10++) {
            if (var9 == 1) {
               var5.addItem(var3.k5(var6));
            } else {
               var5.addItem(var3.u9(var6));
            }

            var6 += var9;
         }

         var4 = var6;
      }

      int var12 = var5.size();
      int var13 = var2 - var4;
      n5(this.l6, var12);
      n5(this.l6, var13);
      n5(this.k5, var5);
      if (var13 > 0) {
         ((com.aspose.slides.internal.m9.h0)var3.l6(var4)).n5(this.u3);
      }
   }

   private static void n5(j5 var0, List<Integer> var1) {
      int var2 = var1.size();
      byte var3 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         if ((var3 & 1) == 0) {
            int var5 = (Integer)var1.get_Item(var4);
            if (var3 != 0 || var4 < 2 || var4 + 2 >= var2 || var5 != (Integer)var1.get_Item(var4 - 2) || var5 != (Integer)var1.get_Item(var4 + 2)) {
               l6(var0, (Integer)var1.get_Item(var4));
            } else if (var4 + 4 < var2 && var5 == (Integer)var1.get_Item(var4 + 4)) {
               var0.n5().writeByte((byte)-4);
               var3 = 20;
            } else {
               var0.n5().writeByte((byte)-5);
               var3 = 4;
            }
         }

         var3 >>= 1;
      }
   }

   public final byte[] n5() {
      return ((e2)this.l6.n5()).toArray();
   }

   public final byte[] l6() {
      return ((e2)this.k5.n5()).toArray();
   }

   public final byte[] k5() {
      return ((e2)this.u3.n5()).toArray();
   }
}
