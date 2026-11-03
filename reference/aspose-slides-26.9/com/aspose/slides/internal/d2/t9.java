package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;

public class t9 extends n5 {
   public t9() {
   }

   public t9(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public final void y1() {
      this.x8.clear();
   }

   public final void n5(String var1, int var2) {
      this.n5(var1, 0, null, null, (int[][])null, var2);
   }

   public final void n5(String var1, int var2, int var3) {
      this.n5(var1, 0, null, this.n5(var3, var1.length()), (int[][])null, var2);
   }

   public final void n5(String var1, int var2, int[] var3, int[] var4, int[][] var5, int var6) {
      int var7 = n5(var4);
      t4 var8 = new t4(var6, var7, var1, var3, var4, var5);
      var8.l6(var2);
      this.n5(var8);
      var8.l6(this);
      this.q0(var7);
   }

   public final void n5(char var1, int var2, boolean var3, int var4, int var5) {
      e2 var6 = new e2(var4, var5, var1, var3);
      var6.l6(var2);
      this.n5(var6);
      var6.l6(this);
      this.q0(var5);
   }

   public String a0() {
      a5 var1 = new a5();
      List$Enumerator var2 = this.x8.iterator();

      try {
         while (var2.hasNext()) {
            c8 var3 = (c8)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, t4.class)) {
               var1.n5(((t4)var3).m1());
            } else {
               var1.n5(((e2)var3).m1());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   @Override
   public String toString() {
      a5 var1 = new a5(super.toString());
      var1.n5(" {text=\"");
      var1.n5(com.aspose.slides.internal.v3.l6.n5(this.a0()));
      var1.n5("\"");
      var1.n5("}");
      return var1.toString();
   }

   private void q0(int var1) {
      if (var1 >= 0) {
         int var2 = this.h0();
         if (var2 >= 0) {
            if (var1 < var2) {
               this.u3(var1);
            }
         } else {
            this.u3(var1);
         }
      }
   }

   private static int n5(int[] var0) {
      if (var0 != null) {
         int var1 = Integer.MAX_VALUE;
         int var2 = 0;

         for (int var3 = var0.length; var2 < var3; var2++) {
            int var4 = var0[var2];
            if (var4 >= 0 && var4 < var1) {
               var1 = var4;
            }
         }

         return var1 == Integer.MAX_VALUE ? -1 : var1;
      } else {
         return -1;
      }
   }

   private int[] n5(int var1, int var2) {
      if (var1 < 0) {
         return null;
      }

      int[] var3 = new int[var2];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var1;
      }

      return var3;
   }
}
