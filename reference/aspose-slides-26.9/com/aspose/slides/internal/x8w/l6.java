package com.aspose.slides.internal.x8w;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.p8;

public class l6 {
   private byte n5;
   private byte[] l6;
   private ArrayList k5;

   public l6() {
      this((byte)0, null);
   }

   public l6(byte var1) {
      this(var1, null);
   }

   public l6(byte var1, byte[] var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public l6(byte[] var1) {
      this.n5 = var1[0];
      int var2 = 0;
      int var3 = var1[1] & 255;
      if (var3 > 128) {
         var2 = var3 - 128;
         var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            var3 *= 256;
            var3 += var1[var4 + 2] & 255;
         }
      } else if (var3 == 128) {
         throw new NotSupportedException("Undefined length encoding.");
      }

      this.l6 = new byte[var3];
      com.aspose.slides.ms.System.y4.n5(var1, 2 + var2, this.l6, 0, var3);
      if ((this.n5 & 255 & 32) == 32) {
         int var7 = 2 + var2;
         int[] var5 = new int[]{var7};
         this.n5(var1, var5, var1.length);
         var7 = var5[0];
      }
   }

   public int n5() {
      return this.k5 == null ? 0 : this.k5.size();
   }

   public byte l6() {
      return this.n5;
   }

   public int k5() {
      return this.l6 != null ? this.l6.length : 0;
   }

   public byte[] u3() {
      if (this.l6 == null) {
         this.a6();
      }

      return (byte[])this.l6.clone();
   }

   public void n5(byte[] var1) {
      if (var1 != null) {
         this.l6 = (byte[])var1.clone();
      }
   }

   private boolean n5(byte[] var1, byte[] var2) {
      boolean var3 = var1.length == var2.length;
      if (var3) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (var1[var4] != var2[var4]) {
               return false;
            }
         }
      }

      return var3;
   }

   public boolean l6(byte[] var1) {
      return this.n5(this.l6, var1);
   }

   public l6 n5(l6 var1) {
      if (var1 != null) {
         if (this.k5 == null) {
            this.k5 = new ArrayList();
         }

         this.k5.addItem(var1);
      }

      return var1;
   }

   public byte[] a6() {
      byte[] var1 = null;
      if (this.n5() > 0) {
         int var2 = 0;
         ArrayList var3 = new ArrayList();

         for (Object recoveredElement$var5$2470 : this.k5) {
            l6 var5 = (l6)recoveredElement$var5$2470;
            byte[] var6 = var5.a6();
            var3.addItem(var6);
            var2 += var6.length;
         }

         var1 = new byte[var2];
         int var9 = 0;

         for (int var11 = 0; var11 < this.k5.size(); var11++) {
            byte[] var12 = (byte[])var3.get_Item(var11);
            com.aspose.slides.ms.System.y4.n5(var12, 0, var1, var9, var12.length);
            var9 += var12.length;
         }
      } else if (this.l6 != null) {
         var1 = this.l6;
      }

      int var8 = 0;
      byte[] var7;
      if (var1 != null) {
         int var10 = var1.length;
         if (var10 > 127) {
            if (var10 <= 255) {
               var7 = new byte[3 + var10];
               com.aspose.slides.ms.System.y4.n5(var1, 0, var7, 3, var10);
               var8 = 129;
               var7[2] = (byte)var10;
            } else if (var10 <= 65535) {
               var7 = new byte[4 + var10];
               com.aspose.slides.ms.System.y4.n5(var1, 0, var7, 4, var10);
               var8 = 130;
               var7[2] = (byte)(var10 >> 8);
               var7[3] = (byte)var10;
            } else if (var10 <= 16777215) {
               var7 = new byte[5 + var10];
               com.aspose.slides.ms.System.y4.n5(var1, 0, var7, 5, var10);
               var8 = 131;
               var7[2] = (byte)(var10 >> 16);
               var7[3] = (byte)(var10 >> 8);
               var7[4] = (byte)var10;
            } else {
               var7 = new byte[6 + var10];
               com.aspose.slides.ms.System.y4.n5(var1, 0, var7, 6, var10);
               var8 = 132;
               var7[2] = (byte)(var10 >> 24);
               var7[3] = (byte)(var10 >> 16);
               var7[4] = (byte)(var10 >> 8);
               var7[5] = (byte)var10;
            }
         } else {
            var7 = new byte[2 + var10];
            com.aspose.slides.ms.System.y4.n5(var1, 0, var7, 2, var10);
            var8 = var10;
         }

         if (this.l6 == null) {
            this.l6 = var1;
         }
      } else {
         var7 = new byte[2];
      }

      var7[0] = this.n5;
      var7[1] = (byte)var8;
      return var7;
   }

   protected void n5(byte[] var1, int[] var2, int var3) {
      byte var4 = 0;
      int var5 = 0;
      byte[] var6 = null;

      while (var2[0] < var3 - 1) {
         byte[] var7 = new byte[]{var4};
         int[] var8 = new int[]{var5};
         byte[][] var9 = new byte[][]{var6};
         this.n5(var1, var2, var7, var8, var9);
         var4 = var7[0];
         var5 = var8[0];
         var6 = var9[0];
         if (var4 != 0) {
            l6 var10 = this.n5(new l6(var4, var6));
            if ((var4 & 255 & 32) == 32) {
               int var11 = var2[0];
               int[] var12 = new int[]{var11};
               var10.n5(var1, var12, var11 + var5);
               var11 = var12[0];
            }

            var2[0] += var5;
         }
      }
   }

   protected void n5(byte[] var1, int[] var2, byte[] var3, int[] var4, byte[][] var5) {
      var3[0] = var1[var2[0]++];
      var4[0] = var1[var2[0]++] & 255;
      if ((var4[0] & 128) == 128) {
         int var6 = var4[0] & 127;
         var4[0] = 0;

         for (int var7 = 0; var7 < var6; var7++) {
            var4[0] = var4[0] * 256 + (var1[var2[0]++] & 255);
         }
      }

      var5[0] = new byte[var4[0]];
      com.aspose.slides.ms.System.y4.n5(var1, var2[0], var5[0], 0, var4[0]);
   }

   public l6 n5(int var1) {
      try {
         return this.k5 != null && var1 < this.k5.size() ? (l6)this.k5.get_Item(var1) : null;
      } catch (ArgumentException var3) {
         return null;
      }
   }

   public l6 n5(int var1, byte var2) {
      try {
         if (this.k5 != null && var1 < this.k5.size()) {
            l6 var3 = (l6)this.k5.get_Item(var1);
            return var3.l6() == var2 ? var3 : null;
         } else {
            return null;
         }
      } catch (ArgumentException var4) {
         return null;
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      a5.n5(var1, "Tag: {0} {1}", com.aspose.slides.ms.System.e2.n5(this.n5, "X2"), p8.n5);
      a5.n5(var1, "Length: {0} {1}", this.u3().length, p8.n5);
      var1.n5("Value: ");
      var1.n5(p8.n5);

      for (int var2 = 0; var2 < this.u3().length; var2++) {
         a5.n5(var1, "{0} ", com.aspose.slides.ms.System.e2.n5(this.u3()[var2], "X2"));
         if ((var2 + 1) % 16 == 0) {
            a5.n5(var1, p8.n5);
         }
      }

      return var1.toString();
   }
}
