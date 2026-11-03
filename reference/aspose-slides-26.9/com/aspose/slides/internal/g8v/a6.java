package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ArrayList;

class a6 {
   y5 n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private com.aspose.slides.internal.l7h.a5 u9;
   private boolean h0;
   private boolean c8;
   private int t2;
   private ArrayList s7;

   public a6(byte[] var1, int var2, int var3, y5 var4) {
      this(var4);
      this.l6(var1, var2, var3);
   }

   public a6(y5 var1) {
      this.n5 = var1;
      this.u9 = new com.aspose.slides.internal.l7h.a5();
      this.s7 = new ArrayList();
      this.l6 = -1;
      this.u3 = 0;
   }

   public void n5() {
      this.l6 = -1;
      this.k5 = 0;
      this.u3 = 0;
      this.s7.clear();
   }

   public void n5(byte[] var1, int var2, int var3, int[] var4) {
      if (var2 + var4[0] > 0) {
         this.l6(var1, var2, var2 + var4[0]);
      }

      var4[0] = this.n5(var1, var2, var3);
   }

   public int n5(byte[] var1, int var2, int var3) {
      return this.k5(var1, var2, var3);
   }

   private int k5(byte[] var1, int var2, int var3) {
      int var4 = this.s7.size();
      int var5 = 0;

      for (int var6 = 0; var6 < var4; var6++) {
         a6$n5 var7 = (a6$n5)this.s7.get_Item(var6);
         if (var7 != null) {
            if (var7.l6 == com.aspose.slides.ms.System.u3.n5((Object)(var7.n5)).a6()) {
               this.s7.set_Item(var6, null);
            } else {
               var5 += var7.n5(var1, var2 + var5, var3 - var5);
               if (var5 == var3) {
                  break;
               }
            }
         }
      }

      return var5;
   }

   public void l6(byte[] var1, int var2, int var3) {
      if (var2 < var3) {
         int[] var4 = new int[]{var2};
         this.n5(var1, var4, var3);
         var2 = var4[0];
      }
   }

   private void n5(byte[] var1, int[] var2, int var3) {
      if (this.a6 == 0) {
         this.a6 = this.k5(var1, var2, var3);
         if (this.a6 == 0) {
            return;
         }

         this.u9.n5(0);
         this.h0 = false;
         this.c8 = false;
      }

      if (this.a6 == 1 && var2[0] < var3) {
         this.a6 = this.l6(var1, var2, var3);
         if (this.a6 == 1) {
            return;
         }
      }

      if (this.a6 == 2 && var2[0] < var3) {
         this.a6 = this.u3(var1, var2, var3);
         if (this.a6 == 2) {
            return;
         }

         this.h0 = false;
      }

      if (this.a6 == 3 && var2[0] < var3) {
         this.a6 = this.a6(var1, var2, var3);
         if (this.a6 == 3) {
            return;
         }

         this.u9.n5(0);
         this.h0 = false;
         this.c8 = false;
      }

      if (var2[0] < var3) {
         this.n5(var1, var2, var3);
      }
   }

   public boolean l6() {
      return this.k5 != this.l6 || this.l6 != 0 || this.a6 != 0;
   }

   public boolean k5() {
      int var1 = this.s7.size();

      for (int var2 = 0; var2 < var1; var2++) {
         a6$n5 var3 = (a6$n5)this.s7.get_Item(var2);
         if (var3 != null
            && var3.n5 != null
            && com.aspose.slides.ms.System.u3.n5((Object)(var3.n5)).a6() > 0
            && var3.l6 < com.aspose.slides.ms.System.u3.n5((Object)(var3.n5)).a6()) {
            return this.a6 != 1;
         }
      }

      return false;
   }

   public int u3() {
      return this.l6 - this.k5;
   }

   private int l6(byte[] var1, int[] var2, int var3) {
      if (this.l6 == 0) {
         return 2;
      }

      int var4 = var3 - var2[0];
      if (var4 + this.k5 > this.l6) {
         var4 = this.l6 - this.k5;
      }

      byte[] var5 = new byte[var4];
      com.aspose.slides.ms.System.y4.n5(var1, var2[0], var5, 0, var4);
      this.s7.addItem(new a6$n5(var5));
      var2[0] += var4;
      this.k5 += var4;
      this.u3 += var4;
      return this.k5 == this.l6 ? 2 : 1;
   }

