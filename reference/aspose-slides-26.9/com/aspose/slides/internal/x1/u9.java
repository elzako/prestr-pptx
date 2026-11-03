package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.n8e.v4;
import com.aspose.slides.ms.System.q1;

public class u9 extends c8 {
   private byte[] x8 = null;
   private boolean n3 = false;
   private boolean y4 = false;

   public u9() {
      this.x8 = new byte[10];
      this.l6 = 2;
   }

   public u9(String var1) {
      this.x8 = new byte[10];
      this.l6 = 2;
      this.n5(var1);
   }

   public u9(long var1, n5 var3, s7 var4) {
      this.n5(var1, var3, var4);
      this.l6 = 2;
   }

   public u9(int var1) {
      this.x8 = new byte[var1];
      this.l6 = 2;
   }

   private void y4() {
      if (this.n3) {
         throw new InvalidOperationException("The stream data is corrupted");
      }
   }

   public final boolean n5(byte[] var1) {
      int var2 = var1.length;
      this.y4();
      this.a6(this.t2 + var2);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), this.t2, var2);
      this.t2 += var2;
      return var2 != 0;
   }

   private void a6(int var1) {
      int var2 = this.x8.length;
      if (var1 > var2) {
         int var3 = var2 * 3 / 2 + 1;
         if (var3 < var1) {
            var3 = var1;
         }

         byte[] var4 = new byte[var3];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), com.aspose.slides.ms.System.u3.n5((Object)(var4)), this.x8.length);
         this.x8 = var4;
      }
   }

   public final List<y4> n5(int var1) {
      this.y4();
      List var2 = new List();
      int var3 = 0;

      do {
         byte[] var4 = new byte[var1];
         v4.n5(var4, (byte)-1);
         int var5 = var3 + var1 < this.t2 ? var1 : this.t2 - var3;
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), var3, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var5);
         var2.addItem(new y4(var4));
         var3 += var1;
      } while (var3 < this.t2);

      return var2;
   }

   public final int l6(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)this.t2 / var1), 14);
   }

   public final void n5(long var1, n5 var3, s7 var4) {
      long[] var5 = var3.n5(var1);
      int var6 = var4.n5(0).n5().length;
      int var7 = this.n3();
      if (var5.length * var6 < var7) {
         var7 = var5.length * var6;
         this.n3 = true;
      }

      if (var7 == 0) {
         var7 = var5.length * var6;
      }

      this.x8 = new byte[var7];

      for (int var8 = 0; var8 < var5.length; var8++) {
         y4 var9 = var4.n5((int)var5[var8]);
         if (var9 == null) {
            this.y4 = true;
            return;
         }

         if (var7 <= var6) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9.n5())), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), var8 * var6, var7);
            break;
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9.n5())), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), var8 * var6, var6);
         var7 -= var6;
      }
   }

   public final void n5(long var1, n5 var3, List<y4> var4) {
      if ((var1 & 4294967295L) < 4294967290L) {
         Object var5 = null;
         long[][] var6 = new long[][]{(long[])var5};
         boolean var7 = !this.n5(var1, var3, var6);
         var5 = var6[0];
         if (var7) {
            this.n3 = true;
         } else {
            int var8 = ((y4)var4.get_Item(0)).n5().length;
            int var9 = this.n3();
            if (((long[])var5).length * var8 < var9) {
               throw new Exception("Size of entry less that it is declared!");
            }

            if (var9 == 0) {
               var9 = ((long[])var5).length * var8;
            }

            this.x8 = new byte[var9];

            for (int var10 = 0; var10 < ((long[])var5).length; var10++) {
               y4 var11 = (y4)var4.get_Item((int)((long[])var5)[var10]);
               if (var9 <= var8) {
                  com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5((Object)(var11.n5())), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), var10 * var8, var9
                  );
                  break;
               }

               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5((Object)(var11.n5())), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), var10 * var8, var8
               );
               var9 -= var8;
            }
         }
      }
   }

   public final byte[] n5() {
      this.y4();
      return this.x8;
   }

   public final byte[] l6() {
      this.y4();
      byte[] var1 = new byte[this.t2];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.x8)), com.aspose.slides.ms.System.u3.n5((Object)(var1)), this.t2);
      return var1;
   }

   public final boolean k5() {
      return this.y4;
   }

   private boolean n5(long var1, n5 var3, long[][] var4) {
      var4[0] = null;

      try {
         var4[0] = var3.n5(var1);
         return true;
      } catch (RuntimeException var6) {
         this.n3 = true;
         return false;
      }
   }
}
