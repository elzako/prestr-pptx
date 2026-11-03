package com.aspose.slides.internal.d5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.d2.e2;
import com.aspose.slides.internal.d2.n3;
import com.aspose.slides.internal.d2.s7;
import com.aspose.slides.internal.d2.t2;
import com.aspose.slides.internal.d2.t4;
import com.aspose.slides.internal.d2.x8;
import com.aspose.slides.internal.d2.y4;
import com.aspose.slides.internal.d2.z1;
import com.aspose.slides.internal.l7h.a5;

public class a6 {
   private com.aspose.slides.internal.d2.c8 n5;
   private int[] l6;
   private int k5;
   private int u3;
   private int a6;

   public a6(com.aspose.slides.internal.d2.c8 var1, int[] var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.n5(var2);
   }

   public a6(com.aspose.slides.internal.d2.c8 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = n5(var2, var3);
      this.n5(this.l6);
   }

   public final com.aspose.slides.internal.d2.c8 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.k5;
   }

   public final int[] k5() {
      return this.l6;
   }

   public final void n5(int[] var1) {
      int var2 = Integer.MAX_VALUE;
      int var3 = Integer.MIN_VALUE;
      if (var1 != null && var1.length > 0) {
         int var4 = 0;

         for (int var5 = var1.length; var4 < var5; var4++) {
            int var6 = var1[var4];
            if (var6 < var2) {
               var2 = var6;
            }

            if (var6 > var3) {
               var3 = var6;
            }
         }
      } else {
         var3 = -1;
         var2 = -1;
      }

      this.k5 = var2;
      this.u3 = var3;
   }

   public final boolean u3() {
      return this.k5 == this.u3;
   }

   public final List<a6> a6() {
      List var1 = new List();
      int var2 = 0;
      int var3 = this.l6.length;

      while (var2 < var3) {
         int var4 = this.l6[var2];
         int var5 = var2;
         int var6 = var5;

         while (var6 < var3 && this.l6[var6] == var4) {
            var6++;
         }

         if (var5 < var6) {
            var1.addItem(new a6(this.n5, var4, var6 - var5));
         }

         var2 = var6;
      }

      return var1;
   }

   public final void l6(int[] var1) {
      if (this.k5 < var1[0]) {
         var1[0] = this.k5;
      }

      if (this.u3 > var1[1]) {
         var1[1] = this.u3;
      }
   }

   public final boolean u9() {
      return this.k5 == this.u3 && (this.k5 & 1) != 0;
   }

   public final void h0() {
      this.a6++;
   }

   public final void n5(boolean var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, t4.class)) {
         t4 var2 = (t4)this.n5;
         if (!var2.a0()) {
            if ((this.a6 & 1) != 0) {
               var2.l6(var1);
            } else if (var1 && this.u9()) {
               var2.y1();
            }
         }
      }
   }

   @Override
   public final boolean equals(Object o) {
      if (com.aspose.slides.internal.v6g.k5.l6(o, a6.class)) {
         a6 var2 = (a6)o;
         if (var2.n5 != this.n5) {
            return false;
         }

         if (var2.k5 != this.k5) {
            return false;
         }

         if (var2.u3 != this.u3) {
            return false;
         }

         if (var2.l6 != null && this.l6 != null) {
            if (var2.l6.length != this.l6.length) {
               return false;
            }

            int var3 = 0;

            for (int var4 = this.l6.length; var3 < var4; var3++) {
               if (var2.l6[var3] != this.l6[var3]) {
                  return false;
               }
            }

            return true;
         } else {
            return var2.l6 == null && this.l6 == null;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = (var1 ^ this.k5) + (var1 << 19);
      return (var1 ^ this.u3) + (var1 << 11);
   }

   @Override
   public String toString() {
      a5 var1 = new a5("RR: { type = '");
      String var2 = null;
      char var3;
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, t4.class)) {
         var3 = 'W';
         var2 = ((t4)this.n5).m1();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, e2.class)) {
         var3 = 'S';
         var2 = ((e2)this.n5).m1();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.d2.l6.class)) {
         var3 = 'A';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, n3.class)) {
         var3 = 'L';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, y4.class)) {
         var3 = 'S';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, z1.class)) {
         var3 = '#';
         var2 = ((z1)this.n5).a0();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, t2.class)) {
         var3 = 'B';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, x8.class)) {
         var3 = 'V';
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.n5, s7.class)) {
         var3 = 'I';
      } else {
         var3 = '?';
      }

      var1.n5(var3);
      var1.n5("', levels = '");
      var1.n5(this.k5(this.l6));
      var1.n5("', min = ");
      var1.k5(this.k5);
      var1.n5(", max = ");
      var1.k5(this.u3);
      var1.n5(", reversals = ");
      var1.k5(this.a6);
      var1.n5(", content = <");
      var1.n5(com.aspose.slides.internal.v3.l6.n5(var2));
      var1.n5("> }");
      return var1.toString();
   }

   private String k5(int[] var1) {
      a5 var2 = new a5();
      int var3 = -1;
      int var4 = var1.length;

      for (int var6 : var1) {
         if (var6 > var3) {
            var3 = var6;
         }
      }

      if (var3 >= 0) {
         if (var3 < 10) {
            for (int var7 = 0; var7 < var4; var7++) {
               var2.n5((char)(48 + var1[var7]));
            }
         } else {
            boolean var8 = true;

            for (int var9 = 0; var9 < var4; var9++) {
               if (var8) {
                  var8 = false;
               } else {
                  var2.n5(',');
               }

               var2.k5(var1[var9]);
            }
         }
      }

      return var2.toString();
   }

   private static int[] n5(int var0, int var1) {
      int[] var2 = new int[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var0;
      }

      return var2;
   }
}