   private int k5(byte[] var1, int[] var2, int var3) {
      this.k5 = 0;
      this.l6 = 0;
      char var4 = 0;

      while (var2[0] < var3) {
         var4 = com.aspose.slides.internal.v6g.k5.x8(var1[var2[0]++], 6);
         if (var4 == '\r') {
            if (this.h0) {
               l6("2 CR found");
            }

            this.h0 = true;
         } else {
            if (this.h0 && var4 == '\n') {
               break;
            }

            if (var4 == ' ') {
               this.c8 = true;
            }

            if (!this.c8) {
               this.u9.n5(var4);
            }

            if (this.u9.l6() > 20) {
               l6("chunk size too long.");
            }
         }
      }

      if (this.h0 && var4 == '\n') {
         this.k5 = 0;

         try {
            this.l6 = com.aspose.slides.ms.System.a3.n5(n5(this.u9.toString()), 515);
         } catch (RuntimeException var6) {
            l6("Cannot parse chunk size.");
         }

         if (this.l6 == 0) {
            this.t2 = 2;
            return 3;
         } else {
            return 1;
         }
      } else {
         if (var2[0] < var3) {
            l6("Missing \\n");
         }

         try {
            if (this.u9.l6() > 0) {
               this.l6 = com.aspose.slides.ms.System.a3.n5(n5(this.u9.toString()), 515);
            }
         } catch (RuntimeException var7) {
            l6("Cannot parse chunk size.");
         }

         return 0;
      }
   }

   static String n5(String var0) {
      int var1 = com.aspose.slides.ms.System.d1.u3(var0, ';');
      return var1 == -1 ? var0 : com.aspose.slides.ms.System.d1.l6(var0, 0, var1);
   }

   private int u3(byte[] var1, int[] var2, int var3) {
      if (!this.h0) {
         if (com.aspose.slides.internal.v6g.k5.x8(var1[var2[0]++], 6) != '\r') {
            l6("Expecting \\r");
         }

         this.h0 = true;
         if (var2[0] == var3) {
            return 2;
         }
      }

      if (this.h0 && com.aspose.slides.internal.v6g.k5.x8(var1[var2[0]++], 6) != '\n') {
         l6("Expecting \\n");
      }

      return 0;
   }

   private int a6(byte[] var1, int[] var2, int var3) {
      char var4 = '\u0000';
      if (this.t2 == 2 && com.aspose.slides.internal.v6g.k5.x8(var1[var2[0]], 6) == '\r' && this.u9.l6() == 0) {
         var2[0]++;
         if (var2[0] < var3 && com.aspose.slides.internal.v6g.k5.x8(var1[var2[0]], 6) == '\n') {
            var2[0]++;
            return 0;
         }

         var2[0]--;
      }

      int var5 = this.t2;
      String var6 = "\r\n\r";

      while (var2[0] < var3 && var5 < 4) {
         var4 = com.aspose.slides.internal.v6g.k5.x8(var1[var2[0]++], 6);
         if ((var5 == 0 || var5 == 2) && var4 == '\r') {
            var5++;
         } else if ((var5 == 1 || var5 == 3) && var4 == '\n') {
            var5++;
         } else if (var5 > 0) {
            this.u9.n5(com.aspose.slides.ms.System.d1.l6(var6, 0, this.u9.l6() == 0 ? var5 - 2 : var5));
            var5 = 0;
            if (this.u9.l6() > 4196) {
               l6("Error reading trailer (too long).");
            }
         }
      }

      if (var5 < 4) {
         this.t2 = var5;
         if (var2[0] < var3) {
            l6("Error reading trailer.");
         }

         return 3;
      } else {
         com.aspose.slides.internal.z0k.w1 var7 = new com.aspose.slides.internal.z0k.w1(this.u9.toString());

         String var8;
         while ((var8 = var7.h0()) != null && !"".equals(var8)) {
            this.n5.n5(var8);
         }

         return 0;
      }
   }

   static void l6(String var0) {
      throw new a7(var0, null, 11, null);
   }
}
