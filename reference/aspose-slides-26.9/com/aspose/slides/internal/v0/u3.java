package com.aspose.slides.internal.v0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class u3 implements com.aspose.slides.internal.s3.l6, com.aspose.slides.internal.s3.n5 {
   public static final s7 n5 = new s7("any", "normal", 400, 97, 0);
   private String l6;
   private s7 k5;
   private int u3;
   private int a6;
   private t9 u9;
   private com.aspose.slides.internal.p1s.l6 h0 = null;

   public final com.aspose.slides.internal.p1s.l6 k5() {
      if (this.h0 == null) {
         s7 var1 = this.c8();
         byte var2 = 0;
         int var3 = var1.k5();
         String var4 = var1.l6();
         if ("italic".equals(var4) || "oblique".equals(var4)) {
            var2 = (byte)(var2 & 0xFF | 2);
         }

         if (var3 >= 600) {
            var2 = (byte)(var2 & 0xFF | 1);
         }

         String var5 = this.u3().l6();
         i1 var6 = com.aspose.slides.internal.r4.z1.n5().n5(var5, var4, var3);
         if (var6 != null) {
            this.h0 = new com.aspose.slides.internal.p1s.l6(this.t2() / 1000.0F, var2 & 255, var6);
         } else {
            if ("Helvetica-Bold".equals(var5) || "Helvetica-BoldOblique".equals(var5)) {
               var5 = "Helvetica";
            } else if ("Courier-Bold".equals(var5) || "Courier-BoldOblique".equals(var5)) {
               var5 = "Courier";
            }

            this.h0 = com.aspose.slides.internal.e1x.x8.u3().n5(var5, this.t2() / 1000.0F, var2 & 255, com.aspose.slides.internal.c8e.n5.l6(var5));
         }
      }

      return this.h0;
   }

   public u3(String var1, s7 var2, t9 var3, int var4, int var5) {
      this.l6 = var1;
      this.k5 = var2;
      this.u9 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public final t9 u3() {
      return this.u9;
   }

   public final int a6() {
      return this.u9.l6(this.u3) / 1000;
   }

   public final int u9() {
      return this.u9.u3(this.u3) / 1000;
   }

   public final String h0() {
      return this.l6;
   }

   public final s7 c8() {
      return this.k5;
   }

   public final int t2() {
      return this.u3;
   }

   public final int s7() {
      return this.a6;
   }

   public final int x8() {
      return this.u9.a6(this.u3) / 1000;
   }

   public final boolean n3() {
      return this.u9.u3();
   }

   public final Dictionary<Integer, Dictionary<Integer, Integer>> y4() {
      return this.u9.u3() ? this.u9.a6() : new Dictionary<>();
   }

   public final int n5(char var1, char var2) {
      Dictionary var3 = this.y4().get_Item(Integer.valueOf(var1));
      if (var3 != null && var3.containsKey(Integer.valueOf(var2))) {
         int var4 = (Integer)var3.get_Item(Integer.valueOf(var2));
         return var4 * this.t2() / 1000;
      } else {
         return 0;
      }
   }

   public final int n5(int var1, int var2) {
      if (var1 > 65536) {
         return 0;
      } else if (var1 >= 55296 && var1 <= 57344) {
         return 0;
      } else if (var2 > 65536) {
         return 0;
      } else {
         return var2 >= 55296 && var2 <= 57344 ? 0 : this.n5((char)var1, (char)var2);
      }
   }

   public final int n5(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.u9.n5(var1, this.u3) / 1000.0F, 13);
   }

   public final int l6(int var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, t4.class)) {
         return ((t4)this.u9).n5(var1);
      }

      int var2 = com.aspose.slides.internal.v0.l6.n5("WinAnsiEncoding").n5(var1);
      if (var2 != 0) {
         var1 = var2;
      } else {
         var1 = 35;
      }

      return var1;
   }

   public final boolean n5(char var1) {
      return com.aspose.slides.internal.v6g.k5.l6(this.u9, t4.class)
         ? ((t4)this.u9).n5(var1)
         : com.aspose.slides.internal.v0.l6.n5("WinAnsiEncoding").n5(var1) > 0;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5('{');
      var1.n5(this.l6);
      var1.n5(',');
      var1.k5(this.u3);
      var1.n5('}');
      return var1.toString();
   }

   public final int l6(char var1) {
      int var2;
      if (var1 == '\n' || var1 == '\r' || var1 == '\t' || var1 == 160) {
         var2 = this.l6(' ');
      } else if (var1 >= 8234 && var1 <= 8238) {
         var2 = 0;
      } else {
         if (this.n5(var1)) {
            int var3 = this.l6((int)var1);
            var2 = this.n5(var3);
         } else {
            var2 = -1;
         }

         if (var2 <= 0) {
            int var5 = this.t2();
            int var4 = var5 / 2;
            if (var1 == ' ') {
               var2 = var5;
            } else if (var1 == 8192) {
               var2 = var4;
            } else if (var1 == 8193) {
               var2 = var5;
            } else if (var1 == 8194) {
               var2 = var5 / 2;
            } else if (var1 == 8195) {
               var2 = this.t2();
            } else if (var1 == 8196) {
               var2 = var5 / 3;
            } else if (var1 == 8197) {
               var2 = var5 / 4;
            } else if (var1 == 8198) {
               var2 = var5 / 6;
            } else if (var1 == 8199) {
               var2 = this.l6('0');
            } else if (var1 == 8200) {
               var2 = this.l6('.');
            } else if (var1 == 8201) {
               var2 = var5 / 5;
            } else if (var1 == 8202) {
               var2 = var5 / 10;
            } else if (var1 == 8203) {
               var2 = 0;
            } else if (var1 == 8239) {
               var2 = this.l6(' ') / 2;
            } else if (var1 == 8288) {
               var2 = 0;
            } else if (var1 == 12288) {
               var2 = this.l6(' ') * 2;
            } else if (var1 == '\ufeff') {
               var2 = 0;
            } else {
               var2 = this.n5(this.l6((int)var1));
            }
         }
      }

      return var2;
   }

   public final int k5(int var1) {
      return var1 < 65536 ? this.l6((char)var1) : -1;
   }

   public final int n5(String var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = var1.length();
      int var3 = 0;
      char[] var4 = d1.k5(var1, 0, var2);

      for (int var5 = 0; var5 < var2; var5++) {
         var3 += this.l6(var4[var5]);
      }

      return var3;
   }

   @Override
   public final boolean l6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, com.aspose.slides.internal.s3.l6.class)) {
         com.aspose.slides.internal.s3.l6 var1 = (com.aspose.slides.internal.s3.l6)this.u9;
         return var1.l6();
      } else {
         return false;
      }
   }

   @Override
   public final com.aspose.slides.internal.r4.a6 n5(com.aspose.slides.internal.r4.a6 var1, String var2, String var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, com.aspose.slides.internal.s3.l6.class)) {
         com.aspose.slides.internal.s3.l6 var4 = (com.aspose.slides.internal.s3.l6)this.u9;
         return var4.n5(var1, var2, var3);
      } else {
         throw new NotSupportedException();
      }
   }

   @Override
   public final com.aspose.slides.internal.r4.a6 n5(com.aspose.slides.internal.r4.a6 var1, int[][] var2, String var3, String var4) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, com.aspose.slides.internal.s3.l6.class)) {
         com.aspose.slides.internal.s3.l6 var5 = (com.aspose.slides.internal.s3.l6)this.u9;
         return var5.n5(var1, var2, var3, var4);
      } else {
         throw new NotSupportedException();
      }
   }

   @Override
   public final boolean n5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, com.aspose.slides.internal.s3.n5.class)) {
         com.aspose.slides.internal.s3.n5 var1 = (com.aspose.slides.internal.s3.n5)this.u9;
         return var1.n5();
      } else {
         return false;
      }
   }

   @Override
   public final int[][] n5(com.aspose.slides.internal.r4.a6 var1, String var2, String var3, int var4) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, com.aspose.slides.internal.s3.n5.class)) {
         com.aspose.slides.internal.s3.n5 var5 = (com.aspose.slides.internal.s3.n5)this.u9;
         return var5.n5(var1, var2, var3, var4);
      } else {
         throw new NotSupportedException();
      }
   }

   public final int[][] l6(com.aspose.slides.internal.r4.a6 var1, String var2, String var3) {
      return this.n5(var1, var2, var3, this.u3);
   }
}
